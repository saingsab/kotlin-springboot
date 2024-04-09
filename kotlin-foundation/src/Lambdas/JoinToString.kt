package Lambdas

fun main() {
    val list = listOf(9, 11, 23, 32)
    println(list.joinToString("") { "[$it]" })
}