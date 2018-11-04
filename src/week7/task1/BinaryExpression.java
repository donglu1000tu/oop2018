package week7.task1;

public abstract class BinaryExpression extends Expression {
    protected Expression left;
    protected Expression right;

    public Expression left() {
        return left;
    }

    public Expression right() {
        return right;
    }


}
