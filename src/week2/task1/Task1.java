package week2.task1;

public class Task1 {

    public static int gcd(int a, int b) {
        // TODO: Tính ước chung lớn nhất của 2 số a, b
    	
        if(b==0) return a ;
    	
    	else return gcd(b,a%b) ; // thuat toan Oclit
    }

    public static int fibonacci(int n) {
        // TODO: Tìm số fibonacci ở vị trí n
        if(n==0) return 0 ; // so thu 0 (neu co)
        else if(n==1) return 1 ;
        else return fibonacci(n-1) + fibonacci(n-2) ;  

    }

    
}
