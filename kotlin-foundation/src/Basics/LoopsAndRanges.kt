package Basics

fun main() {
    val range = 1..10
    for (i in range) {
        println("I: $i")
    }

    val range1 = 10 downTo 1
    for (i in range1) {
        println("i: $i")
    }

    for (i in range1 step 2) {
        println("i: $i")
    }
}