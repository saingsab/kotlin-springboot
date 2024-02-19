package Destructuring

fun main() {
    val list = listOf('a', 'b', 'c')
    for((index, value) in list.withIndex()) {
        println("$index:$value")
    }
}