public class ProductArray {
    public static void main(String[] args) {
        int a[] = {1,3,2,4,5,6,5,6,3,2,3,1,2,3,7,8,9};
        int product=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
               if (a[i]*a[j]>product) {
                  product = a[i]*a[j]; 
               }
            }
        }
        System.out.println(product);
        int product1=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
               if (a[i]*a[j]==product) {
                  continue;
               }
               else if (a[i]*a[j]>product1) {
                   product1 = a[i]*a[j];
               }
            }
        }
        System.out.print(product1 + " ");

    }
}
