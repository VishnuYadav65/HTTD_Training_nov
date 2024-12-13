package org.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.example.Json.readData;

public class SvrcImplementation {
    List<Student> StudentDetails;
    Scanner sc;

    public  void addStudent() throws IOException {


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

    }


//    List<Student> data;
    public void  removeStudent() throws IOException {
//        data = readData();
////     Student s=new Student();
        System.out.println("Enter StudentId to remove");
//        int CompareStudentId  = sc.nextInt();
//
//       for(int i=0;i<data.size();i++){
//           Student s = data.get(i);
//
//          if(s.getStudentId()== CompareStudentId ){
//              data.remove(i);
//          }
//        }
//
//       return data;
        int CompareStudentId = sc.nextInt();
        for (int i = 0; i < StudentDetails.size(); i++) {

            if (  StudentDetails.get(i).getStudentId()== CompareStudentId) ;
            StudentDetails.remove(i);

            Json.writeData(StudentDetails);
        }

    }




    /*
     * List<Student> data
     * data.get(i)
     * */



    public void UpdateStudentDetails() throws IOException {
        System.out.println("How many students u want to add");
        int NoOfStudents = sc.nextInt();
        for (int i=0;i<NoOfStudents;i++){
            Student student3=new Student();
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
//        Json.writeData(StudentDetails);


        }

        Json.writeData(StudentDetails);

    }


//
//    public void getAllStudent() throws IOException {
//
//        data = readData();
//        System.out.println( data.toString());
//
//
////    }



}
