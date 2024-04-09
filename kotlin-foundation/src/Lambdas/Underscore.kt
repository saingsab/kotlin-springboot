package Lambdas
/*
* If you aren’t using a particular argument, you can ignore it using an underscore to
    eliminate compiler warnings about unused identifiers:
* */
fun main() {
    val list = listOf('a', 'b', 'c')
    println(list.mapIndexed { index, _ -> "[$index]" })
}