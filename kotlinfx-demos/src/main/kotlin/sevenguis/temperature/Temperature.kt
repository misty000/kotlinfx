package demos.sevenguis.temperature

import kotlinfx.builders.*
import kotlinfx.properties.*
import kotlinfx.properties1.*
import kotlinfx.properties2.*
import kotlinfx.properties3.*
import kotlinfx.properties4.*
import javafx.application.Application
import javafx.stage.Stage
import javafx.scene.control.Label
import javafx.util.StringConverter

fun main(args: Array<String>) {
    Application.launch(javaClass<TemperatureConverter>())
}

class TemperatureConverter : Application() {
    override fun start(stage: Stage?) {
        val celsius = TextField()
        val fahrenheit = TextField()

        celsius.textP.bindBidirectional(fahrenheit.textP, object : StringConverter<String>() {
            override fun fromString(c: String?): String? =
                if (isNumeric(c!!)) cToF(c) else fahrenheit.text
            override fun toString(f: String?): String? =
                if (isNumeric(f!!)) fToC(f) else celsius.text
        })

        Stage(stage, title = "Temperature Converter") {
            scene = Scene {
                root = HBox(spacing = 10.0, padding = Insets(10.0)) {
                    + celsius + Label("Celsius =") + fahrenheit + Label("Fahrenheit")
                }
            }
        }.show()
    }
}

fun cToF(c: Double) = (9/5.0 * c) + 32
fun fToC(f: Double) = 5/9.0 * (f - 32)
fun cToF(c: String) = Math.round(cToF(c.toDouble())).toString()
fun fToC(f: String) = Math.round(fToC(f.toDouble())).toString()
fun isNumeric(s: String): Boolean {
    try { s.toDouble() }
    catch (e: Exception) { return false }
    return true
}
