package week4.task2;

import week5_6.Layer;
import week5_6.Point;

import java.util.Random;

public class Shape extends Layer {
    private String color;
    private boolean filled;
    private int width ;
    private int length ;
    private Point point ;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Shape() {
        color = "red";
        filled = true;
    }

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

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public Shape(int width , int length , int x , int y){
        setPoint(new Point(x,y));
        setLength(length);
        setWidth(width);
    }

    public Shape(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public void randommove(){
        Random ran = new Random();
        int x = ran.nextInt(1023) + 1 ;
        int y = ran.nextInt(1023) + 1 ;
        this.point = new Point(x,y) ;
    }
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}