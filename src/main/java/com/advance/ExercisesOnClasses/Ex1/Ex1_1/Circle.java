package com.advance.ExercisesOnClasses.Ex1.Ex1_1;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("Radius of circle 1: " + circle1.getRadius());
        System.out.println("Area of circle 1: " + circle1.getArea());

        Circle circle2 = new Circle(10);
        System.out.println("Radius of circle 1: " + circle2.getRadius());
        System.out.println("Area of circle 1: " + circle2.getArea());
    }
}

