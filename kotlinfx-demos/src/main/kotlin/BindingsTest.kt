package demos.bindingstest

import javafx.application.Application
import javafx.scene.paint.Color
import javafx.stage.Stage
import kotlinfx.abbreviations.fillp
import kotlinfx.abbreviations.hoverp
import kotlinfx.bindings.else_
import kotlinfx.bindings.if_
import kotlinfx.builders.Pane
import kotlinfx.builders.Rectangle
import kotlinfx.builders.Scene
import kotlinfx.builders.Stage

fun main(args: Array<String>) {
    Application.launch(BindingsTest::class.java)
}

class BindingsTest : Application() {
    override fun start(stage: Stage?) {
        Stage(stage, title = "Hello World") {
            scene = Scene(width = 600.0, height = 450.0) {
                fill = Color.LIGHTGREEN
                root = Pane {
                    +Rectangle {
                        x = 25.0
                        y = 40.0
                        width = 100.0
                        height = 100.0
                        fillp.bind(if_(hoverp) { Color.GREEN } else_ { Color.RED })
                    }
                }
            }
        }.show()
    }
}


