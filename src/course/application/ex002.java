package course.application;

import course.entities.Employee;
import java.util.Locale;
import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();

        System.out.println("Name: ");
        emp.name = sc.nextLine();
        System.out.println("GlossSalary: ");
        emp.glossSalary = sc.nextDouble();
        System.out.println("Tax: ");
        emp.tax = sc.nextDouble();

        System.out.println("employee: " + emp);

        System.out.println("which percentage to increase salary: ");
        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);
        System.out.println("Updated data: " + emp);

        sc.close();
    }
}
