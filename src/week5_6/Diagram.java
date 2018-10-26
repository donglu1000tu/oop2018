package week5_6;


import week4.task2.Circle;
import week4.task2.Square;

public class Diagram {

    public void deleteCircle(Layer layer){
        for (int i = 0; i < layer.shape.size(); i++){
            if(layer.shape.get(i) instanceof Circle)
                layer.shape.remove(i);
        }
    }

     public static void toString(Layer layer){
        System.out.println(layer.shape.toString());
    }
    public static void main(String[] args) {
        Diagram diagram = new Diagram();
        Layer layer = new Layer();
        diagram = layer;
        Circle circle = new Circle(1, 2, 3);
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        layer.shape.add(circle);
        layer.shape.add(triangle);
        layer.shape.add(square);
        layer.shape.add(rectangle);
        System.out.println("Ban dau");
        toString(layer);
        System.out.println("After delete Triangle");
        layer.dellTriangle();
        toString(layer);
        System.out.println("After delete Circle");
        diagram.deleteCircle(layer);
        toString(layer);
    }
}
