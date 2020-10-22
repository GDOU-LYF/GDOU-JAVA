package edu.gdou.test.Day2;

public class Test2_2 {
    public static void main(String[] args) {
        People human = new People("老爷爷", 98);
        People stu = new Student("小明", 18, "201911211417");
        People tea = new Teacher("陈老师", 20, "0001");
        if (stu instanceof Student) {//向下转型
            Student student = (Student) stu;
            student.addCourse("国语");
            student.addCourse("外语");
            student.addCourse("数学");
        }
        if (tea instanceof Teacher) {//向下转型
            Teacher teacher = (Teacher) tea;
            teacher.addCourse("国语教学计划");
            teacher.addCourse("外语教学计划");
            teacher.addCourse("数学教学计划");
        }
        human.printInfo();
        stu.printInfo();
        tea.printInfo();
    }
}
