package week4.task2;

public class Rectangle extends Shape {
    private int width;
    private int length;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Rectangle() {
        width = 1;
        length = 1;
    }

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(int width, int length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getarea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
