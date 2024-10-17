class A{
   class B{
    private B(){
        System.out.println("hello world");
    }
    static void show(){
        new A().new B();
    }
   }
   static void hello(){
    B.show();
   }
}

public class SingleTnClass {
    public static void main(String[] args) {
       A p=new A();
       p.hello();
    }
}
