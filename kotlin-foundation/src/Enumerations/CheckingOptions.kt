package Enumerations

import Enumerations.level.*
//import Enumerations.Level

fun checkLevel(level: level) {
    when(level) {
        Overflow -> ">>> Overflow!"
        Empty -> "Alert: Empty"
        else -> "Level ${level} OK"
    }
}

fun main() {
    checkLevel(Empty)
}