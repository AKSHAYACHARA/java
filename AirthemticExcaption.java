public class AirthemticExcaption {

    public static void main(String[] args) {
        try{
            int a = 98/0;
        System.out.println(a);
        }catch(ArithmeticException ex){
            System.out.println("excaption handle ");
            System.out.println("please input valid number");
        }
    }
}