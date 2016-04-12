package demos.sevenguis.timer

import javafx.animation.Animation
import javafx.animation.KeyFrame
import javafx.animation.Timeline
import javafx.application.Application
import javafx.beans.binding.Bindings
import javafx.beans.property.SimpleDoubleProperty
import javafx.event.ActionEvent
import javafx.event.EventHandler
import javafx.stage.Stage
import javafx.util.Duration
import kotlinfx.abbreviations.progressp
import kotlinfx.abbreviations.textp
import kotlinfx.abbreviations.v
import kotlinfx.abbreviations.valuep
import kotlinfx.bindings.div
import kotlinfx.builders.*
import java.util.concurrent.Callable

fun main(args: Array<String>) {
    Application.launch(Timer::class.java)
}

class Timer : Application() {
    override fun start(stage: Stage?) {
        val progress = ProgressBar()
        val numericProgress = Label()
        val slider = Slider(min = 1.0, max = 400.0, value = 200.0)
        val reset = Button("Reset")

        val elapsed = SimpleDoubleProperty(0.0)
        progress.progressp.bind(elapsed / slider.valuep)
        // TODO: closure instead of callable
        numericProgress.textp.bind(Bindings.createStringBinding(object : Callable<String> {
            override fun call(): String? =
                    formatElapsed(elapsed.v)
        }, elapsed))
        reset.setOnAction { elapsed.v = 0.0 }

        // TODO: Why can't I use closure syntax here?
        val timeline = Timeline(KeyFrame(Duration.millis(100.0), object : EventHandler<ActionEvent> {
            override fun handle(event: ActionEvent?) {
                if (elapsed.v < slider.value) elapsed.set(elapsed.v + 1)
            }
        }))
        timeline.cycleCount = Animation.INDEFINITE // TODO: Why not Timeline.INDEFINITE?
        timeline.play()

        Stage(stage, title = "Timer") {
            scene = Scene {
                root = VBox(spacing = 10.0, padding = Insets(10.0)) {
                    +HBox(10.0) { +Label("Elapsed Time: ") + progress }
                    +numericProgress
                    +HBox(10.0) { +Label("Duration: ") + slider }
                    +reset
                }
            }
        }.show()
    }
}

fun formatElapsed(elapsed: Double): String {
    val seconds = Math.floor(elapsed / 10.0)
    val dezipart = elapsed % 10
    return "${seconds.toInt()}.${dezipart.toInt()}s"
}