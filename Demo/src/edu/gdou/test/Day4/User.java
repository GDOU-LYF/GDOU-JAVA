package edu.gdou.test.Day4;

public class User {
    private String name;
    private String ID;
    private int age;
    private boolean male;

    public User() {
    }

    public User(String name, String ID, boolean male,int age) {
        this.name = name;
        this.ID = ID;
        this.male = male;
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ",age="+age+
                ", ID='" + ID + '\'' +
                ", male=" + male +
                '}';
    }
}
