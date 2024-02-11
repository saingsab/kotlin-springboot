package classes

class Person(
    val name: String = "", //Still possible of default value
    val age: Int = 0
) {
    fun action() {
        println("Person Walks")
    }
}

fun main() {
    val person = Person("Ayoung", 33)
    person.action()
    println("Name: ${person.name} and the age is ${person.age}")

//    init default contructor
    val person1 = Person()
    println("Name: ${person1.name} and the age is ${person1.age}")
}