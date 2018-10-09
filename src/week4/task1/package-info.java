/**
 * Package bài làm cho Câu 1
 * TODO: Khai báo các lớp (class) theo Câu 1 yêu cầu. 1 file chỉ khai báo 1 class
 * TODO: Mô tả các quan hệ giữa các class và thêm thuộc tính, phương thức cho chúng (mỗi class ít nhất 2 phương thức, 2 thuộc tính)
 * TODO: Viết comment đầy đủ cho class, phương thức. Xem hướng dẫn tại đây (http://dongdiemthuy.github.io/java/javadoc/2014/09/30/su-dung-javadoc-va-maven-de-tao-tai-lieu-du-an.html)
 * @author cuong
 * @version 0.1
 */
package week4.task1;

/**
 * Lớp về Class Hoaqua
 *
 * @param cost : giá của hoa quả
 * @param name : tên của hoa quả
 * @param Constructor Hoaqua : lấy tên hoa quả
 */
public class Week4{
	public static void main(){
		Hoaqua fruit = new Hoaqua() ;
		Cam orange = new Cam(); 
		Camsanh cams = new Camsanh() ;
		CamThanhPhong camt = new CamThanhPhong();
		Tao tao = new Tao();
	}
}
class Hoaqua{
    private int cost ;
    private String name ;

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String Quality(){
        if(cost>=10000) return "Good" ;
        return "NOT Good" ;
    }
    public String taste(){
        return "Delicous" ;
    }

}


class Cam extends Hoaqua{
    private String color ;
    private String address;

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


    public String getFruitName() {
        return "Cam";
    }
    public Cam(){
        color = "Orange" ;
        address = "VN" ;
    }
}
class Tao extends Hoaqua{
    private String color ;
    private String date ;

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
    public Tao(){
        color = "Red" ;
        date = "1/10/2018" ;
    }
}
class CamThanhPhong extends Hoaqua{
    private String color ;
    private int amount ;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }


    public String getFruitName() {
        return "Cam Thanh Phong";
    }
    public CamThanhPhong()
    {
        color = "Green maybe" ;
        amount = 100 ;
    }
}
class Camsanh extends Hoaqua{
    private String color ;
    private float weigh ;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getWeigh() {
        return weigh;
    }

    public void setWeigh(float weigh) {
        this.weigh = weigh;
    }


    public String getFruitName() {
        return "Cam Sành";
    }
    public Camsanh(){
        color = "Oragne" ;

    }
}
