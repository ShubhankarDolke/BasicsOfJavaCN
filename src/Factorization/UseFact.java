package Factorization;

public class UseFact {

    public static void main(String [] args) {

        Fraction f1 = new Fraction(2,4);
        Fraction f2 = new Fraction(3,6);

//        Fraction f3 = Fraction.add(f1, f2);
//        f3.print();
//          Fraction f3 = Fraction.divide(f1, f2);
//          f3.print();
        Fraction f3 = Fraction.multiplication(f1, f2);
        f3.print();
//      f1.increment();
//        f1.add(f2);
//        f1.print();




    }
}
