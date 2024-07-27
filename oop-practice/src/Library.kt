class Library {

    private val books: MutableList<Book> = mutableListOf()
    private val members: MutableList<Member> = mutableListOf()
    private val librarians: MutableList<Librarian> = mutableListOf()

    fun addBook(book: Book) {
        books.add(book)
    }

    fun removeBook(book: Book) {
        books.remove(book)
    }

    fun addMember(member: Member) {
        members.add(member)
    }

    fun removeMember(member: Member) {
        members.remove(member)
    }

    fun addLibrarian(librarian: Librarian) {
        librarians.add(librarian)
    }

    fun removeLibrarian(librarian: Librarian) {
        librarians.remove(librarian)
    }

    fun displayBooks() {
        books.forEach { it.displayDetails() }
    }

    fun displayMembers() {
        members.forEach { it.displayDetails() }
    }

    fun displayLibrarians() {
        librarians.forEach { it.displayDetails() }
    }

    fun displayDetails() {
        println("Books: ${books.size}, Members: ${members.size}, Librarians: ${librarians.size}")
    }

}
