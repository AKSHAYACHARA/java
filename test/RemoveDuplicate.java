import java.util.*;
public class RemoveDuplicate{
public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(20);
    list.add(30);
    list.add(30);
    list.add(50);
    list.add(60);
    list.add(60);

    LinkedHashSet <Integer> set = new LinkedHashSet<>(list);
    list.clear();
    list.addAll(set);

    for(int i : list){
        System.out.print(i + " ");
    }
 }
}