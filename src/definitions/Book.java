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


}
