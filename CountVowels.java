import java.util.Scanner;

public class CountVowels {

    public static void count(char c[]){
      int count = 0;
      for(int i=0;i<c.length;i++){
        if (c[i]=='a'||c[i]=='e' || c[i]=='i' || c[i] == 'o' || c[i]=='u') {
            count++;
        }
      }
      System.out.println("number of vowels in array " + count);
    }
    public static void main(String[] args) {

        //first way 
        // char c [] = {'a','b','e','f','i'};
        // int count = 0;
        // for(int i=0;i<c.length;i++){
        //     if (c[i]=='a' || c[i]=='e' || c[i]=='i'|| c[i]=='o'|| c[i]=='u') {
        //         count++;
        //     }
        // }
        // System.out.println("number of vowels in array " + count);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        int size = sc.nextInt();
        char c[] = new char[size];
        for(int i=0;i<c.length;i++){
            c[i] = sc.next().charAt(i);
        }
        count(c);
    }
}
