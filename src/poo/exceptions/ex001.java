package poo.exceptions;

public class ex001 {
    public static void main(String[] args) {
        try {
            Integer num = null;
            System.out.println(num.toString());
        } catch (NullPointerException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
