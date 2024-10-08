//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hight = sc.nextInt();
        int sp = hight;
        for(int i=1;i<=hight;i++){
            for(int j=1;j<=sp-1;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i*2-1;k++){
                System.out.print("*");
            }
            sp--;
            System.out.println();
        }

        for(int i=1;i<=3;i++){
            for(int s=0;s<=i;s++){
                System.out.print(" ");
            }
            for(int j=5;j>=i*2-1;j--){
                System.out.print("*");
            }

            System.out.println();
            
        }
    }
}
