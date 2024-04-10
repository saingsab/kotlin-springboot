package MemberReferences

data class Student(
    val id: Int,
    val name: String
)

fun main() {
    val names = listOf("Alice", "Bob")
    val student =
        names.mapIndexed{index, name ->
            Student(index, name)
        }

//    println(student)
    println(names.mapIndexed(::Student))
}