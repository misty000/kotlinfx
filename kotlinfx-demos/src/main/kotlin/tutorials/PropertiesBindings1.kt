// http://docs.oracle.com/javafx/2/binding/jfxpub-binding.htm
package demos.tutorials.propertiesbindings1

import javafx.beans.property.SimpleIntegerProperty
import kotlinfx.abbreviations.v
import kotlinfx.bindings.plus

fun main(args: Array<String>) {
    val num1 = SimpleIntegerProperty(1)
    val num2 = SimpleIntegerProperty(2)
    val sum = num1 + num2
    println(sum.v)
    num1.set(2)
    println(sum.v)
}


