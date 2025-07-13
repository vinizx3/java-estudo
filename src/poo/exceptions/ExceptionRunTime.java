package poo.exceptions;

public class ExceptionRunTime {
    public static void main(String[] args) {
        int age = 18;

        if (age < 18){
            throw new RuntimeException("Age must be over 18");
        } else {
            System.out.println("Valid Age: " + age);
        }
    }
}
