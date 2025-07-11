package poo.collections;

import java.util.HashMap;
import java.util.Map;

public class ExemploMap {
    public static void main(String[] args) {
        Map<String, Integer> professionalLevel = new HashMap<>();

        professionalLevel.put("Junior", 2500);
        professionalLevel.put("Pleno", 5000);
        professionalLevel.put("Senior", 10000);
        System.out.println("Levels: " + professionalLevel);

        Map<String, Integer> newProfessionalLevel = new HashMap<>();
        newProfessionalLevel.put("Trainee", 1250);
        newProfessionalLevel.put("TechLead", 20000);
        professionalLevel.putAll(newProfessionalLevel);
        System.out.println("Updated levels: " + professionalLevel);

        if(professionalLevel.containsKey("Trainee") && professionalLevel.containsKey("TechLead")){
            professionalLevel.remove("Junior");
            professionalLevel.remove("Senior");
        }
        System.out.println("Updated levels 2: " + professionalLevel);
    }
}
