package OperationsOnCollections

fun main() {
//    The lambda argument is the element index:
//    "[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]"
    val list1 = List(10) { it }
    println(list1)

//     A list of a single value:
//    "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]"
    val list2 = List(10) { 0 }
    println(list2)

//    A list of letters:
//    [a, b, c, d, e, f, g, h, i, j]
    val list3 = List(10){ 'a' + it }
    println(list3)

//     Cycle through a sequence:
//    "[a, b, c, a, b, c, a, b, c, a]"
    val list4 = List(10) {list3[it % 3]}
    println(list4)
}