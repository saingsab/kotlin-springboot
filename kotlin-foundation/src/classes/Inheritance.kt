package classes

open class User(val name: String) {
    open var isLoggedIn: Boolean = false
    open fun login() {
        println("Inside user Login")
    }
}

class Student(name: String) : User(name) {
    override var isLoggedIn: Boolean = false
    override fun login() {
        println("Inside Student Login")
        super.login()
    }
}

class Instructor(name: String): User(name)

fun main() {
    val student = Student("Sorng")
    println("Student name is: ${student.name}")
    student.login()
    student.isLoggedIn = true

    val instructor = Instructor("Ayoung")
    println("Student name is: ${instructor.name}")
    instructor.login()
}
