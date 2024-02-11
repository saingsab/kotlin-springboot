package classes

class Person(
    val name: String = "", //Still possible of default value
    val age: Int = 0
) {
    var email: String = ""

    constructor(
        _email: String,
        _name: String = "",
        _age: Int = 0
    ): this(_name, _age) {
        email = _email
    }
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

    val person2 = Person(_email = "abc@gmail.com", _name = "BAyoung", 32)
    println("Name: ${person2.name} and the age is ${person2.age} and the email is ${person2.email}")
}