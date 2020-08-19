package Tuan5;

public class Numeral extends Expression{
    private int value;

    public Numeral() {

    }

    public Numeral(int value) {

    }

    @Override
    public String toString() {
        return value + "";
    }

    @Override
    public double evaluate() {
        return 0;
    }
}
