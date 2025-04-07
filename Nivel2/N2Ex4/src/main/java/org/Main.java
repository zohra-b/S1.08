package org;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> myList = new ArrayList<>();

        myList.add("España");
        myList.add("Portugal");
        myList.add("Argentina");
        myList.add("Italia");
        myList.add("Greece");
        myList.add(4250);
        myList.add(58451);
        myList.add(5462);
        myList.add(12346);

        List<String> myList2 = myList.stream()
                .map(Object::toString)
                .sorted()
                .toList();

        System.out.println(myList2);

        List<String> sortedByFirstChar = myList.stream()
                .map(Object::toString)
                .sorted(Comparator.comparingInt(s -> s.charAt(0)))
                .toList();

        System.out.println(sortedByFirstChar);

        List<String> sortedEFirst = sortedByFirstChar.stream()
                .sorted(Comparator.comparing(s -> s.toLowerCase().startsWith("e") ? 0 : 1))
                .toList();

        System.out.println(sortedEFirst);

        List<String> replacingA = sortedEFirst.stream()
                .map(s -> s.replace('a', '4').replace('A', '4'))
                .toList();

        System.out.println(replacingA);

        List<String> showingDigits = sortedEFirst.stream()
                .filter(s -> s.matches("[0-9]+"))
                .toList();

        System.out.println(showingDigits);


    }
}