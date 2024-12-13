package org.example;

import java.util.Scanner;

public class Programs {
    public static void main(String[] args) {
//        areaOfRectangle();
//        sumOfdigits();
//        age();
//        skip();
//        largest();
//        palindrome();
//        ArmstrongNumbers();
//        primeNumbers();
//        sumofeacharray();
//        breakTheLoop();
//        fibonacciseries();
//          factorial();
//        flipTheCoin();
        multiplication();
        caluclator();
    }

    public static void areaOfRectangle() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length");
        int length = scanner.nextInt();
        System.out.println("Enter width");
        int width = scanner.nextInt();
        int area = length * width;
        System.out.println(area);
    }

    public static void sumOfdigits() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");
        int number = scanner.nextInt();
        int temp = 0;
        int sum = 0;
        while (number > 0) {
            temp = number % 10;
            sum = sum + temp;
            number = number / 10;

        }
        System.out.println(sum);

    }

    public static void caluclator() {
        Scanner scanner = new Scanner(System.in);
        char ch=' ';
        do {
            System.out.println("choose option");
            int option = scanner.nextInt();

            switch (option) {
                case 1: {
                    System.out.println("enter two numbers :");
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    int res = a + b;
                    System.out.println("the addition of given number is : " + res);
                    System.out.println("do you want to continue : ");
                    ch = scanner.next().charAt(0);


                }
                break;

                case 2: {
                    System.out.println("enter two numbers :");
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    int result = a - b;
                    System.out.println("the subtraction of given number is : " + result);
                    System.out.println("do you want to continue : ");
                    ch = scanner.next().charAt(0);


                }
                break;

                case 3: {
                    System.out.println("enter two numbers :");
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    int res = a * b;
                    System.out.println("the multiplication of given number is : " + res);
                    System.out.println("do you want to continue : ");
                    ch = scanner.next().charAt(0);


                }
                break;

                case 4: {
                    System.out.println("enter two numbers :");
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    if (a > b) {
                        int res = a / b;
                        System.out.println("the division of given number is : " + res);
                        System.out.println("do you want to continue : ");
                        ch = scanner.next().charAt(0);


                    }

                }
                case 5: {
                    System.out.println("Exit");
                    break;
                }
            }
        }
        while(ch=='y');
        }

        public static void multiplication(){
        Scanner s = new Scanner(System.in);

            System.out.println("enter the lower range : ");
            int lower=s.nextInt();
            System.out.println("enter the upper range : ");
            int higher= s.nextInt();
            System.out.println("multiplicaton table between the given range : ");
            for(int i=lower;i<=higher;i++) {
                System.out.println("the multiplication table of "+i);
                for(int j=1;j<=10;j++) {
                    System.out.println(i+"*"+j+"="+i*j);
                }
                System.out.println(" ");
            }

        }


    public static void skip() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");
        int number = scanner.nextInt();

        for (int i = 1; i < number; i++) {
            if (i % 2 == 0) {
                continue;//skip the loop
            }
            if (number > 20) {
                System.out.println("enter below 20");
                break;
            }

            System.out.println(i);
        }
    }

    public static void age() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");
        int age = scanner.nextInt();

        if (age < 18)
            System.out.println("Incorrect age");
        else if (age < 100)
            System.out.println("Valid age");
        else
            System.out.println("overage");
    }

    public static void largest(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number1");
        int number1 = scanner.nextInt();
        System.out.println("enter number2");
        int number2 = scanner.nextInt();
        System.out.println("enter number3");
        int number3 = scanner.nextInt();
        int temp=0;
        if(number1>=number2&&number1>number3){
            System.out.println("number1 largest");
        }
        else if(number2>number1&&number2>=number3){
            System.out.println("number2 largest");
        }
        else {
            System.out.println("number3 largest");
        }

       System.out.println( Math.max(number1,Math.max(number2,number3)));

    }
    public static void palindrome () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter text");
        String text = scanner.next();

        System.out.println("enter number");
        String number = scanner.next();
        int convertednumber = Integer.parseInt(number);

        StringBuilder sb1 = new StringBuilder(text);

        StringBuilder sb3=new StringBuilder(number);
        String reversedstring= sb1.reverse().toString();
        String reversenumber = sb3.reverse().toString();
        if (text.equals(reversedstring)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
        if (number.equals(reversenumber)) {
            System.out.println(convertednumber+" is palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }

    public static void ArmstrongNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");
        int number = scanner.nextInt();
        int originalNumber=number;

        int length =Integer.toString(number).length();
//        int length=String.valueOf(number).length();
        System.out.println(length);
        int sum = 0;
        while(number>0){
            int singledigit=number%10;
            sum+=Math.pow(singledigit,length);
            number=number/10;
        }
if (sum==originalNumber){
    System.out.println("Amstrong Number");
}
else {
    System.out.println("Not Amstrong Number");
}
    }

    public static void primeNumbers(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter number");
//        int number = scanner.nextInt();
int first=1;
int last=50;

for(int i=first;i<=last;i++){
       if (i==1){
             System.out.println("compositenumber");
                 }
            int count=0;
          for (int j=1;j<=last;j++){
               if( i%j==0){
                   count++;
               }
            }

            if(count==2){
                System.out.println(i);

        }

        }
    }

    public static void sumofeacharray(){

        int sum=0;
        int []arr={1,2,3,4};
        for (int a:arr){
            sum+=a;
        }
        System.out.println(sum);
    }
    public static void breakTheLoop ()
    {
       for (int i=1;i<50;i++)
       {
           if(i%3==0)
           {
               continue;
           }
           if (i==16)
           {
               break;

           } System.out.println(i);

       }


    }
    public static void fibonocciseries(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");
        int number = scanner.nextInt();
        int sum=0;
        for(int i=0;i<number;i++){

            //0 1 1 2 3 5 8




        }
    }
    public static void  fibonacciseries(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");
        int number = scanner.nextInt();
//        int number=10;
        int first=0;
        int second=1;
        for(int i=0;i<number;i++){

            int next=first+second;
            first=second;
            second=next;
            System.out.println(first);
        }
    }

    public static void factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");
        int number = scanner.nextInt();
        int fact = 1;
        for (int i = number; i >=1; i--) {
            fact = fact * i;
        }
        System.out.println(fact);
    }

    public static void flipTheCoin(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");
        int number = scanner.nextInt();
        int tails = 0;
        int heads = 0;
        for(int i=0;i<number;i++) {
            if (Math.random() < 0.5) {
                tails++;
            } else {
                heads++;

            }

        }
        System.out.println(heads);
        System.out.println(tails);

        }
    }



