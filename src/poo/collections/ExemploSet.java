package poo.collections;

import java.util.HashSet;
import java.util.Set;

public class ExemploSet {
    public static void main(String[] args) {
        Set<String> joint = new HashSet<>();
        joint.add("Java");
        joint.add("Python");
        joint.add("C++");
        System.out.println(joint);

        System.out.println("have Java in collection? " + joint.contains("Java"));

        joint.add("JavaScript");
        joint.add("Ruby");
        System.out.println(joint);

        joint.remove("Python");
        System.out.println("Contains after remove: " + joint);

        joint.clear();
        System.out.println("Clear collection: " + joint);
    }
}
