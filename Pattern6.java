//      * 
//     * * 
//    *   *
//   *     *
//  *       *
// ***********
import java.util.*;
public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter hight ");
        int hight = sc.nextInt();
        int space=hight;
        for(int i=1;i<=hight;i++){
            for(int s=1;s<=space-1;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i*2-1;j++){
                if (j==1||j==2*i-1||i==hight) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                
            }
            space--;
            System.out.println();
        }
    }
}
