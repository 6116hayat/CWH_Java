package AdvJava;

import java.util.LinkedList;

public class vid92LinkedList {
    public static void main(String[] args) {

        // creating a linked list
        LinkedList<String> fruits = new LinkedList<>();

        // Adding Elements
        fruits.add("Cherry");
        fruits.add("PineApple");
        fruits.add("WaterMelon");
        fruits.add("Kiwi");
        fruits.add("Pomegranate");

        //Display Linked-List
        System.out.println("Fruits: "+ fruits);

        //Access Elements
        System.out.println("First Element: "+ fruits.get(1));
        System.out.println("Fifth Element: "+ fruits.get(4));

        //Remove Element from LinkedList
        fruits.remove("Cherry");
        System.out.println("List after removal: "+ fruits);
    }
}
