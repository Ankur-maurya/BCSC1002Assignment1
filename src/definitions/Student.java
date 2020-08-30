/*  Created by IntelliJ IDEA.
 *  Author: Ankur Maurya (Ankur-maurya)
 *   Date: 28/08/2020
 *   Time: 9:18 PM
 *  File Name : Student.java
 * */
package definitions;

public class Student {
        Student studentObject = new Student();
        private String studentFirstName, studentMiddleName, studentLastName;
        private long universityRollNumber;
        private int numberOfBooksIssued;
        private Book[] name;

        //Constructor Methods : used to initialise the values (fields) of an object.

        // 1. Non-Parameterized constructor : it has no parameters.
        public Student() {
                studentFirstName = "Ankur";
                studentMiddleName = "Kumar";
                studentLastName = "Maurya";
                universityRollNumber = 191500124;
                numberOfBooksIssued = 3;
                this.name = new Book[3];
                for (int index = 0; index < name.length; index++) {
                        name[index] = new Book("IssuedBook " + (index + 1));
                }
        }

        // 2. Parameterized constructor : it has some parameters.
        public Student(String studentFirstName, String studentMiddleName, String studentLastName, long universityRollNumber, int numberOfBooksIssued, Book[] name) {
                this.studentFirstName = studentFirstName;
                this.studentMiddleName = studentMiddleName;
                this.studentLastName = studentLastName;
                this.universityRollNumber = universityRollNumber;
                this.numberOfBooksIssued = numberOfBooksIssued;
                this.name = new Book[3];
                for (int index = 0; index < name.length; index++) {
                        name[index] = new Book("Book " + (index + 1));
                }
        }
}
