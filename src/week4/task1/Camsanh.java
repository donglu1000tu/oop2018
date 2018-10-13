package week4.task1;

public class Camsanh extends Cam {
    private boolean check;
    private float weigh;

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    public float getWeigh() {
        return weigh;
    }

    public void setWeigh(float weigh) {
        this.weigh = weigh;
    }


    public Camsanh(boolean check, float weigh) {
        super(check, weigh);
        this.check = check;
        this.weigh = weigh;
    }

    public Camsanh() {

        weigh = 10;
        check = true;
    }

    public boolean checkchin() {
        return check;
    }

    @Override
    public String toString() {
        return "Camsanh{" +
                "check=" + check +
                ", weigh=" + weigh + "cost=" + super.getCost() +
                ", round='" + super.getRound() +
                '}';
    }

    public static void main(String[] args) {
        Camsanh ors = new Camsanh(true, 200);
        ors.checkchin();
        System.out.println(ors.toString());
    }
}