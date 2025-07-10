package poo.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        List<String> carBrandList = new ArrayList<>();
        carBrandList.add("Bmw");
        carBrandList.add("Volkswagen");
        carBrandList.add("Audi");
        System.out.println("Car brand list: " + carBrandList);

        List<String> CarBrandList2 = Arrays.asList("Mercedes", "Honda", "Nissan");
        carBrandList.addAll(CarBrandList2);

        System.out.println("Updated car brand list: " + carBrandList);

        String brand = carBrandList.get(1);
        System.out.println("Second element: " + brand);

    }
}
