/*Created by IntelliJ IDEA.
 *   Author: Ankur Maurya (Ankur-maurya)
 *   Date: 27/08/2020
 *   Time: 09:30 PM
 *  File Name : Book.java
 * */
package definitions;

public class Book {

    //Components of a definition class in Java.
    // 1. private fields.
    // 2. getter methods for private fields.
    // 3. setter methods for private fields.
    // 4. Constructors for initializing the fields of an object.
    // 5. the toString() method.
    // 6. the equals() and the hashCode() methods.

    private String nameOfTheBook;
    private String authorOfTheBook;
    private String fifteenDigitISBNNumberOfBook;

    //Constructor Methods : used to initialise the values (fields) of an object.

    // 1. Non-Parameterized constructor : it has no parameters.

    public Book() {
        nameOfTheBook = "Core Java Volume I--Fundamentals";
        authorOfTheBook = "Cay S. Horstmann";
        fifteenDigitISBNNumberOfBook = "879524682145783";

    }

    // 2. Parameterized constructor : it has some parameters.

    public Book(String nameOfTheBook, String authorOfTheBook, String fifteenDigitISBNNumberOfBook) {
        this.nameOfTheBook = nameOfTheBook;
        this.authorOfTheBook = authorOfTheBook;
        this.fifteenDigitISBNNumberOfBook = fifteenDigitISBNNumberOfBook;
    }

    public Book(String nameOfTheBook) {
        this.nameOfTheBook = nameOfTheBook;
    }

    //1. The getter method : it is used to read the value of a private field.
    // Observer methods / Accessor Methods

    /**
     * This method returns the name of the book.
     *
     * @return The name of the book.
     */
    public String getNameOfTheBook() {
        return this.nameOfTheBook;
    }

    //2. The setter method : used to write the value of a private field.
    // Transformer methods / Mutator Methods

    /**
     * This method will change the book name
     *
     * @param nameOfTheBook The name of the book that you want to given
     */

    public void setNameOfTheBook(String nameOfTheBook) {
        this.nameOfTheBook = nameOfTheBook;
    }

    /**
     * This method returns the name of the author of the book.
     *
     * @return The name of author of the book.
     */

    public String getAuthorOfTheBook() {
        return this.authorOfTheBook;
    }

    /**
     * This method will change the author name of book
     *
     * @param authorOfTheBook The author name of the book that you want to given
     */

    public void setAuthorOfTheBook(String authorOfTheBook) {
        this.authorOfTheBook = authorOfTheBook;
    }


}
