package edu.test.T1;

public class sum10 {
    public static void main (String[] args){
        int sum=0;
        for (int i = 1; i <=10; i++) {
            int ret=1;
            for (int j = 2; j <=i ; j++) {
                ret*=j;
            }
            sum+=ret;
        }
        System.out.println(sum);
    }

}
