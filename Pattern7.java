// *******
// *    *
// *   *
// *  *
// * *
// **
// *

public class Pattern7 {
    public static void main(String[] args) {
        for(int i=1;i<=7;i++){
            for(int j=7;j>=i;j--){
                if (i==1||j==i||j==7) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
