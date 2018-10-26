package week4.task2;

import week5_6.Point;
import week5_6.Rectangle;

public class Square extends Rectangle
{
    private int side;
    public Square(){
        super();
        side =0;
        Point a = super.getTopleft();
        Point b = new Point();
        b.setX(a.getX()+side);
        b.setY(a.getY()-side);
        super.setBotright(b);
    }
    public void MoveTo(Point p){
        Point b = new Point();
        b.setX(p.getX()+side);
        b.setY(p.getY()-side);
        super.move(p,b);
    }
    public void MoveToRandom(){
        Point a = new Point();
        a.randommove();
        Point b = new Point();
        b.setX(a.getX()+side);
        b.setY(a.getY()-side);
        super.move(a, b);
    }
    public String toString(){
        return "Square";
    }

}
