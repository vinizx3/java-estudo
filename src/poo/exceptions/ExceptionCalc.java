package poo.exceptions;

public class ExceptionCalc {
    public static void main(String[] args) {
        int studentNote = 10;
        int quantityStudent = 0;

        try {
            int avarageNote = studentNote / quantityStudent;
        } catch (ArithmeticException e) {
            System.out.println("division by zero");
        }
        finally {
            System.out.println("program closed");
        }
    }
}
