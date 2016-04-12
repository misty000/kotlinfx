package kotlinfx.kalium

import javafx.beans.property.*
import javafx.beans.value.ObservableValue
import javafx.beans.value.WritableValue


private var enclosing: Pair<Any, String>? = null
private val calcMap: MutableMap<Pair<Any, String>, () -> Unit> = hashMapOf()

// To not set redundant listeners
private var isConstruction = false
private val listenerMap: MutableMap<Pair<Any, String>, MutableSet<Any>> = hashMapOf()


class V<T>(private var value: T) {
    val callbacks: MutableList<() -> Unit> = arrayListOf()

    operator fun invoke(): T {
        val _enclosing = enclosing
        if (_enclosing != null &&
                (isConstruction || !listenerMap.containsKey(_enclosing) || !listenerMap[_enclosing]!!.contains(this))) {
            val e = _enclosing
            listenerMap.getOrPut(e) { hashSetOf() }.add(this)
            callbacks.add { calcMap[e]!!() }
        }
        return value
    }

    infix fun u(newValue: T) {
        value = newValue
        for (callback in callbacks) {
            callback()
        }
    }
}

class K<T>(private val calc: () -> T) {
    init {
        val e = Pair(this, "K")
        calcMap.put(e, {})
        isConstruction = true; enclosing = e; calc(); enclosing = null; isConstruction = false
    }

    val callbacks: MutableList<() -> Unit> = arrayListOf()

    operator fun invoke(): T {
        val _enclosing = enclosing
        if (_enclosing != null &&
                (isConstruction || !listenerMap.containsKey(_enclosing) || !listenerMap[_enclosing]!!.contains(this))) {
            val e = _enclosing
            listenerMap.getOrPut(e) { hashSetOf() }.add(this)
            callbacks.add { calcMap[e]!!() }
        }
        return calc()
    }
}


fun <T> template(name: String, f: (() -> T)?, thiz: Any, property: ObservableValue<T>): T {
    if (f == null) {
        val _enclosing = enclosing
        if (_enclosing != null &&
                (isConstruction || !listenerMap.containsKey(_enclosing) || !listenerMap[_enclosing]!!.contains(thiz))) {
            val e = _enclosing
            listenerMap.getOrPut(e) { hashSetOf() }.add(thiz)
            property.addListener { v: Any?, o: Any?, n: Any? -> calcMap[e]!!() }
        }
    } else {
        if (property is WritableValue<*>) {
            @Suppress("UNCHECKED_CAST", "NAME_SHADOWING")
            val property = property as WritableValue<T>
            val e = Pair(thiz, name)
            val g = { enclosing = e; property.value = f(); enclosing = null }
            calcMap.put(e, g)
            isConstruction = true; g(); isConstruction = false
        }
    }
    return property.value!!
}

/*
 * experimental
 */
fun BooleanProperty.bind(f: () -> Boolean) {
    template("value", f, this, this)
}

fun DoubleProperty.bind(f: () -> Double) {
    template("value", f, this, this)
}

fun FloatProperty.bind(f: () -> Float) {
    template("value", f, this, this)
}

fun LongProperty.bind(f: () -> Long) {
    template("value", f, this, this)
}

fun IntegerProperty.bind(f: () -> Int) {
    template("value", f, this, this)
}

fun <T> ObjectProperty<T>.bind(f: () -> T) {
    template("value", f, this, this)
}

fun listen(f: () -> Unit) {
    val obs = SimpleObjectProperty<Any>()
    template("listen", f, obs, obs)
}