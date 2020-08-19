package Tuan5;

public class Division extends BinaryExpression {
    public Division(Expression left, Expression right) {
        super(left, right);
    }
    public String toString(){
        return "(" + left.toString() + " / " + right.toString() + ")";
    }
    public double evaluate() throws ArithmeticException{
        if (right.evaluate() == 0){
            throw new ArithmeticException("Lỗi chia cho 0");
        }else{
            return left.evaluate() / right.evaluate();
        }
    }
}
