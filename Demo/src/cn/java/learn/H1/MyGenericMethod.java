package cn.java.learn.H1;

public class MyGenericMethod {

    public <MVP> void show(MVP mvp){
        System.out.println(mvp.getClass());
    }
    public <MVP> MVP show2(MVP mvp){
        return mvp;
    }
}
