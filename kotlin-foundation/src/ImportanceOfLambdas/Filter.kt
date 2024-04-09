package ImportanceOfLambdas

fun main() {
    val list = listOf(1, 2, 3, 4)
    val even = list.filter { it % 2 == 0 }
    val greaterThen2 = list.filter { it > 2 }
    println("EVEN: $even")
    println("GreaterThen 2: $greaterThen2")
}