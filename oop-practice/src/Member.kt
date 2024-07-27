// Inheritance: Member inherits from Person
open class Member(name: String, val memberId: String) : Person(name) {

    // Encapsulation: borrowedBooks is private
    private val borrowedBooks : MutableList<Book> = mutableListOf()

    fun borrowBook(book: Book) {
       if (book.borrowBook()) {
           borrowedBooks.add(book)
       }
    }

    fun returnBook(book: Book) {
        if (!book.isAvailable) {
            book.isAvailable = true
            book.returnBook()
            borrowedBooks.remove(book)
            println("You have returned the book ${book.title}")
        } else {
            println("You have not borrowed the book ${book.title}")
        }
    }

    override fun displayDetails() {
        println("Name: $name, Member ID: $memberId, Borrowed Books: ${borrowedBooks.size}")
    }
}