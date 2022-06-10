package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(3);
        set1.add(4);
        set1.add(1);
        System.out.println("Set 1: " + set1);

        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(1);
        set2.add(7);
        System.out.println("Set 2: " + set2);

        System.out.println("Symmetric difference: " + symmetricDifference(set1, set2));
    }

    public static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> number = new HashSet<>(set1);
        number.removeAll(set2);
        set2.removeAll(set1);
        number.addAll(set2);

        return number;
    }
}
