import java.util.Scanner;

public class Duplicate1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size ");
        int size = sc.nextInt();
        
        int a[] = new int[size];
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
           System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("duplicate value");
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if (a[i]==a[j]) {
                    System.out.print(a[i]+ " ");
                }
            }
        }
        
    }
}
