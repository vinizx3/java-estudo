package encapsulamento.application;

import encapsulamento.entities.Account;
import java.util.Locale;
import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.println("Enter name:");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Is there na initial deposit (Y/N)?");
        char response = sc.next().charAt(0);

        if (response == 'Y') {
            System.out.println("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number, name, initialDeposit);
        } else {
            account = new Account(number, name);
        }

        System.out.println("Account data: ");
        System.out.println(account);
        System.out.println("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.println("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("Updated account data: ");
        System.out.println(account);



        sc.close();
    }
}
