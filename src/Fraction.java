public class Fraction {
    int numerator;
    int denominator;

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public Fraction(){
        
    }
    public Fraction reduce(){
        int x = bai1.gcd(this.numerator, this.denominator);
        Fraction f = new Fraction();
        f.setNumerator(this.numerator/x);
        f.setDenominator(this.denominator/x);
        return f;
    }
    public void print(){
        System.out.println(this.numerator+"/"+ this.denominator);
    }
}
