package Destructuring

data class Tuple(
    val i: Int,
    val d: Double,
    val s: String,
    val b: Boolean,
    val l: List<Int>
)
fun main() {
    val tuple = Tuple(
        1, 3.14, "Mouse", false, listOf())

    val (_, _, animal) = tuple
    println(animal)
}