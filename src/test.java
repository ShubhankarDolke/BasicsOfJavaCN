 class test {
    int a;
    int b;

    public void set(int a , int b) {
        b = a;
        this.b = b;

    }

    public void display(){
        System.out.println("a=" + a +" b=" + b);

    }

}

 class t {
    public static void main(String [] args ) {
        test object = new test();

        object.set(10,20);
        object.display();
    }
 }
