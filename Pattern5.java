//     *
//    ***
//   *****
//  *******
// *********


import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        int space;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the hight ");
        int hight = sc.nextInt();
        space=hight;
        for(int i=1;i<=hight;i++){
            for(int s=1;s<=space-1;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i*2-1;j++){
                System.out.print("*");
            }
            space--;
            System.out.println();
        }
    }
}
