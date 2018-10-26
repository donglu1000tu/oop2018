package week5_6;

import week4.task2.Shape;

public class Rectangle extends Shape {
    private Point topleft ;
    private Point botright ;

    public Point getTopleft() {
        return topleft;
    }

    public void setTopleft(Point topleft) {
        this.topleft = topleft;
    }

    public Point getBotright() {
        return botright;
    }

    public void setBotright(Point botright) {
        this.botright = botright;
    }
    public Rectangle(){
        topleft = new Point() ;
        botright = new Point();
    }
    public void move(Point topleft, Point botright){
        this.topleft.move(topleft.getX(),topleft.getY());
        this.botright.move(botright.getX(), botright.getY());
    }
    @Override
    public void randommove(){
        this.topleft.randommove();
        this.botright.randommove();
        if (topleft.getX()>botright.getX()||topleft.getY()<botright.getY()){
            Point tmp = new Point() ;
            tmp = topleft ;
            topleft = botright ;
            botright = tmp ;
        }
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "topleft=" + topleft +
                ", botright=" + botright +
                '}';
    }
}
