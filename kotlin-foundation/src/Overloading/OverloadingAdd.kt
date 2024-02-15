package Overloading

fun addInt(i: Int, j: Int) = i + j
fun addDouble(i: Double, j: Double) = i + j

fun add(i: Int, j: Int) = i + j
fun add(i: Double, j: Double) = i + j

fun main() {
    println(addInt(5, 6) == add(5, 6))
    println(addDouble(56.23, 44.77) == add(56.23, 44.77))
}