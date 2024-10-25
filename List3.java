// Min and Max in a List in Java
import java.util.*;

public class List3 {
    public static void main(String[] args) {
        List <Integer> a = new ArrayList<Integer>();
        a.add(21);
        a.add(34);
        a.add(87);
        a.add(98);
        a.add(11);
        a.add(10);

        int min = a.get(0);
        for(int e : a){
            if (min>e) {
                min = e;
               
            }
        }
        System.out.print(min + " ");
         System.out.println();
        int max = a.get(0);
        for (int e1 : a) {
            if (e1>max) {
                max=e1;
                
            }

        }
        System.out.print(max + " ");
            
        
    }
}
