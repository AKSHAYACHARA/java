import java.util.*;

public class List1 {
    public static void main(String[] args) {
        List <Integer> a = new ArrayList<>();
        a.add(12);
        a.add(24);
        for(int e : a){
            System.out.print(e + " ");
        }
        System.out.println();
        List <Integer> b = new LinkedList<>();
        b.add(23);
        b.add(0,45);
        for(int e1 : b){
            System.out.print(e1 + " ");
        }
        System.out.println();

        List <Integer> c = new Vector<>();
        c.add(12);
        c.add(54);
        c.add(65);
        for(int e2 : c){
            System.out.print(e2 + " ");
        }


    }
}
