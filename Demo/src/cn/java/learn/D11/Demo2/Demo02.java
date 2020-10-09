package cn.java.learn.D11.Demo2;

public class Demo02 {
    public static void main(String[] args) {
        new Some(){
            @Override
            public void method() {
                System.out.println("method");
            }
        }.method();
    }
}
