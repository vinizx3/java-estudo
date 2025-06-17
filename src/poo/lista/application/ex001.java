package poo.lista.application;

import poo.lista.entities.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        List<Employee> list = new ArrayList<>();
        Integer id = null;
        double salary = 0;
        String name = null;
        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Employee #" + (i + 1) + ": ");
            System.out.println("Id: ");
            id = sc.nextInt();
            while (hasId(list, id)){
                System.out.println("Id already taken!, Try again: ");
                id = sc.nextInt();
            }
            System.out.println("Name: ");
            sc.nextLine();
            name = sc.nextLine();
            System.out.println("Salary: ");
            salary = sc.nextDouble();
        }

        Employee emp = new Employee(name, id, salary);

        list.add(emp);

        System.out.println("Enter the employee id that will have salary increase: ");
        int idSalary = sc.nextInt();

        emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
        // Integer pos = position(list, idSalary);
        if (emp == null){
            System.out.println("This id does not exist!");
        } else {
            System.out.println("Enter the percentage: ");
            double percent = sc.nextDouble();
            emp.increaseSalary(percent);
        }

        System.out.println();
        System.out.println("List of employees: ");
        for (Employee e : list){
            System.out.println(e);
        }

        sc.close();
    }

    public static Integer position(List<Employee> list, int id){
        for (int i=0; i<list.size(); i++){
            if (list.get(i).getId() == id){
                return id;
            }
        }
        return null;
    }
    public static boolean hasId(List<Employee> list, int id){
        Employee emp  = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
