package org.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.example.Json.readData;

public class ServiceImplementation implements Service {
    List<Student> StudentDetails;
    Scanner sc;

    @Override
    public void addStudent() throws IOException {


        Student student = new Student();
        Student student1 = new Student();

        sc = new Scanner(System.in);

        System.out.println("Enter StudentId");
        int StudentId = sc.nextInt();
        student.setStudentId(StudentId);

        System.out.println("Enter StudentName");
        String StudentName = sc.next();
        student.setStudentName(StudentName);

        System.out.println("Enter StudentAge");
        int Age = sc.nextInt();
        student.setAge(Age);


        System.out.println("Enter StudentId");
        int Student1Id = sc.nextInt();
        student1.setStudentId(Student1Id);

        System.out.println("Enter StudentName");
        String Student1Name = sc.next();
        student1.setStudentName(Student1Name);

        System.out.println("Enter StudentAge");
        int Age1 = sc.nextInt();
        student1.setAge(Age1);


        StudentDetails = new ArrayList<>();
        StudentDetails.add(student);
        StudentDetails.add(student1);
        Json.writeData(StudentDetails);
        System.out.println("Added Successfully");

    }


    @Override
    public void removeStudent() throws IOException {
        System.out.println("Enter StudentId to remove");
        int CompareStudentId = sc.nextInt();

        for (int i = 0; i < StudentDetails.size(); i++) {


            if (StudentDetails.get(i).getStudentId() == CompareStudentId) {
                StudentDetails.remove(i);
            }


        }
        Json.writeData(StudentDetails);
        System.out.println("Removed Successfully");

    }




    /*
     * List<Student> data
     * data.get(i)
     * */


    @Override
    public void UpdateStudentDetails() throws IOException {
        System.out.println("How many students u want to add");
        int NoOfStudents = sc.nextInt();

        StudentDetails = Json.readData();
        for (int i = 0; i < NoOfStudents; i++) {
            Student student3 = new Student();
            System.out.println("Enter StudentId");
            int StudentId = sc.nextInt();
            student3.setStudentId(StudentId);

            System.out.println("Enter StudentName");
            String StudentName = sc.next();
            student3.setStudentName(StudentName);

            System.out.println("Enter StudentAge");
            int Age = sc.nextInt();
            student3.setAge(Age);

            StudentDetails.add(student3);


        }
        Json.writeData(StudentDetails);


    }


    @Override
    public void getAllStudent() throws IOException {

        StudentDetails = readData();
        for (Student studentDetail : StudentDetails) {
            System.out.println(studentDetail.toString());
        }
//        for (int i = 0; i < StudentDetails.size(); i++)
//        {
//            System.out.print( StudentDetails.get(i).getStudentId());
//            System.out.print(  StudentDetails.get(i).getStudentName());
//            System.out.println( StudentDetails.get(i).getAge());
//
//
//       }

    }

    @Override
    public void getStudentById() throws IOException {
        StudentDetails = readData();
        System.out.println("Enter Id of Student to get details");
        int GetById = sc.nextInt();
        for (Student studentDetail : StudentDetails) {


            if (studentDetail.getStudentId() == GetById) {
                System.out.println(studentDetail.toString());
            }

        }


    }

}







