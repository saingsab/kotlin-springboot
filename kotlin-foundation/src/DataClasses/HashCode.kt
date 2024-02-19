package DataClasses

data class Key(val name: String, val id: Int)

fun main() {
    val korvo: Key = Key("Korvo", 33)
    println(korvo.hashCode())

    val map = HashMap<Key, String>()
    map[korvo] = "Alien"
}