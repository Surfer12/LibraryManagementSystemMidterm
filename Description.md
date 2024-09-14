Explanation:
User (abstract class):  
Attributes: userId, name, email, password
Methods: login(), logout()
Librarian (inherits from User):  
Methods: createUser(), updateUser(), deleteUser(), manageBooks(), trackDueDates()
Student (inherits from User):  
Attributes: studentId, borrowedBooks (List of Book objects)
Methods: borrowBook(), returnBook()
Book:
Attributes: isbn, title, author, isAvailable
Methods: searchByTitle(), searchByAuthor(), searchByISBN()
Encapsulation:
Use private access modifiers for attributes.
Provide public getter and setter methods for accessing and modifying private attributes.
Inheritance & Polymorphism:
The User class is abstract, promoting code reuse and flexibility through inheritance by Librarian and Student classes.