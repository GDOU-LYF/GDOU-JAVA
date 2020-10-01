package cn.java.learn.D6;

public class PhoneText {
    public static void main(String[] args) {
        Phone a=new Phone("苹果",1000,"黑色");
        Phone b=new Phone("香蕉",2000,"黄色");
        System.out.println("牌子:"+a.brand+",价格:"+a.price+",颜色:"+a.color);
        System.out.println("牌子:"+b.brand+",价格:"+b.price+",颜色:"+b.color);
        a.call("mon");
        b.sendMessage("好好好");
    }

}
