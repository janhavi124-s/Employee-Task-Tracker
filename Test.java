package org.example;

import java.util.*; // This import is not strictly necessary for this code but kept if you plan to use other util classes

public class Student {
    private int studentId;
    private String studentName;

    // Constructor (uncommented and active)
    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    // Default constructor (good practice to have if you also have a parameterized one)
    public Student() {
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}

// It's generally recommended to have Tester in its own file (Tester.java)
// but for demonstration, it's placed here.
class Tester {
    public static void main(String[] args) { // Corrected main method signature
        Student student = new Student(); // Using the default constructor
        // Correcting the type for studentId
        student.setStudentId(1); // Assuming studentId is an int, provide an int value
        student.setStudentName("Janhavi");

        // These print statements must be inside the main method to be executed
        System.out.println("Displaying student details:");
        System.out.println("Student Id :" + student.getStudentId());
        System.out.println("Student Name :" + student.getStudentName()); // Added to display name too
    }
}
