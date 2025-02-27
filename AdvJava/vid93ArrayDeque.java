package AdvJava;

import java.util.ArrayDeque;

public class vid93ArrayDeque {
    public static void main(String[] args) {
        // Creating an Array-Deque

        ArrayDeque<String> sports = new ArrayDeque<>();

        sports.add("Cricket");
        sports.add("Football");
        sports.add("Baseball");
        sports.add("Volleyball");
        sports.add("Basketball");

        System.out.println("Sports: " + sports);

        System.out.println("First element:" + sports.getFirst());
        System.out.println("Last element:" + sports.getLast());

    }
}
