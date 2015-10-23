package demos.sevenguis.crud

import javafx.application.Application
import javafx.collections.FXCollections
import javafx.collections.ListChangeListener
import javafx.geometry.Pos
import javafx.scene.control.SelectionMode
import javafx.stage.Stage
import kotlinfx.abbreviations.disablep
import kotlinfx.abbreviations.selectedIndexp
import kotlinfx.abbreviations.textp
import kotlinfx.abbreviations.v
import kotlinfx.bindings.plus
import kotlinfx.builders.*

fun main(args: Array<String>) {
    Application.launch(CRUD::class.java)
}

class CRUD : Application() {
    override fun start(stage: Stage?) {
        val prefix = TextField { prefWidth = 60.0 }
        val name = TextField { prefWidth = 100.0 }
        val surname = TextField { prefWidth = 100.0 }
        val create = Button("Create")
        val update = Button("Update") { isDisable = true }
        val delete = Button("Delete") { isDisable = true }
        val entries = ListView<String>()
        entries.selectionModel.selectionMode = SelectionMode.SINGLE

        val externDb = arrayListOf("Emil, Hans", "Musterman, Max", "Tisch, Roman")
        val db = FXCollections.observableArrayList(externDb)!!
        // TODO: Why not anonymous function?
        db.addListener(object : ListChangeListener<String> {
            override fun onChanged(c: ListChangeListener.Change<out String>) {
                while (c.next()) {
                    if (c.wasReplaced()) externDb.set(c.from, c.addedSubList[0])
                    else {
                        if (c.wasAdded()) externDb.add(c.addedSubList[0])
                        if (c.wasRemoved()) externDb.removeAt(c.from)
                    }
                }
            }
        })
        val dbView = db.filtered { true }
        entries.items = dbView

        val fullname = surname.textp + ", " + name.textp
        val selectedIndex = entries.selectionModel.selectedIndexp
        prefix.textp.addListener { v, o, n -> dbView.setPredicate { t -> t.startsWith(n) } }
        create.setOnAction { db.add(fullname.v) }
        delete.setOnAction { db.removeAt(dbView.getSourceIndex(selectedIndex.v)) }
        update.setOnAction { db.set(dbView.getSourceIndex(selectedIndex.v), fullname.v) }
        delete.disablep.bind (selectedIndex.isEqualTo(-1))
        update.disablep.bind (selectedIndex.isEqualTo(-1))

        Stage(stage, title = "CRUD") {
            scene = Scene {
                root = BorderPane(padding = Insets(10.0)) {
                    prefWidth = 400.0
                    prefHeight = 400.0
                    top = HBox(spacing = 10.0, padding = Insets(bottom = 10.0)) {
                        alignment = Pos.BASELINE_LEFT
                        +Label("Filter prefix: ") + prefix
                    }
                    center = entries
                    right = GridPane(padding = Insets(left = 10.0)) {
                        hgap = 10.0
                        vgap = 10.0
                        addRow(0, Label("Name: "), name)
                        addRow(1, Label("Surname: "), surname)
                    }
                    bottom = HBox(spacing = 10.0, padding = Insets(top = 10.0)) {
                        +create + update + delete
                    }
                }
            }
        }.show()
    }
}

