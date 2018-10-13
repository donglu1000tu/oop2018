package week4.task1;

public class CamThanhPhong extends Cam {
    private String exp;
    private int amount;

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }


    public CamThanhPhong() {
        amount = 100;
        exp = "12/12/2019";
    }

    public CamThanhPhong(String exp, int amount, String color, String address) {
        super(color, address);
        this.exp = exp;
        this.amount = amount;
    }

    public String checkamount(int amount) {
        if (amount > 100) return " Thừa." + "\n" + " Yêu cầu bớt ";
        if (amount < 100) return "Thiếu" + "\n" + "Yêu cầu thêm";
        else return " Đã đủ ";
    }

    public static void main(String[] args) {
        CamThanhPhong ort = new CamThanhPhong("27/01/2013", 200, "green", "VN");
        ort.checkamount(ort.getAmount());
        System.out.println(ort.toString());
    }
}