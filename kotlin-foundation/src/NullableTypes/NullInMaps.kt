package NullableTypes

fun main() {
    val map = mapOf(0 to "yes", 1 to "no")
    map[2] // null
    println(map)
}