package introducao.scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x;

        x = sc.next();
        System.out.print(x);

        sc.close();
    }
}
