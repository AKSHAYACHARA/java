public class NumberFormat {
    public static void main(String[] args) {
        try {
            String s = "hello";
        int a = Integer.parseInt(s);
        System.out.println(a);
        } catch (NumberFormatException e) {
            System.out.println(" exception handle ");
        }
    }
}
