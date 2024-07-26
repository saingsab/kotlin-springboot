fun main() {
    val book1 = Book("The Da Vinci Code", "Dan Brown", "978-0307474278", 2003)
    println(book1.borrowBook())
    println(book1.displayDetails())

    book1.returnBook()
    println(book1.displayDetails())

}