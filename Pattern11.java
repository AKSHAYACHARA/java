//       *******
//      ******
//     *****
//    ****
//   ***
//  **
// *
//  **
//   ***
//    ****
//     *****
//      ******
//       *******

public class Pattern11 {
    public static void main(String[] args) {
        for(int i=1;i<=7;i++){
            for(int s=7;s>=i;s--){
                System.out.print(" ");
            }
            for(int j=7;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=2;i<=7;i++){
            for(int s=1;s<=i;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
