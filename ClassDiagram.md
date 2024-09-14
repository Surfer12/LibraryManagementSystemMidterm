+-------------------+
|      <<abstract>> |
|       User        |
+-------------------+
| - userId: int     |
| - name: String    |
| - email: String   |
| - password: String|
+-------------------+
| + login()         |
| + logout()        |
+-------------------+
^
|
+---------+---------+
|                   |
|    Librarian      |        Student
+-------------------+        +-------------------+
| + createUser()    |        | - studentId: int  |
| + updateUser()    |        | - borrowedBooks:  |
| + deleteUser()    |        |   List<Book>      |
| + manageBooks()   |        +-------------------+
| + trackDueDates() |        | + borrowBook()    |
+-------------------+        | + returnBook()    |
+-------------------+
|
|
v
+-------------------+
|       Book        |
+-------------------+
| - isbn: String    |
| - title: String   |
| - author: String  |
| - isAvailable:    |
|   boolean         |
+-------------------+
| + searchByTitle() |
| + searchByAuthor()|
| + searchByISBN()  |
+-------------------+