// ***********
//  *       *
//   *     * 
//    *   * 
//     * * 
//      *

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter hight ");
       int hight=sc.nextInt();
       int space=hight;
        for(int i=hight;i>=1;i--){
           for(int s=1;s<=space-1;s++){
            System.out.print(" ");
           }
           for(int j=1;j<=i*2-1;j++){
            if (i==hight||j==2*i-1||j==1) {
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
           }
           space++;
           System.out.println();
        }
    }
}
