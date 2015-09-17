package kotlinfx.properties


// javafx.stage.Window

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.stage.Window.properties: javafx.collections.ObservableMap<Any, Any>
    get() = getProperties()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.stage.Window.onCloseRequest: javafx.event.EventHandler<javafx.stage.WindowEvent>
    get() = getOnCloseRequest()!!
    set(v) = setOnCloseRequest(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.stage.Window.opacity: Double
    get() = getOpacity()!!
    set(v) = setOpacity(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.stage.Window.userData: Any
    get() = getUserData()!!
    set(v) = setUserData(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.stage.Window.width: Double
    get() = getWidth()!!
    set(v) = setWidth(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.stage.Window.height: Double
    get() = getHeight()!!
    set(v) = setHeight(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.stage.Window.onHidden: javafx.event.EventHandler<javafx.stage.WindowEvent>
    get() = getOnHidden()!!
    set(v) = setOnHidden(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.stage.Window.onHiding: javafx.event.EventHandler<javafx.stage.WindowEvent>
    get() = getOnHiding()!!
    set(v) = setOnHiding(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.stage.Window.onShown: javafx.event.EventHandler<javafx.stage.WindowEvent>
    get() = getOnShown()!!
    set(v) = setOnShown(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.stage.Window.onShowing: javafx.event.EventHandler<javafx.stage.WindowEvent>
    get() = getOnShowing()!!
    set(v) = setOnShowing(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.stage.Window.x: Double
    get() = getX()!!
    set(v) = setX(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.stage.Window.y: Double
    get() = getY()!!
    set(v) = setY(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.stage.Window.scene: javafx.scene.Scene
    get() = getScene()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.stage.Window.focused: Boolean
    get() = focusedProperty()!!.get()!!
    set(v) = setFocused(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.stage.Window.eventDispatcher: javafx.event.EventDispatcher
    get() = getEventDispatcher()!!
    set(v) = setEventDispatcher(v)

// javafx.stage.FileChooser.ExtensionFilter

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.stage.FileChooser.ExtensionFilter.extensions: MutableList<String>
    get() = getExtensions()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.stage.FileChooser.ExtensionFilter.description: String
    get() = getDescription()!!


// javafx.beans.value.WritableValue

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var <T> javafx.beans.value.WritableValue<T>.value: T
    get() = getValue()!!
    set(v) = setValue(v)

// javafx.scene.control.ToggleButton

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.control.ToggleButton.toggleGroup: javafx.scene.control.ToggleGroup
    get() = getToggleGroup()!!
    set(v) = setToggleGroup(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.control.ToggleButton.selected: Boolean
    get() = selectedProperty()!!.get()!!
    set(v) = setSelected(v)

// javafx.print.JobSettings

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.print.JobSettings.collation: javafx.print.Collation
    get() = getCollation()!!
    set(v) = setCollation(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.print.JobSettings.jobName: String
    get() = getJobName()!!
    set(v) = setJobName(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.print.JobSettings.printColor: javafx.print.PrintColor
    get() = getPrintColor()!!
    set(v) = setPrintColor(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.print.JobSettings.printQuality: javafx.print.PrintQuality
    get() = getPrintQuality()!!
    set(v) = setPrintQuality(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.print.JobSettings.printSides: javafx.print.PrintSides
    get() = getPrintSides()!!
    set(v) = setPrintSides(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.print.JobSettings.paperSource: javafx.print.PaperSource
    get() = getPaperSource()!!
    set(v) = setPaperSource(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.print.JobSettings.copies: Int
    get() = getCopies()!!
    set(v) = setCopies(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.print.JobSettings.pageLayout: javafx.print.PageLayout
    get() = getPageLayout()!!
    set(v) = setPageLayout(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.print.JobSettings.printResolution: javafx.print.PrintResolution
    get() = getPrintResolution()!!
    set(v) = setPrintResolution(v)

// javafx.beans.binding.StringExpression

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.beans.binding.StringExpression.value: Any
    get() = getValue()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.beans.binding.StringExpression.valueSafe: String
    get() = getValueSafe()!!


// javafx.application.Application

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.application.Application.parameters: javafx.application.Application.Parameters
    get() = getParameters()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.application.Application.hostServices: javafx.application.HostServices
    get() = getHostServices()!!


// javafx.animation.FadeTransition

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.animation.FadeTransition.node: javafx.scene.Node
    get() = getNode()!!
    set(v) = setNode(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.animation.FadeTransition.duration: javafx.util.Duration
    get() = getDuration()!!
    set(v) = setDuration(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.animation.FadeTransition.fromValue: Double
    get() = getFromValue()!!
    set(v) = setFromValue(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.animation.FadeTransition.toValue: Double
    get() = getToValue()!!
    set(v) = setToValue(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.animation.FadeTransition.byValue: Double
    get() = getByValue()!!
    set(v) = setByValue(v)

// javafx.application.Preloader.ProgressNotification

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.application.Preloader.ProgressNotification.progress: Double
    get() = getProgress()!!


// javafx.scene.layout.Border

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.layout.Border.outsets: javafx.geometry.Insets
    get() = getOutsets()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.layout.Border.strokes: MutableList<javafx.scene.layout.BorderStroke>
    get() = getStrokes()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.layout.Border.images: MutableList<javafx.scene.layout.BorderImage>
    get() = getImages()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.layout.Border.insets: javafx.geometry.Insets
    get() = getInsets()!!


// javafx.scene.shape.ArcTo

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.shape.ArcTo.x: Double
    get() = getX()!!
    set(v) = setX(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.shape.ArcTo.y: Double
    get() = getY()!!
    set(v) = setY(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.shape.ArcTo.sweepFlag: Boolean
    get() = sweepFlagProperty()!!.get()!!
    set(v) = setSweepFlag(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.shape.ArcTo.xAxisRotation: Double
    get() = getXAxisRotation()!!
    set(v) = setXAxisRotation(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.shape.ArcTo.largeArcFlag: Boolean
    get() = largeArcFlagProperty()!!.get()!!
    set(v) = setLargeArcFlag(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.shape.ArcTo.radiusX: Double
    get() = getRadiusX()!!
    set(v) = setRadiusX(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.shape.ArcTo.radiusY: Double
    get() = getRadiusY()!!
    set(v) = setRadiusY(v)

// javafx.scene.input.InputMethodRequests

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.input.InputMethodRequests.selectedText: String
    get() = getSelectedText()!!


// javafx.scene.control.MultipleSelectionModel

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var <T> javafx.scene.control.MultipleSelectionModel<T>.selectionMode: javafx.scene.control.SelectionMode
    get() = getSelectionMode()!!
    set(v) = setSelectionMode(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <T> javafx.scene.control.MultipleSelectionModel<T>.selectedItems: javafx.collections.ObservableList<T>
    get() = getSelectedItems()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <T> javafx.scene.control.MultipleSelectionModel<T>.selectedIndices: javafx.collections.ObservableList<Int>
    get() = getSelectedIndices()!!


// javafx.animation.Animation

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.animation.Animation.rate: Double
    get() = getRate()!!
    set(v) = setRate(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.animation.Animation.currentRate: Double
    get() = getCurrentRate()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.animation.Animation.currentTime: javafx.util.Duration
    get() = getCurrentTime()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.animation.Animation.cycleCount: Int
    get() = getCycleCount()!!
    set(v) = setCycleCount(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.animation.Animation.onFinished: javafx.event.EventHandler<javafx.event.ActionEvent>
    get() = getOnFinished()!!
    set(v) = setOnFinished(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.animation.Animation.delay: javafx.util.Duration
    get() = getDelay()!!
    set(v) = setDelay(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.animation.Animation.status: javafx.animation.Animation.Status
    get() = getStatus()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.animation.Animation.cuePoints: javafx.collections.ObservableMap<String, javafx.util.Duration>
    get() = getCuePoints()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.animation.Animation.cycleDuration: javafx.util.Duration
    get() = getCycleDuration()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.animation.Animation.autoReverse: Boolean
    get() = autoReverseProperty()!!.get()!!
    set(v) = setAutoReverse(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.animation.Animation.totalDuration: javafx.util.Duration
    get() = getTotalDuration()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.animation.Animation.targetFramerate: Double
    get() = getTargetFramerate()!!


// javafx.scene.SnapshotParameters

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.SnapshotParameters.fill: javafx.scene.paint.Paint
    get() = getFill()!!
    set(v) = setFill(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.SnapshotParameters.viewport: javafx.geometry.Rectangle2D
    get() = getViewport()!!
    set(v) = setViewport(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.SnapshotParameters.camera: javafx.scene.Camera
    get() = getCamera()!!
    set(v) = setCamera(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.SnapshotParameters.transform: javafx.scene.transform.Transform
    get() = getTransform()!!
    set(v) = setTransform(v)

// javafx.scene.control.SelectionModel

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <T> javafx.scene.control.SelectionModel<T>.selectedItem: T
    get() = getSelectedItem()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <T> javafx.scene.control.SelectionModel<T>.selectedIndex: Int
    get() = getSelectedIndex()!!


// javafx.animation.Timeline

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.animation.Timeline.keyFrames: javafx.collections.ObservableList<javafx.animation.KeyFrame>
    get() = getKeyFrames()!!


// javafx.scene.control.ContextMenu

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.control.ContextMenu.onAction: javafx.event.EventHandler<javafx.event.ActionEvent>
    get() = getOnAction()!!
    set(v) = setOnAction(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.control.ContextMenu.items: javafx.collections.ObservableList<javafx.scene.control.MenuItem>
    get() = getItems()!!


// javafx.geometry.Bounds

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.geometry.Bounds.maxZ: Double
    get() = getMaxZ()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.geometry.Bounds.maxX: Double
    get() = getMaxX()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.geometry.Bounds.maxY: Double
    get() = getMaxY()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.geometry.Bounds.width: Double
    get() = getWidth()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.geometry.Bounds.height: Double
    get() = getHeight()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.geometry.Bounds.minZ: Double
    get() = getMinZ()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.geometry.Bounds.minY: Double
    get() = getMinY()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.geometry.Bounds.minX: Double
    get() = getMinX()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.geometry.Bounds.depth: Double
    get() = getDepth()!!


// javafx.scene.chart.Axis.TickMark

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var <T> javafx.scene.chart.Axis.TickMark<T>.value: T
    get() = getValue()!!
    set(v) = setValue(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var <T> javafx.scene.chart.Axis.TickMark<T>.label: String
    get() = getLabel()!!
    set(v) = setLabel(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var <T> javafx.scene.chart.Axis.TickMark<T>.position: Double
    get() = getPosition()!!
    set(v) = setPosition(v)

// javafx.animation.RotateTransition

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.animation.RotateTransition.node: javafx.scene.Node
    get() = getNode()!!
    set(v) = setNode(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.animation.RotateTransition.axis: javafx.geometry.Point3D
    get() = getAxis()!!
    set(v) = setAxis(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.animation.RotateTransition.duration: javafx.util.Duration
    get() = getDuration()!!
    set(v) = setDuration(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.animation.RotateTransition.byAngle: Double
    get() = getByAngle()!!
    set(v) = setByAngle(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.animation.RotateTransition.fromAngle: Double
    get() = getFromAngle()!!
    set(v) = setFromAngle(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.animation.RotateTransition.toAngle: Double
    get() = getToAngle()!!
    set(v) = setToAngle(v)

// javafx.scene.layout.BackgroundSize

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.layout.BackgroundSize.width: Double
    get() = getWidth()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.layout.BackgroundSize.height: Double
    get() = getHeight()!!


// javafx.scene.effect.MotionBlur

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.MotionBlur.input: javafx.scene.effect.Effect
    get() = getInput()!!
    set(v) = setInput(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.MotionBlur.angle: Double
    get() = getAngle()!!
    set(v) = setAngle(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.MotionBlur.radius: Double
    get() = getRadius()!!
    set(v) = setRadius(v)

// javafx.scene.control.Dialog

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var <R> javafx.scene.control.Dialog<R>.result: R
    get() = getResult()!!
    set(v) = setResult(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <R> javafx.scene.control.Dialog<R>.owner: javafx.stage.Window
    get() = getOwner()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var <R> javafx.scene.control.Dialog<R>.onCloseRequest: javafx.event.EventHandler<javafx.scene.control.DialogEvent>
    get() = getOnCloseRequest()!!
    set(v) = setOnCloseRequest(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var <R> javafx.scene.control.Dialog<R>.title: String
    get() = getTitle()!!
    set(v) = setTitle(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var <R> javafx.scene.control.Dialog<R>.resizable: Boolean
    get() = resizableProperty()!!.get()!!
    set(v) = setResizable(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var <R> javafx.scene.control.Dialog<R>.graphic: javafx.scene.Node
    get() = getGraphic()!!
    set(v) = setGraphic(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var <R> javafx.scene.control.Dialog<R>.width: Double
    get() = getWidth()!!
    set(v) = setWidth(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var <R> javafx.scene.control.Dialog<R>.height: Double
    get() = getHeight()!!
    set(v) = setHeight(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var <R> javafx.scene.control.Dialog<R>.onHidden: javafx.event.EventHandler<javafx.scene.control.DialogEvent>
    get() = getOnHidden()!!
    set(v) = setOnHidden(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var <R> javafx.scene.control.Dialog<R>.onHiding: javafx.event.EventHandler<javafx.scene.control.DialogEvent>
    get() = getOnHiding()!!
    set(v) = setOnHiding(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var <R> javafx.scene.control.Dialog<R>.onShown: javafx.event.EventHandler<javafx.scene.control.DialogEvent>
    get() = getOnShown()!!
    set(v) = setOnShown(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var <R> javafx.scene.control.Dialog<R>.onShowing: javafx.event.EventHandler<javafx.scene.control.DialogEvent>
    get() = getOnShowing()!!
    set(v) = setOnShowing(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var <R> javafx.scene.control.Dialog<R>.x: Double
    get() = getX()!!
    set(v) = setX(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var <R> javafx.scene.control.Dialog<R>.y: Double
    get() = getY()!!
    set(v) = setY(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <R> javafx.scene.control.Dialog<R>.modality: javafx.stage.Modality
    get() = getModality()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var <R> javafx.scene.control.Dialog<R>.dialogPane: javafx.scene.control.DialogPane
    get() = getDialogPane()!!
    set(v) = setDialogPane(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var <R> javafx.scene.control.Dialog<R>.headerText: String
    get() = getHeaderText()!!
    set(v) = setHeaderText(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var <R> javafx.scene.control.Dialog<R>.contentText: String
    get() = getContentText()!!
    set(v) = setContentText(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var <R> javafx.scene.control.Dialog<R>.resultConverter: javafx.util.Callback<javafx.scene.control.ButtonType, R>
    get() = getResultConverter()!!
    set(v) = setResultConverter(v)

// javafx.beans.property.ReadOnlyIntegerWrapper

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.beans.property.ReadOnlyIntegerWrapper.readOnlyProperty: javafx.beans.property.ReadOnlyIntegerProperty
    get() = getReadOnlyProperty()!!


// javafx.scene.input.KeyCombination.Modifier

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.input.KeyCombination.Modifier.value: javafx.scene.input.KeyCombination.ModifierValue
    get() = getValue()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.input.KeyCombination.Modifier.key: javafx.scene.input.KeyCode
    get() = getKey()!!


// javafx.animation.TranslateTransition

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.animation.TranslateTransition.node: javafx.scene.Node
    get() = getNode()!!
    set(v) = setNode(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.animation.TranslateTransition.byZ: Double
    get() = getByZ()!!
    set(v) = setByZ(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.animation.TranslateTransition.fromX: Double
    get() = getFromX()!!
    set(v) = setFromX(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.animation.TranslateTransition.fromY: Double
    get() = getFromY()!!
    set(v) = setFromY(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.animation.TranslateTransition.byX: Double
    get() = getByX()!!
    set(v) = setByX(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.animation.TranslateTransition.byY: Double
    get() = getByY()!!
    set(v) = setByY(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.animation.TranslateTransition.toZ: Double
    get() = getToZ()!!
    set(v) = setToZ(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.animation.TranslateTransition.toY: Double
    get() = getToY()!!
    set(v) = setToY(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.animation.TranslateTransition.fromZ: Double
    get() = getFromZ()!!
    set(v) = setFromZ(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.animation.TranslateTransition.toX: Double
    get() = getToX()!!
    set(v) = setToX(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.animation.TranslateTransition.duration: javafx.util.Duration
    get() = getDuration()!!
    set(v) = setDuration(v)

// javafx.util.converter.PercentageStringConverter

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.util.converter.PercentageStringConverter.numberFormat: java.text.NumberFormat
    get() = getNumberFormat()!!


// javafx.css.PseudoClass

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.css.PseudoClass.pseudoClassName: String
    get() = getPseudoClassName()!!


// javafx.scene.layout.BorderStrokeStyle

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.layout.BorderStrokeStyle.typ: javafx.scene.shape.StrokeType
    get() = getType()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.layout.BorderStrokeStyle.lineCap: javafx.scene.shape.StrokeLineCap
    get() = getLineCap()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.layout.BorderStrokeStyle.miterLimit: Double
    get() = getMiterLimit()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.layout.BorderStrokeStyle.lineJoin: javafx.scene.shape.StrokeLineJoin
    get() = getLineJoin()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.layout.BorderStrokeStyle.dashOffset: Double
    get() = getDashOffset()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.layout.BorderStrokeStyle.dashArray: MutableList<Double>
    get() = getDashArray()!!


// javafx.beans.binding.BooleanExpression

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.beans.binding.BooleanExpression.value: Any
    get() = getValue()!!


// javafx.css.SimpleStyleableDoubleProperty

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.css.SimpleStyleableDoubleProperty.name: String
    get() = getName()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.css.SimpleStyleableDoubleProperty.bean: Any
    get() = getBean()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.css.SimpleStyleableDoubleProperty.cssMetaData: javafx.css.CssMetaData<out javafx.css.Styleable?, Number>
    get() = getCssMetaData()!!


// javafx.scene.paint.LinearGradient

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.paint.LinearGradient.stops: MutableList<javafx.scene.paint.Stop>
    get() = getStops()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.paint.LinearGradient.cycleMethod: javafx.scene.paint.CycleMethod
    get() = getCycleMethod()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.paint.LinearGradient.endY: Double
    get() = getEndY()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.paint.LinearGradient.startY: Double
    get() = getStartY()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.paint.LinearGradient.startX: Double
    get() = getStartX()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.paint.LinearGradient.endX: Double
    get() = getEndX()!!


// javafx.css.StyleableProperty

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <T> javafx.css.StyleableProperty<T>.styleOrigin: javafx.css.StyleOrigin
    get() = getStyleOrigin()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <T> javafx.css.StyleableProperty<T>.cssMetaData: javafx.css.CssMetaData<out javafx.css.Styleable?, T>
    get() = getCssMetaData()!!


// javafx.scene.input.Mnemonic

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.input.Mnemonic.node: javafx.scene.Node
    get() = getNode()!!
    set(v) = setNode(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.input.Mnemonic.keyCombination: javafx.scene.input.KeyCombination
    get() = getKeyCombination()!!
    set(v) = setKeyCombination(v)

// javafx.scene.control.TableColumn.CellDataFeatures

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <S, T> javafx.scene.control.TableColumn.CellDataFeatures<S, T>.value: S
    get() = getValue()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <S, T> javafx.scene.control.TableColumn.CellDataFeatures<S, T>.tableColumn: javafx.scene.control.TableColumn<S, T>
    get() = getTableColumn()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <S, T> javafx.scene.control.TableColumn.CellDataFeatures<S, T>.tableView: javafx.scene.control.TableView<S>
    get() = getTableView()!!


// javafx.scene.shape.MoveTo

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.shape.MoveTo.x: Double
    get() = getX()!!
    set(v) = setX(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.shape.MoveTo.y: Double
    get() = getY()!!
    set(v) = setY(v)

// javafx.scene.text.Font

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.text.Font.name: String
    get() = getName()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.text.Font.size: Double
    get() = getSize()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.text.Font.style: String
    get() = getStyle()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.text.Font.family: String
    get() = getFamily()!!


// javafx.geometry.Dimension2D

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.geometry.Dimension2D.width: Double
    get() = getWidth()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.geometry.Dimension2D.height: Double
    get() = getHeight()!!


// javafx.print.PageLayout

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.print.PageLayout.bottomMargin: Double
    get() = getBottomMargin()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.print.PageLayout.paper: javafx.print.Paper
    get() = getPaper()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.print.PageLayout.rightMargin: Double
    get() = getRightMargin()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.print.PageLayout.topMargin: Double
    get() = getTopMargin()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.print.PageLayout.leftMargin: Double
    get() = getLeftMargin()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.print.PageLayout.pageOrientation: javafx.print.PageOrientation
    get() = getPageOrientation()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.print.PageLayout.printableWidth: Double
    get() = getPrintableWidth()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.print.PageLayout.printableHeight: Double
    get() = getPrintableHeight()!!


// javafx.scene.effect.FloatMap

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.FloatMap.width: Int
    get() = getWidth()!!
    set(v) = setWidth(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.FloatMap.height: Int
    get() = getHeight()!!
    set(v) = setHeight(v)

// javafx.geometry.Rectangle2D

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.geometry.Rectangle2D.maxX: Double
    get() = getMaxX()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.geometry.Rectangle2D.maxY: Double
    get() = getMaxY()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.geometry.Rectangle2D.width: Double
    get() = getWidth()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.geometry.Rectangle2D.height: Double
    get() = getHeight()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.geometry.Rectangle2D.minY: Double
    get() = getMinY()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.geometry.Rectangle2D.minX: Double
    get() = getMinX()!!


// javafx.animation.KeyValue

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.animation.KeyValue.typ: javafx.animation.KeyValue.Type
    get() = getType()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.animation.KeyValue.target: javafx.beans.value.WritableValue<*>
    get() = getTarget()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.animation.KeyValue.interpolator: javafx.animation.Interpolator
    get() = getInterpolator()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.animation.KeyValue.endValue: Any
    get() = getEndValue()!!


// javafx.animation.ScaleTransition

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.animation.ScaleTransition.node: javafx.scene.Node
    get() = getNode()!!
    set(v) = setNode(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.animation.ScaleTransition.byZ: Double
    get() = getByZ()!!
    set(v) = setByZ(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.animation.ScaleTransition.fromX: Double
    get() = getFromX()!!
    set(v) = setFromX(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.animation.ScaleTransition.fromY: Double
    get() = getFromY()!!
    set(v) = setFromY(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.animation.ScaleTransition.byX: Double
    get() = getByX()!!
    set(v) = setByX(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.animation.ScaleTransition.byY: Double
    get() = getByY()!!
    set(v) = setByY(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.animation.ScaleTransition.toZ: Double
    get() = getToZ()!!
    set(v) = setToZ(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.animation.ScaleTransition.toY: Double
    get() = getToY()!!
    set(v) = setToY(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.animation.ScaleTransition.fromZ: Double
    get() = getFromZ()!!
    set(v) = setFromZ(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.animation.ScaleTransition.toX: Double
    get() = getToX()!!
    set(v) = setToX(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.animation.ScaleTransition.duration: javafx.util.Duration
    get() = getDuration()!!
    set(v) = setDuration(v)

// javafx.css.CssMetaData

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <S:javafx.css.Styleable?, V> javafx.css.CssMetaData<S, V>.property: String
    get() = getProperty()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <S:javafx.css.Styleable?, V> javafx.css.CssMetaData<S, V>.converter: javafx.css.StyleConverter<*, V>
    get() = getConverter()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <S:javafx.css.Styleable?, V> javafx.css.CssMetaData<S, V>.subProperties: MutableList<javafx.css.CssMetaData<out javafx.css.Styleable?, *>>
    get() = getSubProperties()!!


// javafx.scene.layout.Background

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.layout.Background.outsets: javafx.geometry.Insets
    get() = getOutsets()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.layout.Background.fills: MutableList<javafx.scene.layout.BackgroundFill>
    get() = getFills()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.layout.Background.images: MutableList<javafx.scene.layout.BackgroundImage>
    get() = getImages()!!


// javafx.scene.image.PixelWriter

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.image.PixelWriter.pixelFormat: javafx.scene.image.PixelFormat<*>
    get() = getPixelFormat()!!


// javafx.scene.input.InputMethodTextRun

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.input.InputMethodTextRun.text: String
    get() = getText()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.input.InputMethodTextRun.highlight: javafx.scene.input.InputMethodHighlight
    get() = getHighlight()!!


// javafx.scene.paint.Color

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.paint.Color.opacity: Double
    get() = getOpacity()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.paint.Color.blue: Double
    get() = getBlue()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.paint.Color.green: Double
    get() = getGreen()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.paint.Color.saturation: Double
    get() = getSaturation()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.paint.Color.brightness: Double
    get() = getBrightness()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.paint.Color.red: Double
    get() = getRed()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.paint.Color.hue: Double
    get() = getHue()!!


// javafx.scene.control.TextFormatter.Change

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.control.TextFormatter.Change.control: javafx.scene.control.Control
    get() = getControl()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.control.TextFormatter.Change.text: String
    get() = getText()!!
    set(v) = setText(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.control.TextFormatter.Change.anchor: Int
    get() = getAnchor()!!
    set(v) = setAnchor(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.control.TextFormatter.Change.caretPosition: Int
    get() = getCaretPosition()!!
    set(v) = setCaretPosition(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.control.TextFormatter.Change.controlText: String
    get() = getControlText()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.control.TextFormatter.Change.rangeEnd: Int
    get() = getRangeEnd()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.control.TextFormatter.Change.rangeStart: Int
    get() = getRangeStart()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.control.TextFormatter.Change.controlAnchor: Int
    get() = getControlAnchor()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.control.TextFormatter.Change.selection: javafx.scene.control.IndexRange
    get() = getSelection()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.control.TextFormatter.Change.controlNewText: String
    get() = getControlNewText()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.control.TextFormatter.Change.controlCaretPosition: Int
    get() = getControlCaretPosition()!!


// javafx.geometry.Insets

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.geometry.Insets.bottom: Double
    get() = getBottom()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.geometry.Insets.top: Double
    get() = getTop()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.geometry.Insets.left: Double
    get() = getLeft()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.geometry.Insets.right: Double
    get() = getRight()!!


// javafx.css.SimpleStyleableStringProperty

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.css.SimpleStyleableStringProperty.name: String
    get() = getName()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.css.SimpleStyleableStringProperty.bean: Any
    get() = getBean()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.css.SimpleStyleableStringProperty.cssMetaData: javafx.css.CssMetaData<out javafx.css.Styleable?, String>
    get() = getCssMetaData()!!


// javafx.beans.binding.Binding

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <T> javafx.beans.binding.Binding<T>.dependencies: javafx.collections.ObservableList<*>
    get() = getDependencies()!!


// javafx.scene.effect.Light

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.Light.color: javafx.scene.paint.Color
    get() = getColor()!!
    set(v) = setColor(v)

// javafx.scene.control.Toggle

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.control.Toggle.properties: javafx.collections.ObservableMap<Any, Any>
    get() = getProperties()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.control.Toggle.userData: Any
    get() = getUserData()!!
    set(v) = setUserData(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.control.Toggle.toggleGroup: javafx.scene.control.ToggleGroup
    get() = getToggleGroup()!!
    set(v) = setToggleGroup(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.control.Toggle.selected: Boolean
    get() = selectedProperty()!!.get()!!
    set(v) = setSelected(v)

// javafx.scene.control.CheckMenuItem

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.control.CheckMenuItem.selected: Boolean
    get() = selectedProperty()!!.get()!!
    set(v) = setSelected(v)

// javafx.scene.media.EqualizerBand

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.media.EqualizerBand.bandwidth: Double
    get() = getBandwidth()!!
    set(v) = setBandwidth(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.media.EqualizerBand.gain: Double
    get() = getGain()!!
    set(v) = setGain(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.media.EqualizerBand.centerFrequency: Double
    get() = getCenterFrequency()!!
    set(v) = setCenterFrequency(v)

// javafx.scene.shape.QuadCurveTo

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.shape.QuadCurveTo.x: Double
    get() = getX()!!
    set(v) = setX(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.shape.QuadCurveTo.y: Double
    get() = getY()!!
    set(v) = setY(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.shape.QuadCurveTo.controlY: Double
    get() = getControlY()!!
    set(v) = setControlY(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.shape.QuadCurveTo.controlX: Double
    get() = getControlX()!!
    set(v) = setControlX(v)

// javafx.scene.image.PixelReader

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.image.PixelReader.pixelFormat: javafx.scene.image.PixelFormat<*>
    get() = getPixelFormat()!!


// javafx.scene.paint.ImagePattern

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.paint.ImagePattern.width: Double
    get() = getWidth()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.paint.ImagePattern.height: Double
    get() = getHeight()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.paint.ImagePattern.image: javafx.scene.image.Image
    get() = getImage()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.paint.ImagePattern.y: Double
    get() = getY()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.paint.ImagePattern.x: Double
    get() = getX()!!


// javafx.scene.layout.BackgroundImage

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.layout.BackgroundImage.size: javafx.scene.layout.BackgroundSize
    get() = getSize()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.layout.BackgroundImage.image: javafx.scene.image.Image
    get() = getImage()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.layout.BackgroundImage.position: javafx.scene.layout.BackgroundPosition
    get() = getPosition()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.layout.BackgroundImage.repeatY: javafx.scene.layout.BackgroundRepeat
    get() = getRepeatY()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.layout.BackgroundImage.repeatX: javafx.scene.layout.BackgroundRepeat
    get() = getRepeatX()!!


// javafx.scene.control.Skinnable

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.control.Skinnable.skin: javafx.scene.control.Skin<*>
    get() = getSkin()!!
    set(v) = setSkin(v)

// javafx.scene.media.VideoTrack

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.media.VideoTrack.width: Int
    get() = getWidth()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.media.VideoTrack.height: Int
    get() = getHeight()!!


// javafx.print.PrinterAttributes

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.print.PrinterAttributes.maxCopies: Int
    get() = getMaxCopies()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.print.PrinterAttributes.defaultCopies: Int
    get() = getDefaultCopies()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.print.PrinterAttributes.defaultPaper: javafx.print.Paper
    get() = getDefaultPaper()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.print.PrinterAttributes.supportedPrintResolutions: MutableSet<javafx.print.PrintResolution>
    get() = getSupportedPrintResolutions()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.print.PrinterAttributes.defaultPrintQuality: javafx.print.PrintQuality
    get() = getDefaultPrintQuality()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.print.PrinterAttributes.supportedPrintColors: MutableSet<javafx.print.PrintColor>
    get() = getSupportedPrintColors()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.print.PrinterAttributes.supportedPageOrientations: MutableSet<javafx.print.PageOrientation>
    get() = getSupportedPageOrientations()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.print.PrinterAttributes.defaultPrintResolution: javafx.print.PrintResolution
    get() = getDefaultPrintResolution()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.print.PrinterAttributes.defaultPaperSource: javafx.print.PaperSource
    get() = getDefaultPaperSource()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.print.PrinterAttributes.supportedPrintSides: MutableSet<javafx.print.PrintSides>
    get() = getSupportedPrintSides()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.print.PrinterAttributes.supportedPapers: MutableSet<javafx.print.Paper>
    get() = getSupportedPapers()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.print.PrinterAttributes.supportedCollations: MutableSet<javafx.print.Collation>
    get() = getSupportedCollations()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.print.PrinterAttributes.defaultCollation: javafx.print.Collation
    get() = getDefaultCollation()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.print.PrinterAttributes.defaultPageOrientation: javafx.print.PageOrientation
    get() = getDefaultPageOrientation()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.print.PrinterAttributes.defaultPrintSides: javafx.print.PrintSides
    get() = getDefaultPrintSides()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.print.PrinterAttributes.supportedPaperSources: MutableSet<javafx.print.PaperSource>
    get() = getSupportedPaperSources()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.print.PrinterAttributes.supportedPrintQuality: MutableSet<javafx.print.PrintQuality>
    get() = getSupportedPrintQuality()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.print.PrinterAttributes.defaultPrintColor: javafx.print.PrintColor
    get() = getDefaultPrintColor()!!


// javafx.scene.effect.BoxBlur

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.BoxBlur.input: javafx.scene.effect.Effect
    get() = getInput()!!
    set(v) = setInput(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.BoxBlur.width: Double
    get() = getWidth()!!
    set(v) = setWidth(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.BoxBlur.height: Double
    get() = getHeight()!!
    set(v) = setHeight(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.BoxBlur.iterations: Int
    get() = getIterations()!!
    set(v) = setIterations(v)

// javafx.beans.binding.BooleanBinding

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.beans.binding.BooleanBinding.value: Any
    get() = getValue()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.beans.binding.BooleanBinding.dependencies: javafx.collections.ObservableList<*>
    get() = getDependencies()!!


// javafx.scene.control.ButtonType

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.control.ButtonType.text: String
    get() = getText()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.control.ButtonType.buttonData: javafx.scene.control.ButtonBar.ButtonData
    get() = getButtonData()!!


// javafx.scene.effect.GaussianBlur

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.GaussianBlur.input: javafx.scene.effect.Effect
    get() = getInput()!!
    set(v) = setInput(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.GaussianBlur.radius: Double
    get() = getRadius()!!
    set(v) = setRadius(v)

// javafx.scene.transform.Translate

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.transform.Translate.tz: Double
    get() = getTz()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.transform.Translate.tx: Double
    get() = getTx()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.transform.Translate.ty: Double
    get() = getTy()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.transform.Translate.x: Double
    get() = getX()!!
    set(v) = setX(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.transform.Translate.y: Double
    get() = getY()!!
    set(v) = setY(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.transform.Translate.z: Double
    get() = getZ()!!
    set(v) = setZ(v)

// javafx.scene.SnapshotResult

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.SnapshotResult.image: javafx.scene.image.WritableImage
    get() = getImage()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.SnapshotResult.source: Any
    get() = getSource()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.SnapshotResult.snapshotParameters: javafx.scene.SnapshotParameters
    get() = getSnapshotParameters()!!


// javafx.scene.control.cell.PropertyValueFactory

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <S, T> javafx.scene.control.cell.PropertyValueFactory<S, T>.property: String
    get() = getProperty()!!


// javafx.scene.input.TouchPoint

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.input.TouchPoint.id: Int
    get() = getId()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.input.TouchPoint.state: javafx.scene.input.TouchPoint.State
    get() = getState()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.input.TouchPoint.target: javafx.event.EventTarget
    get() = getTarget()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.input.TouchPoint.sceneX: Double
    get() = getSceneX()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.input.TouchPoint.pickResult: javafx.scene.input.PickResult
    get() = getPickResult()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.input.TouchPoint.screenX: Double
    get() = getScreenX()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.input.TouchPoint.sceneY: Double
    get() = getSceneY()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.input.TouchPoint.screenY: Double
    get() = getScreenY()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.input.TouchPoint.grabbed: javafx.event.EventTarget
    get() = getGrabbed()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.input.TouchPoint.z: Double
    get() = getZ()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.input.TouchPoint.y: Double
    get() = getY()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.input.TouchPoint.x: Double
    get() = getX()!!


// javafx.scene.transform.Rotate

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.transform.Rotate.pivotY: Double
    get() = getPivotY()!!
    set(v) = setPivotY(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.transform.Rotate.pivotX: Double
    get() = getPivotX()!!
    set(v) = setPivotX(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.transform.Rotate.axis: javafx.geometry.Point3D
    get() = getAxis()!!
    set(v) = setAxis(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.transform.Rotate.pivotZ: Double
    get() = getPivotZ()!!
    set(v) = setPivotZ(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.transform.Rotate.angle: Double
    get() = getAngle()!!
    set(v) = setAngle(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.transform.Rotate.mzy: Double
    get() = getMzy()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.transform.Rotate.tz: Double
    get() = getTz()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.transform.Rotate.tx: Double
    get() = getTx()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.transform.Rotate.ty: Double
    get() = getTy()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.transform.Rotate.mzz: Double
    get() = getMzz()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.transform.Rotate.mxz: Double
    get() = getMxz()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.transform.Rotate.mxy: Double
    get() = getMxy()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.transform.Rotate.myx: Double
    get() = getMyx()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.transform.Rotate.myy: Double
    get() = getMyy()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.transform.Rotate.myz: Double
    get() = getMyz()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.transform.Rotate.mxx: Double
    get() = getMxx()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.transform.Rotate.mzx: Double
    get() = getMzx()!!


// javafx.stage.FileChooser

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.stage.FileChooser.title: String
    get() = getTitle()!!
    set(v) = setTitle(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.stage.FileChooser.initialDirectory: java.io.File
    get() = getInitialDirectory()!!
    set(v) = setInitialDirectory(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.stage.FileChooser.extensionFilters: javafx.collections.ObservableList<javafx.stage.FileChooser.ExtensionFilter>
    get() = getExtensionFilters()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.stage.FileChooser.selectedExtensionFilter: javafx.stage.FileChooser.ExtensionFilter
    get() = getSelectedExtensionFilter()!!
    set(v) = setSelectedExtensionFilter(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.stage.FileChooser.initialFileName: String
    get() = getInitialFileName()!!
    set(v) = setInitialFileName(v)

// javafx.print.PrintResolution

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.print.PrintResolution.crossFeedResolution: Int
    get() = getCrossFeedResolution()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.print.PrintResolution.feedResolution: Int
    get() = getFeedResolution()!!


// javafx.scene.layout.BorderWidths

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.layout.BorderWidths.bottom: Double
    get() = getBottom()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.layout.BorderWidths.top: Double
    get() = getTop()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.layout.BorderWidths.left: Double
    get() = getLeft()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.layout.BorderWidths.right: Double
    get() = getRight()!!


// javafx.beans.binding.FloatExpression

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.beans.binding.FloatExpression.value: Any
    get() = getValue()!!


// javafx.scene.chart.XYChart.Series

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var <X, Y> javafx.scene.chart.XYChart.Series<X, Y>.name: String
    get() = getName()!!
    set(v) = setName(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var <X, Y> javafx.scene.chart.XYChart.Series<X, Y>.node: javafx.scene.Node
    get() = getNode()!!
    set(v) = setNode(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var <X, Y> javafx.scene.chart.XYChart.Series<X, Y>.data: javafx.collections.ObservableList<javafx.scene.chart.XYChart.Data<X, Y>>
    get() = getData()!!
    set(v) = setData(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <X, Y> javafx.scene.chart.XYChart.Series<X, Y>.chart: javafx.scene.chart.XYChart<X, Y>
    get() = getChart()!!


// javafx.beans.binding.IntegerExpression

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.beans.binding.IntegerExpression.value: Any
    get() = getValue()!!


// javafx.scene.image.Image

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.image.Image.exception: Exception
    get() = getException()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.image.Image.progress: Double
    get() = getProgress()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.image.Image.width: Double
    get() = getWidth()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.image.Image.height: Double
    get() = getHeight()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.image.Image.pixelReader: javafx.scene.image.PixelReader
    get() = getPixelReader()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.image.Image.requestedWidth: Double
    get() = getRequestedWidth()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.image.Image.requestedHeight: Double
    get() = getRequestedHeight()!!


// javafx.scene.control.TreeTablePosition

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <S, T> javafx.scene.control.TreeTablePosition<S, T>.tableColumn: javafx.scene.control.TreeTableColumn<S,T>
    get() = getTableColumn()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <S, T> javafx.scene.control.TreeTablePosition<S, T>.column: Int
    get() = getColumn()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <S, T> javafx.scene.control.TreeTablePosition<S, T>.treeTableView: javafx.scene.control.TreeTableView<S>
    get() = getTreeTableView()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <S, T> javafx.scene.control.TreeTablePosition<S, T>.treeItem: javafx.scene.control.TreeItem<S>
    get() = getTreeItem()!!


// javafx.scene.transform.Shear

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.transform.Shear.pivotY: Double
    get() = getPivotY()!!
    set(v) = setPivotY(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.transform.Shear.pivotX: Double
    get() = getPivotX()!!
    set(v) = setPivotX(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.transform.Shear.tx: Double
    get() = getTx()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.transform.Shear.ty: Double
    get() = getTy()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.transform.Shear.x: Double
    get() = getX()!!
    set(v) = setX(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.transform.Shear.y: Double
    get() = getY()!!
    set(v) = setY(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.transform.Shear.mxy: Double
    get() = getMxy()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.transform.Shear.myx: Double
    get() = getMyx()!!


// javafx.beans.binding.MapBinding

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <K, V> javafx.beans.binding.MapBinding<K, V>.value: Any
    get() = getValue()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <K, V> javafx.beans.binding.MapBinding<K, V>.dependencies: javafx.collections.ObservableList<*>
    get() = getDependencies()!!


// javafx.scene.effect.SepiaTone

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.SepiaTone.input: javafx.scene.effect.Effect
    get() = getInput()!!
    set(v) = setInput(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.SepiaTone.level: Double
    get() = getLevel()!!
    set(v) = setLevel(v)

// javafx.animation.Transition

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.animation.Transition.interpolator: javafx.animation.Interpolator
    get() = getInterpolator()!!
    set(v) = setInterpolator(v)

// javafx.scene.control.CustomMenuItem

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.control.CustomMenuItem.content: javafx.scene.Node
    get() = getContent()!!
    set(v) = setContent(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.control.CustomMenuItem.hideOnClick: Boolean
    get() = hideOnClickProperty()!!.get()!!
    set(v) = setHideOnClick(v)

// javafx.css.StyleableLongProperty

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.css.StyleableLongProperty.styleOrigin: javafx.css.StyleOrigin
    get() = getStyleOrigin()!!


// javafx.beans.binding.ObjectExpression

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <T> javafx.beans.binding.ObjectExpression<T>.value: T
    get() = getValue()!!


// javafx.scene.shape.VLineTo

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.shape.VLineTo.y: Double
    get() = getY()!!
    set(v) = setY(v)

// javafx.scene.chart.XYChart.Data

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var <X, Y> javafx.scene.chart.XYChart.Data<X, Y>.node: javafx.scene.Node
    get() = getNode()!!
    set(v) = setNode(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var <X, Y> javafx.scene.chart.XYChart.Data<X, Y>.extraValue: Any
    get() = getExtraValue()!!
    set(v) = setExtraValue(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var <X, Y> javafx.scene.chart.XYChart.Data<X, Y>.yValue: Y
    get() = getYValue()!!
    set(v) = setYValue(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var <X, Y> javafx.scene.chart.XYChart.Data<X, Y>.xValue: X
    get() = getXValue()!!
    set(v) = setXValue(v)

// javafx.event.EventType

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <T:javafx.event.Event> javafx.event.EventType<T>.name: String
    get() = getName()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <T:javafx.event.Event> javafx.event.EventType<T>.superType: javafx.event.EventType<in T>
    get() = getSuperType()!!


// javafx.scene.effect.Bloom

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.Bloom.threshold: Double
    get() = getThreshold()!!
    set(v) = setThreshold(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.Bloom.input: javafx.scene.effect.Effect
    get() = getInput()!!
    set(v) = setInput(v)

// javafx.application.Preloader.StateChangeNotification

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.application.Preloader.StateChangeNotification.typ: javafx.application.Preloader.StateChangeNotification.Type
    get() = getType()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.application.Preloader.StateChangeNotification.application: javafx.application.Application
    get() = getApplication()!!


// javafx.scene.input.KeyCombination

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.input.KeyCombination.name: String
    get() = getName()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.input.KeyCombination.shortcut: javafx.scene.input.KeyCombination.ModifierValue
    get() = getShortcut()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.input.KeyCombination.control: javafx.scene.input.KeyCombination.ModifierValue
    get() = getControl()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.input.KeyCombination.shift: javafx.scene.input.KeyCombination.ModifierValue
    get() = getShift()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.input.KeyCombination.meta: javafx.scene.input.KeyCombination.ModifierValue
    get() = getMeta()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.input.KeyCombination.displayText: String
    get() = getDisplayText()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.input.KeyCombination.alt: javafx.scene.input.KeyCombination.ModifierValue
    get() = getAlt()!!


// javafx.css.SimpleStyleableIntegerProperty

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.css.SimpleStyleableIntegerProperty.name: String
    get() = getName()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.css.SimpleStyleableIntegerProperty.bean: Any
    get() = getBean()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.css.SimpleStyleableIntegerProperty.cssMetaData: javafx.css.CssMetaData<out javafx.css.Styleable?, Number>
    get() = getCssMetaData()!!


// javafx.scene.input.KeyCharacterCombination

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.input.KeyCharacterCombination.name: String
    get() = getName()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.input.KeyCharacterCombination.displayText: String
    get() = getDisplayText()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.input.KeyCharacterCombination.character: String
    get() = getCharacter()!!


// javafx.scene.image.PixelFormat

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <T:java.nio.Buffer> javafx.scene.image.PixelFormat<T>.typ: javafx.scene.image.PixelFormat<*>.Type
    get() = getType()!!


// javafx.scene.control.PopupControl

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.control.PopupControl.id: String
    get() = getId()!!
    set(v) = setId(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.control.PopupControl.maxWidth: Double
    get() = getMaxWidth()!!
    set(v) = setMaxWidth(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.control.PopupControl.prefWidth: Double
    get() = getPrefWidth()!!
    set(v) = setPrefWidth(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.control.PopupControl.minWidth: Double
    get() = getMinWidth()!!
    set(v) = setMinWidth(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.control.PopupControl.skin: javafx.scene.control.Skin<*>
    get() = getSkin()!!
    set(v) = setSkin(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.control.PopupControl.style: String
    get() = getStyle()!!
    set(v) = setStyle(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.control.PopupControl.typeSelector: String
    get() = getTypeSelector()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.control.PopupControl.maxHeight: Double
    get() = getMaxHeight()!!
    set(v) = setMaxHeight(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.control.PopupControl.minHeight: Double
    get() = getMinHeight()!!
    set(v) = setMinHeight(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.control.PopupControl.styleClass: javafx.collections.ObservableList<String>
    get() = getStyleClass()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.control.PopupControl.prefHeight: Double
    get() = getPrefHeight()!!
    set(v) = setPrefHeight(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.control.PopupControl.cssMetaData: MutableList<javafx.css.CssMetaData<out javafx.css.Styleable?, *>>
    get() = getCssMetaData()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.control.PopupControl.pseudoClassStates: javafx.collections.ObservableSet<javafx.css.PseudoClass>
    get() = getPseudoClassStates()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.control.PopupControl.styleableParent: javafx.css.Styleable?
    get() = getStyleableParent()!!


// javafx.collections.MapChangeListener.Change

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <K, V> javafx.collections.MapChangeListener.Change<K, V>.key: K
    get() = getKey()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <K, V> javafx.collections.MapChangeListener.Change<K, V>.map: javafx.collections.ObservableMap<K, V>
    get() = getMap()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <K, V> javafx.collections.MapChangeListener.Change<K, V>.valueAdded: V
    get() = getValueAdded()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <K, V> javafx.collections.MapChangeListener.Change<K, V>.valueRemoved: V
    get() = getValueRemoved()!!


// javafx.scene.control.Tooltip

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.control.Tooltip.graphic: javafx.scene.Node
    get() = getGraphic()!!
    set(v) = setGraphic(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.control.Tooltip.text: String
    get() = getText()!!
    set(v) = setText(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.control.Tooltip.textAlignment: javafx.scene.text.TextAlignment
    get() = getTextAlignment()!!
    set(v) = setTextAlignment(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.control.Tooltip.wrapText: Boolean
    get() = wrapTextProperty()!!.get()!!
    set(v) = setWrapText(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.control.Tooltip.font: javafx.scene.text.Font
    get() = getFont()!!
    set(v) = setFont(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.control.Tooltip.textOverrun: javafx.scene.control.OverrunStyle
    get() = getTextOverrun()!!
    set(v) = setTextOverrun(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.control.Tooltip.cssMetaData: MutableList<javafx.css.CssMetaData<out javafx.css.Styleable?, *>>
    get() = getCssMetaData()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.control.Tooltip.graphicTextGap: Double
    get() = getGraphicTextGap()!!
    set(v) = setGraphicTextGap(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.control.Tooltip.contentDisplay: javafx.scene.control.ContentDisplay
    get() = getContentDisplay()!!
    set(v) = setContentDisplay(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.control.Tooltip.styleableParent: javafx.css.Styleable?
    get() = getStyleableParent()!!


// javafx.css.StyleableStringProperty

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.css.StyleableStringProperty.styleOrigin: javafx.css.StyleOrigin
    get() = getStyleOrigin()!!


// javafx.scene.paint.RadialGradient

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.paint.RadialGradient.centerX: Double
    get() = getCenterX()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.paint.RadialGradient.centerY: Double
    get() = getCenterY()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.paint.RadialGradient.radius: Double
    get() = getRadius()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.paint.RadialGradient.focusDistance: Double
    get() = getFocusDistance()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.paint.RadialGradient.stops: MutableList<javafx.scene.paint.Stop>
    get() = getStops()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.paint.RadialGradient.focusAngle: Double
    get() = getFocusAngle()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.paint.RadialGradient.cycleMethod: javafx.scene.paint.CycleMethod
    get() = getCycleMethod()!!


// javafx.scene.effect.ColorInput

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.ColorInput.paint: javafx.scene.paint.Paint
    get() = getPaint()!!
    set(v) = setPaint(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.ColorInput.width: Double
    get() = getWidth()!!
    set(v) = setWidth(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.ColorInput.height: Double
    get() = getHeight()!!
    set(v) = setHeight(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.ColorInput.x: Double
    get() = getX()!!
    set(v) = setX(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.ColorInput.y: Double
    get() = getY()!!
    set(v) = setY(v)

// javafx.animation.PathTransition

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.animation.PathTransition.path: javafx.scene.shape.Shape
    get() = getPath()!!
    set(v) = setPath(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.animation.PathTransition.node: javafx.scene.Node
    get() = getNode()!!
    set(v) = setNode(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.animation.PathTransition.orientation: javafx.animation.PathTransition.OrientationType
    get() = getOrientation()!!
    set(v) = setOrientation(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.animation.PathTransition.duration: javafx.util.Duration
    get() = getDuration()!!
    set(v) = setDuration(v)

// javafx.beans.property.ReadOnlyStringWrapper

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.beans.property.ReadOnlyStringWrapper.readOnlyProperty: javafx.beans.property.ReadOnlyStringProperty
    get() = getReadOnlyProperty()!!


// javafx.animation.StrokeTransition

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.animation.StrokeTransition.duration: javafx.util.Duration
    get() = getDuration()!!
    set(v) = setDuration(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.animation.StrokeTransition.fromValue: javafx.scene.paint.Color
    get() = getFromValue()!!
    set(v) = setFromValue(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.animation.StrokeTransition.toValue: javafx.scene.paint.Color
    get() = getToValue()!!
    set(v) = setToValue(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.animation.StrokeTransition.shape: javafx.scene.shape.Shape
    get() = getShape()!!
    set(v) = setShape(v)

// javafx.scene.layout.BorderImage

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.layout.BorderImage.image: javafx.scene.image.Image
    get() = getImage()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.layout.BorderImage.slices: javafx.scene.layout.BorderWidths
    get() = getSlices()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.layout.BorderImage.insets: javafx.geometry.Insets
    get() = getInsets()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.layout.BorderImage.widths: javafx.scene.layout.BorderWidths
    get() = getWidths()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.layout.BorderImage.repeatY: javafx.scene.layout.BorderRepeat
    get() = getRepeatY()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.layout.BorderImage.repeatX: javafx.scene.layout.BorderRepeat
    get() = getRepeatX()!!


// javafx.css.SimpleStyleableFloatProperty

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.css.SimpleStyleableFloatProperty.name: String
    get() = getName()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.css.SimpleStyleableFloatProperty.bean: Any
    get() = getBean()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.css.SimpleStyleableFloatProperty.cssMetaData: javafx.css.CssMetaData<out javafx.css.Styleable?, Number>
    get() = getCssMetaData()!!


// javafx.print.PrinterJob

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.print.PrinterJob.jobSettings: javafx.print.JobSettings
    get() = getJobSettings()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.print.PrinterJob.jobStatus: javafx.print.PrinterJob.JobStatus
    get() = getJobStatus()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.print.PrinterJob.printer: javafx.print.Printer
    get() = getPrinter()!!
    set(v) = setPrinter(v)

// javafx.css.Styleable

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.css.Styleable.id: String
    get() = getId()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.css.Styleable.style: String
    get() = getStyle()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.css.Styleable.typeSelector: String
    get() = getTypeSelector()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.css.Styleable.styleClass: javafx.collections.ObservableList<String>
    get() = getStyleClass()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.css.Styleable.cssMetaData: MutableList<javafx.css.CssMetaData<out javafx.css.Styleable?, *>>
    get() = getCssMetaData()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.css.Styleable.pseudoClassStates: javafx.collections.ObservableSet<javafx.css.PseudoClass>
    get() = getPseudoClassStates()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.css.Styleable.styleableParent: javafx.css.Styleable?
    get() = getStyleableParent()!!


// javafx.scene.image.WritableImage

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.image.WritableImage.pixelWriter: javafx.scene.image.PixelWriter
    get() = getPixelWriter()!!


// javafx.scene.effect.Light.Point

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.Light.Point.x: Double
    get() = getX()!!
    set(v) = setX(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.Light.Point.y: Double
    get() = getY()!!
    set(v) = setY(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.Light.Point.z: Double
    get() = getZ()!!
    set(v) = setZ(v)

// javafx.beans.binding.FloatBinding

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.beans.binding.FloatBinding.value: Any
    get() = getValue()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.beans.binding.FloatBinding.dependencies: javafx.collections.ObservableList<*>
    get() = getDependencies()!!


// javafx.scene.control.SpinnerValueFactory

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var <T> javafx.scene.control.SpinnerValueFactory<T>.value: T
    get() = getValue()!!
    set(v) = setValue(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var <T> javafx.scene.control.SpinnerValueFactory<T>.converter: javafx.util.StringConverter<T>
    get() = getConverter()!!
    set(v) = setConverter(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var <T> javafx.scene.control.SpinnerValueFactory<T>.wrapAround: Boolean
    get() = wrapAroundProperty()!!.get()!!
    set(v) = setWrapAround(v)

// javafx.scene.effect.PerspectiveTransform

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.PerspectiveTransform.input: javafx.scene.effect.Effect
    get() = getInput()!!
    set(v) = setInput(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.PerspectiveTransform.llx: Double
    get() = getLlx()!!
    set(v) = setLlx(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.PerspectiveTransform.lrx: Double
    get() = getLrx()!!
    set(v) = setLrx(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.PerspectiveTransform.ulx: Double
    get() = getUlx()!!
    set(v) = setUlx(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.PerspectiveTransform.lly: Double
    get() = getLly()!!
    set(v) = setLly(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.PerspectiveTransform.uly: Double
    get() = getUly()!!
    set(v) = setUly(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.PerspectiveTransform.urx: Double
    get() = getUrx()!!
    set(v) = setUrx(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.PerspectiveTransform.ury: Double
    get() = getUry()!!
    set(v) = setUry(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.PerspectiveTransform.lry: Double
    get() = getLry()!!
    set(v) = setLry(v)

// javafx.beans.value.ObservableValue

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <T> javafx.beans.value.ObservableValue<T>.value: T
    get() = getValue()!!


// javafx.beans.binding.ListBinding

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <E> javafx.beans.binding.ListBinding<E>.value: Any
    get() = getValue()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <E> javafx.beans.binding.ListBinding<E>.dependencies: javafx.collections.ObservableList<*>
    get() = getDependencies()!!


// javafx.beans.property.ReadOnlyProperty

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <T> javafx.beans.property.ReadOnlyProperty<T>.name: String
    get() = getName()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <T> javafx.beans.property.ReadOnlyProperty<T>.bean: Any
    get() = getBean()!!


// javafx.scene.control.Skin

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <C:javafx.scene.control.Skinnable> javafx.scene.control.Skin<C>.node: javafx.scene.Node
    get() = getNode()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <C:javafx.scene.control.Skinnable> javafx.scene.control.Skin<C>.skinnable: C
    get() = getSkinnable()!!


// javafx.scene.transform.Scale

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.transform.Scale.pivotY: Double
    get() = getPivotY()!!
    set(v) = setPivotY(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.transform.Scale.pivotX: Double
    get() = getPivotX()!!
    set(v) = setPivotX(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.transform.Scale.pivotZ: Double
    get() = getPivotZ()!!
    set(v) = setPivotZ(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.transform.Scale.tz: Double
    get() = getTz()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.transform.Scale.tx: Double
    get() = getTx()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.transform.Scale.ty: Double
    get() = getTy()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.transform.Scale.mzz: Double
    get() = getMzz()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.transform.Scale.x: Double
    get() = getX()!!
    set(v) = setX(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.transform.Scale.y: Double
    get() = getY()!!
    set(v) = setY(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.transform.Scale.z: Double
    get() = getZ()!!
    set(v) = setZ(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.transform.Scale.myy: Double
    get() = getMyy()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.transform.Scale.mxx: Double
    get() = getMxx()!!


// javafx.stage.DirectoryChooser

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.stage.DirectoryChooser.title: String
    get() = getTitle()!!
    set(v) = setTitle(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.stage.DirectoryChooser.initialDirectory: java.io.File
    get() = getInitialDirectory()!!
    set(v) = setInitialDirectory(v)

// javafx.scene.control.TableView.ResizeFeatures

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <S> javafx.scene.control.TableView.ResizeFeatures<S>.table: javafx.scene.control.TableView<S>
    get() = getTable()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <S> javafx.scene.control.TableView.ResizeFeatures<S>.column: javafx.scene.control.TableColumn<S, *>
    get() = getColumn()!!


// javafx.beans.binding.SetBinding

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <E> javafx.beans.binding.SetBinding<E>.value: Any
    get() = getValue()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <E> javafx.beans.binding.SetBinding<E>.dependencies: javafx.collections.ObservableList<*>
    get() = getDependencies()!!


// javafx.scene.effect.DisplacementMap

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.DisplacementMap.input: javafx.scene.effect.Effect
    get() = getInput()!!
    set(v) = setInput(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.DisplacementMap.scaleX: Double
    get() = getScaleX()!!
    set(v) = setScaleX(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.DisplacementMap.scaleY: Double
    get() = getScaleY()!!
    set(v) = setScaleY(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.DisplacementMap.wrap: Boolean
    get() = wrapProperty()!!.get()!!
    set(v) = setWrap(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.DisplacementMap.mapData: javafx.scene.effect.FloatMap
    get() = getMapData()!!
    set(v) = setMapData(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.DisplacementMap.offsetY: Double
    get() = getOffsetY()!!
    set(v) = setOffsetY(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.DisplacementMap.offsetX: Double
    get() = getOffsetX()!!
    set(v) = setOffsetX(v)

// javafx.scene.shape.CubicCurveTo

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.shape.CubicCurveTo.x: Double
    get() = getX()!!
    set(v) = setX(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.shape.CubicCurveTo.y: Double
    get() = getY()!!
    set(v) = setY(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.shape.CubicCurveTo.controlY2: Double
    get() = getControlY2()!!
    set(v) = setControlY2(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.shape.CubicCurveTo.controlX2: Double
    get() = getControlX2()!!
    set(v) = setControlX2(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.shape.CubicCurveTo.controlY1: Double
    get() = getControlY1()!!
    set(v) = setControlY1(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.shape.CubicCurveTo.controlX1: Double
    get() = getControlX1()!!
    set(v) = setControlX1(v)

// javafx.stage.Stage

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.stage.Stage.owner: javafx.stage.Window
    get() = getOwner()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.stage.Stage.icons: javafx.collections.ObservableList<javafx.scene.image.Image>
    get() = getIcons()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.stage.Stage.title: String
    get() = getTitle()!!
    set(v) = setTitle(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.stage.Stage.scene: javafx.scene.Scene
    get() = sceneProperty()!!.get()!!
    set(v) = setScene(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.stage.Stage.maxWidth: Double
    get() = getMaxWidth()!!
    set(v) = setMaxWidth(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.stage.Stage.minWidth: Double
    get() = getMinWidth()!!
    set(v) = setMinWidth(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.stage.Stage.resizable: Boolean
    get() = resizableProperty()!!.get()!!
    set(v) = setResizable(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.stage.Stage.style: javafx.stage.StageStyle
    get() = getStyle()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.stage.Stage.maxHeight: Double
    get() = getMaxHeight()!!
    set(v) = setMaxHeight(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.stage.Stage.minHeight: Double
    get() = getMinHeight()!!
    set(v) = setMinHeight(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.stage.Stage.fullScreenExitHint: String
    get() = getFullScreenExitHint()!!
    set(v) = setFullScreenExitHint(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.stage.Stage.fullScreenExitKeyCombination: javafx.scene.input.KeyCombination
    get() = getFullScreenExitKeyCombination()!!
    set(v) = setFullScreenExitKeyCombination(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.stage.Stage.alwaysOnTop: Boolean
    get() = alwaysOnTopProperty()!!.get()!!
    set(v) = setAlwaysOnTop(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.stage.Stage.modality: javafx.stage.Modality
    get() = getModality()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.stage.Stage.iconified: Boolean
    get() = iconifiedProperty()!!.get()!!
    set(v) = setIconified(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.stage.Stage.fullScreen: Boolean
    get() = fullScreenProperty()!!.get()!!
    set(v) = setFullScreen(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.stage.Stage.maximized: Boolean
    get() = maximizedProperty()!!.get()!!
    set(v) = setMaximized(v)

// javafx.scene.paint.Stop

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.paint.Stop.offset: Double
    get() = getOffset()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.paint.Stop.color: javafx.scene.paint.Color
    get() = getColor()!!


// javafx.scene.control.RadioMenuItem

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.control.RadioMenuItem.toggleGroup: javafx.scene.control.ToggleGroup
    get() = getToggleGroup()!!
    set(v) = setToggleGroup(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.control.RadioMenuItem.selected: Boolean
    get() = selectedProperty()!!.get()!!
    set(v) = setSelected(v)

// javafx.scene.effect.DropShadow

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.DropShadow.color: javafx.scene.paint.Color
    get() = getColor()!!
    set(v) = setColor(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.DropShadow.input: javafx.scene.effect.Effect
    get() = getInput()!!
    set(v) = setInput(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.DropShadow.radius: Double
    get() = getRadius()!!
    set(v) = setRadius(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.DropShadow.width: Double
    get() = getWidth()!!
    set(v) = setWidth(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.DropShadow.height: Double
    get() = getHeight()!!
    set(v) = setHeight(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.DropShadow.spread: Double
    get() = getSpread()!!
    set(v) = setSpread(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.DropShadow.blurType: javafx.scene.effect.BlurType
    get() = getBlurType()!!
    set(v) = setBlurType(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.DropShadow.offsetY: Double
    get() = getOffsetY()!!
    set(v) = setOffsetY(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.DropShadow.offsetX: Double
    get() = getOffsetX()!!
    set(v) = setOffsetX(v)

// javafx.css.SimpleStyleableBooleanProperty

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.css.SimpleStyleableBooleanProperty.name: String
    get() = getName()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.css.SimpleStyleableBooleanProperty.bean: Any
    get() = getBean()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.css.SimpleStyleableBooleanProperty.cssMetaData: javafx.css.CssMetaData<out javafx.css.Styleable?, Boolean>
    get() = getCssMetaData()!!


// javafx.beans.property.SimpleFloatProperty

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.beans.property.SimpleFloatProperty.name: String
    get() = getName()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.beans.property.SimpleFloatProperty.bean: Any
    get() = getBean()!!


// javafx.beans.binding.DoubleBinding

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.beans.binding.DoubleBinding.value: Any
    get() = getValue()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.beans.binding.DoubleBinding.dependencies: javafx.collections.ObservableList<*>
    get() = getDependencies()!!


// javafx.scene.shape.TriangleMesh

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.shape.TriangleMesh.points: javafx.collections.ObservableFloatArray
    get() = getPoints()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.shape.TriangleMesh.normalElementSize: Int
    get() = getNormalElementSize()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.shape.TriangleMesh.pointElementSize: Int
    get() = getPointElementSize()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.shape.TriangleMesh.texCoordElementSize: Int
    get() = getTexCoordElementSize()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.shape.TriangleMesh.faceSmoothingGroups: javafx.collections.ObservableIntegerArray
    get() = getFaceSmoothingGroups()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.shape.TriangleMesh.faceElementSize: Int
    get() = getFaceElementSize()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.shape.TriangleMesh.normals: javafx.collections.ObservableFloatArray
    get() = getNormals()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.shape.TriangleMesh.vertexFormat: javafx.scene.shape.VertexFormat
    get() = getVertexFormat()!!
    set(v) = setVertexFormat(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.shape.TriangleMesh.faces: javafx.scene.shape.ObservableFaceArray
    get() = getFaces()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.shape.TriangleMesh.texCoords: javafx.collections.ObservableFloatArray
    get() = getTexCoords()!!


// javafx.collections.ListChangeListener.Change

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <E> javafx.collections.ListChangeListener.Change<E>.removed: MutableList<E>
    get() = getRemoved()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <E> javafx.collections.ListChangeListener.Change<E>.addedSubList: MutableList<E>
    get() = getAddedSubList()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <E> javafx.collections.ListChangeListener.Change<E>.addedSize: Int
    get() = getAddedSize()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <E> javafx.collections.ListChangeListener.Change<E>.removedSize: Int
    get() = getRemovedSize()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <E> javafx.collections.ListChangeListener.Change<E>.from: Int
    get() = getFrom()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <E> javafx.collections.ListChangeListener.Change<E>.list: javafx.collections.ObservableList<E>
    get() = getList()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <E> javafx.collections.ListChangeListener.Change<E>.to: Int
    get() = getTo()!!


// javafx.beans.binding.LongExpression

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.beans.binding.LongExpression.value: Any
    get() = getValue()!!


// javafx.beans.property.SimpleBooleanProperty

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.beans.property.SimpleBooleanProperty.name: String
    get() = getName()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.beans.property.SimpleBooleanProperty.bean: Any
    get() = getBean()!!


// javafx.geometry.Point2D

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.geometry.Point2D.y: Double
    get() = getY()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.geometry.Point2D.x: Double
    get() = getX()!!


// javafx.application.HostServices

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.application.HostServices.codeBase: String
    get() = getCodeBase()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.application.HostServices.webContext: netscape.javascript.JSObject
    get() = getWebContext()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.application.HostServices.documentBase: String
    get() = getDocumentBase()!!


// javafx.scene.transform.Transform

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.transform.Transform.onTransformChanged: javafx.event.EventHandler<in javafx.scene.transform.TransformChangedEvent?>
    get() = getOnTransformChanged()!!
    set(v) = setOnTransformChanged(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.transform.Transform.mzy: Double
    get() = getMzy()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.transform.Transform.tz: Double
    get() = getTz()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.transform.Transform.tx: Double
    get() = getTx()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.transform.Transform.ty: Double
    get() = getTy()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.transform.Transform.mzz: Double
    get() = getMzz()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.transform.Transform.mxz: Double
    get() = getMxz()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.transform.Transform.mxy: Double
    get() = getMxy()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.transform.Transform.myx: Double
    get() = getMyx()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.transform.Transform.myy: Double
    get() = getMyy()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.transform.Transform.myz: Double
    get() = getMyz()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.transform.Transform.mxx: Double
    get() = getMxx()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.transform.Transform.mzx: Double
    get() = getMzx()!!


// javafx.beans.binding.MapExpression

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <K, V> javafx.beans.binding.MapExpression<K, V>.value: javafx.collections.ObservableMap<K, V>
    get() = getValue()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <K, V> javafx.beans.binding.MapExpression<K, V>.size: Int
    get() = getSize()!!


// javafx.beans.property.ReadOnlyDoubleWrapper

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.beans.property.ReadOnlyDoubleWrapper.readOnlyProperty: javafx.beans.property.ReadOnlyDoubleProperty
    get() = getReadOnlyProperty()!!


// javafx.css.SimpleStyleableObjectProperty

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <T> javafx.css.SimpleStyleableObjectProperty<T>.name: String
    get() = getName()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <T> javafx.css.SimpleStyleableObjectProperty<T>.bean: Any
    get() = getBean()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <T> javafx.css.SimpleStyleableObjectProperty<T>.cssMetaData: javafx.css.CssMetaData<out javafx.css.Styleable?, T>
    get() = getCssMetaData()!!


// javafx.scene.control.MenuItem

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.control.MenuItem.properties: javafx.collections.ObservableMap<Any, Any>
    get() = getProperties()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.control.MenuItem.id: String
    get() = getId()!!
    set(v) = setId(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.control.MenuItem.onAction: javafx.event.EventHandler<javafx.event.ActionEvent>
    get() = getOnAction()!!
    set(v) = setOnAction(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.control.MenuItem.parentMenu: javafx.scene.control.Menu
    get() = getParentMenu()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.control.MenuItem.graphic: javafx.scene.Node
    get() = getGraphic()!!
    set(v) = setGraphic(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.control.MenuItem.accelerator: javafx.scene.input.KeyCombination
    get() = getAccelerator()!!
    set(v) = setAccelerator(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.control.MenuItem.text: String
    get() = getText()!!
    set(v) = setText(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.control.MenuItem.style: String
    get() = getStyle()!!
    set(v) = setStyle(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.control.MenuItem.typeSelector: String
    get() = getTypeSelector()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.control.MenuItem.parentPopup: javafx.scene.control.ContextMenu
    get() = getParentPopup()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.control.MenuItem.styleClass: javafx.collections.ObservableList<String>
    get() = getStyleClass()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.control.MenuItem.disable: Boolean
    get() = disableProperty()!!.get()!!
    set(v) = setDisable(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.control.MenuItem.visible: Boolean
    get() = visibleProperty()!!.get()!!
    set(v) = setVisible(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.control.MenuItem.userData: Any
    get() = getUserData()!!
    set(v) = setUserData(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.control.MenuItem.cssMetaData: MutableList<javafx.css.CssMetaData<out javafx.css.Styleable?, *>>
    get() = getCssMetaData()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.control.MenuItem.mnemonicParsing: Boolean
    get() = mnemonicParsingProperty()!!.get()!!
    set(v) = setMnemonicParsing(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.control.MenuItem.onMenuValidation: javafx.event.EventHandler<javafx.event.Event>
    get() = getOnMenuValidation()!!
    set(v) = setOnMenuValidation(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.control.MenuItem.pseudoClassStates: javafx.collections.ObservableSet<javafx.css.PseudoClass>
    get() = getPseudoClassStates()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.control.MenuItem.styleableParent: javafx.css.Styleable?
    get() = getStyleableParent()!!


// javafx.scene.control.TablePositionBase

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <TC:javafx.scene.control.TreeTableColumn<*,*>> javafx.scene.control.TablePositionBase<TC>.tableColumn: TC
    get() = getTableColumn()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <TC:javafx.scene.control.TreeTableColumn<*,*>> javafx.scene.control.TablePositionBase<TC>.column: Int
    get() = getColumn()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <TC:javafx.scene.control.TreeTableColumn<*,*>> javafx.scene.control.TablePositionBase<TC>.row: Int
    get() = getRow()!!


// javafx.scene.control.TreeTableView.ResizeFeatures

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <S> javafx.scene.control.TreeTableView.ResizeFeatures<S>.table: javafx.scene.control.TreeTableView<S>
    get() = getTable()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <S> javafx.scene.control.TreeTableView.ResizeFeatures<S>.column: javafx.scene.control.TreeTableColumn<S, *>
    get() = getColumn()!!


// javafx.fxml.FXMLLoader

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.fxml.FXMLLoader.classLoader: ClassLoader
    get() = getClassLoader()!!
    set(v) = setClassLoader(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.fxml.FXMLLoader.location: java.net.URL
    get() = getLocation()!!
    set(v) = setLocation(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.fxml.FXMLLoader.resources: java.util.ResourceBundle
    get() = getResources()!!
    set(v) = setResources(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.fxml.FXMLLoader.builderFactory: javafx.util.BuilderFactory
    get() = getBuilderFactory()!!
    set(v) = setBuilderFactory(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.fxml.FXMLLoader.charset: java.nio.charset.Charset
    get() = getCharset()!!
    set(v) = setCharset(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.fxml.FXMLLoader.namespace: javafx.collections.ObservableMap<String, Any>
    get() = getNamespace()!!


// javafx.scene.input.Clipboard

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.input.Clipboard.string: String
    get() = getString()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.input.Clipboard.files: MutableList<java.io.File>
    get() = getFiles()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.input.Clipboard.image: javafx.scene.image.Image
    get() = getImage()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.input.Clipboard.url: String
    get() = getUrl()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.input.Clipboard.html: String
    get() = getHtml()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.input.Clipboard.rtf: String
    get() = getRtf()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.input.Clipboard.contentTypes: MutableSet<javafx.scene.input.DataFormat>
    get() = getContentTypes()!!


// javafx.animation.KeyFrame

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.animation.KeyFrame.name: String
    get() = getName()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.animation.KeyFrame.time: javafx.util.Duration
    get() = getTime()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.animation.KeyFrame.onFinished: javafx.event.EventHandler<javafx.event.ActionEvent>
    get() = getOnFinished()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.animation.KeyFrame.values: MutableSet<javafx.animation.KeyValue>
    get() = getValues()!!


// javafx.css.StyleableBooleanProperty

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.css.StyleableBooleanProperty.styleOrigin: javafx.css.StyleOrigin
    get() = getStyleOrigin()!!


// javafx.scene.effect.ColorAdjust

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.ColorAdjust.input: javafx.scene.effect.Effect
    get() = getInput()!!
    set(v) = setInput(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.ColorAdjust.brightness: Double
    get() = getBrightness()!!
    set(v) = setBrightness(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.ColorAdjust.hue: Double
    get() = getHue()!!
    set(v) = setHue(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.ColorAdjust.saturation: Double
    get() = getSaturation()!!
    set(v) = setSaturation(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.ColorAdjust.contrast: Double
    get() = getContrast()!!
    set(v) = setContrast(v)

// javafx.scene.effect.Shadow

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.Shadow.color: javafx.scene.paint.Color
    get() = getColor()!!
    set(v) = setColor(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.Shadow.input: javafx.scene.effect.Effect
    get() = getInput()!!
    set(v) = setInput(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.Shadow.radius: Double
    get() = getRadius()!!
    set(v) = setRadius(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.Shadow.width: Double
    get() = getWidth()!!
    set(v) = setWidth(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.Shadow.height: Double
    get() = getHeight()!!
    set(v) = setHeight(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.Shadow.blurType: javafx.scene.effect.BlurType
    get() = getBlurType()!!
    set(v) = setBlurType(v)

// javafx.css.StyleableIntegerProperty

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.css.StyleableIntegerProperty.styleOrigin: javafx.css.StyleOrigin
    get() = getStyleOrigin()!!


// javafx.css.StyleableObjectProperty

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <T> javafx.css.StyleableObjectProperty<T>.styleOrigin: javafx.css.StyleOrigin
    get() = getStyleOrigin()!!


// javafx.beans.binding.StringBinding

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.beans.binding.StringBinding.dependencies: javafx.collections.ObservableList<*>
    get() = getDependencies()!!


// javafx.scene.layout.BackgroundFill

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.layout.BackgroundFill.insets: javafx.geometry.Insets
    get() = getInsets()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.layout.BackgroundFill.fill: javafx.scene.paint.Paint
    get() = getFill()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.layout.BackgroundFill.radii: javafx.scene.layout.CornerRadii
    get() = getRadii()!!


// javafx.beans.binding.ListExpression

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <E> javafx.beans.binding.ListExpression<E>.value: javafx.collections.ObservableList<E>
    get() = getValue()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <E> javafx.beans.binding.ListExpression<E>.size: Int
    get() = getSize()!!


// javafx.beans.property.SimpleIntegerProperty

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.beans.property.SimpleIntegerProperty.name: String
    get() = getName()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.beans.property.SimpleIntegerProperty.bean: Any
    get() = getBean()!!


// javafx.scene.web.PromptData

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.web.PromptData.message: String
    get() = getMessage()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.web.PromptData.defaultValue: String
    get() = getDefaultValue()!!


// javafx.scene.layout.BorderStroke

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.layout.BorderStroke.insets: javafx.geometry.Insets
    get() = getInsets()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.layout.BorderStroke.radii: javafx.scene.layout.CornerRadii
    get() = getRadii()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.layout.BorderStroke.leftStyle: javafx.scene.layout.BorderStrokeStyle
    get() = getLeftStyle()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.layout.BorderStroke.topStyle: javafx.scene.layout.BorderStrokeStyle
    get() = getTopStyle()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.layout.BorderStroke.rightStyle: javafx.scene.layout.BorderStrokeStyle
    get() = getRightStyle()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.layout.BorderStroke.leftStroke: javafx.scene.paint.Paint
    get() = getLeftStroke()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.layout.BorderStroke.widths: javafx.scene.layout.BorderWidths
    get() = getWidths()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.layout.BorderStroke.bottomStroke: javafx.scene.paint.Paint
    get() = getBottomStroke()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.layout.BorderStroke.rightStroke: javafx.scene.paint.Paint
    get() = getRightStroke()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.layout.BorderStroke.bottomStyle: javafx.scene.layout.BorderStrokeStyle
    get() = getBottomStyle()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.layout.BorderStroke.topStroke: javafx.scene.paint.Paint
    get() = getTopStroke()!!


// javafx.animation.PauseTransition

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.animation.PauseTransition.duration: javafx.util.Duration
    get() = getDuration()!!
    set(v) = setDuration(v)

// javafx.scene.effect.InnerShadow

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.InnerShadow.color: javafx.scene.paint.Color
    get() = getColor()!!
    set(v) = setColor(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.InnerShadow.input: javafx.scene.effect.Effect
    get() = getInput()!!
    set(v) = setInput(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.InnerShadow.radius: Double
    get() = getRadius()!!
    set(v) = setRadius(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.InnerShadow.width: Double
    get() = getWidth()!!
    set(v) = setWidth(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.InnerShadow.height: Double
    get() = getHeight()!!
    set(v) = setHeight(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.InnerShadow.choke: Double
    get() = getChoke()!!
    set(v) = setChoke(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.InnerShadow.blurType: javafx.scene.effect.BlurType
    get() = getBlurType()!!
    set(v) = setBlurType(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.InnerShadow.offsetY: Double
    get() = getOffsetY()!!
    set(v) = setOffsetY(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.InnerShadow.offsetX: Double
    get() = getOffsetX()!!
    set(v) = setOffsetX(v)

// javafx.animation.FillTransition

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.animation.FillTransition.duration: javafx.util.Duration
    get() = getDuration()!!
    set(v) = setDuration(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.animation.FillTransition.fromValue: javafx.scene.paint.Color
    get() = getFromValue()!!
    set(v) = setFromValue(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.animation.FillTransition.toValue: javafx.scene.paint.Color
    get() = getToValue()!!
    set(v) = setToValue(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.animation.FillTransition.shape: javafx.scene.shape.Shape
    get() = getShape()!!
    set(v) = setShape(v)

// javafx.scene.media.AudioEqualizer

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.media.AudioEqualizer.bands: javafx.collections.ObservableList<javafx.scene.media.EqualizerBand>
    get() = getBands()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.media.AudioEqualizer.enabled: Boolean
    get() = enabledProperty()!!.get()!!
    set(v) = setEnabled(v)

// javafx.scene.canvas.GraphicsContext

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.canvas.GraphicsContext.fill: javafx.scene.paint.Paint
    get() = getFill()!!
    set(v) = setFill(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.canvas.GraphicsContext.pixelWriter: javafx.scene.image.PixelWriter
    get() = getPixelWriter()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.canvas.GraphicsContext.font: javafx.scene.text.Font
    get() = getFont()!!
    set(v) = setFont(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.canvas.GraphicsContext.stroke: javafx.scene.paint.Paint
    get() = getStroke()!!
    set(v) = setStroke(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.canvas.GraphicsContext.transform: javafx.scene.transform.Affine
    get() = getTransform()!!
    set(v) = setTransform(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.canvas.GraphicsContext.lineCap: javafx.scene.shape.StrokeLineCap
    get() = getLineCap()!!
    set(v) = setLineCap(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.canvas.GraphicsContext.miterLimit: Double
    get() = getMiterLimit()!!
    set(v) = setMiterLimit(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.canvas.GraphicsContext.lineJoin: javafx.scene.shape.StrokeLineJoin
    get() = getLineJoin()!!
    set(v) = setLineJoin(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.canvas.GraphicsContext.fontSmoothingType: javafx.scene.text.FontSmoothingType
    get() = getFontSmoothingType()!!
    set(v) = setFontSmoothingType(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.canvas.GraphicsContext.globalBlendMode: javafx.scene.effect.BlendMode
    get() = getGlobalBlendMode()!!
    set(v) = setGlobalBlendMode(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.canvas.GraphicsContext.lineDashOffset: Double
    get() = getLineDashOffset()!!
    set(v) = setLineDashOffset(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.canvas.GraphicsContext.canvas: javafx.scene.canvas.Canvas
    get() = getCanvas()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.canvas.GraphicsContext.lineWidth: Double
    get() = getLineWidth()!!
    set(v) = setLineWidth(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.canvas.GraphicsContext.fillRule: javafx.scene.shape.FillRule
    get() = getFillRule()!!
    set(v) = setFillRule(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.canvas.GraphicsContext.globalAlpha: Double
    get() = getGlobalAlpha()!!
    set(v) = setGlobalAlpha(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.canvas.GraphicsContext.lineDashes: DoubleArray
    get() = getLineDashes()!!
    set(v) = setLineDashes(*v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.canvas.GraphicsContext.textAlign: javafx.scene.text.TextAlignment
    get() = getTextAlign()!!
    set(v) = setTextAlign(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.canvas.GraphicsContext.textBaseline: javafx.geometry.VPos
    get() = getTextBaseline()!!
    set(v) = setTextBaseline(v)

// javafx.beans.binding.SetExpression

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <E> javafx.beans.binding.SetExpression<E>.value: javafx.collections.ObservableSet<E>
    get() = getValue()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <E> javafx.beans.binding.SetExpression<E>.size: Int
    get() = getSize()!!


// javafx.scene.control.cell.TreeItemPropertyValueFactory

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <S, T> javafx.scene.control.cell.TreeItemPropertyValueFactory<S, T>.property: String
    get() = getProperty()!!


// javafx.scene.control.TablePosition

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <S, T> javafx.scene.control.TablePosition<S, T>.column: Int
    get() = getColumn()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <S, T> javafx.scene.control.TablePosition<S, T>.tableView: javafx.scene.control.TableView<S>
    get() = getTableView()!!


// javafx.beans.binding.DoubleExpression

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.beans.binding.DoubleExpression.value: Any
    get() = getValue()!!


// javafx.print.PageRange

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.print.PageRange.startPage: Int
    get() = getStartPage()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.print.PageRange.endPage: Int
    get() = getEndPage()!!


// javafx.beans.property.SimpleStringProperty

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.beans.property.SimpleStringProperty.name: String
    get() = getName()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.beans.property.SimpleStringProperty.bean: Any
    get() = getBean()!!


// javafx.beans.property.ReadOnlyObjectWrapper

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <T> javafx.beans.property.ReadOnlyObjectWrapper<T>.readOnlyProperty: javafx.beans.property.ReadOnlyObjectProperty<T>
    get() = getReadOnlyProperty()!!


// javafx.scene.transform.Affine

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.transform.Affine.myx: Double
    get() = getMyx()!!
    set(v) = setMyx(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.transform.Affine.myz: Double
    get() = getMyz()!!
    set(v) = setMyz(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.transform.Affine.mzx: Double
    get() = getMzx()!!
    set(v) = setMzx(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.transform.Affine.mzy: Double
    get() = getMzy()!!
    set(v) = setMzy(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.transform.Affine.mxx: Double
    get() = getMxx()!!
    set(v) = setMxx(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.transform.Affine.mxy: Double
    get() = getMxy()!!
    set(v) = setMxy(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.transform.Affine.myy: Double
    get() = getMyy()!!
    set(v) = setMyy(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.transform.Affine.mzz: Double
    get() = getMzz()!!
    set(v) = setMzz(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.transform.Affine.tz: Double
    get() = getTz()!!
    set(v) = setTz(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.transform.Affine.tx: Double
    get() = getTx()!!
    set(v) = setTx(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.transform.Affine.ty: Double
    get() = getTy()!!
    set(v) = setTy(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.transform.Affine.mxz: Double
    get() = getMxz()!!
    set(v) = setMxz(v)

// javafx.scene.effect.Light.Distant

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.Light.Distant.azimuth: Double
    get() = getAzimuth()!!
    set(v) = setAzimuth(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.Light.Distant.elevation: Double
    get() = getElevation()!!
    set(v) = setElevation(v)

// javafx.scene.control.ToggleGroup

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.control.ToggleGroup.properties: javafx.collections.ObservableMap<Any, Any>
    get() = getProperties()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.control.ToggleGroup.userData: Any
    get() = getUserData()!!
    set(v) = setUserData(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.control.ToggleGroup.selectedToggle: javafx.scene.control.Toggle
    get() = getSelectedToggle()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.control.ToggleGroup.toggles: javafx.collections.ObservableList<javafx.scene.control.Toggle>
    get() = getToggles()!!


// javafx.scene.layout.CornerRadii

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.layout.CornerRadii.topLeftHorizontalRadius: Double
    get() = getTopLeftHorizontalRadius()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.layout.CornerRadii.bottomLeftVerticalRadius: Double
    get() = getBottomLeftVerticalRadius()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.layout.CornerRadii.bottomLeftHorizontalRadius: Double
    get() = getBottomLeftHorizontalRadius()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.layout.CornerRadii.topRightVerticalRadius: Double
    get() = getTopRightVerticalRadius()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.layout.CornerRadii.topLeftVerticalRadius: Double
    get() = getTopLeftVerticalRadius()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.layout.CornerRadii.topRightHorizontalRadius: Double
    get() = getTopRightHorizontalRadius()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.layout.CornerRadii.bottomRightHorizontalRadius: Double
    get() = getBottomRightHorizontalRadius()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.layout.CornerRadii.bottomRightVerticalRadius: Double
    get() = getBottomRightVerticalRadius()!!


// javafx.scene.effect.Light.Spot

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.Light.Spot.pointsAtX: Double
    get() = getPointsAtX()!!
    set(v) = setPointsAtX(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.Light.Spot.pointsAtY: Double
    get() = getPointsAtY()!!
    set(v) = setPointsAtY(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.Light.Spot.pointsAtZ: Double
    get() = getPointsAtZ()!!
    set(v) = setPointsAtZ(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.Light.Spot.specularExponent: Double
    get() = getSpecularExponent()!!
    set(v) = setSpecularExponent(v)

// javafx.scene.effect.Blend

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.Blend.opacity: Double
    get() = getOpacity()!!
    set(v) = setOpacity(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.Blend.topInput: javafx.scene.effect.Effect
    get() = getTopInput()!!
    set(v) = setTopInput(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.Blend.bottomInput: javafx.scene.effect.Effect
    get() = getBottomInput()!!
    set(v) = setBottomInput(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.Blend.mode: javafx.scene.effect.BlendMode
    get() = getMode()!!
    set(v) = setMode(v)

// javafx.scene.input.KeyCodeCombination

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.input.KeyCodeCombination.name: String
    get() = getName()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.input.KeyCodeCombination.code: javafx.scene.input.KeyCode
    get() = getCode()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.input.KeyCodeCombination.displayText: String
    get() = getDisplayText()!!


// javafx.scene.input.PickResult

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.input.PickResult.intersectedNode: javafx.scene.Node
    get() = getIntersectedNode()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.input.PickResult.intersectedDistance: Double
    get() = getIntersectedDistance()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.input.PickResult.intersectedNormal: javafx.geometry.Point3D
    get() = getIntersectedNormal()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.input.PickResult.intersectedTexCoord: javafx.geometry.Point2D
    get() = getIntersectedTexCoord()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.input.PickResult.intersectedFace: Int
    get() = getIntersectedFace()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.input.PickResult.intersectedPoint: javafx.geometry.Point3D
    get() = getIntersectedPoint()!!


// javafx.scene.layout.RowConstraints

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.layout.RowConstraints.maxHeight: Double
    get() = getMaxHeight()!!
    set(v) = setMaxHeight(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.layout.RowConstraints.minHeight: Double
    get() = getMinHeight()!!
    set(v) = setMinHeight(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.layout.RowConstraints.prefHeight: Double
    get() = getPrefHeight()!!
    set(v) = setPrefHeight(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.layout.RowConstraints.vgrow: javafx.scene.layout.Priority
    get() = getVgrow()!!
    set(v) = setVgrow(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.layout.RowConstraints.percentHeight: Double
    get() = getPercentHeight()!!
    set(v) = setPercentHeight(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.layout.RowConstraints.valignment: javafx.geometry.VPos
    get() = getValignment()!!
    set(v) = setValignment(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.layout.RowConstraints.fillHeight: Boolean
    get() = fillHeightProperty()!!.get()!!
    set(v) = setFillHeight(v)

// javafx.application.Preloader.ErrorNotification

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.application.Preloader.ErrorNotification.cause: Throwable
    get() = getCause()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.application.Preloader.ErrorNotification.location: String
    get() = getLocation()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.application.Preloader.ErrorNotification.details: String
    get() = getDetails()!!


// javafx.scene.media.Media

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.media.Media.metadata: javafx.collections.ObservableMap<String, Any>
    get() = getMetadata()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.media.Media.markers: javafx.collections.ObservableMap<String, javafx.util.Duration>
    get() = getMarkers()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.media.Media.width: Int
    get() = getWidth()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.media.Media.height: Int
    get() = getHeight()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.media.Media.onError: Runnable
    get() = getOnError()!!
    set(v) = setOnError(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.media.Media.error: javafx.scene.media.MediaException
    get() = getError()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.media.Media.source: String
    get() = getSource()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.media.Media.duration: javafx.util.Duration
    get() = getDuration()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.media.Media.tracks: javafx.collections.ObservableList<javafx.scene.media.Track>
    get() = getTracks()!!


// javafx.beans.binding.LongBinding

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.beans.binding.LongBinding.value: Any
    get() = getValue()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.beans.binding.LongBinding.dependencies: javafx.collections.ObservableList<*>
    get() = getDependencies()!!


// javafx.scene.control.IndexRange

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.control.IndexRange.length: Int
    get() = getLength()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.control.IndexRange.start: Int
    get() = getStart()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.control.IndexRange.end: Int
    get() = getEnd()!!


// javafx.css.StyleableDoubleProperty

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.css.StyleableDoubleProperty.styleOrigin: javafx.css.StyleOrigin
    get() = getStyleOrigin()!!


// javafx.print.Paper

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.print.Paper.name: String
    get() = getName()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.print.Paper.width: Double
    get() = getWidth()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.print.Paper.height: Double
    get() = getHeight()!!


// javafx.scene.control.ResizeFeaturesBase

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <S> javafx.scene.control.ResizeFeaturesBase<S>.delta: Double
    get() = getDelta()!!


// javafx.print.Printer

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.print.Printer.name: String
    get() = getName()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.print.Printer.printerAttributes: javafx.print.PrinterAttributes
    get() = getPrinterAttributes()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.print.Printer.defaultPageLayout: javafx.print.PageLayout
    get() = getDefaultPageLayout()!!


// javafx.scene.effect.Reflection

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.Reflection.input: javafx.scene.effect.Effect
    get() = getInput()!!
    set(v) = setInput(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.Reflection.bottomOpacity: Double
    get() = getBottomOpacity()!!
    set(v) = setBottomOpacity(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.Reflection.topOpacity: Double
    get() = getTopOpacity()!!
    set(v) = setTopOpacity(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.Reflection.fraction: Double
    get() = getFraction()!!
    set(v) = setFraction(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.Reflection.topOffset: Double
    get() = getTopOffset()!!
    set(v) = setTopOffset(v)

// javafx.css.SimpleStyleableLongProperty

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.css.SimpleStyleableLongProperty.name: String
    get() = getName()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.css.SimpleStyleableLongProperty.bean: Any
    get() = getBean()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.css.SimpleStyleableLongProperty.cssMetaData: javafx.css.CssMetaData<out javafx.css.Styleable?, Number>
    get() = getCssMetaData()!!


// javafx.scene.shape.PathElement

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.shape.PathElement.absolute: Boolean
    get() = absoluteProperty()!!.get()!!
    set(v) = setAbsolute(v)

// javafx.scene.control.SplitPane.Divider

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.control.SplitPane.Divider.position: Double
    get() = getPosition()!!
    set(v) = setPosition(v)

// javafx.css.StyleableFloatProperty

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.css.StyleableFloatProperty.styleOrigin: javafx.css.StyleOrigin
    get() = getStyleOrigin()!!


// javafx.scene.media.Track

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.media.Track.name: String
    get() = getName()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.media.Track.locale: java.util.Locale
    get() = getLocale()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.media.Track.metadata: MutableMap<String, Any>
    get() = getMetadata()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.media.Track.trackID: Long
    get() = getTrackID()!!


// javafx.scene.input.DataFormat

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.input.DataFormat.identifiers: MutableSet<String>
    get() = getIdentifiers()!!


// javafx.beans.property.ReadOnlyBooleanWrapper

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.beans.property.ReadOnlyBooleanWrapper.readOnlyProperty: javafx.beans.property.ReadOnlyBooleanProperty
    get() = getReadOnlyProperty()!!


// javafx.beans.binding.ObjectBinding

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <T> javafx.beans.binding.ObjectBinding<T>.dependencies: javafx.collections.ObservableList<*>
    get() = getDependencies()!!


// javafx.util.Pair

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <K, V> javafx.util.Pair<K, V>.value: V
    get() = getValue()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <K, V> javafx.util.Pair<K, V>.key: K
    get() = getKey()!!


// javafx.beans.property.ReadOnlyLongWrapper

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.beans.property.ReadOnlyLongWrapper.readOnlyProperty: javafx.beans.property.ReadOnlyLongProperty
    get() = getReadOnlyProperty()!!


// javafx.beans.property.SimpleDoubleProperty

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.beans.property.SimpleDoubleProperty.name: String
    get() = getName()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.beans.property.SimpleDoubleProperty.bean: Any
    get() = getBean()!!


// javafx.scene.media.AudioClip

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.media.AudioClip.priority: Int
    get() = getPriority()!!
    set(v) = setPriority(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.media.AudioClip.balance: Double
    get() = getBalance()!!
    set(v) = setBalance(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.media.AudioClip.volume: Double
    get() = getVolume()!!
    set(v) = setVolume(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.media.AudioClip.pan: Double
    get() = getPan()!!
    set(v) = setPan(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.media.AudioClip.rate: Double
    get() = getRate()!!
    set(v) = setRate(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.media.AudioClip.source: String
    get() = getSource()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.media.AudioClip.cycleCount: Int
    get() = getCycleCount()!!
    set(v) = setCycleCount(v)

// javafx.scene.shape.HLineTo

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.shape.HLineTo.x: Double
    get() = getX()!!
    set(v) = setX(v)

// javafx.css.ParsedValue

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <V, T> javafx.css.ParsedValue<V, T>.value: V
    get() = getValue()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <V, T> javafx.css.ParsedValue<V, T>.converter: javafx.css.StyleConverter<V, T>
    get() = getConverter()!!


// javafx.scene.effect.Lighting

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.Lighting.contentInput: javafx.scene.effect.Effect
    get() = getContentInput()!!
    set(v) = setContentInput(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.Lighting.specularExponent: Double
    get() = getSpecularExponent()!!
    set(v) = setSpecularExponent(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.Lighting.specularConstant: Double
    get() = getSpecularConstant()!!
    set(v) = setSpecularConstant(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.Lighting.diffuseConstant: Double
    get() = getDiffuseConstant()!!
    set(v) = setDiffuseConstant(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.Lighting.light: javafx.scene.effect.Light
    get() = getLight()!!
    set(v) = setLight(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.Lighting.bumpInput: javafx.scene.effect.Effect
    get() = getBumpInput()!!
    set(v) = setBumpInput(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.Lighting.surfaceScale: Double
    get() = getSurfaceScale()!!
    set(v) = setSurfaceScale(v)

// javafx.concurrent.Worker

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <V> javafx.concurrent.Worker<V>.value: V
    get() = getValue()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <V> javafx.concurrent.Worker<V>.message: String
    get() = getMessage()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <V> javafx.concurrent.Worker<V>.exception: Throwable
    get() = getException()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <V> javafx.concurrent.Worker<V>.state: javafx.concurrent.Worker.State
    get() = getState()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <V> javafx.concurrent.Worker<V>.totalWork: Double
    get() = getTotalWork()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <V> javafx.concurrent.Worker<V>.workDone: Double
    get() = getWorkDone()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <V> javafx.concurrent.Worker<V>.progress: Double
    get() = getProgress()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <V> javafx.concurrent.Worker<V>.title: String
    get() = getTitle()!!


// javafx.beans.property.SimpleLongProperty

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.beans.property.SimpleLongProperty.name: String
    get() = getName()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.beans.property.SimpleLongProperty.bean: Any
    get() = getBean()!!


// javafx.scene.chart.PieChart.Data

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.chart.PieChart.Data.name: String
    get() = getName()!!
    set(v) = setName(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.chart.PieChart.Data.node: javafx.scene.Node
    get() = getNode()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.chart.PieChart.Data.chart: javafx.scene.chart.PieChart
    get() = getChart()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.chart.PieChart.Data.pieValue: Double
    get() = getPieValue()!!
    set(v) = setPieValue(v)

// javafx.scene.media.AudioTrack

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.media.AudioTrack.language: String
    get() = getLanguage()!!


// javafx.beans.binding.IntegerBinding

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.beans.binding.IntegerBinding.value: Any
    get() = getValue()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.beans.binding.IntegerBinding.dependencies: javafx.collections.ObservableList<*>
    get() = getDependencies()!!


// javafx.scene.layout.ColumnConstraints

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.layout.ColumnConstraints.percentWidth: Double
    get() = getPercentWidth()!!
    set(v) = setPercentWidth(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.layout.ColumnConstraints.halignment: javafx.geometry.HPos
    get() = getHalignment()!!
    set(v) = setHalignment(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.layout.ColumnConstraints.hgrow: javafx.scene.layout.Priority
    get() = getHgrow()!!
    set(v) = setHgrow(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.layout.ColumnConstraints.maxWidth: Double
    get() = getMaxWidth()!!
    set(v) = setMaxWidth(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.layout.ColumnConstraints.prefWidth: Double
    get() = getPrefWidth()!!
    set(v) = setPrefWidth(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.layout.ColumnConstraints.fillWidth: Boolean
    get() = fillWidthProperty()!!.get()!!
    set(v) = setFillWidth(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.layout.ColumnConstraints.minWidth: Double
    get() = getMinWidth()!!
    set(v) = setMinWidth(v)

// javafx.beans.property.SimpleObjectProperty

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <T> javafx.beans.property.SimpleObjectProperty<T>.name: String
    get() = getName()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <T> javafx.beans.property.SimpleObjectProperty<T>.bean: Any
    get() = getBean()!!


// javafx.print.PaperSource

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.print.PaperSource.name: String
    get() = getName()!!


// javafx.scene.effect.Glow

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.Glow.input: javafx.scene.effect.Effect
    get() = getInput()!!
    set(v) = setInput(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.Glow.level: Double
    get() = getLevel()!!
    set(v) = setLevel(v)

// javafx.beans.property.ReadOnlyFloatWrapper

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.beans.property.ReadOnlyFloatWrapper.readOnlyProperty: javafx.beans.property.ReadOnlyFloatProperty
    get() = getReadOnlyProperty()!!


// javafx.scene.shape.LineTo

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.shape.LineTo.x: Double
    get() = getX()!!
    set(v) = setX(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.shape.LineTo.y: Double
    get() = getY()!!
    set(v) = setY(v)

// javafx.scene.control.TextFormatter

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var <V> javafx.scene.control.TextFormatter<V>.value: V
    get() = getValue()!!
    set(v) = setValue(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <V> javafx.scene.control.TextFormatter<V>.valueConverter: javafx.util.StringConverter<V>
    get() = getValueConverter()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <V> javafx.scene.control.TextFormatter<V>.filter: java.util.function.UnaryOperator<javafx.scene.control.TextFormatter.Change>
    get() = getFilter()!!


// javafx.geometry.Point3D

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.geometry.Point3D.z: Double
    get() = getZ()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.geometry.Point3D.y: Double
    get() = getY()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.geometry.Point3D.x: Double
    get() = getX()!!


// javafx.scene.control.TreeTableColumn.CellDataFeatures

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <S, T> javafx.scene.control.TreeTableColumn.CellDataFeatures<S, T>.value: javafx.scene.control.TreeItem<S>
    get() = getValue()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <S, T> javafx.scene.control.TreeTableColumn.CellDataFeatures<S, T>.treeTableView: javafx.scene.control.TreeTableView<S>
    get() = getTreeTableView()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <S, T> javafx.scene.control.TreeTableColumn.CellDataFeatures<S, T>.treeTableColumn: javafx.scene.control.TreeTableColumn<S, T>
    get() = getTreeTableColumn()!!


// javafx.scene.layout.BackgroundPosition

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.layout.BackgroundPosition.verticalPosition: Double
    get() = getVerticalPosition()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.layout.BackgroundPosition.horizontalPosition: Double
    get() = getHorizontalPosition()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.layout.BackgroundPosition.horizontalSide: javafx.geometry.Side
    get() = getHorizontalSide()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.layout.BackgroundPosition.verticalSide: javafx.geometry.Side
    get() = getVerticalSide()!!


// javafx.scene.effect.ImageInput

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.ImageInput.source: javafx.scene.image.Image
    get() = getSource()!!
    set(v) = setSource(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.ImageInput.x: Double
    get() = getX()!!
    set(v) = setX(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.effect.ImageInput.y: Double
    get() = getY()!!
    set(v) = setY(v)

// javafx.collections.SetChangeListener.Change

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <E> javafx.collections.SetChangeListener.Change<E>.elementRemoved: E
    get() = getElementRemoved()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <E> javafx.collections.SetChangeListener.Change<E>.elementAdded: E
    get() = getElementAdded()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val <E> javafx.collections.SetChangeListener.Change<E>.set: javafx.collections.ObservableSet<E>
    get() = getSet()!!


// javafx.scene.paint.PhongMaterial

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.paint.PhongMaterial.selfIlluminationMap: javafx.scene.image.Image
    get() = getSelfIlluminationMap()!!
    set(v) = setSelfIlluminationMap(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.paint.PhongMaterial.specularMap: javafx.scene.image.Image
    get() = getSpecularMap()!!
    set(v) = setSpecularMap(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.paint.PhongMaterial.specularPower: Double
    get() = getSpecularPower()!!
    set(v) = setSpecularPower(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.paint.PhongMaterial.diffuseMap: javafx.scene.image.Image
    get() = getDiffuseMap()!!
    set(v) = setDiffuseMap(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.paint.PhongMaterial.diffuseColor: javafx.scene.paint.Color
    get() = getDiffuseColor()!!
    set(v) = setDiffuseColor(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.paint.PhongMaterial.specularColor: javafx.scene.paint.Color
    get() = getSpecularColor()!!
    set(v) = setSpecularColor(v)

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public var  javafx.scene.paint.PhongMaterial.bumpMap: javafx.scene.image.Image
    get() = getBumpMap()!!
    set(v) = setBumpMap(v)

// javafx.application.Application.Parameters

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.application.Application.Parameters.unnamed: MutableList<String>
    get() = getUnnamed()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.application.Application.Parameters.raw: MutableList<String>
    get() = getRaw()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.application.Application.Parameters.named: MutableMap<String, String>
    get() = getNamed()!!


// javafx.scene.shape.VertexFormat

@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.shape.VertexFormat.pointIndexOffset: Int
    get() = getPointIndexOffset()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.shape.VertexFormat.vertexIndexSize: Int
    get() = getVertexIndexSize()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.shape.VertexFormat.texCoordIndexOffset: Int
    get() = getTexCoordIndexOffset()!!


@suppress("UNNECESSARY_NOT_NULL_ASSERTION")
public val  javafx.scene.shape.VertexFormat.normalIndexOffset: Int
    get() = getNormalIndexOffset()!!

