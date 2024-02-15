package Cast

fun castNumber(any: Double) {

    when(any) {
        any as Double -> println("Value is Double")
    }

    when(any) {
        any as Double -> println("Value is Double")
    }
}

fun main() {

    castNumber(1.0)
//    castNumber(1)
}