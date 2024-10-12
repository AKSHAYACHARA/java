 class A{
    public void show(){
       System.out.println("hello");
    }
    protected int show1(int a){
        System.out.println("hiii");
        return show2(a);
        
    }
    private int show2(int a){
        System.out.println(5);
        return a;
    }

    // public int show3(int a){
    //     return show2(a);
        
    // }
}

public class Encapsulation {
    public static void main(String[] args) {
        A k = new A();
        k.show();
        System.out.println(k.show1(12));
        // System.out.println(k.show3(10));
        
    }
}
