public class bai2 {
    public  static Fraction add(Fraction a, Fraction b){
        Fraction res =  new Fraction();
        res.setNumerator(a.getNumerator()*b.getDenominator()+ b.getNumerator()*a.getDenominator());
        res.setDenominator(a.getDenominator()*b.getDenominator());
        return res.reduce();
    }
    public  static Fraction subtract(Fraction a, Fraction b){
        Fraction res =  new Fraction();
        res.setNumerator(a.getNumerator()*b.getDenominator() - b.getNumerator()*a.getDenominator());
        res.setDenominator(a.getDenominator()*b.getDenominator());
        return res.reduce();
    }
    public  static Fraction multiply(Fraction a, Fraction b){
        Fraction res =  new Fraction();
        res.setNumerator(a.getNumerator()* b.getNumerator());
        res.setDenominator(a.getDenominator()*b.getDenominator());
        return res.reduce();
    }
    public  static Fraction divide(Fraction a, Fraction b){
        Fraction res =  new Fraction();
        res.setNumerator(a.getNumerator()*b.getDenominator());
        res.setDenominator(a.getDenominator()*b.getNumerator());
        return res.reduce();
    }
    public static boolean equals(Object a, Object b){
        if(a instanceof Fraction && b instanceof Fraction){
            Fraction x = ((Fraction) a).reduce();
            Fraction y = ((Fraction) b).reduce();
            if(x.getNumerator() == y.getNumerator() && x.getDenominator() == y.getDenominator()){
                return true;
            }else{
                return false;
            }
        }else{
            return  false;
        }
    }

    public static void main(String[] args) {
        Fraction f = new Fraction(3,6);
        f.print();
        Fraction x = f.reduce();
        x.print();
        Fraction y = add(x, f);
        y.print();
        y = subtract(x,f);
        y.print();
        y = multiply(x,f);
        y.print();
        y = divide(x,f);
        y.print();

        System.out.println(equals(x, y));
    }
}
