package WhenExpressions

fun mixColors(first: String, second: String) =
    when (setOf(first, second)) {
        setOf("red", "blue") -> "purple"
        setOf("red", "yellow") -> "orange"
        setOf("blue", "yellow") -> "greeb"
        else -> "unknown"
    }

fun main() {
    println(mixColors("red", "blue"))
    println(mixColors("blue", "red"))
    println(mixColors("blue", "purple"))
}