public class Pattern {
    public static void main(String[] args) {
        int a=7;
        for(int i=1;i<=6;i++){
            for(int s=1;s<=i;s++){
                System.out.print(" ");
            }
            for(int j=6;j>=i;j--){
                // if (j==6||j==1||i==1 ) {
                    System.out.print(a);
                // }
                // else{
                //     System.out.print(" ");
                // }  
                a++;
            }
            System.out.println();
            a=a+1;
            
        }
    }
}
