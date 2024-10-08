// 20. Pascal's Triangle in C
// Rows: 6

// Preview
//           1
//         2 3 2
//       3 4 5 4 3
//     4 5 6 7 6 5 4
//   5 6 7 8 9 8 7 6 5
// 6 7 8 9 10 11 10 9 8 7 6

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hight = sc.nextInt();
        int space = hight;
        for(int i=1;i<=hight;i++){
            for(int j=1;j<space;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i*2-1;k++){
                System.out.print(i + " ");
            }
            space--;
            System.out.println();
        }
    }
}
