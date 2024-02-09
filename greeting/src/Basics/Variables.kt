package Basics

fun main() {
    val name: String = "Ayoung"
    println(name)

    var age: Int = 34
    println(age)

    age = 35
    println(age)

    val salary = 3000L
    println(salary)

//    String Imp
    val course = "Kotlin Spring"
    println("course: $course and the course length is ${course.length}")

    val multiline = "ABC \n CDE"
    println(multiline)

    val multiline1 = """
        ABC
        CDE
    """.trimIndent()
    println(multiline1)
}
