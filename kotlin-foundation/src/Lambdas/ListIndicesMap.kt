package Lambdas

//Note that Underscore.kt can be rewritten using list.indices
fun main() {
    val list = listOf('a', 'b', 'c')
    println(list.indices.map {
        "[$it]"
    })
}