package ifelse;

import java.util.Scanner;

public class IfExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value a");
        int a = sc.nextInt();
        System.out.println("enter the power ");
        int pow = sc.nextInt();
        int square=1;
        for(int i=1;i<=pow;i++){
             square = square*a;
            
        }
        System.out.println(square + " ");

    }
}
