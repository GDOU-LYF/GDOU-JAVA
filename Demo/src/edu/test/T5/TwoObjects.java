package edu.test.T5;

import javax.swing.*;
import java.util.Objects;

class TwoObjects {
    public static void main(String[] args) {
        B b1 = new B();
        B b2 = new B();
        System.out.println(b1 == b2);
        System.out.println(b1 != b2);
        System.out.println(b1.equals(b2));
        JFrame app=new JFrame();
        app.getContentPane();
    }
}

class B {
    int x;

    B() {
        x = 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        B b = (B) o;
        return x == b.x;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x);
    }
}

