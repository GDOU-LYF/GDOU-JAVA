package cn.java.learn.H1;

public class MyGenericClass<MVP> {
    private MVP mvp;

    public void setE(MVP e){
        this.mvp=e;
    }

    public MVP getMvp(){
        return mvp;
    }
}
