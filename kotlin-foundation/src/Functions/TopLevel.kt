package Functions
//Top level property
const val courseName = "Kotlin Programming"

//declare top level function
fun TopLevelFunction() : Int {
    return (0..100).random()
}
fun main() {

    val num = TopLevelFunction()
    println(num)
}