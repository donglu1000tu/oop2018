package week4.task1;

public class Hoaqua {
    private int cost;
    private String round;

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getRound() {
        return round;
    }

    public void setRound(String round) {
        this.round = round;
    }

    public Hoaqua() {
        cost = 100000;
        round = " Tròn ";
    }

    public Hoaqua(int cost, String round) {
        this.cost = cost;
        this.round = round;
    }

    public String Quality() { // Chất lượng
        if (cost >= 100000) return "Good";
        return "NOT Good";
    }

    public String taste() {
        return "Delicous";
    } // Nếm thử


    public String toString() {
        return "Hoaqua{" +
                "cost=" + cost +
                ", round='" + round +
                '}';
    }

    public static void main(String[] args) {
        Hoaqua fruit = new Hoaqua();
        Hoaqua fruit1 = new Hoaqua(20000, "Length");
        fruit.Quality();
        fruit1.taste();
        System.out.println(fruit.toString());
    }
}
