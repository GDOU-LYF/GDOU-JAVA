package cn.java.learn.D9.Group;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {
    public Member() {

    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void getRed(ArrayList<Integer> redList){
        if (redList.size()==0){
            return ;
        }
        int gold=redList.remove(new Random().nextInt(redList.size()));
        super.money+=gold;
    }
}
