package Enumerations
import Enumerations.Size.*
enum class Size {
    Tiny, Small, Medium, Large, Huge, Gigantic
}

fun main() {
    println(Gigantic)

//    make a list
    println(Size.values().toList())
}