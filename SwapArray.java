public class SwapArray {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        //swap 5 to 1
        for(int i=0;i<a.length;i++){
            a[0] = a[0]+a[a.length-1];
            a[a.length-1] = a[0]-a[a.length-1];
            a[0] = a[0]-a[a.length-1];
            System.out.print(a[i] + " ");
        }
    }
}
