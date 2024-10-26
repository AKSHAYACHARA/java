
abstract class Vehicle{
    abstract void start();
    abstract void stop();

}

  class Car extends Vehicle implements FuelEfficiency{
    void start(){
       System.out.println("start car");
    } 
     void stop(){
      System.out.println("stop car");
    }
}

 class Bike extends Vehicle implements FuelEfficiency{

     void start(){
        System.out.println("start bike");
    } 
    void stop(){
        System.out.println("stop bike");

    }
    
}

interface FuelEfficiency{
   default void calculateFuelEfficiency(){
        System.out.println("Fuel  Efficiency ");
    }
}





public class Abs {
    public static void main(String[] args) {
        Car k = new Car();
        Bike o = new Bike();
        k.start();
        k.stop();
        k.calculateFuelEfficiency();
        o.start();
        o.stop();
        o.calculateFuelEfficiency();
        
    }
}
