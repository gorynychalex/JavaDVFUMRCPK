package ru.dvfu.mrcpk.ex03geometry;

import sun.security.provider.SHA;

public class TestGeometry {

    public static void main(String[] args) {

        Shape rectangle1 = new Rectangle(10,20);
        Shape rectangle2 = new Rectangle(30, 40);
        Shape circle1 = new Circle(10);
        Shape circle2 = new Circle(1,1,20);

        Shape[] shapes = new Shape[10];
        shapes[0] = rectangle1;
        shapes[1] = rectangle2;
        shapes[2] = circle1;
        shapes[3] = circle2;
    }
}
