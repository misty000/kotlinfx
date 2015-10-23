package kotlinfx.kalium

import javafx.beans.value.ObservableValue


// javafx.scene.control.Button

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Button.defaultButton(f: (() -> Boolean)? = null): Boolean =
        template("defaultButton", f, this, defaultButtonProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Button.cancelButton(f: (() -> Boolean)? = null): Boolean =
        template("cancelButton", f, this, cancelButtonProperty()!! as ObservableValue<Boolean>)

// javafx.scene.shape.HLineTo

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.HLineTo.x(f: (() -> Double)? = null): Double =
        template("x", f, this, xProperty()!! as ObservableValue<Double>)

// javafx.print.JobSettings

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.print.JobSettings.copies(f: (() -> Int)? = null): Int =
        template("copies", f, this, copiesProperty()!! as ObservableValue<Int>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.print.JobSettings.jobName(f: (() -> String)? = null): String =
        template("jobName", f, this, jobNameProperty()!! as ObservableValue<String>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.print.JobSettings.collation(f: (() -> javafx.print.Collation)? = null): javafx.print.Collation =
        template("collation", f, this, collationProperty()!! as ObservableValue<javafx.print.Collation>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.print.JobSettings.printResolution(f: (() -> javafx.print.PrintResolution)? = null): javafx.print.PrintResolution =
        template("printResolution", f, this, printResolutionProperty()!! as ObservableValue<javafx.print.PrintResolution>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.print.JobSettings.printColor(f: (() -> javafx.print.PrintColor)? = null): javafx.print.PrintColor =
        template("printColor", f, this, printColorProperty()!! as ObservableValue<javafx.print.PrintColor>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.print.JobSettings.pageLayout(f: (() -> javafx.print.PageLayout)? = null): javafx.print.PageLayout =
        template("pageLayout", f, this, pageLayoutProperty()!! as ObservableValue<javafx.print.PageLayout>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.print.JobSettings.printSides(f: (() -> javafx.print.PrintSides)? = null): javafx.print.PrintSides =
        template("printSides", f, this, printSidesProperty()!! as ObservableValue<javafx.print.PrintSides>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.print.JobSettings.printQuality(f: (() -> javafx.print.PrintQuality)? = null): javafx.print.PrintQuality =
        template("printQuality", f, this, printQualityProperty()!! as ObservableValue<javafx.print.PrintQuality>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.print.JobSettings.paperSource(f: (() -> javafx.print.PaperSource)? = null): javafx.print.PaperSource =
        template("paperSource", f, this, paperSourceProperty()!! as ObservableValue<javafx.print.PaperSource>)

// javafx.scene.control.Skinnable

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Skinnable.skin(f: (() -> javafx.scene.control.Skin<*>)? = null): javafx.scene.control.Skin<*> =
        template("skin", f, this, skinProperty()!! as ObservableValue<javafx.scene.control.Skin<*>>)

// javafx.scene.layout.StackPane

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.StackPane.alignment(f: (() -> javafx.geometry.Pos)? = null): javafx.geometry.Pos =
        template("alignment", f, this, alignmentProperty()!! as ObservableValue<javafx.geometry.Pos>)

// javafx.scene.effect.Blend

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.Blend.opacity(f: (() -> Double)? = null): Double =
        template("opacity", f, this, opacityProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.Blend.bottomInput(f: (() -> javafx.scene.effect.Effect)? = null): javafx.scene.effect.Effect =
        template("bottomInput", f, this, bottomInputProperty()!! as ObservableValue<javafx.scene.effect.Effect>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.Blend.mode(f: (() -> javafx.scene.effect.BlendMode)? = null): javafx.scene.effect.BlendMode =
        template("mode", f, this, modeProperty()!! as ObservableValue<javafx.scene.effect.BlendMode>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.Blend.topInput(f: (() -> javafx.scene.effect.Effect)? = null): javafx.scene.effect.Effect =
        template("topInput", f, this, topInputProperty()!! as ObservableValue<javafx.scene.effect.Effect>)

// javafx.scene.control.TextField

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.TextField.alignment(f: (() -> javafx.geometry.Pos)? = null): javafx.geometry.Pos =
        template("alignment", f, this, alignmentProperty()!! as ObservableValue<javafx.geometry.Pos>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.TextField.prefColumnCount(f: (() -> Int)? = null): Int =
        template("prefColumnCount", f, this, prefColumnCountProperty()!! as ObservableValue<Int>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.TextField.onAction(f: (() -> javafx.event.EventHandler<javafx.event.ActionEvent>)? = null): javafx.event.EventHandler<javafx.event.ActionEvent> =
        template("onAction", f, this, onActionProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.event.ActionEvent>>)

// javafx.scene.control.CustomMenuItem

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.CustomMenuItem.hideOnClick(f: (() -> Boolean)? = null): Boolean =
        template("hideOnClick", f, this, hideOnClickProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.CustomMenuItem.content(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
        template("content", f, this, contentProperty()!! as ObservableValue<javafx.scene.Node>)

// javafx.scene.control.Control

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Control.contextMenu(f: (() -> javafx.scene.control.ContextMenu)? = null): javafx.scene.control.ContextMenu =
        template("contextMenu", f, this, contextMenuProperty()!! as ObservableValue<javafx.scene.control.ContextMenu>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Control.tooltip(f: (() -> javafx.scene.control.Tooltip)? = null): javafx.scene.control.Tooltip =
        template("tooltip", f, this, tooltipProperty()!! as ObservableValue<javafx.scene.control.Tooltip>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Control.skin(f: (() -> javafx.scene.control.Skin<*>)? = null): javafx.scene.control.Skin<*> =
        template("skin", f, this, skinProperty()!! as ObservableValue<javafx.scene.control.Skin<*>>)

// javafx.animation.FillTransition

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.animation.FillTransition.duration(f: (() -> javafx.util.Duration)? = null): javafx.util.Duration =
        template("duration", f, this, durationProperty()!! as ObservableValue<javafx.util.Duration>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.animation.FillTransition.shape(f: (() -> javafx.scene.shape.Shape)? = null): javafx.scene.shape.Shape =
        template("shape", f, this, shapeProperty()!! as ObservableValue<javafx.scene.shape.Shape>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.animation.FillTransition.fromValue(f: (() -> javafx.scene.paint.Color)? = null): javafx.scene.paint.Color =
        template("fromValue", f, this, fromValueProperty()!! as ObservableValue<javafx.scene.paint.Color>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.animation.FillTransition.toValue(f: (() -> javafx.scene.paint.Color)? = null): javafx.scene.paint.Color =
        template("toValue", f, this, toValueProperty()!! as ObservableValue<javafx.scene.paint.Color>)

// javafx.scene.LightBase

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.LightBase.lightOn(f: (() -> Boolean)? = null): Boolean =
        template("lightOn", f, this, lightOnProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.LightBase.color(f: (() -> javafx.scene.paint.Color)? = null): javafx.scene.paint.Color =
        template("color", f, this, colorProperty()!! as ObservableValue<javafx.scene.paint.Color>)

// javafx.scene.transform.Transform

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.transform.Transform.type2D(f: (() -> Boolean)? = null): Boolean =
        template("type2D", f, this, type2DProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.transform.Transform.identity(f: (() -> Boolean)? = null): Boolean =
        template("identity", f, this, identityProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.transform.Transform.onTransformChanged(f: (() -> javafx.event.EventHandler<in javafx.scene.transform.TransformChangedEvent>)? = null): javafx.event.EventHandler<in javafx.scene.transform.TransformChangedEvent> =
        template("onTransformChanged", f, this, onTransformChangedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.transform.TransformChangedEvent>>)

// javafx.scene.control.cell.TextFieldTreeCell

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.cell.TextFieldTreeCell<T>.converter(f: (() -> javafx.util.StringConverter<T>)? = null): javafx.util.StringConverter<T> =
        template("converter", f, this, converterProperty()!! as ObservableValue<javafx.util.StringConverter<T>>)

// javafx.scene.control.Labeled

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Labeled.graphic(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
        template("graphic", f, this, graphicProperty()!! as ObservableValue<javafx.scene.Node>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Labeled.mnemonicParsing(f: (() -> Boolean)? = null): Boolean =
        template("mnemonicParsing", f, this, mnemonicParsingProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Labeled.labelPadding(f: (() -> javafx.geometry.Insets)? = null): javafx.geometry.Insets =
        template("labelPadding", f, this, labelPaddingProperty()!! as ObservableValue<javafx.geometry.Insets>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Labeled.underline(f: (() -> Boolean)? = null): Boolean =
        template("underline", f, this, underlineProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Labeled.lineSpacing(f: (() -> Double)? = null): Double =
        template("lineSpacing", f, this, lineSpacingProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Labeled.textAlignment(f: (() -> javafx.scene.text.TextAlignment)? = null): javafx.scene.text.TextAlignment =
        template("textAlignment", f, this, textAlignmentProperty()!! as ObservableValue<javafx.scene.text.TextAlignment>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Labeled.alignment(f: (() -> javafx.geometry.Pos)? = null): javafx.geometry.Pos =
        template("alignment", f, this, alignmentProperty()!! as ObservableValue<javafx.geometry.Pos>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Labeled.textOverrun(f: (() -> javafx.scene.control.OverrunStyle)? = null): javafx.scene.control.OverrunStyle =
        template("textOverrun", f, this, textOverrunProperty()!! as ObservableValue<javafx.scene.control.OverrunStyle>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Labeled.contentDisplay(f: (() -> javafx.scene.control.ContentDisplay)? = null): javafx.scene.control.ContentDisplay =
        template("contentDisplay", f, this, contentDisplayProperty()!! as ObservableValue<javafx.scene.control.ContentDisplay>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Labeled.ellipsisString(f: (() -> String)? = null): String =
        template("ellipsisString", f, this, ellipsisStringProperty()!! as ObservableValue<String>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Labeled.graphicTextGap(f: (() -> Double)? = null): Double =
        template("graphicTextGap", f, this, graphicTextGapProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Labeled.textFill(f: (() -> javafx.scene.paint.Paint)? = null): javafx.scene.paint.Paint =
        template("textFill", f, this, textFillProperty()!! as ObservableValue<javafx.scene.paint.Paint>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Labeled.font(f: (() -> javafx.scene.text.Font)? = null): javafx.scene.text.Font =
        template("font", f, this, fontProperty()!! as ObservableValue<javafx.scene.text.Font>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Labeled.wrapText(f: (() -> Boolean)? = null): Boolean =
        template("wrapText", f, this, wrapTextProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Labeled.text(f: (() -> String)? = null): String =
        template("text", f, this, textProperty()!! as ObservableValue<String>)

// javafx.animation.Transition

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.animation.Transition.interpolator(f: (() -> javafx.animation.Interpolator)? = null): javafx.animation.Interpolator =
        template("interpolator", f, this, interpolatorProperty()!! as ObservableValue<javafx.animation.Interpolator>)

// javafx.scene.chart.XYChart.Data

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <X, Y> javafx.scene.chart.XYChart.Data<X, Y>.node(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
        template("node", f, this, nodeProperty()!! as ObservableValue<javafx.scene.Node>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <X, Y> javafx.scene.chart.XYChart.Data<X, Y>.extraValue(f: (() -> Any)? = null): Any =
        template("extraValue", f, this, extraValueProperty()!! as ObservableValue<Any>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <X, Y> javafx.scene.chart.XYChart.Data<X, Y>.XValue(f: (() -> X)? = null): X =
        template("XValue", f, this, XValueProperty()!! as ObservableValue<X>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <X, Y> javafx.scene.chart.XYChart.Data<X, Y>.YValue(f: (() -> Y)? = null): Y =
        template("YValue", f, this, YValueProperty()!! as ObservableValue<Y>)

// javafx.scene.control.ContextMenu

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.ContextMenu.onAction(f: (() -> javafx.event.EventHandler<javafx.event.ActionEvent>)? = null): javafx.event.EventHandler<javafx.event.ActionEvent> =
        template("onAction", f, this, onActionProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.event.ActionEvent>>)

// javafx.scene.transform.Shear

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.transform.Shear.y(f: (() -> Double)? = null): Double =
        template("y", f, this, yProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.transform.Shear.x(f: (() -> Double)? = null): Double =
        template("x", f, this, xProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.transform.Shear.pivotX(f: (() -> Double)? = null): Double =
        template("pivotX", f, this, pivotXProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.transform.Shear.pivotY(f: (() -> Double)? = null): Double =
        template("pivotY", f, this, pivotYProperty()!! as ObservableValue<Double>)

// javafx.scene.ImageCursor

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.ImageCursor.image(f: (() -> javafx.scene.image.Image)? = null): javafx.scene.image.Image =
        template("image", f, this, imageProperty()!! as ObservableValue<javafx.scene.image.Image>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.ImageCursor.hotspotX(f: (() -> Double)? = null): Double =
        template("hotspotX", f, this, hotspotXProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.ImageCursor.hotspotY(f: (() -> Double)? = null): Double =
        template("hotspotY", f, this, hotspotYProperty()!! as ObservableValue<Double>)

// javafx.scene.shape.QuadCurve

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.QuadCurve.endY(f: (() -> Double)? = null): Double =
        template("endY", f, this, endYProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.QuadCurve.startY(f: (() -> Double)? = null): Double =
        template("startY", f, this, startYProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.QuadCurve.startX(f: (() -> Double)? = null): Double =
        template("startX", f, this, startXProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.QuadCurve.endX(f: (() -> Double)? = null): Double =
        template("endX", f, this, endXProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.QuadCurve.controlY(f: (() -> Double)? = null): Double =
        template("controlY", f, this, controlYProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.QuadCurve.controlX(f: (() -> Double)? = null): Double =
        template("controlX", f, this, controlXProperty()!! as ObservableValue<Double>)

// javafx.scene.control.SpinnerValueFactory.ListSpinnerValueFactory

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.SpinnerValueFactory.ListSpinnerValueFactory<T>.items(f: (() -> javafx.collections.ObservableList<T>)? = null): javafx.collections.ObservableList<T> =
        template("items", f, this, itemsProperty()!! as ObservableValue<javafx.collections.ObservableList<T>>)

// javafx.scene.chart.Axis

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.chart.Axis<T>.autoRanging(f: (() -> Boolean)? = null): Boolean =
        template("autoRanging", f, this, autoRangingProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.chart.Axis<T>.tickLabelRotation(f: (() -> Double)? = null): Double =
        template("tickLabelRotation", f, this, tickLabelRotationProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.chart.Axis<T>.tickLength(f: (() -> Double)? = null): Double =
        template("tickLength", f, this, tickLengthProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.chart.Axis<T>.tickLabelFill(f: (() -> javafx.scene.paint.Paint)? = null): javafx.scene.paint.Paint =
        template("tickLabelFill", f, this, tickLabelFillProperty()!! as ObservableValue<javafx.scene.paint.Paint>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.chart.Axis<T>.tickLabelGap(f: (() -> Double)? = null): Double =
        template("tickLabelGap", f, this, tickLabelGapProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.chart.Axis<T>.tickLabelsVisible(f: (() -> Boolean)? = null): Boolean =
        template("tickLabelsVisible", f, this, tickLabelsVisibleProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.chart.Axis<T>.tickMarkVisible(f: (() -> Boolean)? = null): Boolean =
        template("tickMarkVisible", f, this, tickMarkVisibleProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.chart.Axis<T>.tickLabelFont(f: (() -> javafx.scene.text.Font)? = null): javafx.scene.text.Font =
        template("tickLabelFont", f, this, tickLabelFontProperty()!! as ObservableValue<javafx.scene.text.Font>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.chart.Axis<T>.label(f: (() -> String)? = null): String =
        template("label", f, this, labelProperty()!! as ObservableValue<String>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.chart.Axis<T>.side(f: (() -> javafx.geometry.Side)? = null): javafx.geometry.Side =
        template("side", f, this, sideProperty()!! as ObservableValue<javafx.geometry.Side>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.chart.Axis<T>.animated(f: (() -> Boolean)? = null): Boolean =
        template("animated", f, this, animatedProperty()!! as ObservableValue<Boolean>)

// javafx.scene.control.DialogPane

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.DialogPane.graphic(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
        template("graphic", f, this, graphicProperty()!! as ObservableValue<javafx.scene.Node>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.DialogPane.expanded(f: (() -> Boolean)? = null): Boolean =
        template("expanded", f, this, expandedProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.DialogPane.expandableContent(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
        template("expandableContent", f, this, expandableContentProperty()!! as ObservableValue<javafx.scene.Node>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.DialogPane.headerText(f: (() -> String)? = null): String =
        template("headerText", f, this, headerTextProperty()!! as ObservableValue<String>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.DialogPane.contentText(f: (() -> String)? = null): String =
        template("contentText", f, this, contentTextProperty()!! as ObservableValue<String>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.DialogPane.content(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
        template("content", f, this, contentProperty()!! as ObservableValue<javafx.scene.Node>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.DialogPane.header(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
        template("header", f, this, headerProperty()!! as ObservableValue<javafx.scene.Node>)

// javafx.concurrent.Service

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <V> javafx.concurrent.Service<V>.onFailed(f: (() -> javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>)? = null): javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent> =
        template("onFailed", f, this, onFailedProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <V> javafx.concurrent.Service<V>.executor(f: (() -> java.util.concurrent.Executor)? = null): java.util.concurrent.Executor =
        template("executor", f, this, executorProperty()!! as ObservableValue<java.util.concurrent.Executor>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <V> javafx.concurrent.Service<V>.value(f: (() -> V)? = null): V =
        template("value", f, this, valueProperty()!! as ObservableValue<V>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <V> javafx.concurrent.Service<V>.state(f: (() -> javafx.concurrent.Worker.State)? = null): javafx.concurrent.Worker.State =
        template("state", f, this, stateProperty()!! as ObservableValue<javafx.concurrent.Worker.State>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <V> javafx.concurrent.Service<V>.running(f: (() -> Boolean)? = null): Boolean =
        template("running", f, this, runningProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <V> javafx.concurrent.Service<V>.progress(f: (() -> Double)? = null): Double =
        template("progress", f, this, progressProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <V> javafx.concurrent.Service<V>.workDone(f: (() -> Double)? = null): Double =
        template("workDone", f, this, workDoneProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <V> javafx.concurrent.Service<V>.message(f: (() -> String)? = null): String =
        template("message", f, this, messageProperty()!! as ObservableValue<String>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <V> javafx.concurrent.Service<V>.title(f: (() -> String)? = null): String =
        template("title", f, this, titleProperty()!! as ObservableValue<String>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <V> javafx.concurrent.Service<V>.onReady(f: (() -> javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>)? = null): javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent> =
        template("onReady", f, this, onReadyProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <V> javafx.concurrent.Service<V>.onRunning(f: (() -> javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>)? = null): javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent> =
        template("onRunning", f, this, onRunningProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <V> javafx.concurrent.Service<V>.onScheduled(f: (() -> javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>)? = null): javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent> =
        template("onScheduled", f, this, onScheduledProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <V> javafx.concurrent.Service<V>.onCancelled(f: (() -> javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>)? = null): javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent> =
        template("onCancelled", f, this, onCancelledProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <V> javafx.concurrent.Service<V>.onSucceeded(f: (() -> javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>)? = null): javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent> =
        template("onSucceeded", f, this, onSucceededProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <V> javafx.concurrent.Service<V>.exception(f: (() -> Throwable)? = null): Throwable =
        template("exception", f, this, exceptionProperty()!! as ObservableValue<Throwable>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <V> javafx.concurrent.Service<V>.totalWork(f: (() -> Double)? = null): Double =
        template("totalWork", f, this, totalWorkProperty()!! as ObservableValue<Double>)

// javafx.beans.property.ReadOnlySetWrapper

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <E> javafx.beans.property.ReadOnlySetWrapper<E>.getReadOnly(f: (() -> E)? = null): E =
        template("getReadOnly", f, this, getReadOnlyProperty()!! as ObservableValue<E>)

// javafx.scene.control.TreeTableColumn

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S, T> javafx.scene.control.TreeTableColumn<S, T>.sortType(f: (() -> javafx.scene.control.TreeTableColumn.SortType)? = null): javafx.scene.control.TreeTableColumn.SortType =
        template("sortType", f, this, sortTypeProperty()!! as ObservableValue<javafx.scene.control.TreeTableColumn.SortType>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S, T> javafx.scene.control.TreeTableColumn<S, T>.treeTableView(f: (() -> javafx.scene.control.TreeTableView<S>)? = null): javafx.scene.control.TreeTableView<S> =
        template("treeTableView", f, this, treeTableViewProperty()!! as ObservableValue<javafx.scene.control.TreeTableView<S>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S, T> javafx.scene.control.TreeTableColumn<S, T>.onEditCancel(f: (() -> javafx.event.EventHandler<javafx.scene.control.TreeTableColumn.CellEditEvent<S, T>>)? = null): javafx.event.EventHandler<javafx.scene.control.TreeTableColumn.CellEditEvent<S, T>> =
        template("onEditCancel", f, this, onEditCancelProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.scene.control.TreeTableColumn.CellEditEvent<S, T>>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S, T> javafx.scene.control.TreeTableColumn<S, T>.onEditCommit(f: (() -> javafx.event.EventHandler<javafx.scene.control.TreeTableColumn.CellEditEvent<S, T>>)? = null): javafx.event.EventHandler<javafx.scene.control.TreeTableColumn.CellEditEvent<S, T>> =
        template("onEditCommit", f, this, onEditCommitProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.scene.control.TreeTableColumn.CellEditEvent<S, T>>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S, T> javafx.scene.control.TreeTableColumn<S, T>.onEditStart(f: (() -> javafx.event.EventHandler<javafx.scene.control.TreeTableColumn.CellEditEvent<S, T>>)? = null): javafx.event.EventHandler<javafx.scene.control.TreeTableColumn.CellEditEvent<S, T>> =
        template("onEditStart", f, this, onEditStartProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.scene.control.TreeTableColumn.CellEditEvent<S, T>>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S, T> javafx.scene.control.TreeTableColumn<S, T>.cellFactory(f: (() -> javafx.util.Callback<javafx.scene.control.TreeTableColumn<S, T>, javafx.scene.control.TreeTableCell<S, T>>)? = null): javafx.util.Callback<javafx.scene.control.TreeTableColumn<S, T>, javafx.scene.control.TreeTableCell<S, T>> =
        template("cellFactory", f, this, cellFactoryProperty()!! as ObservableValue<javafx.util.Callback<javafx.scene.control.TreeTableColumn<S, T>, javafx.scene.control.TreeTableCell<S, T>>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S, T> javafx.scene.control.TreeTableColumn<S, T>.cellValueFactory(f: (() -> javafx.util.Callback<javafx.scene.control.TreeTableColumn.CellDataFeatures<S, T>, javafx.beans.value.ObservableValue<T>>)? = null): javafx.util.Callback<javafx.scene.control.TreeTableColumn.CellDataFeatures<S, T>, javafx.beans.value.ObservableValue<T>> =
        template("cellValueFactory", f, this, cellValueFactoryProperty()!! as ObservableValue<javafx.util.Callback<javafx.scene.control.TreeTableColumn.CellDataFeatures<S, T>, javafx.beans.value.ObservableValue<T>>>)

// javafx.scene.layout.ColumnConstraints

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.ColumnConstraints.percentWidth(f: (() -> Double)? = null): Double =
        template("percentWidth", f, this, percentWidthProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.ColumnConstraints.prefWidth(f: (() -> Double)? = null): Double =
        template("prefWidth", f, this, prefWidthProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.ColumnConstraints.fillWidth(f: (() -> Boolean)? = null): Boolean =
        template("fillWidth", f, this, fillWidthProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.ColumnConstraints.halignment(f: (() -> javafx.geometry.HPos)? = null): javafx.geometry.HPos =
        template("halignment", f, this, halignmentProperty()!! as ObservableValue<javafx.geometry.HPos>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.ColumnConstraints.maxWidth(f: (() -> Double)? = null): Double =
        template("maxWidth", f, this, maxWidthProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.ColumnConstraints.minWidth(f: (() -> Double)? = null): Double =
        template("minWidth", f, this, minWidthProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.ColumnConstraints.hgrow(f: (() -> javafx.scene.layout.Priority)? = null): javafx.scene.layout.Priority =
        template("hgrow", f, this, hgrowProperty()!! as ObservableValue<javafx.scene.layout.Priority>)

// javafx.scene.layout.BorderPane

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.BorderPane.center(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
        template("center", f, this, centerProperty()!! as ObservableValue<javafx.scene.Node>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.BorderPane.top(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
        template("top", f, this, topProperty()!! as ObservableValue<javafx.scene.Node>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.BorderPane.bottom(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
        template("bottom", f, this, bottomProperty()!! as ObservableValue<javafx.scene.Node>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.BorderPane.right(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
        template("right", f, this, rightProperty()!! as ObservableValue<javafx.scene.Node>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.BorderPane.left(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
        template("left", f, this, leftProperty()!! as ObservableValue<javafx.scene.Node>)

// javafx.animation.PathTransition

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.animation.PathTransition.duration(f: (() -> javafx.util.Duration)? = null): javafx.util.Duration =
        template("duration", f, this, durationProperty()!! as ObservableValue<javafx.util.Duration>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.animation.PathTransition.node(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
        template("node", f, this, nodeProperty()!! as ObservableValue<javafx.scene.Node>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.animation.PathTransition.orientation(f: (() -> javafx.animation.PathTransition.OrientationType)? = null): javafx.animation.PathTransition.OrientationType =
        template("orientation", f, this, orientationProperty()!! as ObservableValue<javafx.animation.PathTransition.OrientationType>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.animation.PathTransition.path(f: (() -> javafx.scene.shape.Shape)? = null): javafx.scene.shape.Shape =
        template("path", f, this, pathProperty()!! as ObservableValue<javafx.scene.shape.Shape>)

// javafx.scene.chart.ValueAxis

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T : Number> javafx.scene.chart.ValueAxis<T>.tickLabelFormatter(f: (() -> javafx.util.StringConverter<T>)? = null): javafx.util.StringConverter<T> =
        template("tickLabelFormatter", f, this, tickLabelFormatterProperty()!! as ObservableValue<javafx.util.StringConverter<T>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T : Number> javafx.scene.chart.ValueAxis<T>.upperBound(f: (() -> Double)? = null): Double =
        template("upperBound", f, this, upperBoundProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T : Number> javafx.scene.chart.ValueAxis<T>.lowerBound(f: (() -> Double)? = null): Double =
        template("lowerBound", f, this, lowerBoundProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T : Number> javafx.scene.chart.ValueAxis<T>.scale(f: (() -> Double)? = null): Double =
        template("scale", f, this, scaleProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T : Number> javafx.scene.chart.ValueAxis<T>.minorTickCount(f: (() -> Int)? = null): Int =
        template("minorTickCount", f, this, minorTickCountProperty()!! as ObservableValue<Int>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T : Number> javafx.scene.chart.ValueAxis<T>.minorTickLength(f: (() -> Double)? = null): Double =
        template("minorTickLength", f, this, minorTickLengthProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T : Number> javafx.scene.chart.ValueAxis<T>.minorTickVisible(f: (() -> Boolean)? = null): Boolean =
        template("minorTickVisible", f, this, minorTickVisibleProperty()!! as ObservableValue<Boolean>)

// javafx.scene.web.WebHistory

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.web.WebHistory.maxSize(f: (() -> Int)? = null): Int =
        template("maxSize", f, this, maxSizeProperty()!! as ObservableValue<Int>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.web.WebHistory.currentIndex(f: (() -> Int)? = null): Int =
        template("currentIndex", f, this, currentIndexProperty()!! as ObservableValue<Int>)

// javafx.scene.chart.PieChart.Data

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.chart.PieChart.Data.name(f: (() -> String)? = null): String =
        template("name", f, this, nameProperty()!! as ObservableValue<String>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.chart.PieChart.Data.node(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
        template("node", f, this, nodeProperty()!! as ObservableValue<javafx.scene.Node>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.chart.PieChart.Data.chart(f: (() -> javafx.scene.chart.PieChart)? = null): javafx.scene.chart.PieChart =
        template("chart", f, this, chartProperty()!! as ObservableValue<javafx.scene.chart.PieChart>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.chart.PieChart.Data.pieValue(f: (() -> Double)? = null): Double =
        template("pieValue", f, this, pieValueProperty()!! as ObservableValue<Double>)

// javafx.scene.control.SpinnerValueFactory.DoubleSpinnerValueFactory

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.SpinnerValueFactory.DoubleSpinnerValueFactory.max(f: (() -> Double)? = null): Double =
        template("max", f, this, maxProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.SpinnerValueFactory.DoubleSpinnerValueFactory.min(f: (() -> Double)? = null): Double =
        template("min", f, this, minProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.SpinnerValueFactory.DoubleSpinnerValueFactory.amountToStepBy(f: (() -> Double)? = null): Double =
        template("amountToStepBy", f, this, amountToStepByProperty()!! as ObservableValue<Double>)

// javafx.scene.effect.DisplacementMap

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.DisplacementMap.scaleY(f: (() -> Double)? = null): Double =
        template("scaleY", f, this, scaleYProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.DisplacementMap.scaleX(f: (() -> Double)? = null): Double =
        template("scaleX", f, this, scaleXProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.DisplacementMap.offsetY(f: (() -> Double)? = null): Double =
        template("offsetY", f, this, offsetYProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.DisplacementMap.offsetX(f: (() -> Double)? = null): Double =
        template("offsetX", f, this, offsetXProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.DisplacementMap.input(f: (() -> javafx.scene.effect.Effect)? = null): javafx.scene.effect.Effect =
        template("input", f, this, inputProperty()!! as ObservableValue<javafx.scene.effect.Effect>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.DisplacementMap.mapData(f: (() -> javafx.scene.effect.FloatMap)? = null): javafx.scene.effect.FloatMap =
        template("mapData", f, this, mapDataProperty()!! as ObservableValue<javafx.scene.effect.FloatMap>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.DisplacementMap.wrap(f: (() -> Boolean)? = null): Boolean =
        template("wrap", f, this, wrapProperty()!! as ObservableValue<Boolean>)

// javafx.scene.media.EqualizerBand

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.media.EqualizerBand.gain(f: (() -> Double)? = null): Double =
        template("gain", f, this, gainProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.media.EqualizerBand.bandwidth(f: (() -> Double)? = null): Double =
        template("bandwidth", f, this, bandwidthProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.media.EqualizerBand.centerFrequency(f: (() -> Double)? = null): Double =
        template("centerFrequency", f, this, centerFrequencyProperty()!! as ObservableValue<Double>)

// javafx.scene.effect.Bloom

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.Bloom.threshold(f: (() -> Double)? = null): Double =
        template("threshold", f, this, thresholdProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.Bloom.input(f: (() -> javafx.scene.effect.Effect)? = null): javafx.scene.effect.Effect =
        template("input", f, this, inputProperty()!! as ObservableValue<javafx.scene.effect.Effect>)

// javafx.scene.control.FocusModel

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.FocusModel<T>.focusedIndex(f: (() -> Int)? = null): Int =
        template("focusedIndex", f, this, focusedIndexProperty()!! as ObservableValue<Int>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.FocusModel<T>.focusedItem(f: (() -> T)? = null): T =
        template("focusedItem", f, this, focusedItemProperty()!! as ObservableValue<T>)

// javafx.scene.effect.FloatMap

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.FloatMap.width(f: (() -> Int)? = null): Int =
        template("width", f, this, widthProperty()!! as ObservableValue<Int>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.FloatMap.height(f: (() -> Int)? = null): Int =
        template("height", f, this, heightProperty()!! as ObservableValue<Int>)

// javafx.scene.control.ListView

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.ListView<T>.items(f: (() -> javafx.collections.ObservableList<T>)? = null): javafx.collections.ObservableList<T> =
        template("items", f, this, itemsProperty()!! as ObservableValue<javafx.collections.ObservableList<T>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.ListView<T>.focusModel(f: (() -> javafx.scene.control.FocusModel<T>)? = null): javafx.scene.control.FocusModel<T> =
        template("focusModel", f, this, focusModelProperty()!! as ObservableValue<javafx.scene.control.FocusModel<T>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.ListView<T>.editingIndex(f: (() -> Int)? = null): Int =
        template("editingIndex", f, this, editingIndexProperty()!! as ObservableValue<Int>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.ListView<T>.onScrollTo(f: (() -> javafx.event.EventHandler<javafx.scene.control.ScrollToEvent<Int>>)? = null): javafx.event.EventHandler<javafx.scene.control.ScrollToEvent<Int>> =
        template("onScrollTo", f, this, onScrollToProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.scene.control.ScrollToEvent<Int>>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.ListView<T>.selectionModel(f: (() -> javafx.scene.control.MultipleSelectionModel<T>)? = null): javafx.scene.control.MultipleSelectionModel<T> =
        template("selectionModel", f, this, selectionModelProperty()!! as ObservableValue<javafx.scene.control.MultipleSelectionModel<T>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.ListView<T>.placeholder(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
        template("placeholder", f, this, placeholderProperty()!! as ObservableValue<javafx.scene.Node>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.ListView<T>.orientation(f: (() -> javafx.geometry.Orientation)? = null): javafx.geometry.Orientation =
        template("orientation", f, this, orientationProperty()!! as ObservableValue<javafx.geometry.Orientation>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.ListView<T>.fixedCellSize(f: (() -> Double)? = null): Double =
        template("fixedCellSize", f, this, fixedCellSizeProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.ListView<T>.onEditCancel(f: (() -> javafx.event.EventHandler<javafx.scene.control.ListView.EditEvent<T>>)? = null): javafx.event.EventHandler<javafx.scene.control.ListView.EditEvent<T>> =
        template("onEditCancel", f, this, onEditCancelProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.scene.control.ListView.EditEvent<T>>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.ListView<T>.onEditCommit(f: (() -> javafx.event.EventHandler<javafx.scene.control.ListView.EditEvent<T>>)? = null): javafx.event.EventHandler<javafx.scene.control.ListView.EditEvent<T>> =
        template("onEditCommit", f, this, onEditCommitProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.scene.control.ListView.EditEvent<T>>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.ListView<T>.onEditStart(f: (() -> javafx.event.EventHandler<javafx.scene.control.ListView.EditEvent<T>>)? = null): javafx.event.EventHandler<javafx.scene.control.ListView.EditEvent<T>> =
        template("onEditStart", f, this, onEditStartProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.scene.control.ListView.EditEvent<T>>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.ListView<T>.cellFactory(f: (() -> javafx.util.Callback<javafx.scene.control.ListView<T>, javafx.scene.control.ListCell<T>>)? = null): javafx.util.Callback<javafx.scene.control.ListView<T>, javafx.scene.control.ListCell<T>> =
        template("cellFactory", f, this, cellFactoryProperty()!! as ObservableValue<javafx.util.Callback<javafx.scene.control.ListView<T>, javafx.scene.control.ListCell<T>>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.ListView<T>.editable(f: (() -> Boolean)? = null): Boolean =
        template("editable", f, this, editableProperty()!! as ObservableValue<Boolean>)

// javafx.scene.shape.Rectangle

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.Rectangle.width(f: (() -> Double)? = null): Double =
        template("width", f, this, widthProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.Rectangle.y(f: (() -> Double)? = null): Double =
        template("y", f, this, yProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.Rectangle.x(f: (() -> Double)? = null): Double =
        template("x", f, this, xProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.Rectangle.height(f: (() -> Double)? = null): Double =
        template("height", f, this, heightProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.Rectangle.arcHeight(f: (() -> Double)? = null): Double =
        template("arcHeight", f, this, arcHeightProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.Rectangle.arcWidth(f: (() -> Double)? = null): Double =
        template("arcWidth", f, this, arcWidthProperty()!! as ObservableValue<Double>)

// javafx.scene.effect.Light.Spot

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.Light.Spot.pointsAtZ(f: (() -> Double)? = null): Double =
        template("pointsAtZ", f, this, pointsAtZProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.Light.Spot.specularExponent(f: (() -> Double)? = null): Double =
        template("specularExponent", f, this, specularExponentProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.Light.Spot.pointsAtY(f: (() -> Double)? = null): Double =
        template("pointsAtY", f, this, pointsAtYProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.Light.Spot.pointsAtX(f: (() -> Double)? = null): Double =
        template("pointsAtX", f, this, pointsAtXProperty()!! as ObservableValue<Double>)

// javafx.scene.canvas.Canvas

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.canvas.Canvas.width(f: (() -> Double)? = null): Double =
        template("width", f, this, widthProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.canvas.Canvas.height(f: (() -> Double)? = null): Double =
        template("height", f, this, heightProperty()!! as ObservableValue<Double>)

// javafx.scene.control.cell.ComboBoxTreeTableCell

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S, T> javafx.scene.control.cell.ComboBoxTreeTableCell<S, T>.converter(f: (() -> javafx.util.StringConverter<T>)? = null): javafx.util.StringConverter<T> =
        template("converter", f, this, converterProperty()!! as ObservableValue<javafx.util.StringConverter<T>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S, T> javafx.scene.control.cell.ComboBoxTreeTableCell<S, T>.comboBoxEditable(f: (() -> Boolean)? = null): Boolean =
        template("comboBoxEditable", f, this, comboBoxEditableProperty()!! as ObservableValue<Boolean>)

// javafx.scene.control.TreeTableView

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S> javafx.scene.control.TreeTableView<S>.comparator(f: (() -> java.util.Comparator<javafx.scene.control.TreeItem<S>>)? = null): java.util.Comparator<javafx.scene.control.TreeItem<S>> =
        template("comparator", f, this, comparatorProperty()!! as ObservableValue<java.util.Comparator<javafx.scene.control.TreeItem<S>>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S> javafx.scene.control.TreeTableView<S>.showRoot(f: (() -> Boolean)? = null): Boolean =
        template("showRoot", f, this, showRootProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S> javafx.scene.control.TreeTableView<S>.onSort(f: (() -> javafx.event.EventHandler<javafx.scene.control.SortEvent<javafx.scene.control.TreeTableView<S>>>)? = null): javafx.event.EventHandler<javafx.scene.control.SortEvent<javafx.scene.control.TreeTableView<S>>> =
        template("onSort", f, this, onSortProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.scene.control.SortEvent<javafx.scene.control.TreeTableView<S>>>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S> javafx.scene.control.TreeTableView<S>.sortMode(f: (() -> javafx.scene.control.TreeSortMode)? = null): javafx.scene.control.TreeSortMode =
        template("sortMode", f, this, sortModeProperty()!! as ObservableValue<javafx.scene.control.TreeSortMode>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S> javafx.scene.control.TreeTableView<S>.focusModel(f: (() -> javafx.scene.control.TreeTableView.TreeTableViewFocusModel<S>)? = null): javafx.scene.control.TreeTableView.TreeTableViewFocusModel<S> =
        template("focusModel", f, this, focusModelProperty()!! as ObservableValue<javafx.scene.control.TreeTableView.TreeTableViewFocusModel<S>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S> javafx.scene.control.TreeTableView<S>.onScrollTo(f: (() -> javafx.event.EventHandler<javafx.scene.control.ScrollToEvent<Int>>)? = null): javafx.event.EventHandler<javafx.scene.control.ScrollToEvent<Int>> =
        template("onScrollTo", f, this, onScrollToProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.scene.control.ScrollToEvent<Int>>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S> javafx.scene.control.TreeTableView<S>.selectionModel(f: (() -> javafx.scene.control.TreeTableView.TreeTableViewSelectionModel<S>)? = null): javafx.scene.control.TreeTableView.TreeTableViewSelectionModel<S> =
        template("selectionModel", f, this, selectionModelProperty()!! as ObservableValue<javafx.scene.control.TreeTableView.TreeTableViewSelectionModel<S>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S> javafx.scene.control.TreeTableView<S>.placeholder(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
        template("placeholder", f, this, placeholderProperty()!! as ObservableValue<javafx.scene.Node>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S> javafx.scene.control.TreeTableView<S>.sortPolicy(f: (() -> javafx.util.Callback<javafx.scene.control.TreeTableView<S>, Boolean>)? = null): javafx.util.Callback<javafx.scene.control.TreeTableView<S>, Boolean> =
        template("sortPolicy", f, this, sortPolicyProperty()!! as ObservableValue<javafx.util.Callback<javafx.scene.control.TreeTableView<S>, Boolean>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S> javafx.scene.control.TreeTableView<S>.tableMenuButtonVisible(f: (() -> Boolean)? = null): Boolean =
        template("tableMenuButtonVisible", f, this, tableMenuButtonVisibleProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S> javafx.scene.control.TreeTableView<S>.editingCell(f: (() -> javafx.scene.control.TreeTablePosition<S, *>)? = null): javafx.scene.control.TreeTablePosition<S, *> =
        template("editingCell", f, this, editingCellProperty()!! as ObservableValue<javafx.scene.control.TreeTablePosition<S, *>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S> javafx.scene.control.TreeTableView<S>.expandedItemCount(f: (() -> Int)? = null): Int =
        template("expandedItemCount", f, this, expandedItemCountProperty()!! as ObservableValue<Int>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S> javafx.scene.control.TreeTableView<S>.treeColumn(f: (() -> javafx.scene.control.TreeTableColumn<S, *>)? = null): javafx.scene.control.TreeTableColumn<S, *> =
        template("treeColumn", f, this, treeColumnProperty()!! as ObservableValue<javafx.scene.control.TreeTableColumn<S, *>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S> javafx.scene.control.TreeTableView<S>.onScrollToColumn(f: (() -> javafx.event.EventHandler<javafx.scene.control.ScrollToEvent<javafx.scene.control.TreeTableColumn<S, *>>>)? = null): javafx.event.EventHandler<javafx.scene.control.ScrollToEvent<javafx.scene.control.TreeTableColumn<S, *>>> =
        template("onScrollToColumn", f, this, onScrollToColumnProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.scene.control.ScrollToEvent<javafx.scene.control.TreeTableColumn<S, *>>>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S> javafx.scene.control.TreeTableView<S>.rowFactory(f: (() -> javafx.util.Callback<javafx.scene.control.TreeTableView<S>, javafx.scene.control.TreeTableRow<S>>)? = null): javafx.util.Callback<javafx.scene.control.TreeTableView<S>, javafx.scene.control.TreeTableRow<S>> =
        template("rowFactory", f, this, rowFactoryProperty()!! as ObservableValue<javafx.util.Callback<javafx.scene.control.TreeTableView<S>, javafx.scene.control.TreeTableRow<S>>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S> javafx.scene.control.TreeTableView<S>.columnResizePolicy(f: (() -> javafx.util.Callback<javafx.scene.control.TreeTableView.ResizeFeatures<S>, Boolean>)? = null): javafx.util.Callback<javafx.scene.control.TreeTableView.ResizeFeatures<S>, Boolean> =
        template("columnResizePolicy", f, this, columnResizePolicyProperty()!! as ObservableValue<javafx.util.Callback<javafx.scene.control.TreeTableView.ResizeFeatures<S>, Boolean>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S> javafx.scene.control.TreeTableView<S>.fixedCellSize(f: (() -> Double)? = null): Double =
        template("fixedCellSize", f, this, fixedCellSizeProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S> javafx.scene.control.TreeTableView<S>.root(f: (() -> javafx.scene.control.TreeItem<S>)? = null): javafx.scene.control.TreeItem<S> =
        template("root", f, this, rootProperty()!! as ObservableValue<javafx.scene.control.TreeItem<S>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S> javafx.scene.control.TreeTableView<S>.editable(f: (() -> Boolean)? = null): Boolean =
        template("editable", f, this, editableProperty()!! as ObservableValue<Boolean>)

// javafx.scene.control.MenuItem

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.MenuItem.visible(f: (() -> Boolean)? = null): Boolean =
        template("visible", f, this, visibleProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.MenuItem.style(f: (() -> String)? = null): String =
        template("style", f, this, styleProperty()!! as ObservableValue<String>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.MenuItem.graphic(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
        template("graphic", f, this, graphicProperty()!! as ObservableValue<javafx.scene.Node>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.MenuItem.mnemonicParsing(f: (() -> Boolean)? = null): Boolean =
        template("mnemonicParsing", f, this, mnemonicParsingProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.MenuItem.accelerator(f: (() -> javafx.scene.input.KeyCombination)? = null): javafx.scene.input.KeyCombination =
        template("accelerator", f, this, acceleratorProperty()!! as ObservableValue<javafx.scene.input.KeyCombination>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.MenuItem.onMenuValidation(f: (() -> javafx.event.EventHandler<javafx.event.Event>)? = null): javafx.event.EventHandler<javafx.event.Event> =
        template("onMenuValidation", f, this, onMenuValidationProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.event.Event>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.MenuItem.parentPopup(f: (() -> javafx.scene.control.ContextMenu)? = null): javafx.scene.control.ContextMenu =
        template("parentPopup", f, this, parentPopupProperty()!! as ObservableValue<javafx.scene.control.ContextMenu>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.MenuItem.parentMenu(f: (() -> javafx.scene.control.Menu)? = null): javafx.scene.control.Menu =
        template("parentMenu", f, this, parentMenuProperty()!! as ObservableValue<javafx.scene.control.Menu>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.MenuItem.text(f: (() -> String)? = null): String =
        template("text", f, this, textProperty()!! as ObservableValue<String>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.MenuItem.onAction(f: (() -> javafx.event.EventHandler<javafx.event.ActionEvent>)? = null): javafx.event.EventHandler<javafx.event.ActionEvent> =
        template("onAction", f, this, onActionProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.event.ActionEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.MenuItem.disable(f: (() -> Boolean)? = null): Boolean =
        template("disable", f, this, disableProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.MenuItem.id(f: (() -> String)? = null): String =
        template("id", f, this, idProperty()!! as ObservableValue<String>)

// javafx.scene.control.cell.TextFieldTreeTableCell

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S, T> javafx.scene.control.cell.TextFieldTreeTableCell<S, T>.converter(f: (() -> javafx.util.StringConverter<T>)? = null): javafx.util.StringConverter<T> =
        template("converter", f, this, converterProperty()!! as ObservableValue<javafx.util.StringConverter<T>>)

// javafx.scene.shape.PathElement

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.PathElement.absolute(f: (() -> Boolean)? = null): Boolean =
        template("absolute", f, this, absoluteProperty()!! as ObservableValue<Boolean>)

// javafx.scene.effect.DropShadow

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.DropShadow.width(f: (() -> Double)? = null): Double =
        template("width", f, this, widthProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.DropShadow.height(f: (() -> Double)? = null): Double =
        template("height", f, this, heightProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.DropShadow.color(f: (() -> javafx.scene.paint.Color)? = null): javafx.scene.paint.Color =
        template("color", f, this, colorProperty()!! as ObservableValue<javafx.scene.paint.Color>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.DropShadow.offsetY(f: (() -> Double)? = null): Double =
        template("offsetY", f, this, offsetYProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.DropShadow.offsetX(f: (() -> Double)? = null): Double =
        template("offsetX", f, this, offsetXProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.DropShadow.spread(f: (() -> Double)? = null): Double =
        template("spread", f, this, spreadProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.DropShadow.input(f: (() -> javafx.scene.effect.Effect)? = null): javafx.scene.effect.Effect =
        template("input", f, this, inputProperty()!! as ObservableValue<javafx.scene.effect.Effect>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.DropShadow.blurType(f: (() -> javafx.scene.effect.BlurType)? = null): javafx.scene.effect.BlurType =
        template("blurType", f, this, blurTypeProperty()!! as ObservableValue<javafx.scene.effect.BlurType>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.DropShadow.radius(f: (() -> Double)? = null): Double =
        template("radius", f, this, radiusProperty()!! as ObservableValue<Double>)

// javafx.scene.layout.TilePane

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.TilePane.tileHeight(f: (() -> Double)? = null): Double =
        template("tileHeight", f, this, tileHeightProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.TilePane.tileWidth(f: (() -> Double)? = null): Double =
        template("tileWidth", f, this, tileWidthProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.TilePane.orientation(f: (() -> javafx.geometry.Orientation)? = null): javafx.geometry.Orientation =
        template("orientation", f, this, orientationProperty()!! as ObservableValue<javafx.geometry.Orientation>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.TilePane.alignment(f: (() -> javafx.geometry.Pos)? = null): javafx.geometry.Pos =
        template("alignment", f, this, alignmentProperty()!! as ObservableValue<javafx.geometry.Pos>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.TilePane.prefColumns(f: (() -> Int)? = null): Int =
        template("prefColumns", f, this, prefColumnsProperty()!! as ObservableValue<Int>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.TilePane.tileAlignment(f: (() -> javafx.geometry.Pos)? = null): javafx.geometry.Pos =
        template("tileAlignment", f, this, tileAlignmentProperty()!! as ObservableValue<javafx.geometry.Pos>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.TilePane.prefTileWidth(f: (() -> Double)? = null): Double =
        template("prefTileWidth", f, this, prefTileWidthProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.TilePane.prefTileHeight(f: (() -> Double)? = null): Double =
        template("prefTileHeight", f, this, prefTileHeightProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.TilePane.vgap(f: (() -> Double)? = null): Double =
        template("vgap", f, this, vgapProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.TilePane.prefRows(f: (() -> Int)? = null): Int =
        template("prefRows", f, this, prefRowsProperty()!! as ObservableValue<Int>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.TilePane.hgap(f: (() -> Double)? = null): Double =
        template("hgap", f, this, hgapProperty()!! as ObservableValue<Double>)

// javafx.scene.control.Spinner

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.Spinner<T>.value(f: (() -> T)? = null): T =
        template("value", f, this, valueProperty()!! as ObservableValue<T>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.Spinner<T>.editor(f: (() -> javafx.scene.control.TextField)? = null): javafx.scene.control.TextField =
        template("editor", f, this, editorProperty()!! as ObservableValue<javafx.scene.control.TextField>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.Spinner<T>.valueFactory(f: (() -> javafx.scene.control.SpinnerValueFactory<T>)? = null): javafx.scene.control.SpinnerValueFactory<T> =
        template("valueFactory", f, this, valueFactoryProperty()!! as ObservableValue<javafx.scene.control.SpinnerValueFactory<T>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.Spinner<T>.editable(f: (() -> Boolean)? = null): Boolean =
        template("editable", f, this, editableProperty()!! as ObservableValue<Boolean>)

// javafx.scene.layout.RowConstraints

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.RowConstraints.percentHeight(f: (() -> Double)? = null): Double =
        template("percentHeight", f, this, percentHeightProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.RowConstraints.fillHeight(f: (() -> Boolean)? = null): Boolean =
        template("fillHeight", f, this, fillHeightProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.RowConstraints.maxHeight(f: (() -> Double)? = null): Double =
        template("maxHeight", f, this, maxHeightProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.RowConstraints.prefHeight(f: (() -> Double)? = null): Double =
        template("prefHeight", f, this, prefHeightProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.RowConstraints.minHeight(f: (() -> Double)? = null): Double =
        template("minHeight", f, this, minHeightProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.RowConstraints.valignment(f: (() -> javafx.geometry.VPos)? = null): javafx.geometry.VPos =
        template("valignment", f, this, valignmentProperty()!! as ObservableValue<javafx.geometry.VPos>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.RowConstraints.vgrow(f: (() -> javafx.scene.layout.Priority)? = null): javafx.scene.layout.Priority =
        template("vgrow", f, this, vgrowProperty()!! as ObservableValue<javafx.scene.layout.Priority>)

// javafx.scene.control.SplitPane.Divider

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.SplitPane.Divider.position(f: (() -> Double)? = null): Double =
        template("position", f, this, positionProperty()!! as ObservableValue<Double>)

// javafx.scene.shape.VLineTo

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.VLineTo.y(f: (() -> Double)? = null): Double =
        template("y", f, this, yProperty()!! as ObservableValue<Double>)

// javafx.scene.effect.Lighting

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.Lighting.specularConstant(f: (() -> Double)? = null): Double =
        template("specularConstant", f, this, specularConstantProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.Lighting.diffuseConstant(f: (() -> Double)? = null): Double =
        template("diffuseConstant", f, this, diffuseConstantProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.Lighting.specularExponent(f: (() -> Double)? = null): Double =
        template("specularExponent", f, this, specularExponentProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.Lighting.surfaceScale(f: (() -> Double)? = null): Double =
        template("surfaceScale", f, this, surfaceScaleProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.Lighting.bumpInput(f: (() -> javafx.scene.effect.Effect)? = null): javafx.scene.effect.Effect =
        template("bumpInput", f, this, bumpInputProperty()!! as ObservableValue<javafx.scene.effect.Effect>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.Lighting.contentInput(f: (() -> javafx.scene.effect.Effect)? = null): javafx.scene.effect.Effect =
        template("contentInput", f, this, contentInputProperty()!! as ObservableValue<javafx.scene.effect.Effect>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.Lighting.light(f: (() -> javafx.scene.effect.Light)? = null): javafx.scene.effect.Light =
        template("light", f, this, lightProperty()!! as ObservableValue<javafx.scene.effect.Light>)

// javafx.animation.ParallelTransition

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.animation.ParallelTransition.node(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
        template("node", f, this, nodeProperty()!! as ObservableValue<javafx.scene.Node>)

// javafx.beans.binding.ListBinding

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <E> javafx.beans.binding.ListBinding<E>.size(f: (() -> Int)? = null): Int =
        template("size", f, this, sizeProperty()!! as ObservableValue<Int>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <E> javafx.beans.binding.ListBinding<E>.empty(f: (() -> Boolean)? = null): Boolean =
        template("empty", f, this, emptyProperty()!! as ObservableValue<Boolean>)

// javafx.scene.control.TableRow

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.TableRow<T>.tableView(f: (() -> javafx.scene.control.TableView<T>)? = null): javafx.scene.control.TableView<T> =
        template("tableView", f, this, tableViewProperty()!! as ObservableValue<javafx.scene.control.TableView<T>>)

// javafx.stage.FileChooser

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.stage.FileChooser.initialDirectory(f: (() -> java.io.File)? = null): java.io.File =
        template("initialDirectory", f, this, initialDirectoryProperty()!! as ObservableValue<java.io.File>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.stage.FileChooser.title(f: (() -> String)? = null): String =
        template("title", f, this, titleProperty()!! as ObservableValue<String>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.stage.FileChooser.selectedExtensionFilter(f: (() -> javafx.stage.FileChooser.ExtensionFilter)? = null): javafx.stage.FileChooser.ExtensionFilter =
        template("selectedExtensionFilter", f, this, selectedExtensionFilterProperty()!! as ObservableValue<javafx.stage.FileChooser.ExtensionFilter>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.stage.FileChooser.initialFileName(f: (() -> String)? = null): String =
        template("initialFileName", f, this, initialFileNameProperty()!! as ObservableValue<String>)

// javafx.animation.TranslateTransition

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.animation.TranslateTransition.duration(f: (() -> javafx.util.Duration)? = null): javafx.util.Duration =
        template("duration", f, this, durationProperty()!! as ObservableValue<javafx.util.Duration>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.animation.TranslateTransition.node(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
        template("node", f, this, nodeProperty()!! as ObservableValue<javafx.scene.Node>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.animation.TranslateTransition.toZ(f: (() -> Double)? = null): Double =
        template("toZ", f, this, toZProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.animation.TranslateTransition.byY(f: (() -> Double)? = null): Double =
        template("byY", f, this, byYProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.animation.TranslateTransition.fromX(f: (() -> Double)? = null): Double =
        template("fromX", f, this, fromXProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.animation.TranslateTransition.fromZ(f: (() -> Double)? = null): Double =
        template("fromZ", f, this, fromZProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.animation.TranslateTransition.byX(f: (() -> Double)? = null): Double =
        template("byX", f, this, byXProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.animation.TranslateTransition.toX(f: (() -> Double)? = null): Double =
        template("toX", f, this, toXProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.animation.TranslateTransition.toY(f: (() -> Double)? = null): Double =
        template("toY", f, this, toYProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.animation.TranslateTransition.byZ(f: (() -> Double)? = null): Double =
        template("byZ", f, this, byZProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.animation.TranslateTransition.fromY(f: (() -> Double)? = null): Double =
        template("fromY", f, this, fromYProperty()!! as ObservableValue<Double>)

// javafx.scene.control.TableColumnBase

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S, T> javafx.scene.control.TableColumnBase<S, T>.sortable(f: (() -> Boolean)? = null): Boolean =
        template("sortable", f, this, sortableProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S, T> javafx.scene.control.TableColumnBase<S, T>.visible(f: (() -> Boolean)? = null): Boolean =
        template("visible", f, this, visibleProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S, T> javafx.scene.control.TableColumnBase<S, T>.style(f: (() -> String)? = null): String =
        template("style", f, this, styleProperty()!! as ObservableValue<String>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S, T> javafx.scene.control.TableColumnBase<S, T>.width(f: (() -> Double)? = null): Double =
        template("width", f, this, widthProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S, T> javafx.scene.control.TableColumnBase<S, T>.graphic(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
        template("graphic", f, this, graphicProperty()!! as ObservableValue<javafx.scene.Node>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S, T> javafx.scene.control.TableColumnBase<S, T>.contextMenu(f: (() -> javafx.scene.control.ContextMenu)? = null): javafx.scene.control.ContextMenu =
        template("contextMenu", f, this, contextMenuProperty()!! as ObservableValue<javafx.scene.control.ContextMenu>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S, T> javafx.scene.control.TableColumnBase<S, T>.prefWidth(f: (() -> Double)? = null): Double =
        template("prefWidth", f, this, prefWidthProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S, T> javafx.scene.control.TableColumnBase<S, T>.parentColumn(f: (() -> javafx.scene.control.TableColumnBase<S, *>)? = null): javafx.scene.control.TableColumnBase<S, *> =
        template("parentColumn", f, this, parentColumnProperty()!! as ObservableValue<javafx.scene.control.TableColumnBase<S, *>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S, T> javafx.scene.control.TableColumnBase<S, T>.comparator(f: (() -> java.util.Comparator<T>)? = null): java.util.Comparator<T> =
        template("comparator", f, this, comparatorProperty()!! as ObservableValue<java.util.Comparator<T>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S, T> javafx.scene.control.TableColumnBase<S, T>.resizable(f: (() -> Boolean)? = null): Boolean =
        template("resizable", f, this, resizableProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S, T> javafx.scene.control.TableColumnBase<S, T>.text(f: (() -> String)? = null): String =
        template("text", f, this, textProperty()!! as ObservableValue<String>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S, T> javafx.scene.control.TableColumnBase<S, T>.maxWidth(f: (() -> Double)? = null): Double =
        template("maxWidth", f, this, maxWidthProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S, T> javafx.scene.control.TableColumnBase<S, T>.editable(f: (() -> Boolean)? = null): Boolean =
        template("editable", f, this, editableProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S, T> javafx.scene.control.TableColumnBase<S, T>.minWidth(f: (() -> Double)? = null): Double =
        template("minWidth", f, this, minWidthProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S, T> javafx.scene.control.TableColumnBase<S, T>.sortNode(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
        template("sortNode", f, this, sortNodeProperty()!! as ObservableValue<javafx.scene.Node>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S, T> javafx.scene.control.TableColumnBase<S, T>.id(f: (() -> String)? = null): String =
        template("id", f, this, idProperty()!! as ObservableValue<String>)

// javafx.scene.layout.Region

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.Region.width(f: (() -> Double)? = null): Double =
        template("width", f, this, widthProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.Region.height(f: (() -> Double)? = null): Double =
        template("height", f, this, heightProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.Region.prefWidth(f: (() -> Double)? = null): Double =
        template("prefWidth", f, this, prefWidthProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.Region.border(f: (() -> javafx.scene.layout.Border)? = null): javafx.scene.layout.Border =
        template("border", f, this, borderProperty()!! as ObservableValue<javafx.scene.layout.Border>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.Region.insets(f: (() -> javafx.geometry.Insets)? = null): javafx.geometry.Insets =
        template("insets", f, this, insetsProperty()!! as ObservableValue<javafx.geometry.Insets>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.Region.background(f: (() -> javafx.scene.layout.Background)? = null): javafx.scene.layout.Background =
        template("background", f, this, backgroundProperty()!! as ObservableValue<javafx.scene.layout.Background>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.Region.maxHeight(f: (() -> Double)? = null): Double =
        template("maxHeight", f, this, maxHeightProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.Region.prefHeight(f: (() -> Double)? = null): Double =
        template("prefHeight", f, this, prefHeightProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.Region.minHeight(f: (() -> Double)? = null): Double =
        template("minHeight", f, this, minHeightProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.Region.cacheShape(f: (() -> Boolean)? = null): Boolean =
        template("cacheShape", f, this, cacheShapeProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.Region.centerShape(f: (() -> Boolean)? = null): Boolean =
        template("centerShape", f, this, centerShapeProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.Region.scaleShape(f: (() -> Boolean)? = null): Boolean =
        template("scaleShape", f, this, scaleShapeProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.Region.opaqueInsets(f: (() -> javafx.geometry.Insets)? = null): javafx.geometry.Insets =
        template("opaqueInsets", f, this, opaqueInsetsProperty()!! as ObservableValue<javafx.geometry.Insets>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.Region.snapToPixel(f: (() -> Boolean)? = null): Boolean =
        template("snapToPixel", f, this, snapToPixelProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.Region.shape(f: (() -> javafx.scene.shape.Shape)? = null): javafx.scene.shape.Shape =
        template("shape", f, this, shapeProperty()!! as ObservableValue<javafx.scene.shape.Shape>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.Region.padding(f: (() -> javafx.geometry.Insets)? = null): javafx.geometry.Insets =
        template("padding", f, this, paddingProperty()!! as ObservableValue<javafx.geometry.Insets>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.Region.maxWidth(f: (() -> Double)? = null): Double =
        template("maxWidth", f, this, maxWidthProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.Region.minWidth(f: (() -> Double)? = null): Double =
        template("minWidth", f, this, minWidthProperty()!! as ObservableValue<Double>)

// javafx.animation.ScaleTransition

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.animation.ScaleTransition.duration(f: (() -> javafx.util.Duration)? = null): javafx.util.Duration =
        template("duration", f, this, durationProperty()!! as ObservableValue<javafx.util.Duration>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.animation.ScaleTransition.node(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
        template("node", f, this, nodeProperty()!! as ObservableValue<javafx.scene.Node>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.animation.ScaleTransition.toZ(f: (() -> Double)? = null): Double =
        template("toZ", f, this, toZProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.animation.ScaleTransition.byY(f: (() -> Double)? = null): Double =
        template("byY", f, this, byYProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.animation.ScaleTransition.fromX(f: (() -> Double)? = null): Double =
        template("fromX", f, this, fromXProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.animation.ScaleTransition.fromZ(f: (() -> Double)? = null): Double =
        template("fromZ", f, this, fromZProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.animation.ScaleTransition.byX(f: (() -> Double)? = null): Double =
        template("byX", f, this, byXProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.animation.ScaleTransition.toX(f: (() -> Double)? = null): Double =
        template("toX", f, this, toXProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.animation.ScaleTransition.toY(f: (() -> Double)? = null): Double =
        template("toY", f, this, toYProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.animation.ScaleTransition.byZ(f: (() -> Double)? = null): Double =
        template("byZ", f, this, byZProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.animation.ScaleTransition.fromY(f: (() -> Double)? = null): Double =
        template("fromY", f, this, fromYProperty()!! as ObservableValue<Double>)

// javafx.scene.effect.Glow

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.Glow.level(f: (() -> Double)? = null): Double =
        template("level", f, this, levelProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.Glow.input(f: (() -> javafx.scene.effect.Effect)? = null): javafx.scene.effect.Effect =
        template("input", f, this, inputProperty()!! as ObservableValue<javafx.scene.effect.Effect>)

// javafx.scene.control.SplitPane

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.SplitPane.orientation(f: (() -> javafx.geometry.Orientation)? = null): javafx.geometry.Orientation =
        template("orientation", f, this, orientationProperty()!! as ObservableValue<javafx.geometry.Orientation>)

// javafx.scene.media.AudioClip

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.media.AudioClip.balance(f: (() -> Double)? = null): Double =
        template("balance", f, this, balanceProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.media.AudioClip.pan(f: (() -> Double)? = null): Double =
        template("pan", f, this, panProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.media.AudioClip.volume(f: (() -> Double)? = null): Double =
        template("volume", f, this, volumeProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.media.AudioClip.rate(f: (() -> Double)? = null): Double =
        template("rate", f, this, rateProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.media.AudioClip.priority(f: (() -> Int)? = null): Int =
        template("priority", f, this, priorityProperty()!! as ObservableValue<Int>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.media.AudioClip.cycleCount(f: (() -> Int)? = null): Int =
        template("cycleCount", f, this, cycleCountProperty()!! as ObservableValue<Int>)

// javafx.beans.property.ListPropertyBase

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <E> javafx.beans.property.ListPropertyBase<E>.size(f: (() -> Int)? = null): Int =
        template("size", f, this, sizeProperty()!! as ObservableValue<Int>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <E> javafx.beans.property.ListPropertyBase<E>.empty(f: (() -> Boolean)? = null): Boolean =
        template("empty", f, this, emptyProperty()!! as ObservableValue<Boolean>)

// javafx.scene.effect.GaussianBlur

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.GaussianBlur.input(f: (() -> javafx.scene.effect.Effect)? = null): javafx.scene.effect.Effect =
        template("input", f, this, inputProperty()!! as ObservableValue<javafx.scene.effect.Effect>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.GaussianBlur.radius(f: (() -> Double)? = null): Double =
        template("radius", f, this, radiusProperty()!! as ObservableValue<Double>)

// javafx.collections.transformation.FilteredList

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <E> javafx.collections.transformation.FilteredList<E>.predicate(f: (() -> java.util.function.Predicate<in E>)? = null): java.util.function.Predicate<in E> =
        template("predicate", f, this, predicateProperty()!! as ObservableValue<java.util.function.Predicate<in E>>)

// javafx.scene.Group

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Group.autoSizeChildren(f: (() -> Boolean)? = null): Boolean =
        template("autoSizeChildren", f, this, autoSizeChildrenProperty()!! as ObservableValue<Boolean>)

// javafx.scene.control.cell.ComboBoxTreeCell

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.cell.ComboBoxTreeCell<T>.converter(f: (() -> javafx.util.StringConverter<T>)? = null): javafx.util.StringConverter<T> =
        template("converter", f, this, converterProperty()!! as ObservableValue<javafx.util.StringConverter<T>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.cell.ComboBoxTreeCell<T>.comboBoxEditable(f: (() -> Boolean)? = null): Boolean =
        template("comboBoxEditable", f, this, comboBoxEditableProperty()!! as ObservableValue<Boolean>)

// javafx.beans.property.ReadOnlyListWrapper

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <E> javafx.beans.property.ReadOnlyListWrapper<E>.getReadOnly(f: (() -> E)? = null): E =
        template("getReadOnly", f, this, getReadOnlyProperty()!! as ObservableValue<E>)

// javafx.beans.binding.SetExpression

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <E> javafx.beans.binding.SetExpression<E>.size(f: (() -> Int)? = null): Int =
        template("size", f, this, sizeProperty()!! as ObservableValue<Int>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <E> javafx.beans.binding.SetExpression<E>.empty(f: (() -> Boolean)? = null): Boolean =
        template("empty", f, this, emptyProperty()!! as ObservableValue<Boolean>)

// javafx.scene.chart.PieChart

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.chart.PieChart.data(f: (() -> javafx.collections.ObservableList<javafx.scene.chart.PieChart.Data>)? = null): javafx.collections.ObservableList<javafx.scene.chart.PieChart.Data> =
        template("data", f, this, dataProperty()!! as ObservableValue<javafx.collections.ObservableList<javafx.scene.chart.PieChart.Data>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.chart.PieChart.clockwise(f: (() -> Boolean)? = null): Boolean =
        template("clockwise", f, this, clockwiseProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.chart.PieChart.labelLineLength(f: (() -> Double)? = null): Double =
        template("labelLineLength", f, this, labelLineLengthProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.chart.PieChart.labelsVisible(f: (() -> Boolean)? = null): Boolean =
        template("labelsVisible", f, this, labelsVisibleProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.chart.PieChart.startAngle(f: (() -> Double)? = null): Double =
        template("startAngle", f, this, startAngleProperty()!! as ObservableValue<Double>)

// javafx.scene.layout.VBox

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.VBox.alignment(f: (() -> javafx.geometry.Pos)? = null): javafx.geometry.Pos =
        template("alignment", f, this, alignmentProperty()!! as ObservableValue<javafx.geometry.Pos>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.VBox.fillWidth(f: (() -> Boolean)? = null): Boolean =
        template("fillWidth", f, this, fillWidthProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.VBox.spacing(f: (() -> Double)? = null): Double =
        template("spacing", f, this, spacingProperty()!! as ObservableValue<Double>)

// javafx.scene.web.WebEngine

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.web.WebEngine.title(f: (() -> String)? = null): String =
        template("title", f, this, titleProperty()!! as ObservableValue<String>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.web.WebEngine.location(f: (() -> String)? = null): String =
        template("location", f, this, locationProperty()!! as ObservableValue<String>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.web.WebEngine.onAlert(f: (() -> javafx.event.EventHandler<javafx.scene.web.WebEvent<String>>)? = null): javafx.event.EventHandler<javafx.scene.web.WebEvent<String>> =
        template("onAlert", f, this, onAlertProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.scene.web.WebEvent<String>>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.web.WebEngine.onError(f: (() -> javafx.event.EventHandler<javafx.scene.web.WebErrorEvent>)? = null): javafx.event.EventHandler<javafx.scene.web.WebErrorEvent> =
        template("onError", f, this, onErrorProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.scene.web.WebErrorEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.web.WebEngine.document(f: (() -> org.w3c.dom.Document)? = null): org.w3c.dom.Document =
        template("document", f, this, documentProperty()!! as ObservableValue<org.w3c.dom.Document>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.web.WebEngine.javaScriptEnabled(f: (() -> Boolean)? = null): Boolean =
        template("javaScriptEnabled", f, this, javaScriptEnabledProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.web.WebEngine.onResized(f: (() -> javafx.event.EventHandler<javafx.scene.web.WebEvent<javafx.geometry.Rectangle2D>>)? = null): javafx.event.EventHandler<javafx.scene.web.WebEvent<javafx.geometry.Rectangle2D>> =
        template("onResized", f, this, onResizedProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.scene.web.WebEvent<javafx.geometry.Rectangle2D>>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.web.WebEngine.promptHandler(f: (() -> javafx.util.Callback<javafx.scene.web.PromptData, String>)? = null): javafx.util.Callback<javafx.scene.web.PromptData, String> =
        template("promptHandler", f, this, promptHandlerProperty()!! as ObservableValue<javafx.util.Callback<javafx.scene.web.PromptData, String>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.web.WebEngine.userDataDirectory(f: (() -> java.io.File)? = null): java.io.File =
        template("userDataDirectory", f, this, userDataDirectoryProperty()!! as ObservableValue<java.io.File>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.web.WebEngine.confirmHandler(f: (() -> javafx.util.Callback<String, Boolean>)? = null): javafx.util.Callback<String, Boolean> =
        template("confirmHandler", f, this, confirmHandlerProperty()!! as ObservableValue<javafx.util.Callback<String, Boolean>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.web.WebEngine.onStatusChanged(f: (() -> javafx.event.EventHandler<javafx.scene.web.WebEvent<String>>)? = null): javafx.event.EventHandler<javafx.scene.web.WebEvent<String>> =
        template("onStatusChanged", f, this, onStatusChangedProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.scene.web.WebEvent<String>>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.web.WebEngine.onVisibilityChanged(f: (() -> javafx.event.EventHandler<javafx.scene.web.WebEvent<Boolean>>)? = null): javafx.event.EventHandler<javafx.scene.web.WebEvent<Boolean>> =
        template("onVisibilityChanged", f, this, onVisibilityChangedProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.scene.web.WebEvent<Boolean>>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.web.WebEngine.createPopupHandler(f: (() -> javafx.util.Callback<javafx.scene.web.PopupFeatures, javafx.scene.web.WebEngine>)? = null): javafx.util.Callback<javafx.scene.web.PopupFeatures, javafx.scene.web.WebEngine> =
        template("createPopupHandler", f, this, createPopupHandlerProperty()!! as ObservableValue<javafx.util.Callback<javafx.scene.web.PopupFeatures, javafx.scene.web.WebEngine>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.web.WebEngine.userAgent(f: (() -> String)? = null): String =
        template("userAgent", f, this, userAgentProperty()!! as ObservableValue<String>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.web.WebEngine.userStyleSheetLocation(f: (() -> String)? = null): String =
        template("userStyleSheetLocation", f, this, userStyleSheetLocationProperty()!! as ObservableValue<String>)

// javafx.scene.control.SpinnerValueFactory

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.SpinnerValueFactory<T>.value(f: (() -> T)? = null): T =
        template("value", f, this, valueProperty()!! as ObservableValue<T>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.SpinnerValueFactory<T>.converter(f: (() -> javafx.util.StringConverter<T>)? = null): javafx.util.StringConverter<T> =
        template("converter", f, this, converterProperty()!! as ObservableValue<javafx.util.StringConverter<T>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.SpinnerValueFactory<T>.wrapAround(f: (() -> Boolean)? = null): Boolean =
        template("wrapAround", f, this, wrapAroundProperty()!! as ObservableValue<Boolean>)

// javafx.scene.effect.SepiaTone

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.SepiaTone.level(f: (() -> Double)? = null): Double =
        template("level", f, this, levelProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.SepiaTone.input(f: (() -> javafx.scene.effect.Effect)? = null): javafx.scene.effect.Effect =
        template("input", f, this, inputProperty()!! as ObservableValue<javafx.scene.effect.Effect>)

// javafx.scene.shape.Arc

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.Arc.length(f: (() -> Double)? = null): Double =
        template("length", f, this, lengthProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.Arc.startAngle(f: (() -> Double)? = null): Double =
        template("startAngle", f, this, startAngleProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.Arc.typ(f: (() -> javafx.scene.shape.ArcType)? = null): javafx.scene.shape.ArcType =
        template("typ", f, this, typeProperty()!! as ObservableValue<javafx.scene.shape.ArcType>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.Arc.radiusX(f: (() -> Double)? = null): Double =
        template("radiusX", f, this, radiusXProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.Arc.radiusY(f: (() -> Double)? = null): Double =
        template("radiusY", f, this, radiusYProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.Arc.centerX(f: (() -> Double)? = null): Double =
        template("centerX", f, this, centerXProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.Arc.centerY(f: (() -> Double)? = null): Double =
        template("centerY", f, this, centerYProperty()!! as ObservableValue<Double>)

// javafx.scene.control.TreeTableRow

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.TreeTableRow<T>.treeItem(f: (() -> javafx.scene.control.TreeItem<T>)? = null): javafx.scene.control.TreeItem<T> =
        template("treeItem", f, this, treeItemProperty()!! as ObservableValue<javafx.scene.control.TreeItem<T>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.TreeTableRow<T>.disclosureNode(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
        template("disclosureNode", f, this, disclosureNodeProperty()!! as ObservableValue<javafx.scene.Node>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.TreeTableRow<T>.treeTableView(f: (() -> javafx.scene.control.TreeTableView<T>)? = null): javafx.scene.control.TreeTableView<T> =
        template("treeTableView", f, this, treeTableViewProperty()!! as ObservableValue<javafx.scene.control.TreeTableView<T>>)

// javafx.scene.effect.Reflection

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.Reflection.topOpacity(f: (() -> Double)? = null): Double =
        template("topOpacity", f, this, topOpacityProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.Reflection.bottomOpacity(f: (() -> Double)? = null): Double =
        template("bottomOpacity", f, this, bottomOpacityProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.Reflection.topOffset(f: (() -> Double)? = null): Double =
        template("topOffset", f, this, topOffsetProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.Reflection.fraction(f: (() -> Double)? = null): Double =
        template("fraction", f, this, fractionProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.Reflection.input(f: (() -> javafx.scene.effect.Effect)? = null): javafx.scene.effect.Effect =
        template("input", f, this, inputProperty()!! as ObservableValue<javafx.scene.effect.Effect>)

// javafx.stage.Stage

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.stage.Stage.title(f: (() -> String)? = null): String =
        template("title", f, this, titleProperty()!! as ObservableValue<String>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.stage.Stage.alwaysOnTop(f: (() -> Boolean)? = null): Boolean =
        template("alwaysOnTop", f, this, alwaysOnTopProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.stage.Stage.fullScreenExitKey(f: (() -> javafx.scene.input.KeyCombination)? = null): javafx.scene.input.KeyCombination =
        template("fullScreenExitKey", f, this, fullScreenExitKeyProperty()!! as ObservableValue<javafx.scene.input.KeyCombination>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.stage.Stage.fullScreen(f: (() -> Boolean)? = null): Boolean =
        template("fullScreen", f, this, fullScreenProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.stage.Stage.iconified(f: (() -> Boolean)? = null): Boolean =
        template("iconified", f, this, iconifiedProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.stage.Stage.fullScreenExitHint(f: (() -> String)? = null): String =
        template("fullScreenExitHint", f, this, fullScreenExitHintProperty()!! as ObservableValue<String>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.stage.Stage.maximized(f: (() -> Boolean)? = null): Boolean =
        template("maximized", f, this, maximizedProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.stage.Stage.resizable(f: (() -> Boolean)? = null): Boolean =
        template("resizable", f, this, resizableProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.stage.Stage.maxHeight(f: (() -> Double)? = null): Double =
        template("maxHeight", f, this, maxHeightProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.stage.Stage.minHeight(f: (() -> Double)? = null): Double =
        template("minHeight", f, this, minHeightProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.stage.Stage.maxWidth(f: (() -> Double)? = null): Double =
        template("maxWidth", f, this, maxWidthProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.stage.Stage.minWidth(f: (() -> Double)? = null): Double =
        template("minWidth", f, this, minWidthProperty()!! as ObservableValue<Double>)

// javafx.scene.control.Slider

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Slider.value(f: (() -> Double)? = null): Double =
        template("value", f, this, valueProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Slider.max(f: (() -> Double)? = null): Double =
        template("max", f, this, maxProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Slider.min(f: (() -> Double)? = null): Double =
        template("min", f, this, minProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Slider.valueChanging(f: (() -> Boolean)? = null): Boolean =
        template("valueChanging", f, this, valueChangingProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Slider.labelFormatter(f: (() -> javafx.util.StringConverter<Double>)? = null): javafx.util.StringConverter<Double> =
        template("labelFormatter", f, this, labelFormatterProperty()!! as ObservableValue<javafx.util.StringConverter<Double>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Slider.showTickLabels(f: (() -> Boolean)? = null): Boolean =
        template("showTickLabels", f, this, showTickLabelsProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Slider.orientation(f: (() -> javafx.geometry.Orientation)? = null): javafx.geometry.Orientation =
        template("orientation", f, this, orientationProperty()!! as ObservableValue<javafx.geometry.Orientation>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Slider.majorTickUnit(f: (() -> Double)? = null): Double =
        template("majorTickUnit", f, this, majorTickUnitProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Slider.snapToTicks(f: (() -> Boolean)? = null): Boolean =
        template("snapToTicks", f, this, snapToTicksProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Slider.blockIncrement(f: (() -> Double)? = null): Double =
        template("blockIncrement", f, this, blockIncrementProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Slider.showTickMarks(f: (() -> Boolean)? = null): Boolean =
        template("showTickMarks", f, this, showTickMarksProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Slider.minorTickCount(f: (() -> Int)? = null): Int =
        template("minorTickCount", f, this, minorTickCountProperty()!! as ObservableValue<Int>)

// javafx.scene.Parent

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Parent.needsLayout(f: (() -> Boolean)? = null): Boolean =
        template("needsLayout", f, this, needsLayoutProperty()!! as ObservableValue<Boolean>)

// javafx.scene.shape.Sphere

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.Sphere.radius(f: (() -> Double)? = null): Double =
        template("radius", f, this, radiusProperty()!! as ObservableValue<Double>)

// javafx.scene.media.MediaPlayer

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.media.MediaPlayer.balance(f: (() -> Double)? = null): Double =
        template("balance", f, this, balanceProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.media.MediaPlayer.onError(f: (() -> Runnable)? = null): Runnable =
        template("onError", f, this, onErrorProperty()!! as ObservableValue<Runnable>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.media.MediaPlayer.volume(f: (() -> Double)? = null): Double =
        template("volume", f, this, volumeProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.media.MediaPlayer.rate(f: (() -> Double)? = null): Double =
        template("rate", f, this, rateProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.media.MediaPlayer.autoPlay(f: (() -> Boolean)? = null): Boolean =
        template("autoPlay", f, this, autoPlayProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.media.MediaPlayer.onPaused(f: (() -> Runnable)? = null): Runnable =
        template("onPaused", f, this, onPausedProperty()!! as ObservableValue<Runnable>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.media.MediaPlayer.onReady(f: (() -> Runnable)? = null): Runnable =
        template("onReady", f, this, onReadyProperty()!! as ObservableValue<Runnable>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.media.MediaPlayer.onRepeat(f: (() -> Runnable)? = null): Runnable =
        template("onRepeat", f, this, onRepeatProperty()!! as ObservableValue<Runnable>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.media.MediaPlayer.onHalted(f: (() -> Runnable)? = null): Runnable =
        template("onHalted", f, this, onHaltedProperty()!! as ObservableValue<Runnable>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.media.MediaPlayer.error(f: (() -> javafx.scene.media.MediaException)? = null): javafx.scene.media.MediaException =
        template("error", f, this, errorProperty()!! as ObservableValue<javafx.scene.media.MediaException>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.media.MediaPlayer.onMarker(f: (() -> javafx.event.EventHandler<javafx.scene.media.MediaMarkerEvent>)? = null): javafx.event.EventHandler<javafx.scene.media.MediaMarkerEvent> =
        template("onMarker", f, this, onMarkerProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.scene.media.MediaMarkerEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.media.MediaPlayer.mute(f: (() -> Boolean)? = null): Boolean =
        template("mute", f, this, muteProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.media.MediaPlayer.stopTime(f: (() -> javafx.util.Duration)? = null): javafx.util.Duration =
        template("stopTime", f, this, stopTimeProperty()!! as ObservableValue<javafx.util.Duration>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.media.MediaPlayer.status(f: (() -> javafx.scene.media.MediaPlayer.Status)? = null): javafx.scene.media.MediaPlayer.Status =
        template("status", f, this, statusProperty()!! as ObservableValue<javafx.scene.media.MediaPlayer.Status>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.media.MediaPlayer.bufferProgressTime(f: (() -> javafx.util.Duration)? = null): javafx.util.Duration =
        template("bufferProgressTime", f, this, bufferProgressTimeProperty()!! as ObservableValue<javafx.util.Duration>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.media.MediaPlayer.audioSpectrumInterval(f: (() -> Double)? = null): Double =
        template("audioSpectrumInterval", f, this, audioSpectrumIntervalProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.media.MediaPlayer.currentTime(f: (() -> javafx.util.Duration)? = null): javafx.util.Duration =
        template("currentTime", f, this, currentTimeProperty()!! as ObservableValue<javafx.util.Duration>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.media.MediaPlayer.currentRate(f: (() -> Double)? = null): Double =
        template("currentRate", f, this, currentRateProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.media.MediaPlayer.audioSpectrumNumBands(f: (() -> Int)? = null): Int =
        template("audioSpectrumNumBands", f, this, audioSpectrumNumBandsProperty()!! as ObservableValue<Int>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.media.MediaPlayer.audioSpectrumThreshold(f: (() -> Int)? = null): Int =
        template("audioSpectrumThreshold", f, this, audioSpectrumThresholdProperty()!! as ObservableValue<Int>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.media.MediaPlayer.cycleDuration(f: (() -> javafx.util.Duration)? = null): javafx.util.Duration =
        template("cycleDuration", f, this, cycleDurationProperty()!! as ObservableValue<javafx.util.Duration>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.media.MediaPlayer.audioSpectrumListener(f: (() -> javafx.scene.media.AudioSpectrumListener)? = null): javafx.scene.media.AudioSpectrumListener =
        template("audioSpectrumListener", f, this, audioSpectrumListenerProperty()!! as ObservableValue<javafx.scene.media.AudioSpectrumListener>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.media.MediaPlayer.currentCount(f: (() -> Int)? = null): Int =
        template("currentCount", f, this, currentCountProperty()!! as ObservableValue<Int>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.media.MediaPlayer.onStalled(f: (() -> Runnable)? = null): Runnable =
        template("onStalled", f, this, onStalledProperty()!! as ObservableValue<Runnable>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.media.MediaPlayer.startTime(f: (() -> javafx.util.Duration)? = null): javafx.util.Duration =
        template("startTime", f, this, startTimeProperty()!! as ObservableValue<javafx.util.Duration>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.media.MediaPlayer.onStopped(f: (() -> Runnable)? = null): Runnable =
        template("onStopped", f, this, onStoppedProperty()!! as ObservableValue<Runnable>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.media.MediaPlayer.onEndOfMedia(f: (() -> Runnable)? = null): Runnable =
        template("onEndOfMedia", f, this, onEndOfMediaProperty()!! as ObservableValue<Runnable>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.media.MediaPlayer.totalDuration(f: (() -> javafx.util.Duration)? = null): javafx.util.Duration =
        template("totalDuration", f, this, totalDurationProperty()!! as ObservableValue<javafx.util.Duration>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.media.MediaPlayer.onPlaying(f: (() -> Runnable)? = null): Runnable =
        template("onPlaying", f, this, onPlayingProperty()!! as ObservableValue<Runnable>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.media.MediaPlayer.cycleCount(f: (() -> Int)? = null): Int =
        template("cycleCount", f, this, cycleCountProperty()!! as ObservableValue<Int>)

// javafx.beans.property.ReadOnlyIntegerWrapper

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.beans.property.ReadOnlyIntegerWrapper.getReadOnly(f: (() -> Int)? = null): Int =
        template("getReadOnly", f, this, getReadOnlyProperty()!! as ObservableValue<Int>)

// javafx.scene.control.cell.ComboBoxListCell

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.cell.ComboBoxListCell<T>.converter(f: (() -> javafx.util.StringConverter<T>)? = null): javafx.util.StringConverter<T> =
        template("converter", f, this, converterProperty()!! as ObservableValue<javafx.util.StringConverter<T>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.cell.ComboBoxListCell<T>.comboBoxEditable(f: (() -> Boolean)? = null): Boolean =
        template("comboBoxEditable", f, this, comboBoxEditableProperty()!! as ObservableValue<Boolean>)

// javafx.scene.shape.LineTo

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.LineTo.y(f: (() -> Double)? = null): Double =
        template("y", f, this, yProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.LineTo.x(f: (() -> Double)? = null): Double =
        template("x", f, this, xProperty()!! as ObservableValue<Double>)

// javafx.scene.control.CheckMenuItem

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.CheckMenuItem.selected(f: (() -> Boolean)? = null): Boolean =
        template("selected", f, this, selectedProperty()!! as ObservableValue<Boolean>)

// javafx.scene.control.ListCell

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.ListCell<T>.listView(f: (() -> javafx.scene.control.ListView<T>)? = null): javafx.scene.control.ListView<T> =
        template("listView", f, this, listViewProperty()!! as ObservableValue<javafx.scene.control.ListView<T>>)

// javafx.scene.control.Dialog

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <R> javafx.scene.control.Dialog<R>.width(f: (() -> Double)? = null): Double =
        template("width", f, this, widthProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <R> javafx.scene.control.Dialog<R>.result(f: (() -> R)? = null): R =
        template("result", f, this, resultProperty()!! as ObservableValue<R>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <R> javafx.scene.control.Dialog<R>.y(f: (() -> Double)? = null): Double =
        template("y", f, this, yProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <R> javafx.scene.control.Dialog<R>.showing(f: (() -> Boolean)? = null): Boolean =
        template("showing", f, this, showingProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <R> javafx.scene.control.Dialog<R>.x(f: (() -> Double)? = null): Double =
        template("x", f, this, xProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <R> javafx.scene.control.Dialog<R>.title(f: (() -> String)? = null): String =
        template("title", f, this, titleProperty()!! as ObservableValue<String>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <R> javafx.scene.control.Dialog<R>.height(f: (() -> Double)? = null): Double =
        template("height", f, this, heightProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <R> javafx.scene.control.Dialog<R>.onHidden(f: (() -> javafx.event.EventHandler<javafx.scene.control.DialogEvent>)? = null): javafx.event.EventHandler<javafx.scene.control.DialogEvent> =
        template("onHidden", f, this, onHiddenProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.scene.control.DialogEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <R> javafx.scene.control.Dialog<R>.onShown(f: (() -> javafx.event.EventHandler<javafx.scene.control.DialogEvent>)? = null): javafx.event.EventHandler<javafx.scene.control.DialogEvent> =
        template("onShown", f, this, onShownProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.scene.control.DialogEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <R> javafx.scene.control.Dialog<R>.graphic(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
        template("graphic", f, this, graphicProperty()!! as ObservableValue<javafx.scene.Node>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <R> javafx.scene.control.Dialog<R>.onHiding(f: (() -> javafx.event.EventHandler<javafx.scene.control.DialogEvent>)? = null): javafx.event.EventHandler<javafx.scene.control.DialogEvent> =
        template("onHiding", f, this, onHidingProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.scene.control.DialogEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <R> javafx.scene.control.Dialog<R>.headerText(f: (() -> String)? = null): String =
        template("headerText", f, this, headerTextProperty()!! as ObservableValue<String>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <R> javafx.scene.control.Dialog<R>.onShowing(f: (() -> javafx.event.EventHandler<javafx.scene.control.DialogEvent>)? = null): javafx.event.EventHandler<javafx.scene.control.DialogEvent> =
        template("onShowing", f, this, onShowingProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.scene.control.DialogEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <R> javafx.scene.control.Dialog<R>.contentText(f: (() -> String)? = null): String =
        template("contentText", f, this, contentTextProperty()!! as ObservableValue<String>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <R> javafx.scene.control.Dialog<R>.dialogPane(f: (() -> javafx.scene.control.DialogPane)? = null): javafx.scene.control.DialogPane =
        template("dialogPane", f, this, dialogPaneProperty()!! as ObservableValue<javafx.scene.control.DialogPane>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <R> javafx.scene.control.Dialog<R>.onCloseRequest(f: (() -> javafx.event.EventHandler<javafx.scene.control.DialogEvent>)? = null): javafx.event.EventHandler<javafx.scene.control.DialogEvent> =
        template("onCloseRequest", f, this, onCloseRequestProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.scene.control.DialogEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <R> javafx.scene.control.Dialog<R>.resizable(f: (() -> Boolean)? = null): Boolean =
        template("resizable", f, this, resizableProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <R> javafx.scene.control.Dialog<R>.resultConverter(f: (() -> javafx.util.Callback<javafx.scene.control.ButtonType, R>)? = null): javafx.util.Callback<javafx.scene.control.ButtonType, R> =
        template("resultConverter", f, this, resultConverterProperty()!! as ObservableValue<javafx.util.Callback<javafx.scene.control.ButtonType, R>>)

// javafx.scene.chart.StackedBarChart

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <X, Y> javafx.scene.chart.StackedBarChart<X, Y>.categoryGap(f: (() -> Double)? = null): Double =
        template("categoryGap", f, this, categoryGapProperty()!! as ObservableValue<Double>)

// javafx.scene.web.WebView

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.web.WebView.width(f: (() -> Double)? = null): Double =
        template("width", f, this, widthProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.web.WebView.height(f: (() -> Double)? = null): Double =
        template("height", f, this, heightProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.web.WebView.prefWidth(f: (() -> Double)? = null): Double =
        template("prefWidth", f, this, prefWidthProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.web.WebView.maxHeight(f: (() -> Double)? = null): Double =
        template("maxHeight", f, this, maxHeightProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.web.WebView.prefHeight(f: (() -> Double)? = null): Double =
        template("prefHeight", f, this, prefHeightProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.web.WebView.minHeight(f: (() -> Double)? = null): Double =
        template("minHeight", f, this, minHeightProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.web.WebView.contextMenuEnabled(f: (() -> Boolean)? = null): Boolean =
        template("contextMenuEnabled", f, this, contextMenuEnabledProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.web.WebView.fontScale(f: (() -> Double)? = null): Double =
        template("fontScale", f, this, fontScaleProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.web.WebView.fontSmoothingType(f: (() -> javafx.scene.text.FontSmoothingType)? = null): javafx.scene.text.FontSmoothingType =
        template("fontSmoothingType", f, this, fontSmoothingTypeProperty()!! as ObservableValue<javafx.scene.text.FontSmoothingType>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.web.WebView.zoom(f: (() -> Double)? = null): Double =
        template("zoom", f, this, zoomProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.web.WebView.maxWidth(f: (() -> Double)? = null): Double =
        template("maxWidth", f, this, maxWidthProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.web.WebView.minWidth(f: (() -> Double)? = null): Double =
        template("minWidth", f, this, minWidthProperty()!! as ObservableValue<Double>)

// javafx.animation.Animation

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.animation.Animation.rate(f: (() -> Double)? = null): Double =
        template("rate", f, this, rateProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.animation.Animation.status(f: (() -> javafx.animation.Animation.Status)? = null): javafx.animation.Animation.Status =
        template("status", f, this, statusProperty()!! as ObservableValue<javafx.animation.Animation.Status>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.animation.Animation.currentTime(f: (() -> javafx.util.Duration)? = null): javafx.util.Duration =
        template("currentTime", f, this, currentTimeProperty()!! as ObservableValue<javafx.util.Duration>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.animation.Animation.currentRate(f: (() -> Double)? = null): Double =
        template("currentRate", f, this, currentRateProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.animation.Animation.cycleDuration(f: (() -> javafx.util.Duration)? = null): javafx.util.Duration =
        template("cycleDuration", f, this, cycleDurationProperty()!! as ObservableValue<javafx.util.Duration>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.animation.Animation.totalDuration(f: (() -> javafx.util.Duration)? = null): javafx.util.Duration =
        template("totalDuration", f, this, totalDurationProperty()!! as ObservableValue<javafx.util.Duration>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.animation.Animation.cycleCount(f: (() -> Int)? = null): Int =
        template("cycleCount", f, this, cycleCountProperty()!! as ObservableValue<Int>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.animation.Animation.autoReverse(f: (() -> Boolean)? = null): Boolean =
        template("autoReverse", f, this, autoReverseProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.animation.Animation.onFinished(f: (() -> javafx.event.EventHandler<javafx.event.ActionEvent>)? = null): javafx.event.EventHandler<javafx.event.ActionEvent> =
        template("onFinished", f, this, onFinishedProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.event.ActionEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.animation.Animation.delay(f: (() -> javafx.util.Duration)? = null): javafx.util.Duration =
        template("delay", f, this, delayProperty()!! as ObservableValue<javafx.util.Duration>)

// javafx.beans.binding.MapBinding

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <K, V> javafx.beans.binding.MapBinding<K, V>.size(f: (() -> Int)? = null): Int =
        template("size", f, this, sizeProperty()!! as ObservableValue<Int>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <K, V> javafx.beans.binding.MapBinding<K, V>.empty(f: (() -> Boolean)? = null): Boolean =
        template("empty", f, this, emptyProperty()!! as ObservableValue<Boolean>)

// javafx.scene.control.TableView

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S> javafx.scene.control.TableView<S>.comparator(f: (() -> java.util.Comparator<S>)? = null): java.util.Comparator<S> =
        template("comparator", f, this, comparatorProperty()!! as ObservableValue<java.util.Comparator<S>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S> javafx.scene.control.TableView<S>.items(f: (() -> javafx.collections.ObservableList<S>)? = null): javafx.collections.ObservableList<S> =
        template("items", f, this, itemsProperty()!! as ObservableValue<javafx.collections.ObservableList<S>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S> javafx.scene.control.TableView<S>.onSort(f: (() -> javafx.event.EventHandler<javafx.scene.control.SortEvent<javafx.scene.control.TableView<S>>>)? = null): javafx.event.EventHandler<javafx.scene.control.SortEvent<javafx.scene.control.TableView<S>>> =
        template("onSort", f, this, onSortProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.scene.control.SortEvent<javafx.scene.control.TableView<S>>>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S> javafx.scene.control.TableView<S>.focusModel(f: (() -> javafx.scene.control.TableView.TableViewFocusModel<S>)? = null): javafx.scene.control.TableView.TableViewFocusModel<S> =
        template("focusModel", f, this, focusModelProperty()!! as ObservableValue<javafx.scene.control.TableView.TableViewFocusModel<S>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S> javafx.scene.control.TableView<S>.onScrollTo(f: (() -> javafx.event.EventHandler<javafx.scene.control.ScrollToEvent<Int>>)? = null): javafx.event.EventHandler<javafx.scene.control.ScrollToEvent<Int>> =
        template("onScrollTo", f, this, onScrollToProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.scene.control.ScrollToEvent<Int>>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S> javafx.scene.control.TableView<S>.selectionModel(f: (() -> javafx.scene.control.TableView.TableViewSelectionModel<S>)? = null): javafx.scene.control.TableView.TableViewSelectionModel<S> =
        template("selectionModel", f, this, selectionModelProperty()!! as ObservableValue<javafx.scene.control.TableView.TableViewSelectionModel<S>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S> javafx.scene.control.TableView<S>.placeholder(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
        template("placeholder", f, this, placeholderProperty()!! as ObservableValue<javafx.scene.Node>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S> javafx.scene.control.TableView<S>.sortPolicy(f: (() -> javafx.util.Callback<javafx.scene.control.TableView<S>, Boolean>)? = null): javafx.util.Callback<javafx.scene.control.TableView<S>, Boolean> =
        template("sortPolicy", f, this, sortPolicyProperty()!! as ObservableValue<javafx.util.Callback<javafx.scene.control.TableView<S>, Boolean>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S> javafx.scene.control.TableView<S>.tableMenuButtonVisible(f: (() -> Boolean)? = null): Boolean =
        template("tableMenuButtonVisible", f, this, tableMenuButtonVisibleProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S> javafx.scene.control.TableView<S>.editingCell(f: (() -> javafx.scene.control.TablePosition<S, *>)? = null): javafx.scene.control.TablePosition<S, *> =
        template("editingCell", f, this, editingCellProperty()!! as ObservableValue<javafx.scene.control.TablePosition<S, *>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S> javafx.scene.control.TableView<S>.onScrollToColumn(f: (() -> javafx.event.EventHandler<javafx.scene.control.ScrollToEvent<javafx.scene.control.TableColumn<S, *>>>)? = null): javafx.event.EventHandler<javafx.scene.control.ScrollToEvent<javafx.scene.control.TableColumn<S, *>>> =
        template("onScrollToColumn", f, this, onScrollToColumnProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.scene.control.ScrollToEvent<javafx.scene.control.TableColumn<S, *>>>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S> javafx.scene.control.TableView<S>.rowFactory(f: (() -> javafx.util.Callback<javafx.scene.control.TableView<S>, javafx.scene.control.TableRow<S>>)? = null): javafx.util.Callback<javafx.scene.control.TableView<S>, javafx.scene.control.TableRow<S>> =
        template("rowFactory", f, this, rowFactoryProperty()!! as ObservableValue<javafx.util.Callback<javafx.scene.control.TableView<S>, javafx.scene.control.TableRow<S>>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S> javafx.scene.control.TableView<S>.columnResizePolicy(f: (() -> javafx.util.Callback<javafx.scene.control.TableView.ResizeFeatures<S>, Boolean>)? = null): javafx.util.Callback<javafx.scene.control.TableView.ResizeFeatures<S>, Boolean> =
        template("columnResizePolicy", f, this, columnResizePolicyProperty()!! as ObservableValue<javafx.util.Callback<javafx.scene.control.TableView.ResizeFeatures<S>, Boolean>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S> javafx.scene.control.TableView<S>.fixedCellSize(f: (() -> Double)? = null): Double =
        template("fixedCellSize", f, this, fixedCellSizeProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S> javafx.scene.control.TableView<S>.editable(f: (() -> Boolean)? = null): Boolean =
        template("editable", f, this, editableProperty()!! as ObservableValue<Boolean>)

// javafx.scene.control.ToggleGroup

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.ToggleGroup.selectedToggle(f: (() -> javafx.scene.control.Toggle)? = null): javafx.scene.control.Toggle =
        template("selectedToggle", f, this, selectedToggleProperty()!! as ObservableValue<javafx.scene.control.Toggle>)

// javafx.scene.image.Image

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.image.Image.width(f: (() -> Double)? = null): Double =
        template("width", f, this, widthProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.image.Image.progress(f: (() -> Double)? = null): Double =
        template("progress", f, this, progressProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.image.Image.error(f: (() -> Boolean)? = null): Boolean =
        template("error", f, this, errorProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.image.Image.height(f: (() -> Double)? = null): Double =
        template("height", f, this, heightProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.image.Image.exception(f: (() -> Exception)? = null): Exception =
        template("exception", f, this, exceptionProperty()!! as ObservableValue<Exception>)

// javafx.scene.control.ToggleButton

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.ToggleButton.selected(f: (() -> Boolean)? = null): Boolean =
        template("selected", f, this, selectedProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.ToggleButton.toggleGroup(f: (() -> javafx.scene.control.ToggleGroup)? = null): javafx.scene.control.ToggleGroup =
        template("toggleGroup", f, this, toggleGroupProperty()!! as ObservableValue<javafx.scene.control.ToggleGroup>)

// javafx.scene.effect.Shadow

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.Shadow.width(f: (() -> Double)? = null): Double =
        template("width", f, this, widthProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.Shadow.height(f: (() -> Double)? = null): Double =
        template("height", f, this, heightProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.Shadow.color(f: (() -> javafx.scene.paint.Color)? = null): javafx.scene.paint.Color =
        template("color", f, this, colorProperty()!! as ObservableValue<javafx.scene.paint.Color>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.Shadow.input(f: (() -> javafx.scene.effect.Effect)? = null): javafx.scene.effect.Effect =
        template("input", f, this, inputProperty()!! as ObservableValue<javafx.scene.effect.Effect>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.Shadow.blurType(f: (() -> javafx.scene.effect.BlurType)? = null): javafx.scene.effect.BlurType =
        template("blurType", f, this, blurTypeProperty()!! as ObservableValue<javafx.scene.effect.BlurType>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.Shadow.radius(f: (() -> Double)? = null): Double =
        template("radius", f, this, radiusProperty()!! as ObservableValue<Double>)

// javafx.animation.FadeTransition

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.animation.FadeTransition.duration(f: (() -> javafx.util.Duration)? = null): javafx.util.Duration =
        template("duration", f, this, durationProperty()!! as ObservableValue<javafx.util.Duration>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.animation.FadeTransition.node(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
        template("node", f, this, nodeProperty()!! as ObservableValue<javafx.scene.Node>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.animation.FadeTransition.fromValue(f: (() -> Double)? = null): Double =
        template("fromValue", f, this, fromValueProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.animation.FadeTransition.byValue(f: (() -> Double)? = null): Double =
        template("byValue", f, this, byValueProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.animation.FadeTransition.toValue(f: (() -> Double)? = null): Double =
        template("toValue", f, this, toValueProperty()!! as ObservableValue<Double>)

// javafx.scene.Node

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.scaleZ(f: (() -> Double)? = null): Double =
        template("scaleZ", f, this, scaleZProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.layoutX(f: (() -> Double)? = null): Double =
        template("layoutX", f, this, layoutXProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.onRotate(f: (() -> javafx.event.EventHandler<in javafx.scene.input.RotateEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.RotateEvent> =
        template("onRotate", f, this, onRotateProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.RotateEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.onZoom(f: (() -> javafx.event.EventHandler<in javafx.scene.input.ZoomEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.ZoomEvent> =
        template("onZoom", f, this, onZoomProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.ZoomEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.layoutY(f: (() -> Double)? = null): Double =
        template("layoutY", f, this, layoutYProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.managed(f: (() -> Boolean)? = null): Boolean =
        template("managed", f, this, managedProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.scaleY(f: (() -> Double)? = null): Double =
        template("scaleY", f, this, scaleYProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.parent(f: (() -> javafx.scene.Parent)? = null): javafx.scene.Parent =
        template("parent", f, this, parentProperty()!! as ObservableValue<javafx.scene.Parent>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.pressed(f: (() -> Boolean)? = null): Boolean =
        template("pressed", f, this, pressedProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.scaleX(f: (() -> Double)? = null): Double =
        template("scaleX", f, this, scaleXProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.rotate(f: (() -> Double)? = null): Double =
        template("rotate", f, this, rotateProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.onScroll(f: (() -> javafx.event.EventHandler<in javafx.scene.input.ScrollEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.ScrollEvent> =
        template("onScroll", f, this, onScrollProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.ScrollEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.visible(f: (() -> Boolean)? = null): Boolean =
        template("visible", f, this, visibleProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.style(f: (() -> String)? = null): String =
        template("style", f, this, styleProperty()!! as ObservableValue<String>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.accessibleHelp(f: (() -> String)? = null): String =
        template("accessibleHelp", f, this, accessibleHelpProperty()!! as ObservableValue<String>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.blendMode(f: (() -> javafx.scene.effect.BlendMode)? = null): javafx.scene.effect.BlendMode =
        template("blendMode", f, this, blendModeProperty()!! as ObservableValue<javafx.scene.effect.BlendMode>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.accessibleRole(f: (() -> javafx.scene.AccessibleRole)? = null): javafx.scene.AccessibleRole =
        template("accessibleRole", f, this, accessibleRoleProperty()!! as ObservableValue<javafx.scene.AccessibleRole>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.boundsInLocal(f: (() -> javafx.geometry.Bounds)? = null): javafx.geometry.Bounds =
        template("boundsInLocal", f, this, boundsInLocalProperty()!! as ObservableValue<javafx.geometry.Bounds>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.boundsInParent(f: (() -> javafx.geometry.Bounds)? = null): javafx.geometry.Bounds =
        template("boundsInParent", f, this, boundsInParentProperty()!! as ObservableValue<javafx.geometry.Bounds>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.accessibleText(f: (() -> String)? = null): String =
        template("accessibleText", f, this, accessibleTextProperty()!! as ObservableValue<String>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.depthTest(f: (() -> javafx.scene.DepthTest)? = null): javafx.scene.DepthTest =
        template("depthTest", f, this, depthTestProperty()!! as ObservableValue<javafx.scene.DepthTest>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.effectiveNodeOrientation(f: (() -> javafx.geometry.NodeOrientation)? = null): javafx.geometry.NodeOrientation =
        template("effectiveNodeOrientation", f, this, effectiveNodeOrientationProperty()!! as ObservableValue<javafx.geometry.NodeOrientation>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.focusTraversable(f: (() -> Boolean)? = null): Boolean =
        template("focusTraversable", f, this, focusTraversableProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.cacheHint(f: (() -> javafx.scene.CacheHint)? = null): javafx.scene.CacheHint =
        template("cacheHint", f, this, cacheHintProperty()!! as ObservableValue<javafx.scene.CacheHint>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.inputMethodRequests(f: (() -> javafx.scene.input.InputMethodRequests)? = null): javafx.scene.input.InputMethodRequests =
        template("inputMethodRequests", f, this, inputMethodRequestsProperty()!! as ObservableValue<javafx.scene.input.InputMethodRequests>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.localToSceneTransform(f: (() -> javafx.scene.transform.Transform)? = null): javafx.scene.transform.Transform =
        template("localToSceneTransform", f, this, localToSceneTransformProperty()!! as ObservableValue<javafx.scene.transform.Transform>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.mouseTransparent(f: (() -> Boolean)? = null): Boolean =
        template("mouseTransparent", f, this, mouseTransparentProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.nodeOrientation(f: (() -> javafx.geometry.NodeOrientation)? = null): javafx.geometry.NodeOrientation =
        template("nodeOrientation", f, this, nodeOrientationProperty()!! as ObservableValue<javafx.geometry.NodeOrientation>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.layoutBounds(f: (() -> javafx.geometry.Bounds)? = null): javafx.geometry.Bounds =
        template("layoutBounds", f, this, layoutBoundsProperty()!! as ObservableValue<javafx.geometry.Bounds>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.localToParentTransform(f: (() -> javafx.scene.transform.Transform)? = null): javafx.scene.transform.Transform =
        template("localToParentTransform", f, this, localToParentTransformProperty()!! as ObservableValue<javafx.scene.transform.Transform>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.onDragDetected(f: (() -> javafx.event.EventHandler<in javafx.scene.input.MouseEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.MouseEvent> =
        template("onDragDetected", f, this, onDragDetectedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.MouseEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.onDragDone(f: (() -> javafx.event.EventHandler<in javafx.scene.input.DragEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.DragEvent> =
        template("onDragDone", f, this, onDragDoneProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.DragEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.onContextMenuRequested(f: (() -> javafx.event.EventHandler<in javafx.scene.input.ContextMenuEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.ContextMenuEvent> =
        template("onContextMenuRequested", f, this, onContextMenuRequestedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.ContextMenuEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.onDragDropped(f: (() -> javafx.event.EventHandler<in javafx.scene.input.DragEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.DragEvent> =
        template("onDragDropped", f, this, onDragDroppedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.DragEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.focused(f: (() -> Boolean)? = null): Boolean =
        template("focused", f, this, focusedProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.opacity(f: (() -> Double)? = null): Double =
        template("opacity", f, this, opacityProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.scene(f: (() -> javafx.scene.Scene)? = null): javafx.scene.Scene =
        template("scene", f, this, sceneProperty()!! as ObservableValue<javafx.scene.Scene>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.onKeyTyped(f: (() -> javafx.event.EventHandler<in javafx.scene.input.KeyEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.KeyEvent> =
        template("onKeyTyped", f, this, onKeyTypedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.KeyEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.onMouseClicked(f: (() -> javafx.event.EventHandler<in javafx.scene.input.MouseEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.MouseEvent> =
        template("onMouseClicked", f, this, onMouseClickedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.MouseEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.onMouseMoved(f: (() -> javafx.event.EventHandler<in javafx.scene.input.MouseEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.MouseEvent> =
        template("onMouseMoved", f, this, onMouseMovedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.MouseEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.onTouchPressed(f: (() -> javafx.event.EventHandler<in javafx.scene.input.TouchEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.TouchEvent> =
        template("onTouchPressed", f, this, onTouchPressedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.TouchEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.onRotationFinished(f: (() -> javafx.event.EventHandler<in javafx.scene.input.RotateEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.RotateEvent> =
        template("onRotationFinished", f, this, onRotationFinishedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.RotateEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.onSwipeDown(f: (() -> javafx.event.EventHandler<in javafx.scene.input.SwipeEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.SwipeEvent> =
        template("onSwipeDown", f, this, onSwipeDownProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.SwipeEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.onSwipeLeft(f: (() -> javafx.event.EventHandler<in javafx.scene.input.SwipeEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.SwipeEvent> =
        template("onSwipeLeft", f, this, onSwipeLeftProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.SwipeEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.onScrollStarted(f: (() -> javafx.event.EventHandler<in javafx.scene.input.ScrollEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.ScrollEvent> =
        template("onScrollStarted", f, this, onScrollStartedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.ScrollEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.onZoomFinished(f: (() -> javafx.event.EventHandler<in javafx.scene.input.ZoomEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.ZoomEvent> =
        template("onZoomFinished", f, this, onZoomFinishedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.ZoomEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.rotationAxis(f: (() -> javafx.geometry.Point3D)? = null): javafx.geometry.Point3D =
        template("rotationAxis", f, this, rotationAxisProperty()!! as ObservableValue<javafx.geometry.Point3D>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.onKeyPressed(f: (() -> javafx.event.EventHandler<in javafx.scene.input.KeyEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.KeyEvent> =
        template("onKeyPressed", f, this, onKeyPressedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.KeyEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.onScrollFinished(f: (() -> javafx.event.EventHandler<in javafx.scene.input.ScrollEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.ScrollEvent> =
        template("onScrollFinished", f, this, onScrollFinishedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.ScrollEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.onKeyReleased(f: (() -> javafx.event.EventHandler<in javafx.scene.input.KeyEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.KeyEvent> =
        template("onKeyReleased", f, this, onKeyReleasedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.KeyEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.pickOnBounds(f: (() -> Boolean)? = null): Boolean =
        template("pickOnBounds", f, this, pickOnBoundsProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.onTouchMoved(f: (() -> javafx.event.EventHandler<in javafx.scene.input.TouchEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.TouchEvent> =
        template("onTouchMoved", f, this, onTouchMovedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.TouchEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.translateY(f: (() -> Double)? = null): Double =
        template("translateY", f, this, translateYProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.onMouseReleased(f: (() -> javafx.event.EventHandler<in javafx.scene.input.MouseEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.MouseEvent> =
        template("onMouseReleased", f, this, onMouseReleasedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.MouseEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.onMouseEntered(f: (() -> javafx.event.EventHandler<in javafx.scene.input.MouseEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.MouseEvent> =
        template("onMouseEntered", f, this, onMouseEnteredProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.MouseEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.onRotationStarted(f: (() -> javafx.event.EventHandler<in javafx.scene.input.RotateEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.RotateEvent> =
        template("onRotationStarted", f, this, onRotationStartedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.RotateEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.onTouchStationary(f: (() -> javafx.event.EventHandler<in javafx.scene.input.TouchEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.TouchEvent> =
        template("onTouchStationary", f, this, onTouchStationaryProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.TouchEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.onMouseDragReleased(f: (() -> javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent> =
        template("onMouseDragReleased", f, this, onMouseDragReleasedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.onInputMethodTextChanged(f: (() -> javafx.event.EventHandler<in javafx.scene.input.InputMethodEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.InputMethodEvent> =
        template("onInputMethodTextChanged", f, this, onInputMethodTextChangedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.InputMethodEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.onMouseDragged(f: (() -> javafx.event.EventHandler<in javafx.scene.input.MouseEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.MouseEvent> =
        template("onMouseDragged", f, this, onMouseDraggedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.MouseEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.onSwipeRight(f: (() -> javafx.event.EventHandler<in javafx.scene.input.SwipeEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.SwipeEvent> =
        template("onSwipeRight", f, this, onSwipeRightProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.SwipeEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.onDragOver(f: (() -> javafx.event.EventHandler<in javafx.scene.input.DragEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.DragEvent> =
        template("onDragOver", f, this, onDragOverProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.DragEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.onDragExited(f: (() -> javafx.event.EventHandler<in javafx.scene.input.DragEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.DragEvent> =
        template("onDragExited", f, this, onDragExitedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.DragEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.onSwipeUp(f: (() -> javafx.event.EventHandler<in javafx.scene.input.SwipeEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.SwipeEvent> =
        template("onSwipeUp", f, this, onSwipeUpProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.SwipeEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.onMouseDragEntered(f: (() -> javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent> =
        template("onMouseDragEntered", f, this, onMouseDragEnteredProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.translateX(f: (() -> Double)? = null): Double =
        template("translateX", f, this, translateXProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.translateZ(f: (() -> Double)? = null): Double =
        template("translateZ", f, this, translateZProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.onMouseDragExited(f: (() -> javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent> =
        template("onMouseDragExited", f, this, onMouseDragExitedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.onMouseDragOver(f: (() -> javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent> =
        template("onMouseDragOver", f, this, onMouseDragOverProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.onMouseExited(f: (() -> javafx.event.EventHandler<in javafx.scene.input.MouseEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.MouseEvent> =
        template("onMouseExited", f, this, onMouseExitedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.MouseEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.onMousePressed(f: (() -> javafx.event.EventHandler<in javafx.scene.input.MouseEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.MouseEvent> =
        template("onMousePressed", f, this, onMousePressedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.MouseEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.onTouchReleased(f: (() -> javafx.event.EventHandler<in javafx.scene.input.TouchEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.TouchEvent> =
        template("onTouchReleased", f, this, onTouchReleasedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.TouchEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.onZoomStarted(f: (() -> javafx.event.EventHandler<in javafx.scene.input.ZoomEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.ZoomEvent> =
        template("onZoomStarted", f, this, onZoomStartedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.ZoomEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.eventDispatcher(f: (() -> javafx.event.EventDispatcher)? = null): javafx.event.EventDispatcher =
        template("eventDispatcher", f, this, eventDispatcherProperty()!! as ObservableValue<javafx.event.EventDispatcher>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.onDragEntered(f: (() -> javafx.event.EventHandler<in javafx.scene.input.DragEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.DragEvent> =
        template("onDragEntered", f, this, onDragEnteredProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.DragEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.accessibleRoleDescription(f: (() -> String)? = null): String =
        template("accessibleRoleDescription", f, this, accessibleRoleDescriptionProperty()!! as ObservableValue<String>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.cursor(f: (() -> javafx.scene.Cursor)? = null): javafx.scene.Cursor =
        template("cursor", f, this, cursorProperty()!! as ObservableValue<javafx.scene.Cursor>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.cache(f: (() -> Boolean)? = null): Boolean =
        template("cache", f, this, cacheProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.clip(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
        template("clip", f, this, clipProperty()!! as ObservableValue<javafx.scene.Node>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.disable(f: (() -> Boolean)? = null): Boolean =
        template("disable", f, this, disableProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.effect(f: (() -> javafx.scene.effect.Effect)? = null): javafx.scene.effect.Effect =
        template("effect", f, this, effectProperty()!! as ObservableValue<javafx.scene.effect.Effect>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.disabled(f: (() -> Boolean)? = null): Boolean =
        template("disabled", f, this, disabledProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.hover(f: (() -> Boolean)? = null): Boolean =
        template("hover", f, this, hoverProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Node.id(f: (() -> String)? = null): String =
        template("id", f, this, idProperty()!! as ObservableValue<String>)

// javafx.print.PageRange

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.print.PageRange.endPage(f: (() -> Int)? = null): Int =
        template("endPage", f, this, endPageProperty()!! as ObservableValue<Int>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.print.PageRange.startPage(f: (() -> Int)? = null): Int =
        template("startPage", f, this, startPageProperty()!! as ObservableValue<Int>)

// javafx.scene.control.TabPane

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.TabPane.selectionModel(f: (() -> javafx.scene.control.SingleSelectionModel<javafx.scene.control.Tab>)? = null): javafx.scene.control.SingleSelectionModel<javafx.scene.control.Tab> =
        template("selectionModel", f, this, selectionModelProperty()!! as ObservableValue<javafx.scene.control.SingleSelectionModel<javafx.scene.control.Tab>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.TabPane.tabClosingPolicy(f: (() -> javafx.scene.control.TabPane.TabClosingPolicy)? = null): javafx.scene.control.TabPane.TabClosingPolicy =
        template("tabClosingPolicy", f, this, tabClosingPolicyProperty()!! as ObservableValue<javafx.scene.control.TabPane.TabClosingPolicy>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.TabPane.rotateGraphic(f: (() -> Boolean)? = null): Boolean =
        template("rotateGraphic", f, this, rotateGraphicProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.TabPane.tabMaxHeight(f: (() -> Double)? = null): Double =
        template("tabMaxHeight", f, this, tabMaxHeightProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.TabPane.tabMinHeight(f: (() -> Double)? = null): Double =
        template("tabMinHeight", f, this, tabMinHeightProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.TabPane.tabMaxWidth(f: (() -> Double)? = null): Double =
        template("tabMaxWidth", f, this, tabMaxWidthProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.TabPane.tabMinWidth(f: (() -> Double)? = null): Double =
        template("tabMinWidth", f, this, tabMinWidthProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.TabPane.side(f: (() -> javafx.geometry.Side)? = null): javafx.geometry.Side =
        template("side", f, this, sideProperty()!! as ObservableValue<javafx.geometry.Side>)

// javafx.scene.control.ScrollBar

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.ScrollBar.value(f: (() -> Double)? = null): Double =
        template("value", f, this, valueProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.ScrollBar.max(f: (() -> Double)? = null): Double =
        template("max", f, this, maxProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.ScrollBar.min(f: (() -> Double)? = null): Double =
        template("min", f, this, minProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.ScrollBar.visibleAmount(f: (() -> Double)? = null): Double =
        template("visibleAmount", f, this, visibleAmountProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.ScrollBar.orientation(f: (() -> javafx.geometry.Orientation)? = null): javafx.geometry.Orientation =
        template("orientation", f, this, orientationProperty()!! as ObservableValue<javafx.geometry.Orientation>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.ScrollBar.unitIncrement(f: (() -> Double)? = null): Double =
        template("unitIncrement", f, this, unitIncrementProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.ScrollBar.blockIncrement(f: (() -> Double)? = null): Double =
        template("blockIncrement", f, this, blockIncrementProperty()!! as ObservableValue<Double>)

// javafx.scene.shape.Path

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.Path.fillRule(f: (() -> javafx.scene.shape.FillRule)? = null): javafx.scene.shape.FillRule =
        template("fillRule", f, this, fillRuleProperty()!! as ObservableValue<javafx.scene.shape.FillRule>)

// javafx.scene.effect.Light.Point

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.Light.Point.y(f: (() -> Double)? = null): Double =
        template("y", f, this, yProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.Light.Point.x(f: (() -> Double)? = null): Double =
        template("x", f, this, xProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.Light.Point.z(f: (() -> Double)? = null): Double =
        template("z", f, this, zProperty()!! as ObservableValue<Double>)

// javafx.scene.shape.Circle

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.Circle.radius(f: (() -> Double)? = null): Double =
        template("radius", f, this, radiusProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.Circle.centerX(f: (() -> Double)? = null): Double =
        template("centerX", f, this, centerXProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.Circle.centerY(f: (() -> Double)? = null): Double =
        template("centerY", f, this, centerYProperty()!! as ObservableValue<Double>)

// javafx.beans.property.ReadOnlyFloatWrapper

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.beans.property.ReadOnlyFloatWrapper.getReadOnly(f: (() -> Float)? = null): Float =
        template("getReadOnly", f, this, getReadOnlyProperty()!! as ObservableValue<Float>)

// javafx.scene.media.Media

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.media.Media.duration(f: (() -> javafx.util.Duration)? = null): javafx.util.Duration =
        template("duration", f, this, durationProperty()!! as ObservableValue<javafx.util.Duration>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.media.Media.width(f: (() -> Int)? = null): Int =
        template("width", f, this, widthProperty()!! as ObservableValue<Int>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.media.Media.onError(f: (() -> Runnable)? = null): Runnable =
        template("onError", f, this, onErrorProperty()!! as ObservableValue<Runnable>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.media.Media.error(f: (() -> javafx.scene.media.MediaException)? = null): javafx.scene.media.MediaException =
        template("error", f, this, errorProperty()!! as ObservableValue<javafx.scene.media.MediaException>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.media.Media.height(f: (() -> Int)? = null): Int =
        template("height", f, this, heightProperty()!! as ObservableValue<Int>)

// javafx.scene.transform.Scale

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.transform.Scale.y(f: (() -> Double)? = null): Double =
        template("y", f, this, yProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.transform.Scale.x(f: (() -> Double)? = null): Double =
        template("x", f, this, xProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.transform.Scale.pivotZ(f: (() -> Double)? = null): Double =
        template("pivotZ", f, this, pivotZProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.transform.Scale.z(f: (() -> Double)? = null): Double =
        template("z", f, this, zProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.transform.Scale.pivotX(f: (() -> Double)? = null): Double =
        template("pivotX", f, this, pivotXProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.transform.Scale.pivotY(f: (() -> Double)? = null): Double =
        template("pivotY", f, this, pivotYProperty()!! as ObservableValue<Double>)

// javafx.scene.effect.InnerShadow

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.InnerShadow.width(f: (() -> Double)? = null): Double =
        template("width", f, this, widthProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.InnerShadow.height(f: (() -> Double)? = null): Double =
        template("height", f, this, heightProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.InnerShadow.color(f: (() -> javafx.scene.paint.Color)? = null): javafx.scene.paint.Color =
        template("color", f, this, colorProperty()!! as ObservableValue<javafx.scene.paint.Color>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.InnerShadow.offsetY(f: (() -> Double)? = null): Double =
        template("offsetY", f, this, offsetYProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.InnerShadow.choke(f: (() -> Double)? = null): Double =
        template("choke", f, this, chokeProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.InnerShadow.offsetX(f: (() -> Double)? = null): Double =
        template("offsetX", f, this, offsetXProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.InnerShadow.input(f: (() -> javafx.scene.effect.Effect)? = null): javafx.scene.effect.Effect =
        template("input", f, this, inputProperty()!! as ObservableValue<javafx.scene.effect.Effect>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.InnerShadow.blurType(f: (() -> javafx.scene.effect.BlurType)? = null): javafx.scene.effect.BlurType =
        template("blurType", f, this, blurTypeProperty()!! as ObservableValue<javafx.scene.effect.BlurType>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.InnerShadow.radius(f: (() -> Double)? = null): Double =
        template("radius", f, this, radiusProperty()!! as ObservableValue<Double>)

// javafx.collections.transformation.SortedList

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <E> javafx.collections.transformation.SortedList<E>.comparator(f: (() -> java.util.Comparator<in E>)? = null): java.util.Comparator<in E> =
        template("comparator", f, this, comparatorProperty()!! as ObservableValue<java.util.Comparator<in E>>)

// javafx.scene.shape.CubicCurve

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.CubicCurve.controlX1(f: (() -> Double)? = null): Double =
        template("controlX1", f, this, controlX1Property()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.CubicCurve.controlY2(f: (() -> Double)? = null): Double =
        template("controlY2", f, this, controlY2Property()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.CubicCurve.controlX2(f: (() -> Double)? = null): Double =
        template("controlX2", f, this, controlX2Property()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.CubicCurve.controlY1(f: (() -> Double)? = null): Double =
        template("controlY1", f, this, controlY1Property()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.CubicCurve.endY(f: (() -> Double)? = null): Double =
        template("endY", f, this, endYProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.CubicCurve.startY(f: (() -> Double)? = null): Double =
        template("startY", f, this, startYProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.CubicCurve.startX(f: (() -> Double)? = null): Double =
        template("startX", f, this, startXProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.CubicCurve.endX(f: (() -> Double)? = null): Double =
        template("endX", f, this, endXProperty()!! as ObservableValue<Double>)

// javafx.scene.control.CheckBox

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.CheckBox.selected(f: (() -> Boolean)? = null): Boolean =
        template("selected", f, this, selectedProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.CheckBox.allowIndeterminate(f: (() -> Boolean)? = null): Boolean =
        template("allowIndeterminate", f, this, allowIndeterminateProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.CheckBox.indeterminate(f: (() -> Boolean)? = null): Boolean =
        template("indeterminate", f, this, indeterminateProperty()!! as ObservableValue<Boolean>)

// javafx.scene.control.CheckBoxTreeItem

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.CheckBoxTreeItem<T>.selected(f: (() -> Boolean)? = null): Boolean =
        template("selected", f, this, selectedProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.CheckBoxTreeItem<T>.indeterminate(f: (() -> Boolean)? = null): Boolean =
        template("indeterminate", f, this, indeterminateProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.CheckBoxTreeItem<T>.independent(f: (() -> Boolean)? = null): Boolean =
        template("independent", f, this, independentProperty()!! as ObservableValue<Boolean>)

// javafx.scene.effect.ColorInput

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.ColorInput.width(f: (() -> Double)? = null): Double =
        template("width", f, this, widthProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.ColorInput.y(f: (() -> Double)? = null): Double =
        template("y", f, this, yProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.ColorInput.x(f: (() -> Double)? = null): Double =
        template("x", f, this, xProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.ColorInput.height(f: (() -> Double)? = null): Double =
        template("height", f, this, heightProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.ColorInput.paint(f: (() -> javafx.scene.paint.Paint)? = null): javafx.scene.paint.Paint =
        template("paint", f, this, paintProperty()!! as ObservableValue<javafx.scene.paint.Paint>)

// javafx.scene.control.Pagination

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Pagination.pageFactory(f: (() -> javafx.util.Callback<Int, javafx.scene.Node>)? = null): javafx.util.Callback<Int, javafx.scene.Node> =
        template("pageFactory", f, this, pageFactoryProperty()!! as ObservableValue<javafx.util.Callback<Int, javafx.scene.Node>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Pagination.pageCount(f: (() -> Int)? = null): Int =
        template("pageCount", f, this, pageCountProperty()!! as ObservableValue<Int>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Pagination.currentPageIndex(f: (() -> Int)? = null): Int =
        template("currentPageIndex", f, this, currentPageIndexProperty()!! as ObservableValue<Int>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Pagination.maxPageIndicatorCount(f: (() -> Int)? = null): Int =
        template("maxPageIndicatorCount", f, this, maxPageIndicatorCountProperty()!! as ObservableValue<Int>)

// javafx.scene.layout.HBox

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.HBox.fillHeight(f: (() -> Boolean)? = null): Boolean =
        template("fillHeight", f, this, fillHeightProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.HBox.alignment(f: (() -> javafx.geometry.Pos)? = null): javafx.geometry.Pos =
        template("alignment", f, this, alignmentProperty()!! as ObservableValue<javafx.geometry.Pos>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.HBox.spacing(f: (() -> Double)? = null): Double =
        template("spacing", f, this, spacingProperty()!! as ObservableValue<Double>)

// javafx.scene.control.TreeTableView.TreeTableViewFocusModel

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S> javafx.scene.control.TreeTableView.TreeTableViewFocusModel<S>.focusedCell(f: (() -> javafx.scene.control.TreeTablePosition<S, *>)? = null): javafx.scene.control.TreeTablePosition<S, *> =
        template("focusedCell", f, this, focusedCellProperty()!! as ObservableValue<javafx.scene.control.TreeTablePosition<S, *>>)

// javafx.scene.shape.ArcTo

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.ArcTo.y(f: (() -> Double)? = null): Double =
        template("y", f, this, yProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.ArcTo.x(f: (() -> Double)? = null): Double =
        template("x", f, this, xProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.ArcTo.XAxisRotation(f: (() -> Double)? = null): Double =
        template("XAxisRotation", f, this, XAxisRotationProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.ArcTo.sweepFlag(f: (() -> Boolean)? = null): Boolean =
        template("sweepFlag", f, this, sweepFlagProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.ArcTo.largeArcFlag(f: (() -> Boolean)? = null): Boolean =
        template("largeArcFlag", f, this, largeArcFlagProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.ArcTo.radiusX(f: (() -> Double)? = null): Double =
        template("radiusX", f, this, radiusXProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.ArcTo.radiusY(f: (() -> Double)? = null): Double =
        template("radiusY", f, this, radiusYProperty()!! as ObservableValue<Double>)

// javafx.scene.control.TreeTableCell

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S, T> javafx.scene.control.TreeTableCell<S, T>.tableRow(f: (() -> javafx.scene.control.TreeTableRow<S>)? = null): javafx.scene.control.TreeTableRow<S> =
        template("tableRow", f, this, tableRowProperty()!! as ObservableValue<javafx.scene.control.TreeTableRow<S>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S, T> javafx.scene.control.TreeTableCell<S, T>.tableColumn(f: (() -> javafx.scene.control.TreeTableColumn<S, T>)? = null): javafx.scene.control.TreeTableColumn<S, T> =
        template("tableColumn", f, this, tableColumnProperty()!! as ObservableValue<javafx.scene.control.TreeTableColumn<S, T>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S, T> javafx.scene.control.TreeTableCell<S, T>.treeTableView(f: (() -> javafx.scene.control.TreeTableView<S>)? = null): javafx.scene.control.TreeTableView<S> =
        template("treeTableView", f, this, treeTableViewProperty()!! as ObservableValue<javafx.scene.control.TreeTableView<S>>)

// javafx.scene.chart.CategoryAxis

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.chart.CategoryAxis.categorySpacing(f: (() -> Double)? = null): Double =
        template("categorySpacing", f, this, categorySpacingProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.chart.CategoryAxis.endMargin(f: (() -> Double)? = null): Double =
        template("endMargin", f, this, endMarginProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.chart.CategoryAxis.gapStartAndEnd(f: (() -> Boolean)? = null): Boolean =
        template("gapStartAndEnd", f, this, gapStartAndEndProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.chart.CategoryAxis.startMargin(f: (() -> Double)? = null): Double =
        template("startMargin", f, this, startMarginProperty()!! as ObservableValue<Double>)

// javafx.scene.chart.LineChart

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <X, Y> javafx.scene.chart.LineChart<X, Y>.axisSortingPolicy(f: (() -> javafx.scene.chart.LineChart.SortingPolicy)? = null): javafx.scene.chart.LineChart.SortingPolicy =
        template("axisSortingPolicy", f, this, axisSortingPolicyProperty()!! as ObservableValue<javafx.scene.chart.LineChart.SortingPolicy>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <X, Y> javafx.scene.chart.LineChart<X, Y>.createSymbols(f: (() -> Boolean)? = null): Boolean =
        template("createSymbols", f, this, createSymbolsProperty()!! as ObservableValue<Boolean>)

// javafx.scene.control.Cell

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.Cell<T>.item(f: (() -> T)? = null): T =
        template("item", f, this, itemProperty()!! as ObservableValue<T>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.Cell<T>.editing(f: (() -> Boolean)? = null): Boolean =
        template("editing", f, this, editingProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.Cell<T>.selected(f: (() -> Boolean)? = null): Boolean =
        template("selected", f, this, selectedProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.Cell<T>.empty(f: (() -> Boolean)? = null): Boolean =
        template("empty", f, this, emptyProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.Cell<T>.editable(f: (() -> Boolean)? = null): Boolean =
        template("editable", f, this, editableProperty()!! as ObservableValue<Boolean>)

// javafx.beans.binding.ListExpression

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <E> javafx.beans.binding.ListExpression<E>.size(f: (() -> Int)? = null): Int =
        template("size", f, this, sizeProperty()!! as ObservableValue<Int>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <E> javafx.beans.binding.ListExpression<E>.empty(f: (() -> Boolean)? = null): Boolean =
        template("empty", f, this, emptyProperty()!! as ObservableValue<Boolean>)

// javafx.animation.StrokeTransition

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.animation.StrokeTransition.duration(f: (() -> javafx.util.Duration)? = null): javafx.util.Duration =
        template("duration", f, this, durationProperty()!! as ObservableValue<javafx.util.Duration>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.animation.StrokeTransition.shape(f: (() -> javafx.scene.shape.Shape)? = null): javafx.scene.shape.Shape =
        template("shape", f, this, shapeProperty()!! as ObservableValue<javafx.scene.shape.Shape>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.animation.StrokeTransition.fromValue(f: (() -> javafx.scene.paint.Color)? = null): javafx.scene.paint.Color =
        template("fromValue", f, this, fromValueProperty()!! as ObservableValue<javafx.scene.paint.Color>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.animation.StrokeTransition.toValue(f: (() -> javafx.scene.paint.Color)? = null): javafx.scene.paint.Color =
        template("toValue", f, this, toValueProperty()!! as ObservableValue<javafx.scene.paint.Color>)

// javafx.scene.control.Tooltip

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Tooltip.graphic(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
        template("graphic", f, this, graphicProperty()!! as ObservableValue<javafx.scene.Node>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Tooltip.activated(f: (() -> Boolean)? = null): Boolean =
        template("activated", f, this, activatedProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Tooltip.textAlignment(f: (() -> javafx.scene.text.TextAlignment)? = null): javafx.scene.text.TextAlignment =
        template("textAlignment", f, this, textAlignmentProperty()!! as ObservableValue<javafx.scene.text.TextAlignment>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Tooltip.textOverrun(f: (() -> javafx.scene.control.OverrunStyle)? = null): javafx.scene.control.OverrunStyle =
        template("textOverrun", f, this, textOverrunProperty()!! as ObservableValue<javafx.scene.control.OverrunStyle>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Tooltip.contentDisplay(f: (() -> javafx.scene.control.ContentDisplay)? = null): javafx.scene.control.ContentDisplay =
        template("contentDisplay", f, this, contentDisplayProperty()!! as ObservableValue<javafx.scene.control.ContentDisplay>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Tooltip.graphicTextGap(f: (() -> Double)? = null): Double =
        template("graphicTextGap", f, this, graphicTextGapProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Tooltip.font(f: (() -> javafx.scene.text.Font)? = null): javafx.scene.text.Font =
        template("font", f, this, fontProperty()!! as ObservableValue<javafx.scene.text.Font>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Tooltip.wrapText(f: (() -> Boolean)? = null): Boolean =
        template("wrapText", f, this, wrapTextProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Tooltip.text(f: (() -> String)? = null): String =
        template("text", f, this, textProperty()!! as ObservableValue<String>)

// javafx.scene.media.AudioEqualizer

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.media.AudioEqualizer.enabled(f: (() -> Boolean)? = null): Boolean =
        template("enabled", f, this, enabledProperty()!! as ObservableValue<Boolean>)

// javafx.scene.web.WebHistory.Entry

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.web.WebHistory.Entry.title(f: (() -> String)? = null): String =
        template("title", f, this, titleProperty()!! as ObservableValue<String>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.web.WebHistory.Entry.lastVisitedDate(f: (() -> java.util.Date)? = null): java.util.Date =
        template("lastVisitedDate", f, this, lastVisitedDateProperty()!! as ObservableValue<java.util.Date>)

// javafx.scene.chart.XYChart.Series

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <X, Y> javafx.scene.chart.XYChart.Series<X, Y>.name(f: (() -> String)? = null): String =
        template("name", f, this, nameProperty()!! as ObservableValue<String>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <X, Y> javafx.scene.chart.XYChart.Series<X, Y>.node(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
        template("node", f, this, nodeProperty()!! as ObservableValue<javafx.scene.Node>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <X, Y> javafx.scene.chart.XYChart.Series<X, Y>.data(f: (() -> javafx.collections.ObservableList<javafx.scene.chart.XYChart.Data<X, Y>>)? = null): javafx.collections.ObservableList<javafx.scene.chart.XYChart.Data<X, Y>> =
        template("data", f, this, dataProperty()!! as ObservableValue<javafx.collections.ObservableList<javafx.scene.chart.XYChart.Data<X, Y>>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <X, Y> javafx.scene.chart.XYChart.Series<X, Y>.chart(f: (() -> javafx.scene.chart.XYChart<X, Y>)? = null): javafx.scene.chart.XYChart<X, Y> =
        template("chart", f, this, chartProperty()!! as ObservableValue<javafx.scene.chart.XYChart<X, Y>>)

// javafx.animation.SequentialTransition

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.animation.SequentialTransition.node(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
        template("node", f, this, nodeProperty()!! as ObservableValue<javafx.scene.Node>)

// javafx.scene.control.ButtonBar

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.ButtonBar.buttonMinWidth(f: (() -> Double)? = null): Double =
        template("buttonMinWidth", f, this, buttonMinWidthProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.ButtonBar.buttonOrder(f: (() -> String)? = null): String =
        template("buttonOrder", f, this, buttonOrderProperty()!! as ObservableValue<String>)

// javafx.scene.control.Hyperlink

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Hyperlink.visited(f: (() -> Boolean)? = null): Boolean =
        template("visited", f, this, visitedProperty()!! as ObservableValue<Boolean>)

// javafx.scene.text.Text

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.text.Text.y(f: (() -> Double)? = null): Double =
        template("y", f, this, yProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.text.Text.x(f: (() -> Double)? = null): Double =
        template("x", f, this, xProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.text.Text.wrappingWidth(f: (() -> Double)? = null): Double =
        template("wrappingWidth", f, this, wrappingWidthProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.text.Text.underline(f: (() -> Boolean)? = null): Boolean =
        template("underline", f, this, underlineProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.text.Text.lineSpacing(f: (() -> Double)? = null): Double =
        template("lineSpacing", f, this, lineSpacingProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.text.Text.textAlignment(f: (() -> javafx.scene.text.TextAlignment)? = null): javafx.scene.text.TextAlignment =
        template("textAlignment", f, this, textAlignmentProperty()!! as ObservableValue<javafx.scene.text.TextAlignment>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.text.Text.baselineOffset(f: (() -> Double)? = null): Double =
        template("baselineOffset", f, this, baselineOffsetProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.text.Text.strikethrough(f: (() -> Boolean)? = null): Boolean =
        template("strikethrough", f, this, strikethroughProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.text.Text.textOrigin(f: (() -> javafx.geometry.VPos)? = null): javafx.geometry.VPos =
        template("textOrigin", f, this, textOriginProperty()!! as ObservableValue<javafx.geometry.VPos>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.text.Text.fontSmoothingType(f: (() -> javafx.scene.text.FontSmoothingType)? = null): javafx.scene.text.FontSmoothingType =
        template("fontSmoothingType", f, this, fontSmoothingTypeProperty()!! as ObservableValue<javafx.scene.text.FontSmoothingType>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.text.Text.boundsType(f: (() -> javafx.scene.text.TextBoundsType)? = null): javafx.scene.text.TextBoundsType =
        template("boundsType", f, this, boundsTypeProperty()!! as ObservableValue<javafx.scene.text.TextBoundsType>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.text.Text.font(f: (() -> javafx.scene.text.Font)? = null): javafx.scene.text.Font =
        template("font", f, this, fontProperty()!! as ObservableValue<javafx.scene.text.Font>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.text.Text.text(f: (() -> String)? = null): String =
        template("text", f, this, textProperty()!! as ObservableValue<String>)

// javafx.scene.control.cell.CheckBoxTreeTableCell

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S, T> javafx.scene.control.cell.CheckBoxTreeTableCell<S, T>.converter(f: (() -> javafx.util.StringConverter<T>)? = null): javafx.util.StringConverter<T> =
        template("converter", f, this, converterProperty()!! as ObservableValue<javafx.util.StringConverter<T>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S, T> javafx.scene.control.cell.CheckBoxTreeTableCell<S, T>.selectedStateCallback(f: (() -> javafx.util.Callback<Int, javafx.beans.value.ObservableValue<Boolean>>)? = null): javafx.util.Callback<Int, javafx.beans.value.ObservableValue<Boolean>> =
        template("selectedStateCallback", f, this, selectedStateCallbackProperty()!! as ObservableValue<javafx.util.Callback<Int, javafx.beans.value.ObservableValue<Boolean>>>)

// javafx.scene.control.TreeView

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.TreeView<T>.showRoot(f: (() -> Boolean)? = null): Boolean =
        template("showRoot", f, this, showRootProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.TreeView<T>.focusModel(f: (() -> javafx.scene.control.FocusModel<javafx.scene.control.TreeItem<T>>)? = null): javafx.scene.control.FocusModel<javafx.scene.control.TreeItem<T>> =
        template("focusModel", f, this, focusModelProperty()!! as ObservableValue<javafx.scene.control.FocusModel<javafx.scene.control.TreeItem<T>>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.TreeView<T>.onScrollTo(f: (() -> javafx.event.EventHandler<javafx.scene.control.ScrollToEvent<Int>>)? = null): javafx.event.EventHandler<javafx.scene.control.ScrollToEvent<Int>> =
        template("onScrollTo", f, this, onScrollToProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.scene.control.ScrollToEvent<Int>>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.TreeView<T>.selectionModel(f: (() -> javafx.scene.control.MultipleSelectionModel<javafx.scene.control.TreeItem<T>>)? = null): javafx.scene.control.MultipleSelectionModel<javafx.scene.control.TreeItem<T>> =
        template("selectionModel", f, this, selectionModelProperty()!! as ObservableValue<javafx.scene.control.MultipleSelectionModel<javafx.scene.control.TreeItem<T>>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.TreeView<T>.editingItem(f: (() -> javafx.scene.control.TreeItem<T>)? = null): javafx.scene.control.TreeItem<T> =
        template("editingItem", f, this, editingItemProperty()!! as ObservableValue<javafx.scene.control.TreeItem<T>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.TreeView<T>.expandedItemCount(f: (() -> Int)? = null): Int =
        template("expandedItemCount", f, this, expandedItemCountProperty()!! as ObservableValue<Int>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.TreeView<T>.fixedCellSize(f: (() -> Double)? = null): Double =
        template("fixedCellSize", f, this, fixedCellSizeProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.TreeView<T>.onEditCancel(f: (() -> javafx.event.EventHandler<javafx.scene.control.TreeView.EditEvent<T>>)? = null): javafx.event.EventHandler<javafx.scene.control.TreeView.EditEvent<T>> =
        template("onEditCancel", f, this, onEditCancelProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.scene.control.TreeView.EditEvent<T>>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.TreeView<T>.onEditCommit(f: (() -> javafx.event.EventHandler<javafx.scene.control.TreeView.EditEvent<T>>)? = null): javafx.event.EventHandler<javafx.scene.control.TreeView.EditEvent<T>> =
        template("onEditCommit", f, this, onEditCommitProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.scene.control.TreeView.EditEvent<T>>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.TreeView<T>.onEditStart(f: (() -> javafx.event.EventHandler<javafx.scene.control.TreeView.EditEvent<T>>)? = null): javafx.event.EventHandler<javafx.scene.control.TreeView.EditEvent<T>> =
        template("onEditStart", f, this, onEditStartProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.scene.control.TreeView.EditEvent<T>>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.TreeView<T>.cellFactory(f: (() -> javafx.util.Callback<javafx.scene.control.TreeView<T>, javafx.scene.control.TreeCell<T>>)? = null): javafx.util.Callback<javafx.scene.control.TreeView<T>, javafx.scene.control.TreeCell<T>> =
        template("cellFactory", f, this, cellFactoryProperty()!! as ObservableValue<javafx.util.Callback<javafx.scene.control.TreeView<T>, javafx.scene.control.TreeCell<T>>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.TreeView<T>.root(f: (() -> javafx.scene.control.TreeItem<T>)? = null): javafx.scene.control.TreeItem<T> =
        template("root", f, this, rootProperty()!! as ObservableValue<javafx.scene.control.TreeItem<T>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.TreeView<T>.editable(f: (() -> Boolean)? = null): Boolean =
        template("editable", f, this, editableProperty()!! as ObservableValue<Boolean>)

// javafx.beans.property.MapPropertyBase

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <K, V> javafx.beans.property.MapPropertyBase<K, V>.size(f: (() -> Int)? = null): Int =
        template("size", f, this, sizeProperty()!! as ObservableValue<Int>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <K, V> javafx.beans.property.MapPropertyBase<K, V>.empty(f: (() -> Boolean)? = null): Boolean =
        template("empty", f, this, emptyProperty()!! as ObservableValue<Boolean>)

// javafx.scene.control.TextInputControl

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.TextInputControl.anchor(f: (() -> Int)? = null): Int =
        template("anchor", f, this, anchorProperty()!! as ObservableValue<Int>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.TextInputControl.length(f: (() -> Int)? = null): Int =
        template("length", f, this, lengthProperty()!! as ObservableValue<Int>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.TextInputControl.undoable(f: (() -> Boolean)? = null): Boolean =
        template("undoable", f, this, undoableProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.TextInputControl.redoable(f: (() -> Boolean)? = null): Boolean =
        template("redoable", f, this, redoableProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.TextInputControl.promptText(f: (() -> String)? = null): String =
        template("promptText", f, this, promptTextProperty()!! as ObservableValue<String>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.TextInputControl.textFormatter(f: (() -> javafx.scene.control.TextFormatter<*>)? = null): javafx.scene.control.TextFormatter<*> =
        template("textFormatter", f, this, textFormatterProperty()!! as ObservableValue<javafx.scene.control.TextFormatter<*>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.TextInputControl.selection(f: (() -> javafx.scene.control.IndexRange)? = null): javafx.scene.control.IndexRange =
        template("selection", f, this, selectionProperty()!! as ObservableValue<javafx.scene.control.IndexRange>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.TextInputControl.selectedText(f: (() -> String)? = null): String =
        template("selectedText", f, this, selectedTextProperty()!! as ObservableValue<String>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.TextInputControl.caretPosition(f: (() -> Int)? = null): Int =
        template("caretPosition", f, this, caretPositionProperty()!! as ObservableValue<Int>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.TextInputControl.font(f: (() -> javafx.scene.text.Font)? = null): javafx.scene.text.Font =
        template("font", f, this, fontProperty()!! as ObservableValue<javafx.scene.text.Font>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.TextInputControl.text(f: (() -> String)? = null): String =
        template("text", f, this, textProperty()!! as ObservableValue<String>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.TextInputControl.editable(f: (() -> Boolean)? = null): Boolean =
        template("editable", f, this, editableProperty()!! as ObservableValue<Boolean>)

// javafx.scene.chart.XYChart

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <X, Y> javafx.scene.chart.XYChart<X, Y>.data(f: (() -> javafx.collections.ObservableList<javafx.scene.chart.XYChart.Series<X, Y>>)? = null): javafx.collections.ObservableList<javafx.scene.chart.XYChart.Series<X, Y>> =
        template("data", f, this, dataProperty()!! as ObservableValue<javafx.collections.ObservableList<javafx.scene.chart.XYChart.Series<X, Y>>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <X, Y> javafx.scene.chart.XYChart<X, Y>.alternativeRowFillVisible(f: (() -> Boolean)? = null): Boolean =
        template("alternativeRowFillVisible", f, this, alternativeRowFillVisibleProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <X, Y> javafx.scene.chart.XYChart<X, Y>.horizontalGridLinesVisible(f: (() -> Boolean)? = null): Boolean =
        template("horizontalGridLinesVisible", f, this, horizontalGridLinesVisibleProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <X, Y> javafx.scene.chart.XYChart<X, Y>.alternativeColumnFillVisible(f: (() -> Boolean)? = null): Boolean =
        template("alternativeColumnFillVisible", f, this, alternativeColumnFillVisibleProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <X, Y> javafx.scene.chart.XYChart<X, Y>.horizontalZeroLineVisible(f: (() -> Boolean)? = null): Boolean =
        template("horizontalZeroLineVisible", f, this, horizontalZeroLineVisibleProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <X, Y> javafx.scene.chart.XYChart<X, Y>.verticalGridLinesVisible(f: (() -> Boolean)? = null): Boolean =
        template("verticalGridLinesVisible", f, this, verticalGridLinesVisibleProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <X, Y> javafx.scene.chart.XYChart<X, Y>.verticalZeroLineVisible(f: (() -> Boolean)? = null): Boolean =
        template("verticalZeroLineVisible", f, this, verticalZeroLineVisibleProperty()!! as ObservableValue<Boolean>)

// javafx.scene.control.cell.ChoiceBoxTableCell

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S, T> javafx.scene.control.cell.ChoiceBoxTableCell<S, T>.converter(f: (() -> javafx.util.StringConverter<T>)? = null): javafx.util.StringConverter<T> =
        template("converter", f, this, converterProperty()!! as ObservableValue<javafx.util.StringConverter<T>>)

// javafx.scene.shape.SVGPath

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.SVGPath.content(f: (() -> String)? = null): String =
        template("content", f, this, contentProperty()!! as ObservableValue<String>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.SVGPath.fillRule(f: (() -> javafx.scene.shape.FillRule)? = null): javafx.scene.shape.FillRule =
        template("fillRule", f, this, fillRuleProperty()!! as ObservableValue<javafx.scene.shape.FillRule>)

// javafx.scene.control.TextArea

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.TextArea.scrollTop(f: (() -> Double)? = null): Double =
        template("scrollTop", f, this, scrollTopProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.TextArea.scrollLeft(f: (() -> Double)? = null): Double =
        template("scrollLeft", f, this, scrollLeftProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.TextArea.prefColumnCount(f: (() -> Int)? = null): Int =
        template("prefColumnCount", f, this, prefColumnCountProperty()!! as ObservableValue<Int>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.TextArea.prefRowCount(f: (() -> Int)? = null): Int =
        template("prefRowCount", f, this, prefRowCountProperty()!! as ObservableValue<Int>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.TextArea.wrapText(f: (() -> Boolean)? = null): Boolean =
        template("wrapText", f, this, wrapTextProperty()!! as ObservableValue<Boolean>)

// javafx.scene.control.cell.CheckBoxTableCell

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S, T> javafx.scene.control.cell.CheckBoxTableCell<S, T>.converter(f: (() -> javafx.util.StringConverter<T>)? = null): javafx.util.StringConverter<T> =
        template("converter", f, this, converterProperty()!! as ObservableValue<javafx.util.StringConverter<T>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S, T> javafx.scene.control.cell.CheckBoxTableCell<S, T>.selectedStateCallback(f: (() -> javafx.util.Callback<Int, javafx.beans.value.ObservableValue<Boolean>>)? = null): javafx.util.Callback<Int, javafx.beans.value.ObservableValue<Boolean>> =
        template("selectedStateCallback", f, this, selectedStateCallbackProperty()!! as ObservableValue<javafx.util.Callback<Int, javafx.beans.value.ObservableValue<Boolean>>>)

// javafx.scene.control.TableColumn

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S, T> javafx.scene.control.TableColumn<S, T>.sortType(f: (() -> javafx.scene.control.TableColumn.SortType)? = null): javafx.scene.control.TableColumn.SortType =
        template("sortType", f, this, sortTypeProperty()!! as ObservableValue<javafx.scene.control.TableColumn.SortType>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S, T> javafx.scene.control.TableColumn<S, T>.onEditCancel(f: (() -> javafx.event.EventHandler<javafx.scene.control.TableColumn.CellEditEvent<S, T>>)? = null): javafx.event.EventHandler<javafx.scene.control.TableColumn.CellEditEvent<S, T>> =
        template("onEditCancel", f, this, onEditCancelProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.scene.control.TableColumn.CellEditEvent<S, T>>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S, T> javafx.scene.control.TableColumn<S, T>.onEditCommit(f: (() -> javafx.event.EventHandler<javafx.scene.control.TableColumn.CellEditEvent<S, T>>)? = null): javafx.event.EventHandler<javafx.scene.control.TableColumn.CellEditEvent<S, T>> =
        template("onEditCommit", f, this, onEditCommitProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.scene.control.TableColumn.CellEditEvent<S, T>>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S, T> javafx.scene.control.TableColumn<S, T>.tableView(f: (() -> javafx.scene.control.TableView<S>)? = null): javafx.scene.control.TableView<S> =
        template("tableView", f, this, tableViewProperty()!! as ObservableValue<javafx.scene.control.TableView<S>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S, T> javafx.scene.control.TableColumn<S, T>.onEditStart(f: (() -> javafx.event.EventHandler<javafx.scene.control.TableColumn.CellEditEvent<S, T>>)? = null): javafx.event.EventHandler<javafx.scene.control.TableColumn.CellEditEvent<S, T>> =
        template("onEditStart", f, this, onEditStartProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.scene.control.TableColumn.CellEditEvent<S, T>>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S, T> javafx.scene.control.TableColumn<S, T>.cellFactory(f: (() -> javafx.util.Callback<javafx.scene.control.TableColumn<S, T>, javafx.scene.control.TableCell<S, T>>)? = null): javafx.util.Callback<javafx.scene.control.TableColumn<S, T>, javafx.scene.control.TableCell<S, T>> =
        template("cellFactory", f, this, cellFactoryProperty()!! as ObservableValue<javafx.util.Callback<javafx.scene.control.TableColumn<S, T>, javafx.scene.control.TableCell<S, T>>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S, T> javafx.scene.control.TableColumn<S, T>.cellValueFactory(f: (() -> javafx.util.Callback<javafx.scene.control.TableColumn.CellDataFeatures<S, T>, javafx.beans.value.ObservableValue<T>>)? = null): javafx.util.Callback<javafx.scene.control.TableColumn.CellDataFeatures<S, T>, javafx.beans.value.ObservableValue<T>> =
        template("cellValueFactory", f, this, cellValueFactoryProperty()!! as ObservableValue<javafx.util.Callback<javafx.scene.control.TableColumn.CellDataFeatures<S, T>, javafx.beans.value.ObservableValue<T>>>)

// javafx.scene.shape.CubicCurveTo

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.CubicCurveTo.y(f: (() -> Double)? = null): Double =
        template("y", f, this, yProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.CubicCurveTo.x(f: (() -> Double)? = null): Double =
        template("x", f, this, xProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.CubicCurveTo.controlX1(f: (() -> Double)? = null): Double =
        template("controlX1", f, this, controlX1Property()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.CubicCurveTo.controlY2(f: (() -> Double)? = null): Double =
        template("controlY2", f, this, controlY2Property()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.CubicCurveTo.controlX2(f: (() -> Double)? = null): Double =
        template("controlX2", f, this, controlX2Property()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.CubicCurveTo.controlY1(f: (() -> Double)? = null): Double =
        template("controlY1", f, this, controlY1Property()!! as ObservableValue<Double>)

// javafx.scene.Scene

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Scene.onRotate(f: (() -> javafx.event.EventHandler<in javafx.scene.input.RotateEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.RotateEvent> =
        template("onRotate", f, this, onRotateProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.RotateEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Scene.onZoom(f: (() -> javafx.event.EventHandler<in javafx.scene.input.ZoomEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.ZoomEvent> =
        template("onZoom", f, this, onZoomProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.ZoomEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Scene.onScroll(f: (() -> javafx.event.EventHandler<in javafx.scene.input.ScrollEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.ScrollEvent> =
        template("onScroll", f, this, onScrollProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.ScrollEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Scene.effectiveNodeOrientation(f: (() -> javafx.geometry.NodeOrientation)? = null): javafx.geometry.NodeOrientation =
        template("effectiveNodeOrientation", f, this, effectiveNodeOrientationProperty()!! as ObservableValue<javafx.geometry.NodeOrientation>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Scene.nodeOrientation(f: (() -> javafx.geometry.NodeOrientation)? = null): javafx.geometry.NodeOrientation =
        template("nodeOrientation", f, this, nodeOrientationProperty()!! as ObservableValue<javafx.geometry.NodeOrientation>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Scene.onDragDetected(f: (() -> javafx.event.EventHandler<in javafx.scene.input.MouseEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.MouseEvent> =
        template("onDragDetected", f, this, onDragDetectedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.MouseEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Scene.onDragDone(f: (() -> javafx.event.EventHandler<in javafx.scene.input.DragEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.DragEvent> =
        template("onDragDone", f, this, onDragDoneProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.DragEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Scene.onContextMenuRequested(f: (() -> javafx.event.EventHandler<in javafx.scene.input.ContextMenuEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.ContextMenuEvent> =
        template("onContextMenuRequested", f, this, onContextMenuRequestedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.ContextMenuEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Scene.onDragDropped(f: (() -> javafx.event.EventHandler<in javafx.scene.input.DragEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.DragEvent> =
        template("onDragDropped", f, this, onDragDroppedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.DragEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Scene.width(f: (() -> Double)? = null): Double =
        template("width", f, this, widthProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Scene.y(f: (() -> Double)? = null): Double =
        template("y", f, this, yProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Scene.x(f: (() -> Double)? = null): Double =
        template("x", f, this, xProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Scene.height(f: (() -> Double)? = null): Double =
        template("height", f, this, heightProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Scene.focusOwner(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
        template("focusOwner", f, this, focusOwnerProperty()!! as ObservableValue<javafx.scene.Node>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Scene.userAgentStylesheet(f: (() -> String)? = null): String =
        template("userAgentStylesheet", f, this, userAgentStylesheetProperty()!! as ObservableValue<String>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Scene.onKeyTyped(f: (() -> javafx.event.EventHandler<in javafx.scene.input.KeyEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.KeyEvent> =
        template("onKeyTyped", f, this, onKeyTypedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.KeyEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Scene.onMouseClicked(f: (() -> javafx.event.EventHandler<in javafx.scene.input.MouseEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.MouseEvent> =
        template("onMouseClicked", f, this, onMouseClickedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.MouseEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Scene.onMouseMoved(f: (() -> javafx.event.EventHandler<in javafx.scene.input.MouseEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.MouseEvent> =
        template("onMouseMoved", f, this, onMouseMovedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.MouseEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Scene.onTouchPressed(f: (() -> javafx.event.EventHandler<in javafx.scene.input.TouchEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.TouchEvent> =
        template("onTouchPressed", f, this, onTouchPressedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.TouchEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Scene.onRotationFinished(f: (() -> javafx.event.EventHandler<in javafx.scene.input.RotateEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.RotateEvent> =
        template("onRotationFinished", f, this, onRotationFinishedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.RotateEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Scene.onSwipeDown(f: (() -> javafx.event.EventHandler<in javafx.scene.input.SwipeEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.SwipeEvent> =
        template("onSwipeDown", f, this, onSwipeDownProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.SwipeEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Scene.onSwipeLeft(f: (() -> javafx.event.EventHandler<in javafx.scene.input.SwipeEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.SwipeEvent> =
        template("onSwipeLeft", f, this, onSwipeLeftProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.SwipeEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Scene.onScrollStarted(f: (() -> javafx.event.EventHandler<in javafx.scene.input.ScrollEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.ScrollEvent> =
        template("onScrollStarted", f, this, onScrollStartedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.ScrollEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Scene.onZoomFinished(f: (() -> javafx.event.EventHandler<in javafx.scene.input.ZoomEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.ZoomEvent> =
        template("onZoomFinished", f, this, onZoomFinishedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.ZoomEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Scene.onKeyPressed(f: (() -> javafx.event.EventHandler<in javafx.scene.input.KeyEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.KeyEvent> =
        template("onKeyPressed", f, this, onKeyPressedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.KeyEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Scene.onScrollFinished(f: (() -> javafx.event.EventHandler<in javafx.scene.input.ScrollEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.ScrollEvent> =
        template("onScrollFinished", f, this, onScrollFinishedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.ScrollEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Scene.onKeyReleased(f: (() -> javafx.event.EventHandler<in javafx.scene.input.KeyEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.KeyEvent> =
        template("onKeyReleased", f, this, onKeyReleasedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.KeyEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Scene.onTouchMoved(f: (() -> javafx.event.EventHandler<in javafx.scene.input.TouchEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.TouchEvent> =
        template("onTouchMoved", f, this, onTouchMovedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.TouchEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Scene.onMouseReleased(f: (() -> javafx.event.EventHandler<in javafx.scene.input.MouseEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.MouseEvent> =
        template("onMouseReleased", f, this, onMouseReleasedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.MouseEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Scene.onMouseEntered(f: (() -> javafx.event.EventHandler<in javafx.scene.input.MouseEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.MouseEvent> =
        template("onMouseEntered", f, this, onMouseEnteredProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.MouseEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Scene.onRotationStarted(f: (() -> javafx.event.EventHandler<in javafx.scene.input.RotateEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.RotateEvent> =
        template("onRotationStarted", f, this, onRotationStartedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.RotateEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Scene.onTouchStationary(f: (() -> javafx.event.EventHandler<in javafx.scene.input.TouchEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.TouchEvent> =
        template("onTouchStationary", f, this, onTouchStationaryProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.TouchEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Scene.onMouseDragReleased(f: (() -> javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent> =
        template("onMouseDragReleased", f, this, onMouseDragReleasedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Scene.onInputMethodTextChanged(f: (() -> javafx.event.EventHandler<in javafx.scene.input.InputMethodEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.InputMethodEvent> =
        template("onInputMethodTextChanged", f, this, onInputMethodTextChangedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.InputMethodEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Scene.onMouseDragged(f: (() -> javafx.event.EventHandler<in javafx.scene.input.MouseEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.MouseEvent> =
        template("onMouseDragged", f, this, onMouseDraggedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.MouseEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Scene.onSwipeRight(f: (() -> javafx.event.EventHandler<in javafx.scene.input.SwipeEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.SwipeEvent> =
        template("onSwipeRight", f, this, onSwipeRightProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.SwipeEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Scene.onDragOver(f: (() -> javafx.event.EventHandler<in javafx.scene.input.DragEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.DragEvent> =
        template("onDragOver", f, this, onDragOverProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.DragEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Scene.onDragExited(f: (() -> javafx.event.EventHandler<in javafx.scene.input.DragEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.DragEvent> =
        template("onDragExited", f, this, onDragExitedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.DragEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Scene.onSwipeUp(f: (() -> javafx.event.EventHandler<in javafx.scene.input.SwipeEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.SwipeEvent> =
        template("onSwipeUp", f, this, onSwipeUpProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.SwipeEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Scene.onMouseDragEntered(f: (() -> javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent> =
        template("onMouseDragEntered", f, this, onMouseDragEnteredProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Scene.onMouseDragExited(f: (() -> javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent> =
        template("onMouseDragExited", f, this, onMouseDragExitedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Scene.onMouseDragOver(f: (() -> javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent> =
        template("onMouseDragOver", f, this, onMouseDragOverProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.MouseDragEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Scene.onMouseExited(f: (() -> javafx.event.EventHandler<in javafx.scene.input.MouseEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.MouseEvent> =
        template("onMouseExited", f, this, onMouseExitedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.MouseEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Scene.onMousePressed(f: (() -> javafx.event.EventHandler<in javafx.scene.input.MouseEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.MouseEvent> =
        template("onMousePressed", f, this, onMousePressedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.MouseEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Scene.onTouchReleased(f: (() -> javafx.event.EventHandler<in javafx.scene.input.TouchEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.TouchEvent> =
        template("onTouchReleased", f, this, onTouchReleasedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.TouchEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Scene.onZoomStarted(f: (() -> javafx.event.EventHandler<in javafx.scene.input.ZoomEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.ZoomEvent> =
        template("onZoomStarted", f, this, onZoomStartedProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.ZoomEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Scene.eventDispatcher(f: (() -> javafx.event.EventDispatcher)? = null): javafx.event.EventDispatcher =
        template("eventDispatcher", f, this, eventDispatcherProperty()!! as ObservableValue<javafx.event.EventDispatcher>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Scene.onDragEntered(f: (() -> javafx.event.EventHandler<in javafx.scene.input.DragEvent>)? = null): javafx.event.EventHandler<in javafx.scene.input.DragEvent> =
        template("onDragEntered", f, this, onDragEnteredProperty()!! as ObservableValue<javafx.event.EventHandler<in javafx.scene.input.DragEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Scene.camera(f: (() -> javafx.scene.Camera)? = null): javafx.scene.Camera =
        template("camera", f, this, cameraProperty()!! as ObservableValue<javafx.scene.Camera>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Scene.root(f: (() -> javafx.scene.Parent)? = null): javafx.scene.Parent =
        template("root", f, this, rootProperty()!! as ObservableValue<javafx.scene.Parent>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Scene.fill(f: (() -> javafx.scene.paint.Paint)? = null): javafx.scene.paint.Paint =
        template("fill", f, this, fillProperty()!! as ObservableValue<javafx.scene.paint.Paint>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Scene.window(f: (() -> javafx.stage.Window)? = null): javafx.stage.Window =
        template("window", f, this, windowProperty()!! as ObservableValue<javafx.stage.Window>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Scene.cursor(f: (() -> javafx.scene.Cursor)? = null): javafx.scene.Cursor =
        template("cursor", f, this, cursorProperty()!! as ObservableValue<javafx.scene.Cursor>)

// javafx.scene.control.cell.ChoiceBoxTreeTableCell

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S, T> javafx.scene.control.cell.ChoiceBoxTreeTableCell<S, T>.converter(f: (() -> javafx.util.StringConverter<T>)? = null): javafx.util.StringConverter<T> =
        template("converter", f, this, converterProperty()!! as ObservableValue<javafx.util.StringConverter<T>>)

// javafx.scene.control.IndexedCell

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.IndexedCell<T>.index(f: (() -> Int)? = null): Int =
        template("index", f, this, indexProperty()!! as ObservableValue<Int>)

// javafx.scene.control.ScrollPane

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.ScrollPane.vmax(f: (() -> Double)? = null): Double =
        template("vmax", f, this, vmaxProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.ScrollPane.hmin(f: (() -> Double)? = null): Double =
        template("hmin", f, this, hminProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.ScrollPane.hvalue(f: (() -> Double)? = null): Double =
        template("hvalue", f, this, hvalueProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.ScrollPane.hmax(f: (() -> Double)? = null): Double =
        template("hmax", f, this, hmaxProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.ScrollPane.vvalue(f: (() -> Double)? = null): Double =
        template("vvalue", f, this, vvalueProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.ScrollPane.vmin(f: (() -> Double)? = null): Double =
        template("vmin", f, this, vminProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.ScrollPane.minViewportHeight(f: (() -> Double)? = null): Double =
        template("minViewportHeight", f, this, minViewportHeightProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.ScrollPane.prefViewportWidth(f: (() -> Double)? = null): Double =
        template("prefViewportWidth", f, this, prefViewportWidthProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.ScrollPane.prefViewportHeight(f: (() -> Double)? = null): Double =
        template("prefViewportHeight", f, this, prefViewportHeightProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.ScrollPane.viewportBounds(f: (() -> javafx.geometry.Bounds)? = null): javafx.geometry.Bounds =
        template("viewportBounds", f, this, viewportBoundsProperty()!! as ObservableValue<javafx.geometry.Bounds>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.ScrollPane.minViewportWidth(f: (() -> Double)? = null): Double =
        template("minViewportWidth", f, this, minViewportWidthProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.ScrollPane.vbarPolicy(f: (() -> javafx.scene.control.ScrollPane.ScrollBarPolicy)? = null): javafx.scene.control.ScrollPane.ScrollBarPolicy =
        template("vbarPolicy", f, this, vbarPolicyProperty()!! as ObservableValue<javafx.scene.control.ScrollPane.ScrollBarPolicy>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.ScrollPane.hbarPolicy(f: (() -> javafx.scene.control.ScrollPane.ScrollBarPolicy)? = null): javafx.scene.control.ScrollPane.ScrollBarPolicy =
        template("hbarPolicy", f, this, hbarPolicyProperty()!! as ObservableValue<javafx.scene.control.ScrollPane.ScrollBarPolicy>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.ScrollPane.fitToHeight(f: (() -> Boolean)? = null): Boolean =
        template("fitToHeight", f, this, fitToHeightProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.ScrollPane.fitToWidth(f: (() -> Boolean)? = null): Boolean =
        template("fitToWidth", f, this, fitToWidthProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.ScrollPane.content(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
        template("content", f, this, contentProperty()!! as ObservableValue<javafx.scene.Node>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.ScrollPane.pannable(f: (() -> Boolean)? = null): Boolean =
        template("pannable", f, this, pannableProperty()!! as ObservableValue<Boolean>)

// javafx.scene.control.Tab

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Tab.style(f: (() -> String)? = null): String =
        template("style", f, this, styleProperty()!! as ObservableValue<String>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Tab.graphic(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
        template("graphic", f, this, graphicProperty()!! as ObservableValue<javafx.scene.Node>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Tab.contextMenu(f: (() -> javafx.scene.control.ContextMenu)? = null): javafx.scene.control.ContextMenu =
        template("contextMenu", f, this, contextMenuProperty()!! as ObservableValue<javafx.scene.control.ContextMenu>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Tab.onCloseRequest(f: (() -> javafx.event.EventHandler<javafx.event.Event>)? = null): javafx.event.EventHandler<javafx.event.Event> =
        template("onCloseRequest", f, this, onCloseRequestProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.event.Event>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Tab.selected(f: (() -> Boolean)? = null): Boolean =
        template("selected", f, this, selectedProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Tab.onSelectionChanged(f: (() -> javafx.event.EventHandler<javafx.event.Event>)? = null): javafx.event.EventHandler<javafx.event.Event> =
        template("onSelectionChanged", f, this, onSelectionChangedProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.event.Event>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Tab.closable(f: (() -> Boolean)? = null): Boolean =
        template("closable", f, this, closableProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Tab.content(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
        template("content", f, this, contentProperty()!! as ObservableValue<javafx.scene.Node>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Tab.tooltip(f: (() -> javafx.scene.control.Tooltip)? = null): javafx.scene.control.Tooltip =
        template("tooltip", f, this, tooltipProperty()!! as ObservableValue<javafx.scene.control.Tooltip>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Tab.onClosed(f: (() -> javafx.event.EventHandler<javafx.event.Event>)? = null): javafx.event.EventHandler<javafx.event.Event> =
        template("onClosed", f, this, onClosedProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.event.Event>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Tab.tabPane(f: (() -> javafx.scene.control.TabPane)? = null): javafx.scene.control.TabPane =
        template("tabPane", f, this, tabPaneProperty()!! as ObservableValue<javafx.scene.control.TabPane>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Tab.text(f: (() -> String)? = null): String =
        template("text", f, this, textProperty()!! as ObservableValue<String>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Tab.disable(f: (() -> Boolean)? = null): Boolean =
        template("disable", f, this, disableProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Tab.disabled(f: (() -> Boolean)? = null): Boolean =
        template("disabled", f, this, disabledProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Tab.id(f: (() -> String)? = null): String =
        template("id", f, this, idProperty()!! as ObservableValue<String>)

// javafx.scene.control.cell.TextFieldListCell

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.cell.TextFieldListCell<T>.converter(f: (() -> javafx.util.StringConverter<T>)? = null): javafx.util.StringConverter<T> =
        template("converter", f, this, converterProperty()!! as ObservableValue<javafx.util.StringConverter<T>>)

// javafx.concurrent.Task

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <V> javafx.concurrent.Task<V>.onFailed(f: (() -> javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>)? = null): javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent> =
        template("onFailed", f, this, onFailedProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <V> javafx.concurrent.Task<V>.value(f: (() -> V)? = null): V =
        template("value", f, this, valueProperty()!! as ObservableValue<V>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <V> javafx.concurrent.Task<V>.state(f: (() -> javafx.concurrent.Worker.State)? = null): javafx.concurrent.Worker.State =
        template("state", f, this, stateProperty()!! as ObservableValue<javafx.concurrent.Worker.State>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <V> javafx.concurrent.Task<V>.running(f: (() -> Boolean)? = null): Boolean =
        template("running", f, this, runningProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <V> javafx.concurrent.Task<V>.progress(f: (() -> Double)? = null): Double =
        template("progress", f, this, progressProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <V> javafx.concurrent.Task<V>.workDone(f: (() -> Double)? = null): Double =
        template("workDone", f, this, workDoneProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <V> javafx.concurrent.Task<V>.message(f: (() -> String)? = null): String =
        template("message", f, this, messageProperty()!! as ObservableValue<String>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <V> javafx.concurrent.Task<V>.title(f: (() -> String)? = null): String =
        template("title", f, this, titleProperty()!! as ObservableValue<String>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <V> javafx.concurrent.Task<V>.onRunning(f: (() -> javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>)? = null): javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent> =
        template("onRunning", f, this, onRunningProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <V> javafx.concurrent.Task<V>.onScheduled(f: (() -> javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>)? = null): javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent> =
        template("onScheduled", f, this, onScheduledProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <V> javafx.concurrent.Task<V>.onCancelled(f: (() -> javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>)? = null): javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent> =
        template("onCancelled", f, this, onCancelledProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <V> javafx.concurrent.Task<V>.onSucceeded(f: (() -> javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>)? = null): javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent> =
        template("onSucceeded", f, this, onSucceededProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <V> javafx.concurrent.Task<V>.exception(f: (() -> Throwable)? = null): Throwable =
        template("exception", f, this, exceptionProperty()!! as ObservableValue<Throwable>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <V> javafx.concurrent.Task<V>.totalWork(f: (() -> Double)? = null): Double =
        template("totalWork", f, this, totalWorkProperty()!! as ObservableValue<Double>)

// javafx.scene.text.TextFlow

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.text.TextFlow.lineSpacing(f: (() -> Double)? = null): Double =
        template("lineSpacing", f, this, lineSpacingProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.text.TextFlow.textAlignment(f: (() -> javafx.scene.text.TextAlignment)? = null): javafx.scene.text.TextAlignment =
        template("textAlignment", f, this, textAlignmentProperty()!! as ObservableValue<javafx.scene.text.TextAlignment>)

// javafx.beans.property.ReadOnlyDoubleWrapper

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.beans.property.ReadOnlyDoubleWrapper.getReadOnly(f: (() -> Double)? = null): Double =
        template("getReadOnly", f, this, getReadOnlyProperty()!! as ObservableValue<Double>)

// javafx.animation.PauseTransition

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.animation.PauseTransition.duration(f: (() -> javafx.util.Duration)? = null): javafx.util.Duration =
        template("duration", f, this, durationProperty()!! as ObservableValue<javafx.util.Duration>)

// javafx.stage.DirectoryChooser

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.stage.DirectoryChooser.initialDirectory(f: (() -> java.io.File)? = null): java.io.File =
        template("initialDirectory", f, this, initialDirectoryProperty()!! as ObservableValue<java.io.File>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.stage.DirectoryChooser.title(f: (() -> String)? = null): String =
        template("title", f, this, titleProperty()!! as ObservableValue<String>)

// javafx.scene.shape.Ellipse

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.Ellipse.radiusX(f: (() -> Double)? = null): Double =
        template("radiusX", f, this, radiusXProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.Ellipse.radiusY(f: (() -> Double)? = null): Double =
        template("radiusY", f, this, radiusYProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.Ellipse.centerX(f: (() -> Double)? = null): Double =
        template("centerX", f, this, centerXProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.Ellipse.centerY(f: (() -> Double)? = null): Double =
        template("centerY", f, this, centerYProperty()!! as ObservableValue<Double>)

// javafx.scene.chart.BarChart

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <X, Y> javafx.scene.chart.BarChart<X, Y>.categoryGap(f: (() -> Double)? = null): Double =
        template("categoryGap", f, this, categoryGapProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <X, Y> javafx.scene.chart.BarChart<X, Y>.barGap(f: (() -> Double)? = null): Double =
        template("barGap", f, this, barGapProperty()!! as ObservableValue<Double>)

// javafx.scene.chart.NumberAxis

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.chart.NumberAxis.forceZeroInRange(f: (() -> Boolean)? = null): Boolean =
        template("forceZeroInRange", f, this, forceZeroInRangeProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.chart.NumberAxis.tickUnit(f: (() -> Double)? = null): Double =
        template("tickUnit", f, this, tickUnitProperty()!! as ObservableValue<Double>)

// javafx.scene.shape.QuadCurveTo

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.QuadCurveTo.y(f: (() -> Double)? = null): Double =
        template("y", f, this, yProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.QuadCurveTo.x(f: (() -> Double)? = null): Double =
        template("x", f, this, xProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.QuadCurveTo.controlY(f: (() -> Double)? = null): Double =
        template("controlY", f, this, controlYProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.QuadCurveTo.controlX(f: (() -> Double)? = null): Double =
        template("controlX", f, this, controlXProperty()!! as ObservableValue<Double>)

// javafx.scene.control.TextFormatter

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <V> javafx.scene.control.TextFormatter<V>.value(f: (() -> V)? = null): V =
        template("value", f, this, valueProperty()!! as ObservableValue<V>)

// javafx.scene.control.Separator

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Separator.orientation(f: (() -> javafx.geometry.Orientation)? = null): javafx.geometry.Orientation =
        template("orientation", f, this, orientationProperty()!! as ObservableValue<javafx.geometry.Orientation>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Separator.valignment(f: (() -> javafx.geometry.VPos)? = null): javafx.geometry.VPos =
        template("valignment", f, this, valignmentProperty()!! as ObservableValue<javafx.geometry.VPos>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Separator.halignment(f: (() -> javafx.geometry.HPos)? = null): javafx.geometry.HPos =
        template("halignment", f, this, halignmentProperty()!! as ObservableValue<javafx.geometry.HPos>)

// javafx.scene.shape.MeshView

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.MeshView.mesh(f: (() -> javafx.scene.shape.Mesh)? = null): javafx.scene.shape.Mesh =
        template("mesh", f, this, meshProperty()!! as ObservableValue<javafx.scene.shape.Mesh>)

// javafx.scene.transform.Translate

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.transform.Translate.y(f: (() -> Double)? = null): Double =
        template("y", f, this, yProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.transform.Translate.x(f: (() -> Double)? = null): Double =
        template("x", f, this, xProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.transform.Translate.z(f: (() -> Double)? = null): Double =
        template("z", f, this, zProperty()!! as ObservableValue<Double>)

// javafx.scene.paint.PhongMaterial

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.paint.PhongMaterial.specularPower(f: (() -> Double)? = null): Double =
        template("specularPower", f, this, specularPowerProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.paint.PhongMaterial.diffuseColor(f: (() -> javafx.scene.paint.Color)? = null): javafx.scene.paint.Color =
        template("diffuseColor", f, this, diffuseColorProperty()!! as ObservableValue<javafx.scene.paint.Color>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.paint.PhongMaterial.diffuseMap(f: (() -> javafx.scene.image.Image)? = null): javafx.scene.image.Image =
        template("diffuseMap", f, this, diffuseMapProperty()!! as ObservableValue<javafx.scene.image.Image>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.paint.PhongMaterial.specularMap(f: (() -> javafx.scene.image.Image)? = null): javafx.scene.image.Image =
        template("specularMap", f, this, specularMapProperty()!! as ObservableValue<javafx.scene.image.Image>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.paint.PhongMaterial.specularColor(f: (() -> javafx.scene.paint.Color)? = null): javafx.scene.paint.Color =
        template("specularColor", f, this, specularColorProperty()!! as ObservableValue<javafx.scene.paint.Color>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.paint.PhongMaterial.selfIlluminationMap(f: (() -> javafx.scene.image.Image)? = null): javafx.scene.image.Image =
        template("selfIlluminationMap", f, this, selfIlluminationMapProperty()!! as ObservableValue<javafx.scene.image.Image>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.paint.PhongMaterial.bumpMap(f: (() -> javafx.scene.image.Image)? = null): javafx.scene.image.Image =
        template("bumpMap", f, this, bumpMapProperty()!! as ObservableValue<javafx.scene.image.Image>)

// javafx.stage.PopupWindow

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.stage.PopupWindow.hideOnEscape(f: (() -> Boolean)? = null): Boolean =
        template("hideOnEscape", f, this, hideOnEscapeProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.stage.PopupWindow.ownerWindow(f: (() -> javafx.stage.Window)? = null): javafx.stage.Window =
        template("ownerWindow", f, this, ownerWindowProperty()!! as ObservableValue<javafx.stage.Window>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.stage.PopupWindow.consumeAutoHidingEvents(f: (() -> Boolean)? = null): Boolean =
        template("consumeAutoHidingEvents", f, this, consumeAutoHidingEventsProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.stage.PopupWindow.ownerNode(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
        template("ownerNode", f, this, ownerNodeProperty()!! as ObservableValue<javafx.scene.Node>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.stage.PopupWindow.anchorLocation(f: (() -> javafx.stage.PopupWindow.AnchorLocation)? = null): javafx.stage.PopupWindow.AnchorLocation =
        template("anchorLocation", f, this, anchorLocationProperty()!! as ObservableValue<javafx.stage.PopupWindow.AnchorLocation>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.stage.PopupWindow.onAutoHide(f: (() -> javafx.event.EventHandler<javafx.event.Event>)? = null): javafx.event.EventHandler<javafx.event.Event> =
        template("onAutoHide", f, this, onAutoHideProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.event.Event>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.stage.PopupWindow.anchorX(f: (() -> Double)? = null): Double =
        template("anchorX", f, this, anchorXProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.stage.PopupWindow.anchorY(f: (() -> Double)? = null): Double =
        template("anchorY", f, this, anchorYProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.stage.PopupWindow.autoFix(f: (() -> Boolean)? = null): Boolean =
        template("autoFix", f, this, autoFixProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.stage.PopupWindow.autoHide(f: (() -> Boolean)? = null): Boolean =
        template("autoHide", f, this, autoHideProperty()!! as ObservableValue<Boolean>)

// javafx.scene.Camera

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Camera.farClip(f: (() -> Double)? = null): Double =
        template("farClip", f, this, farClipProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.Camera.nearClip(f: (() -> Double)? = null): Double =
        template("nearClip", f, this, nearClipProperty()!! as ObservableValue<Double>)

// javafx.scene.control.ChoiceBox

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.ChoiceBox<T>.value(f: (() -> T)? = null): T =
        template("value", f, this, valueProperty()!! as ObservableValue<T>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.ChoiceBox<T>.showing(f: (() -> Boolean)? = null): Boolean =
        template("showing", f, this, showingProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.ChoiceBox<T>.onHidden(f: (() -> javafx.event.EventHandler<javafx.event.Event>)? = null): javafx.event.EventHandler<javafx.event.Event> =
        template("onHidden", f, this, onHiddenProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.event.Event>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.ChoiceBox<T>.onShown(f: (() -> javafx.event.EventHandler<javafx.event.Event>)? = null): javafx.event.EventHandler<javafx.event.Event> =
        template("onShown", f, this, onShownProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.event.Event>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.ChoiceBox<T>.onHiding(f: (() -> javafx.event.EventHandler<javafx.event.Event>)? = null): javafx.event.EventHandler<javafx.event.Event> =
        template("onHiding", f, this, onHidingProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.event.Event>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.ChoiceBox<T>.converter(f: (() -> javafx.util.StringConverter<T>)? = null): javafx.util.StringConverter<T> =
        template("converter", f, this, converterProperty()!! as ObservableValue<javafx.util.StringConverter<T>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.ChoiceBox<T>.onShowing(f: (() -> javafx.event.EventHandler<javafx.event.Event>)? = null): javafx.event.EventHandler<javafx.event.Event> =
        template("onShowing", f, this, onShowingProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.event.Event>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.ChoiceBox<T>.items(f: (() -> javafx.collections.ObservableList<T>)? = null): javafx.collections.ObservableList<T> =
        template("items", f, this, itemsProperty()!! as ObservableValue<javafx.collections.ObservableList<T>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.ChoiceBox<T>.selectionModel(f: (() -> javafx.scene.control.SingleSelectionModel<T>)? = null): javafx.scene.control.SingleSelectionModel<T> =
        template("selectionModel", f, this, selectionModelProperty()!! as ObservableValue<javafx.scene.control.SingleSelectionModel<T>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.ChoiceBox<T>.onAction(f: (() -> javafx.event.EventHandler<javafx.event.ActionEvent>)? = null): javafx.event.EventHandler<javafx.event.ActionEvent> =
        template("onAction", f, this, onActionProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.event.ActionEvent>>)

// javafx.scene.control.PopupControl

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.PopupControl.style(f: (() -> String)? = null): String =
        template("style", f, this, styleProperty()!! as ObservableValue<String>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.PopupControl.prefWidth(f: (() -> Double)? = null): Double =
        template("prefWidth", f, this, prefWidthProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.PopupControl.maxHeight(f: (() -> Double)? = null): Double =
        template("maxHeight", f, this, maxHeightProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.PopupControl.prefHeight(f: (() -> Double)? = null): Double =
        template("prefHeight", f, this, prefHeightProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.PopupControl.minHeight(f: (() -> Double)? = null): Double =
        template("minHeight", f, this, minHeightProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.PopupControl.skin(f: (() -> javafx.scene.control.Skin<*>)? = null): javafx.scene.control.Skin<*> =
        template("skin", f, this, skinProperty()!! as ObservableValue<javafx.scene.control.Skin<*>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.PopupControl.maxWidth(f: (() -> Double)? = null): Double =
        template("maxWidth", f, this, maxWidthProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.PopupControl.minWidth(f: (() -> Double)? = null): Double =
        template("minWidth", f, this, minWidthProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.PopupControl.id(f: (() -> String)? = null): String =
        template("id", f, this, idProperty()!! as ObservableValue<String>)

// javafx.scene.control.cell.CheckBoxTreeCell

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.cell.CheckBoxTreeCell<T>.converter(f: (() -> javafx.util.StringConverter<javafx.scene.control.TreeItem<T>>)? = null): javafx.util.StringConverter<javafx.scene.control.TreeItem<T>> =
        template("converter", f, this, converterProperty()!! as ObservableValue<javafx.util.StringConverter<javafx.scene.control.TreeItem<T>>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.cell.CheckBoxTreeCell<T>.selectedStateCallback(f: (() -> javafx.util.Callback<javafx.scene.control.TreeItem<T>, javafx.beans.value.ObservableValue<Boolean>>)? = null): javafx.util.Callback<javafx.scene.control.TreeItem<T>, javafx.beans.value.ObservableValue<Boolean>> =
        template("selectedStateCallback", f, this, selectedStateCallbackProperty()!! as ObservableValue<javafx.util.Callback<javafx.scene.control.TreeItem<T>, javafx.beans.value.ObservableValue<Boolean>>>)

// javafx.scene.SubScene

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.SubScene.width(f: (() -> Double)? = null): Double =
        template("width", f, this, widthProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.SubScene.height(f: (() -> Double)? = null): Double =
        template("height", f, this, heightProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.SubScene.userAgentStylesheet(f: (() -> String)? = null): String =
        template("userAgentStylesheet", f, this, userAgentStylesheetProperty()!! as ObservableValue<String>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.SubScene.camera(f: (() -> javafx.scene.Camera)? = null): javafx.scene.Camera =
        template("camera", f, this, cameraProperty()!! as ObservableValue<javafx.scene.Camera>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.SubScene.root(f: (() -> javafx.scene.Parent)? = null): javafx.scene.Parent =
        template("root", f, this, rootProperty()!! as ObservableValue<javafx.scene.Parent>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.SubScene.fill(f: (() -> javafx.scene.paint.Paint)? = null): javafx.scene.paint.Paint =
        template("fill", f, this, fillProperty()!! as ObservableValue<javafx.scene.paint.Paint>)

// javafx.scene.effect.ImageInput

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.ImageInput.y(f: (() -> Double)? = null): Double =
        template("y", f, this, yProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.ImageInput.x(f: (() -> Double)? = null): Double =
        template("x", f, this, xProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.ImageInput.source(f: (() -> javafx.scene.image.Image)? = null): javafx.scene.image.Image =
        template("source", f, this, sourceProperty()!! as ObservableValue<javafx.scene.image.Image>)

// javafx.scene.effect.BoxBlur

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.BoxBlur.width(f: (() -> Double)? = null): Double =
        template("width", f, this, widthProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.BoxBlur.height(f: (() -> Double)? = null): Double =
        template("height", f, this, heightProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.BoxBlur.iterations(f: (() -> Int)? = null): Int =
        template("iterations", f, this, iterationsProperty()!! as ObservableValue<Int>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.BoxBlur.input(f: (() -> javafx.scene.effect.Effect)? = null): javafx.scene.effect.Effect =
        template("input", f, this, inputProperty()!! as ObservableValue<javafx.scene.effect.Effect>)

// javafx.scene.effect.Light.Distant

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.Light.Distant.elevation(f: (() -> Double)? = null): Double =
        template("elevation", f, this, elevationProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.Light.Distant.azimuth(f: (() -> Double)? = null): Double =
        template("azimuth", f, this, azimuthProperty()!! as ObservableValue<Double>)

// javafx.scene.shape.Shape

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.Shape.strokeType(f: (() -> javafx.scene.shape.StrokeType)? = null): javafx.scene.shape.StrokeType =
        template("strokeType", f, this, strokeTypeProperty()!! as ObservableValue<javafx.scene.shape.StrokeType>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.Shape.strokeMiterLimit(f: (() -> Double)? = null): Double =
        template("strokeMiterLimit", f, this, strokeMiterLimitProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.Shape.strokeDashOffset(f: (() -> Double)? = null): Double =
        template("strokeDashOffset", f, this, strokeDashOffsetProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.Shape.strokeLineCap(f: (() -> javafx.scene.shape.StrokeLineCap)? = null): javafx.scene.shape.StrokeLineCap =
        template("strokeLineCap", f, this, strokeLineCapProperty()!! as ObservableValue<javafx.scene.shape.StrokeLineCap>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.Shape.strokeLineJoin(f: (() -> javafx.scene.shape.StrokeLineJoin)? = null): javafx.scene.shape.StrokeLineJoin =
        template("strokeLineJoin", f, this, strokeLineJoinProperty()!! as ObservableValue<javafx.scene.shape.StrokeLineJoin>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.Shape.strokeWidth(f: (() -> Double)? = null): Double =
        template("strokeWidth", f, this, strokeWidthProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.Shape.stroke(f: (() -> javafx.scene.paint.Paint)? = null): javafx.scene.paint.Paint =
        template("stroke", f, this, strokeProperty()!! as ObservableValue<javafx.scene.paint.Paint>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.Shape.smooth(f: (() -> Boolean)? = null): Boolean =
        template("smooth", f, this, smoothProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.Shape.fill(f: (() -> javafx.scene.paint.Paint)? = null): javafx.scene.paint.Paint =
        template("fill", f, this, fillProperty()!! as ObservableValue<javafx.scene.paint.Paint>)

// javafx.scene.effect.MotionBlur

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.MotionBlur.angle(f: (() -> Double)? = null): Double =
        template("angle", f, this, angleProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.MotionBlur.input(f: (() -> javafx.scene.effect.Effect)? = null): javafx.scene.effect.Effect =
        template("input", f, this, inputProperty()!! as ObservableValue<javafx.scene.effect.Effect>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.MotionBlur.radius(f: (() -> Double)? = null): Double =
        template("radius", f, this, radiusProperty()!! as ObservableValue<Double>)

// javafx.scene.control.TableView.TableViewFocusModel

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S> javafx.scene.control.TableView.TableViewFocusModel<S>.focusedCell(f: (() -> javafx.scene.control.TablePosition<*, *>)? = null): javafx.scene.control.TablePosition<*, *> =
        template("focusedCell", f, this, focusedCellProperty()!! as ObservableValue<javafx.scene.control.TablePosition<*, *>>)

// javafx.scene.media.MediaView

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.media.MediaView.y(f: (() -> Double)? = null): Double =
        template("y", f, this, yProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.media.MediaView.x(f: (() -> Double)? = null): Double =
        template("x", f, this, xProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.media.MediaView.onError(f: (() -> javafx.event.EventHandler<javafx.scene.media.MediaErrorEvent>)? = null): javafx.event.EventHandler<javafx.scene.media.MediaErrorEvent> =
        template("onError", f, this, onErrorProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.scene.media.MediaErrorEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.media.MediaView.fitWidth(f: (() -> Double)? = null): Double =
        template("fitWidth", f, this, fitWidthProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.media.MediaView.viewport(f: (() -> javafx.geometry.Rectangle2D)? = null): javafx.geometry.Rectangle2D =
        template("viewport", f, this, viewportProperty()!! as ObservableValue<javafx.geometry.Rectangle2D>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.media.MediaView.mediaPlayer(f: (() -> javafx.scene.media.MediaPlayer)? = null): javafx.scene.media.MediaPlayer =
        template("mediaPlayer", f, this, mediaPlayerProperty()!! as ObservableValue<javafx.scene.media.MediaPlayer>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.media.MediaView.preserveRatio(f: (() -> Boolean)? = null): Boolean =
        template("preserveRatio", f, this, preserveRatioProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.media.MediaView.fitHeight(f: (() -> Double)? = null): Double =
        template("fitHeight", f, this, fitHeightProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.media.MediaView.smooth(f: (() -> Boolean)? = null): Boolean =
        template("smooth", f, this, smoothProperty()!! as ObservableValue<Boolean>)

// javafx.scene.control.TitledPane

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.TitledPane.expanded(f: (() -> Boolean)? = null): Boolean =
        template("expanded", f, this, expandedProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.TitledPane.collapsible(f: (() -> Boolean)? = null): Boolean =
        template("collapsible", f, this, collapsibleProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.TitledPane.content(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
        template("content", f, this, contentProperty()!! as ObservableValue<javafx.scene.Node>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.TitledPane.animated(f: (() -> Boolean)? = null): Boolean =
        template("animated", f, this, animatedProperty()!! as ObservableValue<Boolean>)

// javafx.scene.control.ComboBoxBase

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.ComboBoxBase<T>.value(f: (() -> T)? = null): T =
        template("value", f, this, valueProperty()!! as ObservableValue<T>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.ComboBoxBase<T>.showing(f: (() -> Boolean)? = null): Boolean =
        template("showing", f, this, showingProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.ComboBoxBase<T>.onHidden(f: (() -> javafx.event.EventHandler<javafx.event.Event>)? = null): javafx.event.EventHandler<javafx.event.Event> =
        template("onHidden", f, this, onHiddenProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.event.Event>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.ComboBoxBase<T>.onShown(f: (() -> javafx.event.EventHandler<javafx.event.Event>)? = null): javafx.event.EventHandler<javafx.event.Event> =
        template("onShown", f, this, onShownProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.event.Event>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.ComboBoxBase<T>.onHiding(f: (() -> javafx.event.EventHandler<javafx.event.Event>)? = null): javafx.event.EventHandler<javafx.event.Event> =
        template("onHiding", f, this, onHidingProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.event.Event>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.ComboBoxBase<T>.onShowing(f: (() -> javafx.event.EventHandler<javafx.event.Event>)? = null): javafx.event.EventHandler<javafx.event.Event> =
        template("onShowing", f, this, onShowingProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.event.Event>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.ComboBoxBase<T>.armed(f: (() -> Boolean)? = null): Boolean =
        template("armed", f, this, armedProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.ComboBoxBase<T>.promptText(f: (() -> String)? = null): String =
        template("promptText", f, this, promptTextProperty()!! as ObservableValue<String>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.ComboBoxBase<T>.onAction(f: (() -> javafx.event.EventHandler<javafx.event.ActionEvent>)? = null): javafx.event.EventHandler<javafx.event.ActionEvent> =
        template("onAction", f, this, onActionProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.event.ActionEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.ComboBoxBase<T>.editable(f: (() -> Boolean)? = null): Boolean =
        template("editable", f, this, editableProperty()!! as ObservableValue<Boolean>)

// javafx.scene.control.ProgressIndicator

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.ProgressIndicator.progress(f: (() -> Double)? = null): Double =
        template("progress", f, this, progressProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.ProgressIndicator.indeterminate(f: (() -> Boolean)? = null): Boolean =
        template("indeterminate", f, this, indeterminateProperty()!! as ObservableValue<Boolean>)

// javafx.stage.Window

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.stage.Window.width(f: (() -> Double)? = null): Double =
        template("width", f, this, widthProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.stage.Window.y(f: (() -> Double)? = null): Double =
        template("y", f, this, yProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.stage.Window.showing(f: (() -> Boolean)? = null): Boolean =
        template("showing", f, this, showingProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.stage.Window.x(f: (() -> Double)? = null): Double =
        template("x", f, this, xProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.stage.Window.focused(f: (() -> Boolean)? = null): Boolean =
        template("focused", f, this, focusedProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.stage.Window.opacity(f: (() -> Double)? = null): Double =
        template("opacity", f, this, opacityProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.stage.Window.scene(f: (() -> javafx.scene.Scene)? = null): javafx.scene.Scene =
        template("scene", f, this, sceneProperty()!! as ObservableValue<javafx.scene.Scene>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.stage.Window.height(f: (() -> Double)? = null): Double =
        template("height", f, this, heightProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.stage.Window.onHidden(f: (() -> javafx.event.EventHandler<javafx.stage.WindowEvent>)? = null): javafx.event.EventHandler<javafx.stage.WindowEvent> =
        template("onHidden", f, this, onHiddenProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.stage.WindowEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.stage.Window.onShown(f: (() -> javafx.event.EventHandler<javafx.stage.WindowEvent>)? = null): javafx.event.EventHandler<javafx.stage.WindowEvent> =
        template("onShown", f, this, onShownProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.stage.WindowEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.stage.Window.onHiding(f: (() -> javafx.event.EventHandler<javafx.stage.WindowEvent>)? = null): javafx.event.EventHandler<javafx.stage.WindowEvent> =
        template("onHiding", f, this, onHidingProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.stage.WindowEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.stage.Window.onShowing(f: (() -> javafx.event.EventHandler<javafx.stage.WindowEvent>)? = null): javafx.event.EventHandler<javafx.stage.WindowEvent> =
        template("onShowing", f, this, onShowingProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.stage.WindowEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.stage.Window.onCloseRequest(f: (() -> javafx.event.EventHandler<javafx.stage.WindowEvent>)? = null): javafx.event.EventHandler<javafx.stage.WindowEvent> =
        template("onCloseRequest", f, this, onCloseRequestProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.stage.WindowEvent>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.stage.Window.eventDispatcher(f: (() -> javafx.event.EventDispatcher)? = null): javafx.event.EventDispatcher =
        template("eventDispatcher", f, this, eventDispatcherProperty()!! as ObservableValue<javafx.event.EventDispatcher>)

// javafx.scene.chart.AreaChart

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <X, Y> javafx.scene.chart.AreaChart<X, Y>.createSymbols(f: (() -> Boolean)? = null): Boolean =
        template("createSymbols", f, this, createSymbolsProperty()!! as ObservableValue<Boolean>)

// javafx.scene.control.TableSelectionModel

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.TableSelectionModel<T>.cellSelectionEnabled(f: (() -> Boolean)? = null): Boolean =
        template("cellSelectionEnabled", f, this, cellSelectionEnabledProperty()!! as ObservableValue<Boolean>)

// javafx.scene.control.TreeCell

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.TreeCell<T>.treeItem(f: (() -> javafx.scene.control.TreeItem<T>)? = null): javafx.scene.control.TreeItem<T> =
        template("treeItem", f, this, treeItemProperty()!! as ObservableValue<javafx.scene.control.TreeItem<T>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.TreeCell<T>.treeView(f: (() -> javafx.scene.control.TreeView<T>)? = null): javafx.scene.control.TreeView<T> =
        template("treeView", f, this, treeViewProperty()!! as ObservableValue<javafx.scene.control.TreeView<T>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.TreeCell<T>.disclosureNode(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
        template("disclosureNode", f, this, disclosureNodeProperty()!! as ObservableValue<javafx.scene.Node>)

// javafx.scene.control.TreeItem

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.TreeItem<T>.parent(f: (() -> javafx.scene.control.TreeItem<T>)? = null): javafx.scene.control.TreeItem<T> =
        template("parent", f, this, parentProperty()!! as ObservableValue<javafx.scene.control.TreeItem<T>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.TreeItem<T>.value(f: (() -> T)? = null): T =
        template("value", f, this, valueProperty()!! as ObservableValue<T>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.TreeItem<T>.graphic(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
        template("graphic", f, this, graphicProperty()!! as ObservableValue<javafx.scene.Node>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.TreeItem<T>.expanded(f: (() -> Boolean)? = null): Boolean =
        template("expanded", f, this, expandedProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.TreeItem<T>.leaf(f: (() -> Boolean)? = null): Boolean =
        template("leaf", f, this, leafProperty()!! as ObservableValue<Boolean>)

// javafx.scene.control.Label

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Label.labelFor(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
        template("labelFor", f, this, labelForProperty()!! as ObservableValue<javafx.scene.Node>)

// javafx.scene.chart.StackedAreaChart

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <X, Y> javafx.scene.chart.StackedAreaChart<X, Y>.createSymbols(f: (() -> Boolean)? = null): Boolean =
        template("createSymbols", f, this, createSymbolsProperty()!! as ObservableValue<Boolean>)

// javafx.scene.control.ToolBar

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.ToolBar.orientation(f: (() -> javafx.geometry.Orientation)? = null): javafx.geometry.Orientation =
        template("orientation", f, this, orientationProperty()!! as ObservableValue<javafx.geometry.Orientation>)

// javafx.print.PrinterJob

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.print.PrinterJob.jobStatus(f: (() -> javafx.print.PrinterJob.JobStatus)? = null): javafx.print.PrinterJob.JobStatus =
        template("jobStatus", f, this, jobStatusProperty()!! as ObservableValue<javafx.print.PrinterJob.JobStatus>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.print.PrinterJob.printer(f: (() -> javafx.print.Printer)? = null): javafx.print.Printer =
        template("printer", f, this, printerProperty()!! as ObservableValue<javafx.print.Printer>)

// javafx.scene.transform.Affine

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.transform.Affine.ty(f: (() -> Double)? = null): Double =
        template("ty", f, this, tyProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.transform.Affine.tx(f: (() -> Double)? = null): Double =
        template("tx", f, this, txProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.transform.Affine.tz(f: (() -> Double)? = null): Double =
        template("tz", f, this, tzProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.transform.Affine.mxy(f: (() -> Double)? = null): Double =
        template("mxy", f, this, mxyProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.transform.Affine.myx(f: (() -> Double)? = null): Double =
        template("myx", f, this, myxProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.transform.Affine.mxx(f: (() -> Double)? = null): Double =
        template("mxx", f, this, mxxProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.transform.Affine.mzx(f: (() -> Double)? = null): Double =
        template("mzx", f, this, mzxProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.transform.Affine.myy(f: (() -> Double)? = null): Double =
        template("myy", f, this, myyProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.transform.Affine.mxz(f: (() -> Double)? = null): Double =
        template("mxz", f, this, mxzProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.transform.Affine.myz(f: (() -> Double)? = null): Double =
        template("myz", f, this, myzProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.transform.Affine.mzy(f: (() -> Double)? = null): Double =
        template("mzy", f, this, mzyProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.transform.Affine.mzz(f: (() -> Double)? = null): Double =
        template("mzz", f, this, mzzProperty()!! as ObservableValue<Double>)

// javafx.scene.layout.FlowPane

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.FlowPane.prefWrapLength(f: (() -> Double)? = null): Double =
        template("prefWrapLength", f, this, prefWrapLengthProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.FlowPane.orientation(f: (() -> javafx.geometry.Orientation)? = null): javafx.geometry.Orientation =
        template("orientation", f, this, orientationProperty()!! as ObservableValue<javafx.geometry.Orientation>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.FlowPane.alignment(f: (() -> javafx.geometry.Pos)? = null): javafx.geometry.Pos =
        template("alignment", f, this, alignmentProperty()!! as ObservableValue<javafx.geometry.Pos>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.FlowPane.columnHalignment(f: (() -> javafx.geometry.HPos)? = null): javafx.geometry.HPos =
        template("columnHalignment", f, this, columnHalignmentProperty()!! as ObservableValue<javafx.geometry.HPos>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.FlowPane.rowValignment(f: (() -> javafx.geometry.VPos)? = null): javafx.geometry.VPos =
        template("rowValignment", f, this, rowValignmentProperty()!! as ObservableValue<javafx.geometry.VPos>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.FlowPane.vgap(f: (() -> Double)? = null): Double =
        template("vgap", f, this, vgapProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.FlowPane.hgap(f: (() -> Double)? = null): Double =
        template("hgap", f, this, hgapProperty()!! as ObservableValue<Double>)

// javafx.scene.control.Toggle

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Toggle.selected(f: (() -> Boolean)? = null): Boolean =
        template("selected", f, this, selectedProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Toggle.toggleGroup(f: (() -> javafx.scene.control.ToggleGroup)? = null): javafx.scene.control.ToggleGroup =
        template("toggleGroup", f, this, toggleGroupProperty()!! as ObservableValue<javafx.scene.control.ToggleGroup>)

// javafx.scene.control.ComboBox

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.ComboBox<T>.visibleRowCount(f: (() -> Int)? = null): Int =
        template("visibleRowCount", f, this, visibleRowCountProperty()!! as ObservableValue<Int>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.ComboBox<T>.buttonCell(f: (() -> javafx.scene.control.ListCell<T>)? = null): javafx.scene.control.ListCell<T> =
        template("buttonCell", f, this, buttonCellProperty()!! as ObservableValue<javafx.scene.control.ListCell<T>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.ComboBox<T>.converter(f: (() -> javafx.util.StringConverter<T>)? = null): javafx.util.StringConverter<T> =
        template("converter", f, this, converterProperty()!! as ObservableValue<javafx.util.StringConverter<T>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.ComboBox<T>.items(f: (() -> javafx.collections.ObservableList<T>)? = null): javafx.collections.ObservableList<T> =
        template("items", f, this, itemsProperty()!! as ObservableValue<javafx.collections.ObservableList<T>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.ComboBox<T>.editor(f: (() -> javafx.scene.control.TextField)? = null): javafx.scene.control.TextField =
        template("editor", f, this, editorProperty()!! as ObservableValue<javafx.scene.control.TextField>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.ComboBox<T>.selectionModel(f: (() -> javafx.scene.control.SingleSelectionModel<T>)? = null): javafx.scene.control.SingleSelectionModel<T> =
        template("selectionModel", f, this, selectionModelProperty()!! as ObservableValue<javafx.scene.control.SingleSelectionModel<T>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.ComboBox<T>.placeholder(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
        template("placeholder", f, this, placeholderProperty()!! as ObservableValue<javafx.scene.Node>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.ComboBox<T>.cellFactory(f: (() -> javafx.util.Callback<javafx.scene.control.ListView<T>, javafx.scene.control.ListCell<T>>)? = null): javafx.util.Callback<javafx.scene.control.ListView<T>, javafx.scene.control.ListCell<T>> =
        template("cellFactory", f, this, cellFactoryProperty()!! as ObservableValue<javafx.util.Callback<javafx.scene.control.ListView<T>, javafx.scene.control.ListCell<T>>>)

// javafx.scene.control.ChoiceDialog

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.ChoiceDialog<T>.selectedItem(f: (() -> T)? = null): T =
        template("selectedItem", f, this, selectedItemProperty()!! as ObservableValue<T>)

// javafx.scene.control.SelectionModel

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.SelectionModel<T>.selectedIndex(f: (() -> Int)? = null): Int =
        template("selectedIndex", f, this, selectedIndexProperty()!! as ObservableValue<Int>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.SelectionModel<T>.selectedItem(f: (() -> T)? = null): T =
        template("selectedItem", f, this, selectedItemProperty()!! as ObservableValue<T>)

// javafx.beans.property.ReadOnlyStringWrapper

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.beans.property.ReadOnlyStringWrapper.getReadOnly(f: (() -> String)? = null): String =
        template("getReadOnly", f, this, getReadOnlyProperty()!! as ObservableValue<String>)

// javafx.concurrent.Worker

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <V> javafx.concurrent.Worker<V>.value(f: (() -> V)? = null): V =
        template("value", f, this, valueProperty()!! as ObservableValue<V>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <V> javafx.concurrent.Worker<V>.state(f: (() -> javafx.concurrent.Worker.State)? = null): javafx.concurrent.Worker.State =
        template("state", f, this, stateProperty()!! as ObservableValue<javafx.concurrent.Worker.State>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <V> javafx.concurrent.Worker<V>.running(f: (() -> Boolean)? = null): Boolean =
        template("running", f, this, runningProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <V> javafx.concurrent.Worker<V>.progress(f: (() -> Double)? = null): Double =
        template("progress", f, this, progressProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <V> javafx.concurrent.Worker<V>.workDone(f: (() -> Double)? = null): Double =
        template("workDone", f, this, workDoneProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <V> javafx.concurrent.Worker<V>.message(f: (() -> String)? = null): String =
        template("message", f, this, messageProperty()!! as ObservableValue<String>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <V> javafx.concurrent.Worker<V>.title(f: (() -> String)? = null): String =
        template("title", f, this, titleProperty()!! as ObservableValue<String>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <V> javafx.concurrent.Worker<V>.exception(f: (() -> Throwable)? = null): Throwable =
        template("exception", f, this, exceptionProperty()!! as ObservableValue<Throwable>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <V> javafx.concurrent.Worker<V>.totalWork(f: (() -> Double)? = null): Double =
        template("totalWork", f, this, totalWorkProperty()!! as ObservableValue<Double>)

// javafx.scene.PerspectiveCamera

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.PerspectiveCamera.fieldOfView(f: (() -> Double)? = null): Double =
        template("fieldOfView", f, this, fieldOfViewProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.PerspectiveCamera.verticalFieldOfView(f: (() -> Boolean)? = null): Boolean =
        template("verticalFieldOfView", f, this, verticalFieldOfViewProperty()!! as ObservableValue<Boolean>)

// javafx.scene.shape.Cylinder

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.Cylinder.height(f: (() -> Double)? = null): Double =
        template("height", f, this, heightProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.Cylinder.radius(f: (() -> Double)? = null): Double =
        template("radius", f, this, radiusProperty()!! as ObservableValue<Double>)

// javafx.scene.control.cell.ChoiceBoxListCell

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.cell.ChoiceBoxListCell<T>.converter(f: (() -> javafx.util.StringConverter<T>)? = null): javafx.util.StringConverter<T> =
        template("converter", f, this, converterProperty()!! as ObservableValue<javafx.util.StringConverter<T>>)

// javafx.beans.property.ReadOnlyObjectWrapper

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.beans.property.ReadOnlyObjectWrapper<T>.getReadOnly(f: (() -> T)? = null): T =
        template("getReadOnly", f, this, getReadOnlyProperty()!! as ObservableValue<T>)

// javafx.scene.shape.Line

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.Line.endY(f: (() -> Double)? = null): Double =
        template("endY", f, this, endYProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.Line.startY(f: (() -> Double)? = null): Double =
        template("startY", f, this, startYProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.Line.startX(f: (() -> Double)? = null): Double =
        template("startX", f, this, startXProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.Line.endX(f: (() -> Double)? = null): Double =
        template("endX", f, this, endXProperty()!! as ObservableValue<Double>)

// javafx.scene.transform.Rotate

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.transform.Rotate.angle(f: (() -> Double)? = null): Double =
        template("angle", f, this, angleProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.transform.Rotate.axis(f: (() -> javafx.geometry.Point3D)? = null): javafx.geometry.Point3D =
        template("axis", f, this, axisProperty()!! as ObservableValue<javafx.geometry.Point3D>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.transform.Rotate.pivotZ(f: (() -> Double)? = null): Double =
        template("pivotZ", f, this, pivotZProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.transform.Rotate.pivotX(f: (() -> Double)? = null): Double =
        template("pivotX", f, this, pivotXProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.transform.Rotate.pivotY(f: (() -> Double)? = null): Double =
        template("pivotY", f, this, pivotYProperty()!! as ObservableValue<Double>)

// javafx.scene.effect.PerspectiveTransform

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.PerspectiveTransform.uly(f: (() -> Double)? = null): Double =
        template("uly", f, this, ulyProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.PerspectiveTransform.lly(f: (() -> Double)? = null): Double =
        template("lly", f, this, llyProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.PerspectiveTransform.ulx(f: (() -> Double)? = null): Double =
        template("ulx", f, this, ulxProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.PerspectiveTransform.llx(f: (() -> Double)? = null): Double =
        template("llx", f, this, llxProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.PerspectiveTransform.lry(f: (() -> Double)? = null): Double =
        template("lry", f, this, lryProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.PerspectiveTransform.lrx(f: (() -> Double)? = null): Double =
        template("lrx", f, this, lrxProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.PerspectiveTransform.urx(f: (() -> Double)? = null): Double =
        template("urx", f, this, urxProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.PerspectiveTransform.ury(f: (() -> Double)? = null): Double =
        template("ury", f, this, uryProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.PerspectiveTransform.input(f: (() -> javafx.scene.effect.Effect)? = null): javafx.scene.effect.Effect =
        template("input", f, this, inputProperty()!! as ObservableValue<javafx.scene.effect.Effect>)

// javafx.beans.property.ReadOnlyBooleanWrapper

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.beans.property.ReadOnlyBooleanWrapper.getReadOnly(f: (() -> Boolean)? = null): Boolean =
        template("getReadOnly", f, this, getReadOnlyProperty()!! as ObservableValue<Boolean>)

// javafx.scene.control.MenuBar

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.MenuBar.useSystemMenuBar(f: (() -> Boolean)? = null): Boolean =
        template("useSystemMenuBar", f, this, useSystemMenuBarProperty()!! as ObservableValue<Boolean>)

// javafx.animation.RotateTransition

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.animation.RotateTransition.duration(f: (() -> javafx.util.Duration)? = null): javafx.util.Duration =
        template("duration", f, this, durationProperty()!! as ObservableValue<javafx.util.Duration>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.animation.RotateTransition.node(f: (() -> javafx.scene.Node)? = null): javafx.scene.Node =
        template("node", f, this, nodeProperty()!! as ObservableValue<javafx.scene.Node>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.animation.RotateTransition.fromAngle(f: (() -> Double)? = null): Double =
        template("fromAngle", f, this, fromAngleProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.animation.RotateTransition.axis(f: (() -> javafx.geometry.Point3D)? = null): javafx.geometry.Point3D =
        template("axis", f, this, axisProperty()!! as ObservableValue<javafx.geometry.Point3D>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.animation.RotateTransition.toAngle(f: (() -> Double)? = null): Double =
        template("toAngle", f, this, toAngleProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.animation.RotateTransition.byAngle(f: (() -> Double)? = null): Double =
        template("byAngle", f, this, byAngleProperty()!! as ObservableValue<Double>)

// javafx.scene.control.SpinnerValueFactory.IntegerSpinnerValueFactory

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.SpinnerValueFactory.IntegerSpinnerValueFactory.max(f: (() -> Int)? = null): Int =
        template("max", f, this, maxProperty()!! as ObservableValue<Int>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.SpinnerValueFactory.IntegerSpinnerValueFactory.min(f: (() -> Int)? = null): Int =
        template("min", f, this, minProperty()!! as ObservableValue<Int>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.SpinnerValueFactory.IntegerSpinnerValueFactory.amountToStepBy(f: (() -> Int)? = null): Int =
        template("amountToStepBy", f, this, amountToStepByProperty()!! as ObservableValue<Int>)

// javafx.beans.binding.MapExpression

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <K, V> javafx.beans.binding.MapExpression<K, V>.size(f: (() -> Int)? = null): Int =
        template("size", f, this, sizeProperty()!! as ObservableValue<Int>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <K, V> javafx.beans.binding.MapExpression<K, V>.empty(f: (() -> Boolean)? = null): Boolean =
        template("empty", f, this, emptyProperty()!! as ObservableValue<Boolean>)

// javafx.scene.shape.Box

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.Box.width(f: (() -> Double)? = null): Double =
        template("width", f, this, widthProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.Box.height(f: (() -> Double)? = null): Double =
        template("height", f, this, heightProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.Box.depth(f: (() -> Double)? = null): Double =
        template("depth", f, this, depthProperty()!! as ObservableValue<Double>)

// javafx.beans.binding.SetBinding

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <E> javafx.beans.binding.SetBinding<E>.size(f: (() -> Int)? = null): Int =
        template("size", f, this, sizeProperty()!! as ObservableValue<Int>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <E> javafx.beans.binding.SetBinding<E>.empty(f: (() -> Boolean)? = null): Boolean =
        template("empty", f, this, emptyProperty()!! as ObservableValue<Boolean>)

// javafx.scene.image.ImageView

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.image.ImageView.y(f: (() -> Double)? = null): Double =
        template("y", f, this, yProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.image.ImageView.x(f: (() -> Double)? = null): Double =
        template("x", f, this, xProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.image.ImageView.fitWidth(f: (() -> Double)? = null): Double =
        template("fitWidth", f, this, fitWidthProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.image.ImageView.image(f: (() -> javafx.scene.image.Image)? = null): javafx.scene.image.Image =
        template("image", f, this, imageProperty()!! as ObservableValue<javafx.scene.image.Image>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.image.ImageView.viewport(f: (() -> javafx.geometry.Rectangle2D)? = null): javafx.geometry.Rectangle2D =
        template("viewport", f, this, viewportProperty()!! as ObservableValue<javafx.geometry.Rectangle2D>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.image.ImageView.preserveRatio(f: (() -> Boolean)? = null): Boolean =
        template("preserveRatio", f, this, preserveRatioProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.image.ImageView.fitHeight(f: (() -> Double)? = null): Double =
        template("fitHeight", f, this, fitHeightProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.image.ImageView.smooth(f: (() -> Boolean)? = null): Boolean =
        template("smooth", f, this, smoothProperty()!! as ObservableValue<Boolean>)

// javafx.scene.control.Alert

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Alert.alertType(f: (() -> javafx.scene.control.Alert.AlertType)? = null): javafx.scene.control.Alert.AlertType =
        template("alertType", f, this, alertTypeProperty()!! as ObservableValue<javafx.scene.control.Alert.AlertType>)

// javafx.scene.chart.Chart

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.chart.Chart.title(f: (() -> String)? = null): String =
        template("title", f, this, titleProperty()!! as ObservableValue<String>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.chart.Chart.titleSide(f: (() -> javafx.geometry.Side)? = null): javafx.geometry.Side =
        template("titleSide", f, this, titleSideProperty()!! as ObservableValue<javafx.geometry.Side>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.chart.Chart.legendVisible(f: (() -> Boolean)? = null): Boolean =
        template("legendVisible", f, this, legendVisibleProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.chart.Chart.legendSide(f: (() -> javafx.geometry.Side)? = null): javafx.geometry.Side =
        template("legendSide", f, this, legendSideProperty()!! as ObservableValue<javafx.geometry.Side>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.chart.Chart.animated(f: (() -> Boolean)? = null): Boolean =
        template("animated", f, this, animatedProperty()!! as ObservableValue<Boolean>)

// javafx.scene.control.TableCell

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S, T> javafx.scene.control.TableCell<S, T>.tableRow(f: (() -> javafx.scene.control.TableRow<*>)? = null): javafx.scene.control.TableRow<*> =
        template("tableRow", f, this, tableRowProperty()!! as ObservableValue<javafx.scene.control.TableRow<*>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S, T> javafx.scene.control.TableCell<S, T>.tableColumn(f: (() -> javafx.scene.control.TableColumn<S, T>)? = null): javafx.scene.control.TableColumn<S, T> =
        template("tableColumn", f, this, tableColumnProperty()!! as ObservableValue<javafx.scene.control.TableColumn<S, T>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S, T> javafx.scene.control.TableCell<S, T>.tableView(f: (() -> javafx.scene.control.TableView<S>)? = null): javafx.scene.control.TableView<S> =
        template("tableView", f, this, tableViewProperty()!! as ObservableValue<javafx.scene.control.TableView<S>>)

// javafx.scene.shape.TriangleMesh

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.TriangleMesh.vertexFormat(f: (() -> javafx.scene.shape.VertexFormat)? = null): javafx.scene.shape.VertexFormat =
        template("vertexFormat", f, this, vertexFormatProperty()!! as ObservableValue<javafx.scene.shape.VertexFormat>)

// javafx.scene.control.cell.CheckBoxListCell

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.cell.CheckBoxListCell<T>.converter(f: (() -> javafx.util.StringConverter<T>)? = null): javafx.util.StringConverter<T> =
        template("converter", f, this, converterProperty()!! as ObservableValue<javafx.util.StringConverter<T>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.cell.CheckBoxListCell<T>.selectedStateCallback(f: (() -> javafx.util.Callback<T, javafx.beans.value.ObservableValue<Boolean>>)? = null): javafx.util.Callback<T, javafx.beans.value.ObservableValue<Boolean>> =
        template("selectedStateCallback", f, this, selectedStateCallbackProperty()!! as ObservableValue<javafx.util.Callback<T, javafx.beans.value.ObservableValue<Boolean>>>)

// javafx.scene.control.cell.ChoiceBoxTreeCell

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.cell.ChoiceBoxTreeCell<T>.converter(f: (() -> javafx.util.StringConverter<T>)? = null): javafx.util.StringConverter<T> =
        template("converter", f, this, converterProperty()!! as ObservableValue<javafx.util.StringConverter<T>>)

// javafx.scene.layout.GridPane

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.GridPane.alignment(f: (() -> javafx.geometry.Pos)? = null): javafx.geometry.Pos =
        template("alignment", f, this, alignmentProperty()!! as ObservableValue<javafx.geometry.Pos>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.GridPane.gridLinesVisible(f: (() -> Boolean)? = null): Boolean =
        template("gridLinesVisible", f, this, gridLinesVisibleProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.GridPane.vgap(f: (() -> Double)? = null): Double =
        template("vgap", f, this, vgapProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.layout.GridPane.hgap(f: (() -> Double)? = null): Double =
        template("hgap", f, this, hgapProperty()!! as ObservableValue<Double>)

// javafx.concurrent.ScheduledService

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <V> javafx.concurrent.ScheduledService<V>.currentFailureCount(f: (() -> Int)? = null): Int =
        template("currentFailureCount", f, this, currentFailureCountProperty()!! as ObservableValue<Int>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <V> javafx.concurrent.ScheduledService<V>.lastValue(f: (() -> V)? = null): V =
        template("lastValue", f, this, lastValueProperty()!! as ObservableValue<V>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <V> javafx.concurrent.ScheduledService<V>.maximumCumulativePeriod(f: (() -> javafx.util.Duration)? = null): javafx.util.Duration =
        template("maximumCumulativePeriod", f, this, maximumCumulativePeriodProperty()!! as ObservableValue<javafx.util.Duration>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <V> javafx.concurrent.ScheduledService<V>.cumulativePeriod(f: (() -> javafx.util.Duration)? = null): javafx.util.Duration =
        template("cumulativePeriod", f, this, cumulativePeriodProperty()!! as ObservableValue<javafx.util.Duration>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <V> javafx.concurrent.ScheduledService<V>.maximumFailureCount(f: (() -> Int)? = null): Int =
        template("maximumFailureCount", f, this, maximumFailureCountProperty()!! as ObservableValue<Int>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <V> javafx.concurrent.ScheduledService<V>.backoffStrategy(f: (() -> javafx.util.Callback<javafx.concurrent.ScheduledService<*>, javafx.util.Duration>)? = null): javafx.util.Callback<javafx.concurrent.ScheduledService<*>, javafx.util.Duration> =
        template("backoffStrategy", f, this, backoffStrategyProperty()!! as ObservableValue<javafx.util.Callback<javafx.concurrent.ScheduledService<*>, javafx.util.Duration>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <V> javafx.concurrent.ScheduledService<V>.restartOnFailure(f: (() -> Boolean)? = null): Boolean =
        template("restartOnFailure", f, this, restartOnFailureProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <V> javafx.concurrent.ScheduledService<V>.delay(f: (() -> javafx.util.Duration)? = null): javafx.util.Duration =
        template("delay", f, this, delayProperty()!! as ObservableValue<javafx.util.Duration>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <V> javafx.concurrent.ScheduledService<V>.period(f: (() -> javafx.util.Duration)? = null): javafx.util.Duration =
        template("period", f, this, periodProperty()!! as ObservableValue<javafx.util.Duration>)

// javafx.scene.control.MultipleSelectionModel

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <T> javafx.scene.control.MultipleSelectionModel<T>.selectionMode(f: (() -> javafx.scene.control.SelectionMode)? = null): javafx.scene.control.SelectionMode =
        template("selectionMode", f, this, selectionModeProperty()!! as ObservableValue<javafx.scene.control.SelectionMode>)

// javafx.scene.control.cell.TextFieldTableCell

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S, T> javafx.scene.control.cell.TextFieldTableCell<S, T>.converter(f: (() -> javafx.util.StringConverter<T>)? = null): javafx.util.StringConverter<T> =
        template("converter", f, this, converterProperty()!! as ObservableValue<javafx.util.StringConverter<T>>)

// javafx.beans.property.ReadOnlyLongWrapper

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.beans.property.ReadOnlyLongWrapper.getReadOnly(f: (() -> Long)? = null): Long =
        template("getReadOnly", f, this, getReadOnlyProperty()!! as ObservableValue<Long>)

// javafx.scene.control.ButtonBase

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.ButtonBase.armed(f: (() -> Boolean)? = null): Boolean =
        template("armed", f, this, armedProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.ButtonBase.onAction(f: (() -> javafx.event.EventHandler<javafx.event.ActionEvent>)? = null): javafx.event.EventHandler<javafx.event.ActionEvent> =
        template("onAction", f, this, onActionProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.event.ActionEvent>>)

// javafx.scene.control.RadioMenuItem

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.RadioMenuItem.selected(f: (() -> Boolean)? = null): Boolean =
        template("selected", f, this, selectedProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.RadioMenuItem.toggleGroup(f: (() -> javafx.scene.control.ToggleGroup)? = null): javafx.scene.control.ToggleGroup =
        template("toggleGroup", f, this, toggleGroupProperty()!! as ObservableValue<javafx.scene.control.ToggleGroup>)

// javafx.scene.effect.Light

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.Light.color(f: (() -> javafx.scene.paint.Color)? = null): javafx.scene.paint.Color =
        template("color", f, this, colorProperty()!! as ObservableValue<javafx.scene.paint.Color>)

// javafx.scene.control.MenuButton

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.MenuButton.showing(f: (() -> Boolean)? = null): Boolean =
        template("showing", f, this, showingProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.MenuButton.popupSide(f: (() -> javafx.geometry.Side)? = null): javafx.geometry.Side =
        template("popupSide", f, this, popupSideProperty()!! as ObservableValue<javafx.geometry.Side>)

// javafx.scene.control.Menu

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Menu.showing(f: (() -> Boolean)? = null): Boolean =
        template("showing", f, this, showingProperty()!! as ObservableValue<Boolean>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Menu.onHidden(f: (() -> javafx.event.EventHandler<javafx.event.Event>)? = null): javafx.event.EventHandler<javafx.event.Event> =
        template("onHidden", f, this, onHiddenProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.event.Event>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Menu.onShown(f: (() -> javafx.event.EventHandler<javafx.event.Event>)? = null): javafx.event.EventHandler<javafx.event.Event> =
        template("onShown", f, this, onShownProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.event.Event>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Menu.onHiding(f: (() -> javafx.event.EventHandler<javafx.event.Event>)? = null): javafx.event.EventHandler<javafx.event.Event> =
        template("onHiding", f, this, onHidingProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.event.Event>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Menu.onShowing(f: (() -> javafx.event.EventHandler<javafx.event.Event>)? = null): javafx.event.EventHandler<javafx.event.Event> =
        template("onShowing", f, this, onShowingProperty()!! as ObservableValue<javafx.event.EventHandler<javafx.event.Event>>)

// javafx.scene.control.DatePicker

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.DatePicker.dayCellFactory(f: (() -> javafx.util.Callback<javafx.scene.control.DatePicker, javafx.scene.control.DateCell>)? = null): javafx.util.Callback<javafx.scene.control.DatePicker, javafx.scene.control.DateCell> =
        template("dayCellFactory", f, this, dayCellFactoryProperty()!! as ObservableValue<javafx.util.Callback<javafx.scene.control.DatePicker, javafx.scene.control.DateCell>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.DatePicker.chronology(f: (() -> java.time.chrono.Chronology)? = null): java.time.chrono.Chronology =
        template("chronology", f, this, chronologyProperty()!! as ObservableValue<java.time.chrono.Chronology>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.DatePicker.converter(f: (() -> javafx.util.StringConverter<java.time.LocalDate>)? = null): javafx.util.StringConverter<java.time.LocalDate> =
        template("converter", f, this, converterProperty()!! as ObservableValue<javafx.util.StringConverter<java.time.LocalDate>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.DatePicker.editor(f: (() -> javafx.scene.control.TextField)? = null): javafx.scene.control.TextField =
        template("editor", f, this, editorProperty()!! as ObservableValue<javafx.scene.control.TextField>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.DatePicker.showWeekNumbers(f: (() -> Boolean)? = null): Boolean =
        template("showWeekNumbers", f, this, showWeekNumbersProperty()!! as ObservableValue<Boolean>)

// javafx.scene.control.cell.ComboBoxTableCell

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S, T> javafx.scene.control.cell.ComboBoxTableCell<S, T>.converter(f: (() -> javafx.util.StringConverter<T>)? = null): javafx.util.StringConverter<T> =
        template("converter", f, this, converterProperty()!! as ObservableValue<javafx.util.StringConverter<T>>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <S, T> javafx.scene.control.cell.ComboBoxTableCell<S, T>.comboBoxEditable(f: (() -> Boolean)? = null): Boolean =
        template("comboBoxEditable", f, this, comboBoxEditableProperty()!! as ObservableValue<Boolean>)

// javafx.scene.control.Accordion

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.control.Accordion.expandedPane(f: (() -> javafx.scene.control.TitledPane)? = null): javafx.scene.control.TitledPane =
        template("expandedPane", f, this, expandedPaneProperty()!! as ObservableValue<javafx.scene.control.TitledPane>)

// javafx.scene.effect.ColorAdjust

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.ColorAdjust.brightness(f: (() -> Double)? = null): Double =
        template("brightness", f, this, brightnessProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.ColorAdjust.saturation(f: (() -> Double)? = null): Double =
        template("saturation", f, this, saturationProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.ColorAdjust.contrast(f: (() -> Double)? = null): Double =
        template("contrast", f, this, contrastProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.ColorAdjust.hue(f: (() -> Double)? = null): Double =
        template("hue", f, this, hueProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.effect.ColorAdjust.input(f: (() -> javafx.scene.effect.Effect)? = null): javafx.scene.effect.Effect =
        template("input", f, this, inputProperty()!! as ObservableValue<javafx.scene.effect.Effect>)

// javafx.beans.property.SetPropertyBase

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <E> javafx.beans.property.SetPropertyBase<E>.size(f: (() -> Int)? = null): Int =
        template("size", f, this, sizeProperty()!! as ObservableValue<Int>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun <E> javafx.beans.property.SetPropertyBase<E>.empty(f: (() -> Boolean)? = null): Boolean =
        template("empty", f, this, emptyProperty()!! as ObservableValue<Boolean>)

// javafx.scene.shape.MoveTo

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.MoveTo.y(f: (() -> Double)? = null): Double =
        template("y", f, this, yProperty()!! as ObservableValue<Double>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.MoveTo.x(f: (() -> Double)? = null): Double =
        template("x", f, this, xProperty()!! as ObservableValue<Double>)

// javafx.scene.shape.Shape3D

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.Shape3D.drawMode(f: (() -> javafx.scene.shape.DrawMode)? = null): javafx.scene.shape.DrawMode =
        template("drawMode", f, this, drawModeProperty()!! as ObservableValue<javafx.scene.shape.DrawMode>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.Shape3D.cullFace(f: (() -> javafx.scene.shape.CullFace)? = null): javafx.scene.shape.CullFace =
        template("cullFace", f, this, cullFaceProperty()!! as ObservableValue<javafx.scene.shape.CullFace>)

@Suppress("USELESS_CAST_STATIC_ASSERT_IS_FINE", "UNCHECKED_CAST")
public fun javafx.scene.shape.Shape3D.material(f: (() -> javafx.scene.paint.Material)? = null): javafx.scene.paint.Material =
        template("material", f, this, materialProperty()!! as ObservableValue<javafx.scene.paint.Material>)
