package MemberReferences

data class Message(
    val sender: String,
    val text: String,
    val isRead: Boolean
)

fun main() {
    val message =  listOf(
        Message("Kitty", "Hey!", true),
        Message("Kitty", "Where are you?", false))
    val unread = message.filterNot(Message::isRead)

//    1
    println(unread.size)
//    Where are you?
    println(unread.single().text)
}