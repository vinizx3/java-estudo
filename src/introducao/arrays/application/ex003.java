package introducao.arrays.application;

import introducao.arrays.entites.Room;

import java.util.Locale;
import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Room[] vect = new Room[10];

        System.out.println("How many rooms will be ranted? ");
        int n = sc.nextInt();

        for (int i=1; i<n; i++) {
            System.out.println("Room #" + i + ":");
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Email: ");
            String email = sc.next();
            System.out.println("Room: ");
            int roomNumber = sc.nextInt();

            vect[roomNumber] = new Room(name, email);
        }

        System.out.println("Busy rooms: ");
        for (int i=0; i<10; i++){
            if (vect[i] != null){
                System.out.println(i + ": " + vect[i]);
            }
        }
        sc.close();
    }
}
