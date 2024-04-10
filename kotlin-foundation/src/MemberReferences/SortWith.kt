package MemberReferences
import MemberReferences.Message

fun main() {
    val message =  listOf(
        Message("Kitty", "Hey!", true),
        Message("Kitty", "Where are you?", false),
        Message("Boss", "Meeting today", false))

    println(message.sortedWith(compareBy(
        Message::isRead, Message::sender)))
}