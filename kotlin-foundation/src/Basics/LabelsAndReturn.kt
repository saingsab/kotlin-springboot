package Basics

fun main() {
    for(i in 1..5)  {
        println("i in  $i")
        if(i==3) break
    }

    label()

    println("end of the program!")
}

fun label() {

    lable@ for(i in 1..5)  {
        println("i in  $i")
        if(i==3) break@lable
    }
}