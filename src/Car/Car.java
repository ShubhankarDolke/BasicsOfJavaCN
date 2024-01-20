package Car;

public class Car extends Vehical{

    int noDoors;

    Car(String color){
        super(color);
        this.color = color;
        System.out.println("In Cars para cont"+ this.color);
    }

     Car(){
         super();
        System.out.println("In vehicals default cont");


    }

}
