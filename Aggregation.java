class B{
    public static final char[] a = null;
    A p;
    B(A p){
        this.p=p;
    }
    void show(){
        System.out.println(p.b);
    }
}
public class Aggregation {
    public static void main(String[] args) {
        A k=new A(2);
        B p=new B(k);
        p.show();
    }
}
