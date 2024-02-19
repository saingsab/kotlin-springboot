package DataClasses

data class DetailedContact(
    val name: String,
    val surname: String,
    val number: String,
    val address: String
)

fun main() {
    val contact = DetailedContact(
        "Ayoung",
        "Saing",
        "010299109",
        "BKK, Phnom Penh, Cambodia"
    )

    val newContact = contact.copy(
        number = "102020202",
        address = "TK, Phnom Penh, Cambodia"
    )
}