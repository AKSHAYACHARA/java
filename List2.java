import java.util.*;

public class List2 {
    

    public static void main(String[] args) throws Exception {
         try {
            ArrayList <Integer> a = new ArrayList<>();
         a.add(12);
         a.add(13);
         a.add(22);
         a.add(12);
         a.add(52);
         a.add(15);
         a.add(14);
         System.out.println(a);
        // for(int e : a){
        //     System.out.print(e + " ");
        // }

        List <Integer> b = a.subList(2, 7);
        System.out.print(b);
         } catch (Exception e) {
            System.out.println("handle");
         }
    }
}
