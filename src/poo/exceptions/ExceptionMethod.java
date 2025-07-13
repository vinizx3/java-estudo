package poo.exceptions;

public class ExceptionMethod {
    public static int avarageCalc (int totalGrade, int students) throws ArithmeticException{
        return totalGrade / students;
    }

    public static void main(String[] args) {
        int totalGrade = 10;
        int students = 0;
        try {
            int avarageGrade = avarageCalc(totalGrade, students);
            System.out.println("Avarage grade: " + avarageGrade);
        } catch (Exception ae){
            System.out.println("Error: " + ae.getMessage());
        }
    }

}
