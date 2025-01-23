package OOPS;

import java.sql.SQLOutput;

class Student{

    // Taking input
    String name;
    int rollNo;
    int Class;

    // Printing the Details
    public void printDetails(){
        System.out.println("Name: "+ name);
        System.out.println("Roll No: "+ rollNo);
        System.out.println("Class: "+ Class);
    }
}

public class vid38 {
    public static void main(String[] args) {

        System.out.println("This is Custom Class");

        Student st1 = new Student(); // student 1
        Student st2 = new Student(); // student 2

        // Setting Attributes for Student 1
        st1.name = "Umar Hayat";
        st1.rollNo = 45;
        st1.Class = 12;

        System.out.println("\n");

        // Setting Attributes for Student 2
        st2.name = "Danish Hayat";
        st2.rollNo = 24;
        st2.Class = 9;

        // Printing the Details
        st1.printDetails();
        st2.printDetails();
    }
}
