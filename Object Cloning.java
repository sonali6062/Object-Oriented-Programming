Shallow copy is called automatically even if we don't define the copy constructor but for deep copy user has toh provided the yser defined code and it has to be deleted manually.
/*You are required to design a class hierarchy to demonstrate object cloning using shallow and deep copying in a library system. A Library contains a list of Book objects.
Shallow Copy: Creates a new object that shares references with the original object for nested structures.
Deep Copy: Creates a completely independent copy of the original object, including all nested structures.
Classes :
Book :
Attributes : title (string) , author (string)
Library :
Attributes : name (string) , books (List of Book class)
Methods :
shallowClone() : Creates a shallow copy of the Library object.
deepClone() : Creates a deep copy of Library object.
display() : Displays the output/ attributes of the class.
addBook (Book book) : It adds one book info to the list of books.
Refer the commented code on IDE to understand the output format using display method.
Refer the sample example output to understand the output format.
Examples:
Input : name = "Central_Library"

title = [ "Frankestein", "King_Arthur_and_the_Round_Table" ]

author = [ "Mary_Shelley", "Rosemary_Sutcliff" ]
changeIndex = 1
newTitle = "Treasure_Island"
new_author = "Robert_Louis_Stevenson"
Output :
Original Library :
Library : Central_Library
Book : Frankestein, Author : Mary_Shelley
Book : King_Arthur_and_the_Round_Table, Author : Rosemary_Sutcliff
After Modifications :
Original Library :
Library : Central_Library
Book : Frankestein, Author : Mary_Shelley
Book : Treasure_Island, Author : Robert_Louis_Stevenson

Shallow Clone :
Library : Central_Library
Book : Frankestein, Author : Mary_Shelley
Book : Treasure_Island, Author : Robert_Louis_Stevenson

Deep Clone :
Library : Central_Library
Library : Central_Library
Book : Frankestein, Author : Mary_Shelley
Book : King_Arthur_and_the_Round_Table, Author : Rosemary_Sutcliff*/


// Book Class
class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

// Library Class
class Library {
    String name;
    List<Book> books;

    Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    // Add a book
    void addBook(Book book) {
        books.add(book);
    }

    // Shallow Clone
    Library shallowClone() {
        Library newLibrary = new Library(this.name);
        newLibrary.books = this.books; // Shares the book list reference
        return newLibrary;
    }

    // Deep Clone
    Library deepClone() {
        Library newLibrary = new Library(this.name);
        for (Book book : books) {
            newLibrary.addBook(new Book(book.title, book.author)); // Creates new copies of books
        }
        return newLibrary;
    }

    // Display Library
    void display() {
        System.out.println("Library : " + name);
        for (Book book : books) {
            System.out.println("Book : " + book.title + ", Author : " + book.author);
        }
    }
}
