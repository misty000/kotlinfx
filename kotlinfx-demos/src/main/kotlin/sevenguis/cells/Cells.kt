package demos.sevenguis.cells

import javafx.application.Application
import javafx.stage.Stage
import kotlinfx.builders.HBox
import kotlinfx.builders.Insets
import kotlinfx.builders.Scene
import kotlinfx.builders.Stage

// TODO
fun main(args: Array<String>) {
    Application.launch(Cells::class.java)
}

class Cells : Application() {
    override fun start(stage: Stage?) {
        Stage(stage, title = "Cells") {
            scene = Scene {
                root = HBox(spacing = 10.0, padding = Insets(10.0)) {
                }
            }
        }.show()
    }
}


