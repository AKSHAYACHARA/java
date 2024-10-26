import java.util.Scanner;
public class Pascal {

    
    static void printArray(int a[][]) { 
        for (int i = 0; i < a.length; i++) { 
            for (int j = 0; j < a[i].length; j++) { 
                System.out.print(a[i][j] + " "); 
            }
            System.out.println(); 
        }
    } 
    static int[][] printPascal(int n) { 
        int step[][] = new int[n][]; 
        for (int i = 0; i < n; i++) { 
            step[i] = new int[i + 1]; 
            step[i][0] = step[i][i] = 1; 
            for (int j = 1; j < i; j++) { 
                step[i][j] = step[i - 1][j - 1] + step[i - 1][j]; 
            } 
        } 
        return step; 
    } 

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter  Pascal triangle: "); 
        int rows = sc.nextInt(); 
        
        if (rows < 1) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int arr[][] = printPascal(rows); 
        printArray(arr); 
    }
}

    

