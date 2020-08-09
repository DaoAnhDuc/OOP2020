package Tuan2;

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
        this.setDenominator(this.getDenominator()/x);
        this.setNumerator(this.getNumerator()/x);
        return this;
    }
    public void print(){
        System.out.println(this.numerator+"/"+ this.denominator);
    }
    public  Fraction add(Fraction b){
        Fraction res =  new Fraction();
        res.setNumerator(this.getNumerator()*b.getDenominator()+ b.getNumerator()*this.getDenominator());
        res.setDenominator(this.getDenominator()*b.getDenominator());
        return res.reduce();
    }
    public Fraction subtract(Fraction b){
        Fraction res =  new Fraction();
        res.setNumerator(this.getNumerator()*b.getDenominator() - b.getNumerator()*this.getDenominator());
        res.setDenominator(this.getDenominator()*b.getDenominator());
        return res.reduce();
    }public Fraction multiply(Fraction b){
        Fraction res =  new Fraction();
        res.setNumerator(this.getNumerator()* b.getNumerator());
        res.setDenominator(this.getDenominator()*b.getDenominator());
        return res.reduce();
    }
    public Fraction divide(Fraction b){
        Fraction res =  new Fraction();
        res.setNumerator(this.getNumerator()*b.getDenominator());
        res.setDenominator(this.getDenominator()*b.getNumerator());
        return res.reduce();
    }
    public boolean equals(Object a){
        if(a instanceof Fraction){
            Fraction x = this.subtract((Fraction) a);
            if(x.getNumerator()==0){
                return true;
            }else{
                return  false;
            }
        }else{
            return  false;
        }
    }
}
