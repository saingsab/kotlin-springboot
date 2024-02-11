package Functions

import java.time.LocalDate

fun printName(name: String) {
    println("Name is $name")
}

fun addition(x: Int, y: Int): Int {
    return x + y
}

fun additionNewApprouch(x: Int, y: Int) = x + y

//default value
fun printPersonDetails(
    name: String,
    email: String = "",
    dob: LocalDate = LocalDate.now()
) {
    println("Name is $name, email is $email, dob is $dob")
}
fun main() {
    printName("Ayoung")
    
    val result = addition(1, 2)
    println("Result is : $result")

    val newResult = additionNewApprouch(2, 3);
    println("New Approuch result: $newResult")

//    past value
    printPersonDetails("Ayoung", "abc@gmail.com", LocalDate.parse("2000-10-10"))
    printPersonDetails("Ayoung001")

}

