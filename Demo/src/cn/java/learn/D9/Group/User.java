package cn.java.learn.D9.Group;

public class User {
    String name;
    int money;
    public User(){

    }
    public User(String name,int money){
        this.name=name;
        this.money=money;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setMoney(int money){
        this.money=money;
    }
    public int getMoney(){
        return money;
    }
    public void show(){
        System.out.println("User:"+this.name+"\tGold:"+this.money);
    }
}
