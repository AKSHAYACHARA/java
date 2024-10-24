public class SwapLastToFirstElement {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        // int temp = a[0];
        //  a[0] = a[a.length-1];
        //  a[a.length-1] = temp;

         a[1] = a[1] + a[a.length-2];
         a[a.length-2] = a[1]-a[a.length-2];
         a[1] = a[1]-a[a.length-2];
         for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
         }
    }
}
