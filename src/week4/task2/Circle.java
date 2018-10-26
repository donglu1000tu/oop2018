package week4.task2;

import week5_6.Point;

public class Circle extends Shape {
    private double radius;
    private Point point ;
    public static final double PI = 3.14;

    public Circle() {
        radius = 1.0;
    }

    public Circle(double radius, String color, boolean filled) {

        super(color, filled);
        this.radius = radius;
    }
    public Circle(int radius , int x , int y){
        super(radius,radius,x,y);
        this.radius = radius ;
    }
    public double getRadius() {

        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getarea() {
        return radius * radius * PI;
    }

    public double getPerimeter() {

        return 2 * radius * PI;
    }

    public void setRadius(int radius){
        this.setLength(radius);
        this.setWidth(radius);
    }
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}

