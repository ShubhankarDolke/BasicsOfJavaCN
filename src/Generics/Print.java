package Generics;



public class Print {

    public static <T>void printArray(T [] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        Integer [] arrInt = new Integer [5];
        for(int i = 0; i < arrInt.length; i++) {
            arrInt[i] = i + 1;

        }

        String [] arrString = new String[5];
        for(int i = 0; i < arrString.length;i++) {
            arrString [i] = "Avc" + i;

        }

        Vehical [] arrVehical = new Vehical[5]; // only created reference
        for(int i = 0; i < arrVehical.length; i++) {
            arrVehical [i] = new Vehical();

        }


//        printArray(arrInt);
//        printArray(arrString);
        printArray(arrVehical);




    }
}
