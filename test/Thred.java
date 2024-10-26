class A extends Thread implements Runnable{
    public void run(){
       for(int i=1;i<=10;i++){
        if (i%2==0) {
            System.out.println(i);
        }
       }
       System.out.println();
    }
}

class B extends Thread implements Runnable{
    public void run(){
        for(int i=1;i<=10;i++){
          if (i%2==1) {
            System.out.println(i);
          }
        }
    }
}


public class Thred {
    public static void main(String[] args) {
        A obj = new A();
        B boj1 = new B();
        obj.run();
        boj1.run();
    }
}
