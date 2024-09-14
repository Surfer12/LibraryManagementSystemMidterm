+------------------------+
|         User           |
+------------------------+
| - userId: int          |
| - name: String         |
| - email: String        |
| - password: String     |
+------------------------+
| + User(userId: int, name: String, email: String, password: String)
| + getUserId(): int     |
| + setUserId(userId: int): void |
| + getName(): String    |
| + setName(name: String): void |
| + getEmail(): String   |
| + setEmail(email: String): void |
| + getPassword(): String |
| + setPassword(password: String): void |
| + login(): void        |
| + logout(): void       |
+------------------------+
           ^
           |
+------------------------+
|       Librarian        |
+------------------------+
| + Librarian(userId: int, name: String, email: String, password: String)
| + createUser(user: User): void |
| + updateUser(user: User): void |
| + deleteUser(user: User): void |
| + manageBooks(book: Book): void |
| + trackDueDates(): void |
| + login(): void        |
| + logout(): void       |
+------------------------+
           ^
           |
+------------------------+
|        Student         |
+------------------------+
| - studentId: int       |
| - borrowedBooks: List<Book> |
+------------------------+
| + Student(userId: int, name: String, email: String, password: String, studentId: int)
| + getStudentId(): int  |
| + setStudentId(studentId: int): void |
| + getBorrowedBooks(): List<Book> |
| + setBorrowedBooks(borrowedBooks: List<Book>): void |
| + borrowBook(book: Book): void |
| + returnBook(book: Book): void |
| + login(): void        |
| + logout(): void       |
+------------------------+

+------------------------+
|         Book           |
+------------------------+
| - isbn: String         |
| - title: String        |
| - author: String       |
| - isAvailable: boolean |
+------------------------+
| + Book(isbn: String, title: String, author: String)
| + getIsbn(): String    |
| + setIsbn(isbn: String): void |
| + getTitle(): String   |
| + setTitle(title: String): void |
| + getAuthor(): String  |
| + setAuthor(author: String): void |
| + isAvailable(): boolean |
| + setAvailable(isAvailable: boolean): void |
| + searchByTitle(title: String, books: List<Book>): Book |
| + searchByAuthor(author: String, books: List<Book>): Book |
| + searchByISBN(isbn: String, books: List<Book>): Book |
+------------------------+

