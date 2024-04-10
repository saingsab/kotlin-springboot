package MemberReferences

fun ignore(message: Messages) =
    !message.isImportant() &&
            message.sender in setOf("Boos", "Mom")

fun main() {
    val text = "Let's discuss goals " +
            "for the next year"
    val msgs = listOf(
        Messages("Boss", text, false, listOf()),
        Messages("Boss", text, false, listOf(
            Attachment("image", "cute cats")
        ))
    )

    println(msgs.filter(::ignore).size)
    println(msgs.filterNot(::ignore).size)
}