package week4.task2;

public class Circle extends Shape {
    private double radius;
    public static final double PI = 3.14;

    public Circle() {
        radius = 1.0;
    }

    public Circle(double radius, String color, boolean filled) {

        super(color, filled);
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

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}

