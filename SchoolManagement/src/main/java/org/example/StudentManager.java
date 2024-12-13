package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StudentManager {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student Student = new Student();
        ArrayList<Student> studentDetails = new ArrayList<Student>();


        ArrayList<Teacher> TeacherDetails = new ArrayList<Teacher>();
        Teacher Teacher = new Teacher();


        while (true){
            System.out.println("Menu");
            System.out.println("1.Enter and display Student details");
            System.out.println("2.Enter and display Teacher details");
            System.out.println("3.Exit");
            System.out.println("Choose option: ");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("ID");
                    int id = sc.nextInt();

                    System.out.println("name");
                    String name = sc.next();

                    System.out.println("age");
                    int age = sc.nextInt();


                    System.out.println("course");
                    String course = sc.next();

                    System.out.println("marks");
                    int marks = sc.nextInt();

                    Student.setId(id);
                    Student.setName(name);
                    Student.setAge(age);
                    Student.setCourse(course);
                    Student.setMarks(marks);

                    studentDetails.add(Student); ///al

                    Student.display();
                    System.out.println( Student.toString());

                    Student.caluclateGrade();
                    break;
                case 2:


                    System.out.println("TeacherName");
                    String TeacherName = sc.next();

                    System.out.println("TeacherAge");
                    int TeacherAge = sc.nextInt();

                    System.out.println("subjectteacher");
                    String subjectTeacher = sc.next();

                    System.out.println("salary");
                    int salary = sc.nextInt();

                    System.out.println("TeacherID");
                    int TeacherId = sc.nextInt();

                    Teacher.setId(TeacherId);
                    Teacher.setName(TeacherName);
                    Teacher.setAge(TeacherAge);
                    Teacher.setSubjectTeacher(subjectTeacher);
                    Teacher.setSalary(salary);


                    TeacherDetails.add(Teacher);

                    Teacher.display();
                    System.out.println(Teacher.toString());
                    break;

                case 3:
                    System.out.println("Exit");
                    sc.close();
                    break;
                default:
                    System.out.println("Thank You");



            }

        }







//
//        Teacher.setSalary(salary);
//        Teacher.setSubjectTeacher(subjectTeacher);

//

//
//        System.out.println( Student.getId());
//        System.out.println( Teacher.getId());

//        studentDetails.forEach(System.out::println);
//        studentDetails.forEach((n) -> System.out.println(n));
//        for (int i=0;i<studentDetails.size();i++){
//            System.out.println(studentDetails.get(i).toString());
//        }

//        List<String> hh = studentDetails.stream().map(s -> s.toString()).collect(Collectors.toList());
//        for (String h : hh) {
//            System.out.println(h);
//        System.out.println( Student.toString());
//

        }

    }