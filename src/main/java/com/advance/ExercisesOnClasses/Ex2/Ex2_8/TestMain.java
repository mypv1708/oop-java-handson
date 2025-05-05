package com.advance.ExercisesOnClasses.Ex2.Ex2_8;

import com.advance.ExercisesOnClasses.Ex2.Ex2_6.MyPoint;

public class TestMain {
    public static void main(String[] args) {
        MyCircle c1 = new MyCircle();
        System.out.println("c1 is " + c1);
        System.out.println("Area of c1: " + c1.getArea());
        System.out.println("Circumference of c1: " + c1.getCircumference());

        MyCircle c2 = new MyCircle(2, 3, 4);
        System.out.println("c2 is " + c2);
        System.out.println("Distance between centers of c1 and c2: " + c1.distance(c2));

        MyPoint p1 = new MyPoint(5, 6);
        MyCircle c3 = new MyCircle(p1, 7);
        System.out.println("c3 is " + c3);

        c3.setRadius(10);
        c3.setCenterXY(1, 1);
        System.out.println("c3 after modification: " + c3);

    }
}
