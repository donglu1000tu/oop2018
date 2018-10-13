package week4.task2;

public class Square extends Rectangle {
    public Square() {}

    public Square(double size) {
        super(size, size);
    }

    public Square(double size, String color, boolean filled) {
        super(size, size, color, filled);
    }
    @Override
    public void setWidth(double size) {

        super.setWidth(size);
    }
    @Override
    public void setLength(double size) {
        super.setLength(size);
    }

    public double getSize() {
        return super.getWidth();
    }

    public void setSize(double size) {
        super.setWidth(size);
        ;
    }
    @Override
    public String toString() {
        return "Square " + " { " + " size " + getWidth() + " }";
    }
}
