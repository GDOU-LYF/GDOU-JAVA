package edu.test.T1;

public class ATest {
    public static void main(String args[]) {
        Sub sb = new Sub();
        System.out.println(sb.method1());
    }
}

class Super {
    int x = 1, y = 2;

    int method1() {
        return x < y ? x : y;
    }
}

class Sub extends Super {
    @Override
    int method1() {
        return ((x > y) ? x : y);
    }
}

