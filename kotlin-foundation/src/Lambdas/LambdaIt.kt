package Lambdas

fun main() {
    val list = listOf(1, 2, 3, 4)
    val result = list.map({ "[$it]" })
    println(result)
}