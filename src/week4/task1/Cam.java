package week4.task1;

public class Cam extends Hoaqua {
    private String color;
    private String address;

    public Cam() {
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public Cam(String color, String address) {
        this.color = color;
        this.address = address;
    }

    public String outorin() {

        if (this.address.equals("VN")) return "Nội nhập";
        return "Ngoại nhập";
    }

    public Cam(boolean check, float weigh) {
        color = "Orange";
        address = "VN";
    }


    public String toString() {
        return "Cam{" +
                "color='" + color +
                ", address='" + address + "cost=" + super.getCost() +
                ", round='" + super.getRound() + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Cam orange = new Cam("Red", "Laos");
        orange.outorin();
        System.out.println(orange.toString());
    }
}