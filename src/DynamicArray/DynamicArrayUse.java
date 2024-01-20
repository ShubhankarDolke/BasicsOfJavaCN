package DynamicArray;



public class DynamicArrayUse {


 public static void main (String [] args) {

  DynamicArray d = new DynamicArray();

  for(int i = 0; i < 10; i++){
   d.add(100 + i);
  }


//     try {
         d.set(100,3);
//     } catch (InvalidIndexException e) {
//      System.out.println("Invalid Index");
//
//     }

//  int a = d.size();
//  int b = d.get(9);
//  int c = d.removeLastElement();
//  System.out.println(b);
  System.out.println("Size = " + d.size());

  for(int i = 0; i < d.size(); i++){
   int a = d.get(i);

   System.out.print(a + " ");
  }
  System.out.println();
  d.remove(2);

  for(int i = 0; i < d.size(); i++){
   int a = d.get(i);

   System.out.print(a + " ");
  }




//
//  int b = d.get(8);
//  int c = d.get(9);
//
//  System.out.println("after  add fn 8 =="+ b);
//  System.out.println("after  add fn 9 =="+ c);


//  d.remove(4);









//
//
//     size();
//    get(index)
//        isEmpty();
//    add(element );
//    removeLast();
//
//     set(int index , int elemtn)



 }


}
