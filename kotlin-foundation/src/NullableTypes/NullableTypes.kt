package NullableTypes

fun main() {
    val s1 = "abc"
//Compile-time Error:
//    val s2: String = null

val s3: String? = null
val s4: String? = s1

}

