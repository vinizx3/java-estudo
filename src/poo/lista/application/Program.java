package poo.lista.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("maria");
        list.add("alex");
        list.add("bob");
        list.add("anna");
        list.add(2, "marco");
        System.out.println(list.size());
        for (String x : list){
            System.out.println(x);
        }

        System.out.println("------------------------");
        list.removeIf(x -> x.charAt(0) == 'm');
        for (String x : list){
            System.out.println(x);
        }

        System.out.println("------------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'a').collect(Collectors.toList());
        for (String x : result){
            System.out.println(x);
        }

        System.out.println("------------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'a').findFirst().orElse(null);
        System.out.println(name);
    }
}
