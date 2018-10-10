/**
 * Package bài làm cho Câu 2
 * TODO: Khai báo các class, thuộc tính và phương thức như biểu đồ lớp của Câu 2. 1 file chỉ khai báo 1 class
 * TODO: Viết comment và khai báo getter, setter đầy đủ như yêu cầu ở Câu 1
 * TODO: Sử dụng số PI tự định nghĩa dùng cho các phương thức getArea() và getPerimeter()
 * @author cuong
 * @version 0.1
 */
package week4.task2;
public class week4{}

class Shape{
	private String color = "red" ;
	private boolean filled = true ;

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
	public Shape(){}
	public Shape(String color , boolean filled){
		this.color = color ;
		this.filled = filled ;
	}
	

	
	public String toString() {
		return "Shape{" +
				"color='" + color + '\'' +
				", filled=" + filled +
				'}';
	}
}
class Circle extends Shape{
	private double radius = 1.0 ;
	public Circle(){}
	public Circle(double radius , String color , boolean filled){}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getarea(){}
	public double getPerimeter(){}

	
	public String toString() {
		return "Circle{" +
				"radius=" + radius +
				'}';
	}
}
class Rectangle extends Shape{
	private double width = 1.0 ;
	private double length = 1.0 ;

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	public Rectangle(){}
	public Rectangle(double width , double length){}
	public Rectangle(double width , double length , String color , boolean filled){}
	public double getarea(){}
	public double getPerimeter(){}

	
	public String toString() {
		return "Rectangle{" +
				"width=" + width +
				", length=" + length +
				'}';
	}
}
class Square extends Rectangle{
	public Square(){}
	public Square(double size){}
	public Square(double size , String color , boolean filled){}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	public double getSize(){
		return size ;
	}
	public void setSize(double size){
		this.size = size ;
	}
	public String toString(){}
}