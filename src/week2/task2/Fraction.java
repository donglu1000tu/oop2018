package week2.task2;

public class Fraction {

    // TODO: khai báo các thuộc tính
    private int numerator; // tử số 
    private int denominator; // mẫu số
    // hàm get set cho tử và mẫu
    public int getNumerator() { 
        return numerator;
    }
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    public int getDenominator() {
        return denominator;
    }
    public void setDenominator(int denominator) {
        if (denominator != 0)
            this.denominator = denominator;
        else {
            System.out.println("denominator = 0. Nhập lại: ");
            setNumerator(denominator);
        }
    }
    
    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numerator (tử số), denominator (mẫu số)
       
        this.numerator = numerator ;
        this.denominator = denominator ;
    }
    

    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction res = new Fraction(0,1) ; // hoặc tạo thêm 1 con structor nữa
        res.numerator = other.numerator*this.denominator + this.numerator*other.denominator;
        res.denominator = other.denominator *this.denominator;
        
        return res;
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
       Fraction res = new Fraction(0,1) ; 
        res.numerator = this.numerator*other.denominator - other.numerator*this.denominator;
        res.denominator = this.denominator*other.denominator;
        
        return res;
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
       Fraction res = new Fraction(0,1) ;
        res.numerator = this.numerator * other.numerator;
        res.denominator = this.denominator * other.denominator;
        
        return res;
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
       Fraction res = new Fraction(0,1) ;
        res.numerator = this.numerator * other.denominator; // (a/b) / (c/d) = (a*d) / (b*c)
        res.denominator = this.denominator * other.numerator;
        
        return res;
    }

    public boolean equals(Object obj) {
        if(obj == null ) return false ;
        else if(obj.getClass() != this.getClass()){
            Fraction other = (Fraction) obj ;
            
            if(this.equals(other)) return true ;
            return false ;
        }
        else{ if(this.equals(obj)) return true ;
                return false;
            }
    }
}
