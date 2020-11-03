package edu.test.T2;

public class tw {
    private tw() {
    }

    public static void main(String[] args) {
        int a[ ]={2,4,6,8};
        System.out.println((a[0]+=a[1])+ ++a[2]);
    }
}
