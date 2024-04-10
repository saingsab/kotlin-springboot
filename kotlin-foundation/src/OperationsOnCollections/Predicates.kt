package OperationsOnCollections

fun main() {
    val list = listOf(-3, -1, 5, 7, 10)

//    3
    println(list.filter { it > 0 })
//    5
    println(list.count {it > 0})

//    5
    println(list.find { it > 0 })
//    -1
    println(list.firstOrNull { it > 0 })
//    true
    println(list.lastOrNull { it < 0})

//    true
    println(list.any { it > 0 })
//    false
    println(list.any { it != 0})

    println(list.all { it > 0 })
    println(list.all { it != 0 })

    println(list.none { it > 0 })
    println(list.none { it == 0 })
}