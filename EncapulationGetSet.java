import java.util.Scanner;

class Atm{
    private String acc_holder_name;
    private long account_no;
    private int pin;

    public void setA(String acc_holder_name , long account_no , int pin ){
        this.acc_holder_name=acc_holder_name;
        this.account_no=account_no;
        this.pin=pin;
    }

    public String getA(){
        return acc_holder_name;
    }
    public long getA1(){
        return account_no;
    }
    public int getA2(){
        return pin;
    }
}


public class EncapulationGetSet {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     Atm k= new Atm();
     System.out.println("enter pin ");
     int pin = sc.nextInt();
     if (pin==8400) {
        k.setA("Akshay", 998773843, 8400);
       System.out.println( " Account holder name: " + k.getA() );
       System.out.println("Account number " + k.getA1());
     }
     else{
        System.out.println("worng pin ");
     }
    }
}
