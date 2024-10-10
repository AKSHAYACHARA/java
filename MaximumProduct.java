public class MaximumProduct {

    public static void sorted(int a[]){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if (a[i]>a[j]) {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
    }
    public static void maxproduct(int a[]){
        int max = 0;
        for(int i=0;i<a.length;i++){
            if (max<a[i]) {
                max=a[i];
            }
        }
        int max2 = 0;
        for(int i = 0;i<a.length-1;i++){
            if (max2<a[i]) {
                max2=a[i];
            }
        }
        int product = max*max2;
        System.out.println("maximum product " + product);
    }
    public static void main(String[] args) {
        int a[] = {2,4,3,7,8,5};
        sorted(a);
        maxproduct(a);
    }
}
