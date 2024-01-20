package Factorization;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {

        if(numerator == 0) {
            System.out.println("Invalid Input => Numerator more than 0 ");
        }else{
            this.numerator = numerator;
        }
        if(denominator == 0) {
            System.out.println("Invalid Input => Denominator more than 0 ");
        }else{
            this.denominator = denominator;
        }
        simplify();

    }

    private void simplify() {
//        simplify the num and deno
        int num = numerator;
        int deo = denominator;
        int GCD = 1;

        while (num != deo) {
            if(num > deo) {
                num = num - deo;

            }else{
                deo = deo - num;

            }
        }
        GCD = num;

        numerator= numerator / GCD;
        denominator = denominator / GCD;
    }

    void print(){
//        print num  and den
        System.out.println(numerator + "/" + denominator);
    }
     public void increment(){
        /* increment by 1   => add 1 in fraction then simplify */
        numerator = numerator + denominator;
        simplify();
    }

    public void add(@org.jetbrains.annotations.NotNull Fraction f2){
//        add fraction f1 and f2 and put answer in f1
        this.numerator = this.numerator * f2.denominator +  this.denominator * f2.numerator;
        this.denominator = this.denominator * f2.denominator;
        simplify();

    }


     public int GetNumerator(){
         return numerator;
     }

     public void SetNumerator(int numerator){
        if(numerator == 0){
            System.out.println("Invalid Input numerator ");

        }else{
            this.numerator = numerator;
        }

     }

     public int GetDenominator() {
         return denominator;

     }
     public void SetDenominator(int denominator) {
        if(denominator == 0) {
            System.out.println("Invalid Input denominator");
        }else{
            this.denominator = denominator;
        }


     }

    public static Fraction add(Fraction f1, Fraction f2) {
//        Add f1 and f1 then auto simplyfy becase of constructor
//        return f3;
        int newNumerator = f1.numerator * f2.denominator + f2.numerator * f1.denominator;
        int newDenominator = f1.denominator * f2.denominator;

        Fraction f3 = new Fraction(newNumerator, newDenominator);

        return f3;
//        return new Fraction(newNumerator, newDenominator);
    }

    public static Fraction subtract(Fraction f1, Fraction f2) {
        int newNumerator =f1.numerator * f2.denominator - f2.numerator * f1.denominator ;
        int newDenominator =f1.denominator *f2.denominator;

//        Fraction f3 = new Fraction(newNumerator, newDenominator);
        return new Fraction(newNumerator, newDenominator);


    }

    public static Fraction multiplication (Fraction f1, Fraction f2) {
        int newNumerator = f1.numerator * f2.numerator;
        int newDenominator = f1.denominator * f2.denominator ;

        return new Fraction(newNumerator, newDenominator);


    }

    public static Fraction divide(Fraction f1, Fraction f2) {
        int newNum = f1.numerator * f2.denominator;
        int newDeo = f1.denominator * f2.numerator;

        return new Fraction(newNum, newDeo);

    }





}
