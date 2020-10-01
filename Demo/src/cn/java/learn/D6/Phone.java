package cn.java.learn.D6;

public class Phone {
    String brand;
    int price;
    String color;
    public Phone(){

    }
    public Phone(String brand,int price,String color){
        this.brand=brand;
        this.price=price;
        this.color=color;
    }

    public void call(String name){
        System.out.println("给"+name+"打电话");
    }

    public void sendMessage(String message){
        System.out.println(message);
    }
}
