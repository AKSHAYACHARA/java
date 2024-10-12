  class A{
   private A(){
        System.out.println("contercter " );
    }
   
    // abstract void show(int a);
   static void show1(){
        new A();
        
        System.out.println(" non absterct method");
    }
}



public class Abstract {
    public static void main(String[] args) {
        
        A.show1();

    }
}
