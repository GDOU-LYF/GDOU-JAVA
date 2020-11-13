package edu.test.T5;

import java.awt.*;
import java.applet.*;

interface Area {
    abstract int getArea();
}

interface Perimeter {
    abstract int getPeri();
}

class Rectangle implements Area, Perimeter {
    int width, height;

    public int getArea() {
        return (width * height);
    }

    public int getPeri() {
        return (2 * (width + height));
    }

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
}
