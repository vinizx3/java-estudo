package poo.collections;

import java.util.HashMap;
import java.util.Map;

public class ex002 {
    public static void main(String[] args) {
        Map<String, Integer> stockControl = new HashMap<>();
        stockControl.put("3389", 20);
        stockControl.put("5632", 30);
        stockControl.put("8821", 50);

        String productCode = "3389";
        int quantityOnStock = stockControl.get("3389");

        int removeStock = 10;
        if (quantityOnStock >= removeStock){
            stockControl.put(productCode, quantityOnStock-removeStock);
        } else {
            System.out.println("Out of stock");
        }
        System.out.println("Updated Stock: " + stockControl);
    }
}
