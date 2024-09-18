import java.util.*;

class Ar{

    // public static void display(int a[]){
    //     for(int i=0;i<a.length;i++){
    //         System.out.print(a[i] + " ");
    //     }
    // }
    //second way to print through for each loop
    // public static void display1(int a[]){
    //     for(int i:a){
    //         System.out.print(i + " ");
    //     }
    // }

    // public static void display(int a[]){
    //     for(int i=0;i<a.length;i++){
    //         System.out.println(a[i] + " ");
    //     }
    // }

    // public static void display(int a[]){
    //     for(int i=0;i<a.length;i++){
    //         System.out.print(a[i] + " ");
    //     }
    // }

    // public static void display(int a[]){
    //     for(int i=0;i<a.length;i++){
    //         System.out.print(a[i] + " ");
    //     }
    // }


    //unique element 

    // public static int printunique(int a[]){
    //   for(int i=0;i<a.length;i++){
    //     for(int j=i+1;j<a.length;j++){
    //       if (a[i]==a[j]) {
    //         a[i] = -1;
    //         a[j] = -1;
    //       }
    //     }
    //   }
    //   int ans = 0;
    //   for(int i=0;i<a.length;i++){
    //     if (a[i]>0) {
    //       ans = a[i];
    //     }
    //   }
    //     return ans;
    // }

    public static void printArray(int a[]){
      for(int i=0;i<a.length;i++){
        System.out.print(a[i] + " ");
      }
    }

    public static void shot(int a[]){
      for(int i=0;i<a.length;i++){
        for(int j = i+1;j<a.length;j++){
          if (a[i]>a[j]) {
             swap(a,i,j);
          }
        }
      }
    }

    static void swap(int a[],int i,int j){
      int temp = a[i];
      a[i] = a[j];
      a[j] = temp;

    }

