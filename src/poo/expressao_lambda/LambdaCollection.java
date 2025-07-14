package poo.expressao_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaCollection {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> evenNum = new ArrayList<>();

        numList.forEach( num -> System.out.print(num + ", "));
        System.out.println();
        numList.forEach(num -> {
            if (num  % 2 == 0) {
                System.out.println("Even numbers: " + num);
            }
        });
    }
}
