package edu.gdou.test.Day2;

public class People {
    private String name;
    private int age;

    public People() {

    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printInfo() {
        System.out.println("People {name=" + name + ",age=" + age + "}");
    }
}
