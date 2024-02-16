//package WhenExpressions
//
//import sun.util.locale.provider.LocaleResources.trace
//
//class Coordinates {
//    var x: Int = 0
//        set(value) {
//            trace("x gets $value")
//            field = value
//        }
//
//    var y: Int = 0
//        set(value) {
//            trace("y gets $value")
//            field = value
//        }
//
//    override fun toString() = "($x, $y)"
//}
//
//fun processInputs(inputs: List<String>) {
//    val coordinates = Coordinates()
//    for (input in inputs) {
//        when (input) {
//            "up", "u" -> coordinates.y--
//            "down", "d" -> coordinates.y++
//            "left", "l" -> coordinates.x--
//            "right", "r" -> {
//                trace("Moving right")
//                coordinates.x++
//            }
//
//            "nowhere" -> {}
//            "exit" -> return
//            else -> trace("bad input: $input")
//        }
//    }
//}
//
//fun main() {
//    processInputs(listOf("up", "d", "nowhere",
//        "left", "right", "exit", "r"))
//}