public class Ars {
    public static void main(String[] args) {
        
   
    int a[] = {1,2,1,4,5,7,3,4,2,1,4,5};
    int target = 2;
    int firstElement = -1;
    int lastElement = -1;
    for(int i=0;i<a.length;i++){
        if (a[i] == target) {
            if (firstElement==-1) {
                firstElement=i;
            }
            lastElement = i;
        }
    }

    if (firstElement != -1 ) {
        System.out.println("firstelement index " + firstElement);
        System.out.println("lastelement index " + lastElement);
    }else{
        System.out.println("not found");
    }

}


}
