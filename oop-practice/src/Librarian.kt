
class Librarian(name: String, memberId: String, val employeeId: String): Member(name, memberId) {

    fun addBook(book: Book, library: Library) {
        library.addBook(book)
        println("You have added the book ${book.title}")
    }

    fun removeBook(book: Book, library: Library) {
        library.removeBook(book)
        println("You have removed the book ${book.title}")
    }

    override fun displayDetails() {
        super.displayDetails()
        println("EmployeeID: $employeeId")
    }
}