package Lambdas

fun main() {
    val list = listOf('a', 'b', 'c', 'd')
    val result = list.map({"[${it.toUpperCase()}]"})
    println(result)
}