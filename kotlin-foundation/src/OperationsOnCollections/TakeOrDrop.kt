package OperationsOnCollections

fun main() {
    val list = listOf('a', 'b', 'c', 'X', 'Z')
//  [c, X, Z]
    println(list.takeLast(3))
//  [X, Z]
    println(list.takeLastWhile { it.isUpperCase() })
//  [b, c, X, Z]
    println(list.drop(1))
//  [X, Z]
    println(list.dropWhile { it.isLowerCase() })
}