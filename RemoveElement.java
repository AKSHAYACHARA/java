public class RemoveElement {
    //3 se 7 or 8 se 5 
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9};
        for(int i=2;i<=6;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        //8 se 5
        for(int i=a.length-2;i>=4;i--){
            System.out.print(a[i] + " ");
        }
    }
}
