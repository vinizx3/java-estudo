package poo.expressao_lambda;

import java.util.ArrayList;
import java.util.List;

public class ex002 {
    public static void main(String[] args) {
        List<String> countryList = new ArrayList<>();
        countryList.add("Brazil");
        countryList.add("Irlanda");
        countryList.add("Canada");
        countryList.add("United_States");
        countryList.add("Argentina");
        countryList.add("Mexico");
        System.out.println("Contry ist: " + countryList);

        countryList.removeIf(name -> name.length() > 6);
        countryList.add(0,"sweden");
        countryList.forEach(System.out::println);
    }
}
