package MemberReferences

import java.awt.Font

fun Int.time47() = times(47)

class Frog
fun Frog.speak() = "Ribbit1"

fun goInt(n: Int, g: (Int) -> Int) = g(n)

fun goFrog(frog: Frog, g: (Frog) -> String) =
    g(frog)

fun main() {
    println(goInt(12, Int::time47))
    goFrog(Frog(), Frog::speak)
}