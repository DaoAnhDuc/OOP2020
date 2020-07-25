public class bai2 {
    public static void main(String[] args) {
        Fraction f = new Fraction(3,6);
        Fraction ff = new Fraction(3,6);
        f.print();
        f.reduce();
        f.print();
        Fraction fff = f.add(ff);
        fff.print();
        fff = f.subtract(ff);
        fff.print();
        fff= f.multiply(ff);
        fff.print();
        fff = f.divide(ff);
        fff.print();
        System.out.println(f.equals(ff));
    }
}
