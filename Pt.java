public class Pt {
    public static void main(String[] args) {
        int a=7;
        int b=5;
        for(int i=1;i<=6;i++){
            for(int s=1;s<=i;s++){
                System.out.print(" ");
            }
            for(int j=6;j>=i;j--){
                if (i==1 || i==j|| j==6) {
                    System.out.print(a+"");
                }else
                {
                    System.out.print(" "+" ");
                }
                
                a++;

            }
            
            a=a-b;
            b--;
            
            System.out.println();
        }
    }
}
