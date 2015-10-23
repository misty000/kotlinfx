package demos.sevenguis.flightbooker

import javafx.application.Application
import javafx.beans.Observable
import javafx.beans.binding.Bindings
import javafx.collections.FXCollections
import javafx.stage.Stage
import kotlinfx.abbreviations.disablep
import kotlinfx.abbreviations.stylep
import kotlinfx.abbreviations.textp
import kotlinfx.abbreviations.valuep
import kotlinfx.builders.*
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.concurrent.Callable

fun main(args: Array<String>) {
    Application.launch(FlightBooker::class.java)
}

class FlightBooker : Application() {
    override fun start(stage: Stage?) {
        val flightType = ComboBox(FXCollections.observableArrayList("one-way flight", "return flight"))
        flightType.value = "one-way flight"
        val startDate = TextField(LocalDate.now().asString())
        val returnDate = TextField(LocalDate.now().asString())
        val book = Button("Book")
        book.isDisable = true

        returnDate.disablep bind flightType.valuep.isEqualTo("one-way flight")
        // TODO: How to use closure instead of Callable?
        /*startDate.stylep bind Bindings.createStringBinding(object : Callable<String>{ override fun call(): String? =
                if (startDate.text.isDate) "" else "-fx-background-color: lightcoral"
        }, startDate.textp)*/
        startDate.stylep bind Bindings.createStringBinding({
            if (startDate.text.isDate) "" else "-fx-background-color: lightcoral"
        }, arrayOf(startDate.textp))

        // For comparison, callback alternative
        returnDate.textp.addListener { v, o, n ->
            returnDate.style = if (n.isDate) "" else "-fx-background-color: lightcoral"
        }
        // TODO: How to use closure instead of Callable?
        /*book.disablep bind Bindings.createBooleanBinding(object : Callable<Boolean> {
            override fun call(): Boolean? =
                    if (flightType.value == "one-way flight") {
                        !startDate.text.isDate
                    } else {
                        !startDate.text.isDate || !returnDate.text.isDate ||
                                startDate.text.asDate.compareTo(returnDate.text.asDate) > 0
                    }
        }, flightType.valuep, startDate.textp, returnDate.textp)*/
        book.disablep bind Bindings.createBooleanBinding({
            if (flightType.value == "one-way flight") {
                !startDate.text.isDate
            } else {
                !startDate.text.isDate || !returnDate.text.isDate ||
                        startDate.text.asDate.compareTo(returnDate.text.asDate) > 0
            }
        }, arrayOf<Observable>(flightType.valuep, startDate.textp, returnDate.textp))

        Stage(stage, title = "Flight Booker") {
            scene = Scene {
                root = VBox(spacing = 10.0, padding = Insets(10.0)) {
                    +flightType
                    +startDate
                    +returnDate
                    +book
                }
            }
        }.show()
    }
}

val formatter = DateTimeFormatter.ISO_LOCAL_DATE
fun LocalDate?.asString() = this!!.format(formatter)!!
val String?.asDate: LocalDate get() = LocalDate.from(formatter.parse(this!!))!!
val String?.isDate: Boolean get() =
try {
    formatter.parse(this)
    true
} catch (e: Exception) {
    false
}

