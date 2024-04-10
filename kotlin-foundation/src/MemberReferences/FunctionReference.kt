package MemberReferences

data class Messages(
    val sender: String,
    val text: String,
    val isRead: Boolean,
    val attachments: List<Attachment>
)

data class Attachment(
    val type: String,
    val name: String
)

fun Messages.isImportant(): Boolean =
    text.contains("Salary increase") ||
            attachments.any {
                it.type == "image" &&
                        it.name.contains("cat")
            }

fun main() {
    val messages = listOf(Messages(
        "Boss", "Let's discuss goals " +
        "for next year", false,
        listOf(Attachment("image", "cut cats"))))

    println(messages.any(Messages::isImportant))
}