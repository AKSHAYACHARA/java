public class Pallindrom {

    static void printPallindrom(int a[]){
        for(int i=0;i<a.length;i++){
            int temp = a[i];
            int rem ;
            int sum = 0;
            while (a[i]>0) {
                rem = a[i] % 10;
                sum = sum * 10 + rem;
                a[i] = a[i]/10;
            }
            if (temp==sum) {
                System.out.println("pallindrome " + sum);
            }
            else{
                System.out.println("not " + sum);
            }

        }
    }
    public static void main(String[] args) {
        int a[] = {121,141,232,556,864,964};
        printPallindrom(a);

    }
}