    public static void main(String[] args) {
        //static type
        // int a [] = {1,2,34,5,4};
        // System.out.println(a[1]);

        //dynamic tyre of array 

        // int a[] = new int[5];
        // a[0] = 12;
        // a[1] = 54;
        // a[2] = 32;
        // a[3] = 54;
        // a[4] = 65;
        // System.out.println(a[5]);

        // All elements print

        // int a[] = {1,2,3,4,5,6,7};
        // for(int i=0;i<a.length;i++){
        //     System.out.print(a[i] + " ");
        // }

        //revere of array

        // int a[] = {1,2,3,4,56,7,7,};
        // for(int i=a.length-1;i>=0;i--){
        //     System.out.print(a[i] + " ");
        // }

        // user input of array
        
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter the size");
        // int size = sc.nextInt();
        // int a[] = new int[size];
        // //for input
        // for(int i=0;i<size;i++){
        //     System.out.println("enter the value");
        //     a[i] = sc.nextInt();
        // }
        // //for output

        // for(int i=0;i<size;i++){
        //     System.out.print(a[i]+ " ");
        // }

        // count total number of element

        // int a[] = {1,2,3,4,5,6,7,8};
        // int count=0;
        // for(int i=0;i<a.length;i++){
        //     count++;
        // }
        // System.out.println(count + " ");



        // sum of all element in array
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter size");
        // int size=sc.nextInt();
        // int sum =0;
        // int a[] = new int[size];
        // for(int i=0;i<a.length;i++){
        //     System.out.println("enter the value");
        //     a[i] = sc.nextInt();
        // }
        
        // for(int i=0;i<a.length;i++){
        //     sum = sum+i;
        //  }
        // System.out.print(sum + " ");
        // sum=0;
        // for(int i=0;i<a.length;i++){
        //    sum = sum+a[i];
        // }
        // System.out.print(sum + " ");


        // evan number in array

       //sum of all evan number in array

    //    Scanner sc = new Scanner(System.in);
    //    System.out.println("enter size ");
    //    int size = sc.nextInt();
    //    int a[] = new int[size];
    //    int sum=0;
    //    for(int i=0;i<a.length;i++){
    //     System.out.println("enter value");
    //     a[i] = sc.nextInt();
    //    }
    //    for(int i=0;i<a.length;i++){
    //     if (a[i]%2==0) {
    //         sum = sum + a[i];
    //     }
    //    }
    //    System.out.print("sum of all evan number " + sum);



    // addition of two array
    //  Scanner sc = new Scanner(System.in);
    //  System.out.println("enter size ");
    //  int size = sc.nextInt();
    // int a[] = new int[size];
    // int b[] = new int[size];
    // for(int i=0;i<a.length;i++){
    //     System.out.println("enter value");
    //     a[i] = sc.nextInt();
    // }
    // for(int j=0;j<a.length;j++){
    //     System.out.print(a[j] + " ");
    // }
    // System.out.println(" ");
    // for(int i=0;i<b.length;i++){
    //     System.out.println("enter value");
    //     b[i] = sc.nextInt();
    // }
    // for(int j=0;j<b.length;j++){
    //     System.out.print(b[j] + " ");
    // }
    // System.out.println(" ");
    // int sum[] = new int[size];
    // for(int i=0;i<a.length;i++){
    //     sum[i] = a[i] + b[i];
    //     System.out.print(sum[i] + " ");
    // }
    
    
    //chack a number is present in array or not

    // Scanner sc = new Scanner(System.in);
    // System.out.println("enter size ");
    // int size = sc.nextInt();
    // int a[] = new int[size];
    // System.out.println("enter target value ");
    // int target = sc.nextInt();
    // for(int i=0;i<a.length;i++){
    //     System.out.println("enter value");
    //     a[i] = sc.nextInt();
    // }
    // for(int i=0;i<a.length;i++){
    //     if (a[i]==target) {
    //         System.out.println("yes target present " + a[i]);
    //     }
    //     }

    

    // duplicate element in two array

    // int a[] = {1,2,3,4,5,6};
    // int b[] = {1,2,3,4,6,7};

    // for(int i=0;i<a.length;i++){
    //     if (a[i]==b[i]) {
    //         System.out.print("present" + i + ":" + a[i] + " ");
    //     }
    // }


    //pass by value in array
    
    // int a[] = {1,2,3,4,7,6};
    // display(a);
    // System.out.println("through for each loop ");
    // display1(a);
    // }



    //shallow copy
    // int a[] = {1,2,3,4,5};
    // display(a);
    // System.out.println();
    // System.out.print("copy of array ");
    // int b[] = a;
    // display(b);
    


    // if we change first array element to chack also change second array
    
    // int a[] = {12,32,45,65,76,87,98};
    // display(a);
    // System.out.println();
    // //change the a[] element
    // a[0] = 32;
    // a[1] = 65;
    // a[2] = 90;
    // display(a);
    // System.out.println();
    // System.out.print("B Array");
    // int b[] = a;
    // display(b);


    //deep copy 
    // int a[] = {12,23,34,45,56,67,78};
    // display(a);
    // int b[] = a.clone();
    // display(b);
    // //change element a[]
    // System.out.println("change element in a[] ");
    // a[0] = 21;
    // a[1] = 54;

    // display(a);
    // System.out.println("b array");
    // display(b);


    //two number sum

    // Scanner sc = new Scanner(System.in);
    // int a[] = {1,2,3,4,5,6,7,8,9,10};
    // System.out.println("enter target ");
    // int target = sc.nextInt();
    // for(int i=0;i<a.length;i++){
    //   for(int j=i+1;j<a.length;j++){
    //     if (a[i] + a[j] == target) {
    //       System.out.println("this is pair " + a[i] + " " + a[j]);
    //     }
    //   }
    // }


    //unique element 

    //  int a[] = {1,2,3,2,1,5};
    //  System.out.println(printunique(a));


    //max or min of array

    // int a[] = {1,2,3,4,532,54,2,3,1,1,1};
    // int min = a[0];
    // for(int i=1;i<a.length;i++){
      
    //     if (a[i]<min) {
    //       min = a[i];
    //     }
      
    // }
    // System.out.println(min + " ");

    // a[] = {1,2,3,4,5} target value 6 = 1+2+3=6

    // int a[] = {1,2,1,2,3,4,5,6,2,3,1};
    // int target = 6;
    // for(int i=0;i<a.length;i++){
    //   for(int j=i+1;j<a.length;j++){
    //     int k = i+1;
    //     if (a[i] + a[j] + k == target) {
    //        System.out.println("addtion of three array equal to target " + a[i] + " " + a[j] + " " +k  +"this is index : "+i+" "+j+" "+k);
    //     }
    //   }
    // }

    int a[] = {2,1,3,4,7,5,1,2,3};
    printArray(a);
    System.out.println();
    shot(a);
    printArray(a);

  
    
  }
 
}

