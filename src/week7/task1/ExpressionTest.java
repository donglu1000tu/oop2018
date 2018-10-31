package week7.task1;

public class ExpressionTest {
    public static void main(String[] args) {
        Square a = new Square(new Numeral(10));
        Subtraction b = new Subtraction(a, new Numeral(1));
        Multiplication c = new Multiplication(new Numeral(2), new Numeral(3));
        Addition d = new Addition(b, c);
        Square res = new Square(d);
        System.out.println(res.toString() + " = " + res.evaluate());
        Division division = new Division(new Numeral(10), new Numeral(0));
        System.out.println(division.evaluate());
    }
}
