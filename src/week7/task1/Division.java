package week7.task1;

public class Division extends BinaryExpression {

    public Division(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return left.toString() + " / " + right.toString();
    }

    @Override
    public int evaluate() {
        return left.evaluate() / right.evaluate();
    }
}
