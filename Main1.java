// 7)
// Matrix Addition
// Question: Write a Java program to add two 2D arrays (matrices) of the same dimensions.
// Test: Understanding matrix addition.

// input :
// int[][] matrix1 = {{1, 2}, {3, 4}};
// int[][] matrix2 = {{5, 6}, {7, 8}};

// output : 
// Sum = {{6, 8}, {10, 12}}


   
  
  
    

public class Main1 {
    abstract class A {
        abstract void show();
      }
      public class B extends A{
        void show(){
          System.out.println("hello");
        }
      }
    
    public static void main(String[] args) {
       A k = new B();
       k.show();
    }
}
