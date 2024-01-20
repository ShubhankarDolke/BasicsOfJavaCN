package Recursion;


public class FactorialRec {

    public static long fact(int n){
        if(n == 0) {
            return 1;

        }
        long smallerOutput =fact(n - 1);
        long output = n * smallerOutput;
        return output;
    }

    public static void main (String [] args ) {

        int a =9;
        System.out.println(fact(a));

    }
}

