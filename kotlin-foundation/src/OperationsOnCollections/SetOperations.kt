package OperationsOnCollections

fun main() {
    val set = setOf("a", "ab", "ac")
//    2
    println(set.maxByOrNull { it.length }?.length)

//    [ab]
    println(set.filter {
        it.contains('b')
    })
//    [1, 2, 2]
    println(set.map { it.length })
}