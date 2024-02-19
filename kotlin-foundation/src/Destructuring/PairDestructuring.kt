package Destructuring

import Destructuring.compute

fun main() {
    val (value, description) = compute(7)
    println(value)
    println(description)
}