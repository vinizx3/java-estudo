package poo.collections;

import java.util.ArrayList;
import java.util.List;

public class ex003 {
    public static void main(String[] args) {
        List<String> games = new ArrayList<>();
        games.add("ForzaHorizon");
        games.add("NeedForSpeed");
        games.add("GranTurismo");

        System.out.print("Games: ");
        for (String game : games){
            System.out.print(game + ", ");
        }

        System.out.println();
        String searchGame = "ForzaHorizon";
        if (games.contains(searchGame)){
            System.out.println("this game has on the list");
        } else {
            System.out.println("this game has not on the list");
        }

    }
}
