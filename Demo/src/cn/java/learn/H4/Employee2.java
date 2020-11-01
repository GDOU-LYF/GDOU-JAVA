package cn.java.learn.H4;

public class Employee2 implements java.io.Serializable {
    public String name;
    public String address;
    public transient int age;
    public void addressCheck(){
        System.out.println("Address check:"+name+"--"+address);
    }

    public Employee2() {
    }

    public Employee2(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee2{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}
