package poo.collections;

import java.util.HashSet;
import java.util.Set;

public class ex001 {
    public static void main(String[] args) {
        Set<Integer> num = new HashSet<>();
        num.add(10);
        num.add(5);
        num.add(33);
        num.add(18);
        num.add(59);
        System.out.println(num);

        System.out.println("Num contains a number 20? " + num.contains(20));

        num.remove(18);
        num.remove(59);

        System.out.println("Collection after remove a numbers: " + num);

    }
}
