public class SecondLargestElement {
    public static void main(String[] args) {
        int temp;
        int size ;
       
        int a[] = {10,20,25,54,67,87,45};
        size  = a.length;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if (a[i]<a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(a[size-2]);
    }
}
