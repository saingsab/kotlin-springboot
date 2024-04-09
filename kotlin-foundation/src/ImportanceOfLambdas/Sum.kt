package ImportanceOfLambdas

fun main() {
    val list = listOf(1, 5, 7, 10)
    val divider= 5
    println(list.filter { it % divider == 0 }
        .sum())
}