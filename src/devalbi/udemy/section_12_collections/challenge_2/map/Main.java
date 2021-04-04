package devalbi.udemy.section_12_collections.challenge_2.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();
    private static Map<String, String> directions = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java"));
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building"));
        locations.put(2, new Location(2, "You are at the top of a hill"));
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring"));
        locations.put(4, new Location(4, "You are in a valley beside a stream"));
        locations.put(5, new Location(5, "You are in the forest"));

        locations.get(1).addExit("W", 2);
        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("S", 4);
        locations.get(1).addExit("N", 5);

        locations.get(2).addExit("N", 5);

        locations.get(3).addExit("W", 1);

        locations.get(4).addExit("N", 1);
        locations.get(4).addExit("W", 2);

        locations.get(5).addExit("S", 1);
        locations.get(5).addExit("W", 2);

        directions.put("NORTH", "N");
        directions.put("EAST", "E");
        directions.put("SOUTH", "S");
        directions.put("WEST", "W");
        directions.put("QUIT", "Q");

        // Change the program to allow players to type full words, or phrases, then move to the
        // correct location based upon their input.

        // The player should be able to type commands such as "Go West", "run South", or just "East"
        // and the program will move to the appropriate location if there is one.  As at present, an
        // attempt to move in an invalid direction should print a message and remain in the same place.
        //
        // Single letter commands (N, W, S, E, Q) should still be available.

        int loc = 1;
        while(true) {
           System.out.println(locations.get(loc).getDescription());
           if(loc == 0) {
               break;
           }

           Map<String, Integer> exits = locations.get(loc).getExits();
           System.out.print("Available exits are ");
           for(String exit: exits.keySet()) {
               System.out.print(exit + ", ");
           }
           System.out.println();

           String direction = scanner.nextLine().toUpperCase();

           if(direction.length() > 1) {
               String[] directionWords = direction.split(" ");

               for (String word : directionWords) {

                   if (directions.containsKey(word)) {
                       direction = directions.get(word);
                       break;
                   }
               }
           }

           if(exits.containsKey(direction)) {
               loc = exits.get(direction);

           } else {
               System.out.println("You cannot go in that direction");
           }
       }

/*        String[] road = "You are standing at the end of a road before a small brick building".split(" ");
        for (String i : road) {
            System.out.println(i);
        }

        System.out.println("==================================");

        String[] building = "You are inside a building, a well house for a small spring".split(", ");
        for (String i : building) {
            System.out.println(i);
        }*/
    }
}

