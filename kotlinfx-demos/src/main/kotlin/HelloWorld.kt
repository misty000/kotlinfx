//http://docs.oracle.com/javafx/2/get_started/hello_world.htm
package demos.helloworld

import javafx.application.Application
import javafx.stage.Stage
import kotlinfx.builders.Button
import kotlinfx.builders.Scene
import kotlinfx.builders.StackPane
import kotlinfx.builders.Stage

fun main(args: Array<String>) {
    Application.launch(HelloWorld::class.java)
}

class HelloWorld : Application() {
    override fun start(stage: Stage?) {
        Stage(stage, title = "Hello World!") {
            scene = Scene(width = 300.0, height = 250.0) {
                root = StackPane {
                    + Button("Say 'Hello World'") {
                        setOnAction { println("Hello World!") }
                    }
                }
            }
        }.show()
    }
}


