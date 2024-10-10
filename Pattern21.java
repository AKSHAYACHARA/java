public class Pattern21 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int s=5;s>=i;s--){
                System.out.print("$");
            }
           
            for(int j=2;j<=i*2-1;j++){
                System.out.print(" ");
            }
            for(int s1=5;s1>=i;s1--){
                System.out.print("$");
            }
            System.out.println();
        }
    }
}
