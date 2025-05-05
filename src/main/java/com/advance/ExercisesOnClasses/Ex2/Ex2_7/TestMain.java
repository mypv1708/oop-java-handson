package com.advance.ExercisesOnClasses.Ex2.Ex2_7;

import com.advance.ExercisesOnClasses.Ex2.Ex2_6.MyPoint;

public class TestMain {
    public static void main(String[] args) {
        MyLine l1 = new MyLine(0, 0, 3, 4);
        System.out.println("Line l1: " + l1);
        System.out.println("Length of l1: " + l1.getLength());
        System.out.println("Gradient of l1 (in radians): " + l1.getGradient());

        MyPoint p1 = new MyPoint(1, 2);
        MyPoint p2 = new MyPoint(5, 6);
        MyLine l2 = new MyLine(p1, p2);
        System.out.println("Line l2: " + l2);
        System.out.println("Begin point of l2: " + l2.getBegin());
        System.out.println("End point of l2: " + l2.getEnd());

        l2.setBeginX(10);
        l2.setEndY(20);
        System.out.println("Line l2 after modification: " + l2);
        System.out.println("New length of l2: " + l2.getLength());
        System.out.println("New gradient of l2 (in radians): " + l2.getGradient());
    }
}
