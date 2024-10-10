import java.util.Scanner;

public class Month {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Days");
        int a=sc.nextInt();
        int year=a/365;

        if(a>0){
            
            System.out.println("Years "+ year);
        }
        int month=a-year*365;
        int month1=month/30;

        if(a>0){
          System.out.println("Month "+month1);
        }
        int week=a-month1*30-year*365;
        int week1=week/7;

        if(a>0){
            System.out.println("Week "+ week1);
        }
        int days=a-week1*7-month1*30-year*365;
        if(a>0){
            System.out.println("Days "+days);

        }
    }
}
