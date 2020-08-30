/*  Created by IntelliJ IDEA.
 *  Author: Ankur Maurya (Ankur-maurya)
 *   Date: 27/08/2020
 *   Time: 11:30 PM
 *  File Name : Library.java
 * */
package definitions;

public class Library {
    private Book[] stock;


    public Library() {
        this.stock = new Book[10];
        for (int index = 0; index < stock.length; index++) {
            stock[index] = new Book("AvailableBook " + (index + 1));
        }
    }

    public Library(Book[] stock) {
        this.stock = stock;
    }

}
