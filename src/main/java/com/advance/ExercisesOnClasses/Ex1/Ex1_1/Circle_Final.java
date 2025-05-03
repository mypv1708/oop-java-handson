package com.advance.ExercisesOnClasses.Ex1.Ex1_1;

public class Circle_Final {
    private double radius = 1.0;
    private String color = "red";

    public Circle_Final() {
    }

    public Circle_Final(double radius) {
        this.radius = radius;
    }

    public Circle_Final(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle_Final{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public static void main(String[] args) {
        Circle_Final circle1 = new Circle_Final();
        System.out.println(circle1);
        System.out.println("Diện tích hình tròn 1: " + circle1.getArea());

        Circle_Final circle2 = new Circle_Final(5.0);
        System.out.println(circle2);
        System.out.println("Diện tích hình tròn 2: " + circle2.getArea());

        Circle_Final circle3 = new Circle_Final(10.0, "blue");
        System.out.println(circle3);
        System.out.println("Diện tích hình tròn 3: " + circle3.getArea());

        circle1.setRadius(20.0);
        circle1.setColor("green");
        System.out.println("Hình tròn 1 sau khi thay đổi: " + circle1);
        System.out.println("Diện tích hình tròn 1 mới: " + circle1.getArea());

    }
}
