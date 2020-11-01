package edu.test.T1;

public class test {
    public static void main(String[] args) {
        int s=0,fact=1;
        for(int i=1;i<=10;i++)
        {
            fact=fact*i;
            s+=fact;
        }
        System.out.println("s="+s);
    }
}

