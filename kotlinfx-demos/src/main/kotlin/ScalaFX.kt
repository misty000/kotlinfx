// https://code.google.com/p/scalafx/wiki/GettingStarted
package demos.scalafx

import javafx.application.Application
import javafx.scene.paint.Color
import javafx.stage.Stage
import kotlinfx.builders.Pane
import kotlinfx.builders.Rectangle
import kotlinfx.builders.Scene
import kotlinfx.builders.Stage
import kotlinfx.kalium.fill
import kotlinfx.kalium.hover

fun main(args: Array<String>) {
    Application.launch(World::class.java)
}

class World : Application() {
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
                        fill { if (hover()) Color.GREEN else Color.RED }
                    }
                }
            }
        }.show()
    }
}

