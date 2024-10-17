import java.util.Scanner;

public class GetSet {
    private int a;
    private int b;
    public void setA(int a) {
        this.a = a;
    }
    public void setB(int b) {
        this.b = b;
    }
    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
    public void add(){
        int c = a+b;
        System.out.println(c);
    }
    public static void main(String[] args) {
        GetSet ac = new GetSet();
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b = sc.nextInt();
        ac.setA(a);
        ac.setB(b);
        System.out.println(ac.getA());
        System.out.println(ac.getB());
        ac.add();
    }
}
