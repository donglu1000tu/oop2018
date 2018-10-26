package week5_6;

import java.util.Random;

public class Point {
    private int x ;
    private int y ;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void move(int x , int y){
        this.x = x ;
        this.y = y ;
    }
    public Point() {}

    public void randommove(){
        Random ran = new Random();
        int x = ran.nextInt(1024) ;     this.x = x ;
        int y = ran.nextInt(1024) ;     this.y = y ;
        }
}
