package edu.gdou.test.Day4;

public class Teacher extends User {
    private int money;
    private String course;

    public Teacher() {
        super();
    }

    public Teacher(String name, String ID, boolean male,int age, int money, String course) {
        super(name, ID, male,age);
        this.money = money;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + getName() + '\'' +
                ", ID='" + getID() + '\'' +
                ",age="+getAge()+
                ", male=" + isMale() +
                ",在教的课程:" + course +
                ",money=" + money +
                '}';
    }
}
