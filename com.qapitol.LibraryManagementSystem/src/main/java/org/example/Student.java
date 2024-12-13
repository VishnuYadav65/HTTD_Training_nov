package org.example;

import java.io.IOException;
import java.security.PublicKey;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.example.Json.readData;

public class Student {
    private int StudentId;
    private String StudentName;
    private int Age;



    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentId=" + StudentId +
                ", StudentName='" + StudentName + '\'' +
                ", Age=" + Age +
                '}';
    }
}







