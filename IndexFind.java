public class IndexFind {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6};
        int target = 4;
        System.out.println("Array ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for(int i=0;i<a.length;i++){
            if (target==a[i]) {
                System.out.println(i + " ");
            }
        }
    }
}
