package OperationsOnCollections

fun main() {
    val list = listOf(-3, -1, 5, 7, 10)
    val isPositive = { i: Int -> i > 0}

    println(list.filter(isPositive))
    println(list.filterNot(isPositive))

    val (pos, neg) = list.partition { it > 0 }
    println(pos)
    println(neg)
}