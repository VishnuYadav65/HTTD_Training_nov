package org.example;

public class Student extends Person {

    private int marks;
    private String course;
    int Id;
    String Name;
    int age;
    public Student() {
//        super(Id,Name,age);
        this.course=course;
        this.marks=marks;
    }
    public void getdetails(){
       Id = getId();
        Name =getName();
        age=getAge();
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public void display() {
        System.out.println("StudentName: "+ getName());
        System.out.println("StudentAge: "+getAge());
        System.out.println( "StudentID: " +getId());



    }

    @Override
    public int getId() {
        return Id;
    }

    @Override
    public void setId(int id) {
        Id = id;
    }

    @Override
    public String toString() {
        System.out.println(getId());
        System.out.println(getName());
        System.out.println(getAge());

        return "Student{" +
                "marks=" + marks +
                ", course='" + course + '\'' +
                '}';
    }

    public void caluclateGrade(){
        if(marks>=75){
            System.out.println("Grade A");
        } else if (marks>50) {
            System.out.println("Grade B");

        }else if(marks<50){
            System.out.println("Grade C");

        }
    }
}
