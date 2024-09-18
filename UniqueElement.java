import java.util.Scanner;

public class UniqueElement {
    static void unique(int a[]){
        for(int i =0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if (a[i]==a[j]) {
                    a[i]=-1;
                    a[j]=-1;
                }
            }
        }

        for(int i=0;i<a.length;i++){
            if (a[i]>0) {
                System.out.print(a[i] + " ");
            }
        }

    }
    public static void main(String[] args) {
        int a[] = {1,2,1,3,5,2,6,6,4,3,9,7};
        unique(a);
       
    }
}
