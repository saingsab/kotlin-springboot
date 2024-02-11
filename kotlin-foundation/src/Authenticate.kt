object Authenticate {
    fun authenticate(userName: String, password: String) {
        println("User authenticated for userName: $userName")
    }
}

fun main() {
    Authenticate.authenticate("Ayoung", "abc")
}