/*  Created by IntelliJ IDEA.
 *  Author: Ankur Maurya (Ankur-maurya)
 *   Date: 28/08/2020
 *   Time: 10:28 PM
 *  File Name : FrontDesk.java
 * */
package execution;

public class FrontDesk {
    private static final int ISSUE_A_NEW_BOOK_FOR_ME = 1;
    private static final int RETURN_A_PREVIOUSLY_ISSUED_BOOK_FOR_ME = 2;
    private static final int SHOW_ME_ALL_MY_ISSUES_BOOKS = 3;
    private static final int EXIT = 4;

    public static void main(String[] args) {
        Student currentlyInteractStudent;
        Scanner scannerObject = new Scanner(System.in);
        int studentInput;

        Library libraryObject = new Library();
        Student studentObject = new Student();
        Book bookObject = new Book();

    }
}
