public class PalindromeArray {
    public static void main(String[] args) {
        int a[] = {155,343,678,989};
        for(int i=0;i<a.length;i++){
            int num = a[i];
            int temp = num;
            int sum =0;
            int rem =0;
            while (num>0) {
                rem = num%10;
                sum = sum * 10 + rem;
                num = num/10;
            }
            if (sum==temp) {
                System.out.println(sum + " ");
            }
        }
    }
}
