package genproperties

import util.allJavaFXClasses
import util.dekeyword
import util.getPropertyValueType
import util.projectRoot
import java.io.FileWriter
import java.lang.reflect.Modifier
import java.nio.file.Paths

fun main(args: Array<String>) {
    fun allJavaFXClasses() = emptyList<Class<*>>() // Kotlin M14开始不再需要

    val propPath = Paths.get(projectRoot, "kotlinfx-core", "src", "main", "kotlin", "kotlinfx", "properties", "Generated.kt")!!
    val fw = FileWriter(propPath.toFile())
    fw.append("package kotlinfx.properties\n\n")

    for (clazz in allJavaFXClasses()) {
        if (clazz.canonicalName == null) continue;
        if (!Modifier.isPublic(clazz.modifiers)) continue

        val className = clazz.canonicalName!!
        var classNamePrinted = false
        val allMethods = clazz.methods.toList()
        val methods = clazz.declaredMethods.toList()
        val xetterPairs = methods.
                filter {
                    val name = it.name!!;
                    val modifiers = it.modifiers
                    (name.startsWith("get") || name.startsWith("set")) && name.length > 3 &&
                            (!name.startsWith("get") || it.parameterCount == 0) &&
                            (!name.startsWith("set") || it.parameterCount == 1) &&
                            !Modifier.isStatic(modifiers) && // TODO Static xetters are not supported yet
                            Modifier.isPublic(modifiers)
                }.
                groupBy { it.name!!.substring(3) }

        for ((suffix, xetters) in xetterPairs) {
            val name = dekeyword(suffix.first().toString().toLowerCase() + suffix.substring(1))

            if (name.contains("impl_")) continue
            // Not worth the trouble. These are provided manually in kotlinfx.properties.Manual.kt
            val fullName = "$className.$name"
            if (fullName in listOf(
                    "javafx.print.JobSettings.pageRanges", // Getter returns array, but setter expects varargs
                    "javafx.scene.control.SplitPane.dividerPositions", // Same as above
                    "javafx.scene.control.ResizeFeaturesBase.column",
                    "javafx.scene.control.TableColumnBase.parentColumn",
                    "javafx.scene.control.TableColumnBase.columns",
                    "javafx.scene.control.TableSelectionModel.selectedIndices",
                    "javafx.scene.control.TablePosition.tableColumn",
                    "javafx.fxml.FXMLLoader.root",
                    "javafx.fxml.FXMLLoader.controllerFactory",
                    "javafx.fxml.FXMLLoader.controller"
            )) continue

            val setter = xetters.firstOrNull { it.name!!.startsWith("set") }
            var getter0 = xetters.firstOrNull { it.name!!.startsWith("get") }
            // Kotlin does not support write-only properties.
            // Still, for example, Button has setDisable without getDisable but there is disableProperty().get().
            // There are approx. 100 situations like this so it is worthwhile to solve the problem in general
            // That is, get the getter from the property.
            val getterAlt = allMethods.firstOrNull { it.name!!.endsWith(name + "Property") }
            var b = false
            if (getter0 == null && getterAlt == null) continue
            if (getter0 == null && getterAlt != null) {
                getter0 = getterAlt
                b = true
            }
            val getter = getter0!!

            val va = if (setter == null) "val" else "var"
            var ty: String? = kotlinfyType(getter.genericReturnType!!.typeName!!)
            if (b) ty = getPropertyValueType(ty!!)
            val isArray = util.isArray(ty)
            val tyParamList = clazz.typeParameters.toArrayList()
            val tyParams = util.genTypeParamsString(tyParamList)
            val tyParamsFirst = util.genFirstTypeParamsString(tyParamList)
            val template =
                    """
@Suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public $va $tyParamsFirst $className$tyParams.$name: $ty
    get() = ${if (!b) "get$suffix" else "${name}Property()!!.get"}()!!
${if (setter != null) {
                        if (!isArray) {
                            "    set(v) = set$suffix(v)"
                        } else {
                            "    set(v) = set$suffix(*v)"
                        }
                    } else ""}
"""
            if (!classNamePrinted) {
                fw.append("\n// " + className + "\n")
                classNamePrinted = true
            }
            fw.append(template)
            println(name + ": " + xetters.map { it.name!! })
        }
    }

    fw.close()
}

fun kotlinfyType(ty: String): String {
    var t = util.kotlinfyType(ty)
    // The following are special cases where I could not think of a general solution
    t = t.replace("TableView.ResizeFeatures", "TableView.ResizeFeatures<S>")
    t = t.replace("javafx.util.Callback<javafx.scene.control.TreeTableView.ResizeFeatures<S>",
            "javafx.util.Callback<javafx.scene.control.TreeTableView.ResizeFeatures<*>")
    t = t.replace("javafx.scene.image.PixelFormat", "javafx.scene.image.PixelFormat<*>")
    t = t.replace("javafx.collections.ObservableList<javafx.scene.control.TableColumn<S, *>>",
            "javafx.collections.ObservableList<out javafx.scene.control.TableColumn<S, *>?>")
    t = t.replace("javafx.collections.ObservableList<javafx.scene.control.TreeTableColumn<S, *>>",
            "javafx.collections.ObservableList<out javafx.scene.control.TreeTableColumn<S, *>?>")
    t = t.replace("javafx.scene.control.TableColumnBase", "javafx.scene.control.TreeTableColumn<S,T>")
    t = t.replace("javafx.css.Styleable", "javafx.css.Styleable?")
    t = t.replace("javafx.scene.input.MouseDragEvent", "javafx.scene.input.MouseDragEvent?")
    t = t.replace("javafx.scene.input.MouseEvent", "javafx.scene.input.MouseEvent?")
    t = t.replace("javafx.scene.input.SwipeEvent", "javafx.scene.input.SwipeEvent?")
    t = t.replace("javafx.scene.input.ScrollEvent", "javafx.scene.input.ScrollEvent?")
    t = t.replace("javafx.scene.input.ZoomEvent", "javafx.scene.input.ZoomEvent?")
    t = t.replace("javafx.scene.input.ContextMenuEvent", "javafx.scene.input.ContextMenuEvent?")
    t = t.replace("javafx.scene.input.RotateEvent", "javafx.scene.input.RotateEvent?")
    t = t.replace("javafx.scene.input.KeyEvent", "javafx.scene.input.KeyEvent?")
    t = t.replace("javafx.scene.input.TouchEvent", "javafx.scene.input.TouchEvent?")
    t = t.replace("javafx.scene.input.InputMethodEvent", "javafx.scene.input.InputMethodEvent?")
    t = t.replace("javafx.scene.input.DragEvent", "javafx.scene.input.DragEvent?")
    if (t == "javafx.scene.control.TablePosition") return "javafx.scene.control.TablePosition<*,*>"
    if (t == "javafx.scene.control.TableRow") return "javafx.scene.control.TableRow<*>"
    if (t == "javafx.collections.ObservableList") return "javafx.collections.ObservableList<T>"
    if (t == "javafx.util.Callback<javafx.scene.control.TableView.ResizeFeatures<S>, Boolean>")
        return "javafx.util.Callback<javafx.scene.control.TableView.ResizeFeatures<*>, Boolean>"
    if (t == "javafx.collections.ObservableList<javafx.scene.control.TablePosition>")
        return "javafx.collections.ObservableList<javafx.scene.control.TablePosition<*,*>>"
    if (t == "javafx.event.EventHandler<in javafx.scene.transform.TransformChangedEvent>")
        return "javafx.event.EventHandler<in javafx.scene.transform.TransformChangedEvent?>"
    return t
}


