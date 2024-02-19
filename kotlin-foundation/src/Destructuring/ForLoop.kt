package Destructuring

fun main() {
    var result = ""
    val map = mapOf(1 to "one", 2 to "two")
    for ((key, value) in map) {
        result += "$key = $value, "
    }
    println(result)

    result = ""
    val listOfPair =
        listOf(Pair(1, "one"), Pair(2, "two"))
    for((i, s) in listOfPair) {
        result += "($i, $s), "
    }
    println(result)
}