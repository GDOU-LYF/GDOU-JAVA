package cn.java.learn.D9.Group;

import java.util.ArrayList;
import java.util.Random;

public class Lord extends User{
    public Lord() {
    }
    public Lord(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int money, int number) {
        ArrayList<Integer> list = new ArrayList<>();
        if (this.money < money) {//看看能不能发红包
            System.out.println("User:" + super.name + "\t金额不足!");
            return list;
        }

        Random ra = new Random();
        int gold = money;
        for (int i = 0; i < number-1; i++) {
            int num = ra.nextInt(gold) + 1;
            list.add(num);
            gold -= num;
        }
        list.add(gold);
        super.money-=money;
        return list;
    }

}
