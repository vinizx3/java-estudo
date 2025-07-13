package poo.exceptions;

public class ExceptionNull {
    public static void main(String[] args) {
        String name = null;

        try {
            int sizeName = name.length();
            System.out.println("Size name: " + sizeName);
        } catch(NullPointerException e){
            System.out.println("The variable is null");
        }
    }



}
