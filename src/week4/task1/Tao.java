package week4.task1;

/**
 * @author Dang
 */
public class Tao extends Hoaqua {
    private String color;
    private String date;
    public static final String ex = "07/12/2020";

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


    public String getFruitName() {
        return "Táo";
    }


    public Tao() {
        color = "Red";
        date = "1/10/2018";
    }

    public Tao(String color, String date, int cost, String round) {
        super(cost, round);
        this.color = color;
        this.date = date;
    }

    public boolean checkdate() {
        return this.date.equals(ex);
    }

    @Override
    public String toString() {
        return "Tao{" +
                "color='" + color +
                ", date='" + date + "cost=" + super.getCost() +
                ", round='" + super.getRound() +
                '}';
    }

    public static void main(String[] args) {
        Tao apple1 = new Tao("Yellow", "2/10/2017", 200000, "not circle");
        apple1.checkdate();
        System.out.println(apple1.toString());
    }
}
