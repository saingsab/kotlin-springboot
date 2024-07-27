### Building a Library Management System
A purely OOP based library management system that allows users to add, remove, and search for books in the library. The system also allows users to borrow and return books. The system is built using Kotlin.

#### Objective:
To practice OOP principles such as 
 - encapsulation
 - inheritance
 - polymorphism
 - abstraction 
by creating a simple library management system in Kotlin.

#### Requirements:
Classes and Objects:

Book Class:

Properties: title, author, isbn, publishedYear, isAvailable

Methods: displayDetails(), borrowBook(), returnBook()

Member Class:


Properties: name, memberId, borrowedBooks

Methods: borrowBook(book: Book), returnBook(book: Book), displayMemberDetails()

Librarian Class (inherits from Member):

Properties: employeeId
Methods: addBook(book: Book), removeBook(book: Book), displayLibrarianDetails()
Library Class:

Properties: books, members, librarians
Methods: addBook(book: Book), removeBook(book: Book), registerMember(member: Member), registerLibrarian(librarian: Librarian), displayAllBooks(), displayAllMembers(), displayAllLibrarians()
Encapsulation:

Ensure that properties are private and use getters and setters where necessary.
Inheritance and Polymorphism:

Demonstrate inheritance by having Librarian inherit from Member.
Use polymorphism to handle borrowing and returning books by both Member and Librarian.
Abstraction:

Create an abstract class Person with common properties and methods for Member and Librarian.