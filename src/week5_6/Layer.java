package week5_6;


import week4.task2.Shape;


import java.util.ArrayList;

public class Layer extends  Diagram {
    ArrayList<Shape> shape = new ArrayList<>();

    public void dellTriangle(){
        for (int i = 0 ; i < shape.size(); i++){
            if(shape.get(i) instanceof Triangle)
                shape.remove(i);
        }
    }


}
