package cn.java.learn.D10.Demo3;

public class Demo3 {
    public static void main(String[] args) {
        Animal animal=new Dog();
        animal.eat();
        if (animal instanceof Cat){
            System.out.println("this animal is cat");
            Cat cat=(Cat)animal;
            cat.sleep();
        }else{
            Dog dog=(Dog)animal;
//            System.out.println();
            dog.eat();
        }
    }

}
