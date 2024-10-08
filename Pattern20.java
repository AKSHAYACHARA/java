// 1
// 121
// 12321
// 1234321
// 123454321
// 12345654321

public class Pattern20 {
    public static void main(String[] args) {
        for(int i=1;i<=6;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            for(int k=i-1;k>=1;k--){
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
