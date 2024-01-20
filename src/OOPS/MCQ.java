package OOPS;

public class MCQ {
    public static void main(String[] args) {

        Test t = new Test();
        t.set_marks(78);
        System.out.println(Test.marks);

        Test t2 = new Test();
        t2.set_marks(999);
        System.out.println(Test.marks);


    }
}
