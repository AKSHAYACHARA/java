//       *******
//      *******
//     *******
//    *******
//   *******
//  *******
// *******


public class Pattern15 {
    public static void main(String[] args) {
        for(int i=1;i<=7;i++){
            for(int s=7;s>=i;s--){
                System.out.print(" ");
            }
            for(int j=1;j<=7;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
