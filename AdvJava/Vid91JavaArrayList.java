package AdvJava;

import java.util.*;

public class Vid91JavaArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(56);
        l1.add(57);
        l1.add(58);
        l1.add(59);
        l1.add(60);

        for (int i = 0; i<l1.size(); i++){
            System.out.println("Index = " + i + " || Element = "+ l1.get(i));
        }
    }
}
