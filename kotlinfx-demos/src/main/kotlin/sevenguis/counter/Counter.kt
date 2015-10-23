package demos.sevenguis.counter

import javafx.application.Application
import javafx.stage.Stage
import kotlinfx.builders.*

fun main(args: Array<String>) {
    Application.launch(Counter::class.java)
}

class Counter : Application() {
    override fun start(stage: Stage?) {
        val count = TextField("0") {
            isEditable = false;
            prefWidth = 50.0
        }
        val countUp = Button("Count") {
            setOnAction { count.text = "${1 + Integer.parseInt(count.text.toString())}" }
        }
        //TODO Why does the following not work?
        //onAction = { count.setText("${1+Integer.parseInt(count.text.toString())}") }}

        Stage(stage, title = "Counter") {
            scene = Scene {
                root = HBox(spacing = 10.0, padding = Insets(10.0)) {
                    +count
                    +countUp
                }
            }
        }.show()
    }
}

