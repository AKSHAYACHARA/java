
import java.util.Scanner;

class BankAccount{
    private int A_no;
    private float Balance;
   
    void Aset(int A_no,float Balance){
        if(A_no>0000 && A_no<9999 && Balance>0){
        this.A_no=A_no;
        this.Balance=Balance;
        }
    }

    int Aget(){
        return A_no;
    }

    float Aget1(){
        return Balance;
    }

    void deposit(){
        if(A_no>=0000 && A_no<=9999 && Balance>0){
            Aget();
            Aget1();
        }
        System.out.println("Amount Deposit");
    }

    void withdraw(){
        if(A_no>=0000 && A_no<=9999 && Balance>0){
            Aget();
            Aget1();
        }
        System.out.println("Amount Withdraw");
    }
   
}
public class Encapsule {
    public static void main(String[] args) {
        BankAccount k=new BankAccount();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Account Number of 4 Digit");
        int A_no=sc.nextInt();
        System.out.println("Enter Balance Greater than 0");
        float Balance=sc.nextFloat();
        k.Aset(A_no, Balance);
        System.out.println(k.Aget());
        System.out.println(k.Aget1());
        k.deposit();
        k.withdraw();

    }
}
