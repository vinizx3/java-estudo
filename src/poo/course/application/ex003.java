package poo.course.application;

import poo.course.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.println("Name: ");
        student.name = sc.nextLine();
        System.out.println("Grade1: ");
        student.grade1 = sc.nextDouble();
        System.out.println("Grade2: ");
        student.grade2 = sc.nextDouble();
        System.out.println("Grade3: ");
        student.grade3 = sc.nextDouble();

        System.out.printf("Final grade: %.2f ", student.finalGrade());

        if (student.finalGrade() < 60.0) {
            System.out.println("Failed");
            System.out.printf("Missing: %.2f points%n", student.missingPoints());
        } else {
            System.out.println("Pass");
        }

        sc.close();
    }
}
