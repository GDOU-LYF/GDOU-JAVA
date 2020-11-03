package edu.gdou.test.Day4;

public class Student extends User {
    private String course;
    public Student(){
        super();
    }
    public Student(String name,String ID,boolean male,int age,String course){
        super(name,ID,male,age);
        this.course=course;
    }
    @Override
    public String toString(){
        return "Student{" +
                "name='" + getName() + '\'' +
                ", ID='" + getID() + '\'' +
                ",age="+getAge()+
                ", male=" + isMale() +",在学的课程:"+course+
                '}';
    }
}
