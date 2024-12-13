package org.example;

public class Teacher extends Person{

    private String subjectTeacher;
    private int salary;
    String TeacherName;
    int TeacherId;
    int TeacherAge;

    @Override
    public String toString() {
        return "Teacher{" +
                "subjectTeacher='" + subjectTeacher + '\'' +
                ", salary=" + salary +
                ", TeacherName='" + TeacherName + '\'' +
                ", TeacherId=" + TeacherId +
                ", TeacherAge=" + TeacherAge +
                '}';
    }

    public Teacher() {
//        super(TeacherId,TeacherName,TeacherAge);
        this.subjectTeacher=subjectTeacher;
        this.salary=salary;
    }
public void getdetails(){
       TeacherName= getName();
        TeacherId=getId();
       TeacherAge= getAge();
}

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getSubjectTeacher() {
        return subjectTeacher;
    }

    public void setSubjectTeacher(String subjectTeacher) {
        this.subjectTeacher = subjectTeacher;
    }


    @Override
    void display() {
        System.out.println(getAge());
        System.out.println(getId());
        System.out.println(getName());
        System.out.println(subjectTeacher);
        System.out.println(salary);


    }
}
