package cn.java.learn.D9.Fm;

public class Son extends Father {

    int num;
    public Son(){
        this(123);
        System.out.println("无参构造函数-派生类");
    }

    public Son(int num){
//        this();
        super(num);
        this.num=num;
        System.out.println("有参构造函数-派生类");
    }
}
