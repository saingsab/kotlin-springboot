class Book(val title: String, val author: String, val isbn: String, val publishedYear: Int) {
    // Encapsulation: isAvailable is private and can only be modified through methods
    private var isAvailable: Boolean = true

    fun displayDetails() {
        println("Title: $title, Author: $author, ISBN: $isbn, Published Year: $publishedYear, Is Available: $isAvailable")
    }

    fun borrowBook() {
        if (isAvailable) {
            isAvailable = false
            println("You have borrowed the book: $title")
        } else {
            println("Sorry, the book is not available.")
        }
    }

    fun returnBook() {
        if (!isAvailable) {
            isAvailable = true
            println("You have returned the book $title")
        } else {
            println("You have not borrowed the book $title")
        }
    }
}