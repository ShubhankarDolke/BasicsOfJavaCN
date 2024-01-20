package DynamicArray;

public class DynamicArray {

    private int [] data;
    private int nextElementIndex ;


    public DynamicArray() {
        data = new int[5];
        nextElementIndex = 0;

    }

    public int size(){
        return nextElementIndex;

    }

    public int get(int index) {
        if(index < nextElementIndex && index >= 0){
            return data[index];
        }else{
            System.out.println("Index Out of Bound =>");
            return 0;

        }


    }

    public boolean isEmpty(){
        return nextElementIndex == 0;

    }

//    public void set(int index, int element) {
//        if(index < nextElementIndex && index >= 0){
//            data [index] = element;
//        }else{
//            System.out.println("Invalid Index => ");
//
//
//        }
//
//
//
//    }
public void set(int index, int element) {
    if(index < nextElementIndex ){
        data [index] = element;
    }else{
        try{
            throw new InvalidIndexException();
        }catch(InvalidIndexException e) {
            System.out.println("nvalid Index Index OOB");


        }

//        System.out.println("Invalid Index => ");


    }



}

    public int removeLastElement(){
        if(nextElementIndex == 0) {
            System.out.print("Remove element out of bound =>");
            return 0;

        }else{
            int temp = data [nextElementIndex - 1] ;
            data [nextElementIndex -1 ] = 0;

            nextElementIndex--;
            return temp;

        }


    }

    public void add(int element ) {
        if(nextElementIndex == data.length) {
            doubleCapacity();
        }
        data [nextElementIndex] = element;
        nextElementIndex++;


    }

    private void doubleCapacity() {

        int [] temp = data;
        data = new int[2 * temp.length];
        for(int i = 0 ; i < temp.length ; i++) {
            data[i] = temp [i];
        }


    }

    public void add(int index , int element ) {

        if(index > nextElementIndex) {
            System.out.println("Index Out of Bound add not possible ");

            return;
        }
        if(nextElementIndex == data.length) {
            doubleCapacity();
        }
        for(int i = nextElementIndex - 1   ; i >= index  ; i--) {
            data[i + 1] = data[i];
        }

        data [index] = element;
        nextElementIndex++;

    }

    public void remove(int index) {
        if(index > nextElementIndex) {
            System.out.println("Index Out of Bound remove not possible ");
            return;

        }
        data [index] = 0;
        nextElementIndex--;
        for(int i = index; i < nextElementIndex ; i++) {
            data[i ] = data[i + 1 ];

        }




    }


}
