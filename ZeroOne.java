public class ZeroOne {
     static void printf(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
     }

     static void sorted(int a[]){
        int count = 0 ;
        for(int i=0;i<a.length;i++){
            if (a[i] == 0) {
                count++;
            }
        }

        for(int i=0;i<a.length;i++){
            if (i<count) {
                a[i] = 0;
            }else{
                a[i] = 1;
            }
        }

     }
    public static void main(String[] args) {
        int a[] = {1,0,0,1,0,1,0,1,0,0,0};
        printf(a);
        System.out.println();
        sorted(a);
        printf(a);
    }
}
