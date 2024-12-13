package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.Scanner;



public class Controller extends Json {



    public static void main(String[] args) throws IOException {
        ServiceImplementation SI = new ServiceImplementation();
//        SI.addStudent();
//        SI.removeStudent();
//        SI.UpdateStudentDetails();
//        SI.getAllStudent();
//        SI.getStudentById();

        Scanner sc=new Scanner(System.in);
        int UserChoice;
        System.out.println("Enter ur choice\n 1.AddStudent\n 2.RemoveStudent\n 3.UpdateStudentDetails\n 4.getAllStudent\n 5.getStudentById \n 6.Exit");
do {

     UserChoice=sc.nextInt();

    switch (UserChoice) {
        case 1:
            SI.addStudent();

            break;
        case 2:
            SI.removeStudent();
            break;
        case 3:
            SI.UpdateStudentDetails();
            break;
        case 4:
            SI.getAllStudent();
            break;
        case 5:
            SI.getStudentById();
            break;
        case 6:
            sc.close();
            System.out.println("Successfully Exited");
            break;
        default:
            System.out.println("Enter correct choice");
            break;
    }
}while (UserChoice!=6);

        }

        }



