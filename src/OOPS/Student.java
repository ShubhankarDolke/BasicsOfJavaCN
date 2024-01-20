package OOPS;

class Student {
    String name;
    int rollNum ;
    private static int numStudent ;

    private final static double CONVO_FACT = 0.95;

    private int marks;



    public void print() {
        System.out.println("Name: " + name + " Roll Number: " + rollNum );
    }

    Student(String name, int rollNum) {
        this.name = name;
        this.rollNum = rollNum;
        numStudent++;


    }

    static int getNumStudent() {
        return numStudent;

    }

    static double getConvoFact(){
        return CONVO_FACT;
    }

     void setStudentMarks(int marks) {
        this.marks = marks;
    }


    public int divide(int a , int b) {

        try {
            if (b == 0) {
                throw new DivideByZeroException();
            }
            return a/ b;

        } catch (DivideByZeroException e) {
            System.out.println("Division By Zero not define");

            return 0;
        }

    }
}


