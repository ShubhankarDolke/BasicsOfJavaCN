package Polynomial;


public class Polynomial {
    private int[] poliArr;



    /* This function sets coefficient for a particular degree value, if degree is not there in the polynomial
     *  then corresponding term with specified degree and value is added int the polynomial. If the degree
     *  is already present in the polynomial then previous coefficient is replaced by
     *  new coefficient value passed as function argument
     */

    public Polynomial() {
        poliArr = new int[0];


    }

    public void setCoefficient(int degree, int coeff) {


        this.poliArr[0] = degree;
        this.poliArr[0] = coeff;


    }

//    // Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree.
//    public void print() {
//        for (int i = degree.length - 1; i >= 0; i--) {
//            if (this.coeff[i] != 0) {
//                System.out.println(this.degree[i] + "x" + this.coeff[i]);
//            }
//        }
//
//
//    }


    // Adds two polynomials and returns a new polynomial which has result
//    public Polynomial add(Polynomial p) {
//
//
//    }
//
//    // Subtracts two polynomials and returns a new polynomial which has result
//    public Polynomial subtract(Polynomial p) {
//
//    }
//
//    // Multiply two polynomials and returns a new polynomial which has result
//    public Polynomial multiply(Polynomial p) {
//
//    }
}

