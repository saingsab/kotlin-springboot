package Overloading

fun f(n: Int) = n + 373
fun f() = f(0)

fun main() {
    val f = f()
    println(f)
}