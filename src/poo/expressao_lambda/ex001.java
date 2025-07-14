package poo.expressao_lambda;

import java.util.HashSet;
import java.util.Set;

public class ex001 {
    public static void main(String[] args) {
        Set <Integer> oddNum = new HashSet<>();
        for (int i = 1; i <= 10; i++){
            oddNum.add(i);
        }
        System.out.println("Num List: " + oddNum);
        oddNum.removeIf(num -> num % 2 == 0);
        System.out.println("Odd num list: " + oddNum);
    }
}
