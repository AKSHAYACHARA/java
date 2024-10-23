public class NullPointerExcaption {
    public static void main(String[] args) {
        try{
            String s = null;
           System.out.println(s.length());
        }
        catch(NullPointerExcaption ex){
             System.out.println("exception handle ");
        }
    }
}
