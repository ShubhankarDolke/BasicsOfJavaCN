package TestExceptions;

public class DemoException {

    public static void main(String[] args) {
        int i, j, k ;

        i = 4;
        j = 0;
        int [] a = new int[4];

        try{
            try{
                k = i / j;
            }catch (ArithmeticException ae) {
                System.out.println("in first try");
            }

            for(int s = 0; s < 4; s++) {
                a[s] = s +1;
            }

            for(int p = 0; p < 5; p++) {
                System.out.println(a[p]);
            }


//            System.out.println(k);
        } catch (ArithmeticException ae) {
            System.out.println("in a catch block ex");
            System.out.println(ae);
        }catch (IndexOutOfBoundsException ie) {
            System.out.println("max no of index is");
            System.out.println(ie);
        }

        System.out.println("End Pro");
    }
}
