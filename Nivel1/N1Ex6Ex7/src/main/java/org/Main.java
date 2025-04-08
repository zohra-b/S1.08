package org;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> myList = new ArrayList<>();
        myList.add("Hello");
        myList.add(3258);
        myList.add("Catalunya");
        myList.add(123);

        //EXERCISE 6
        List<String>
                sortedLength = myList.stream()
                .map(Object::toString)
                .sorted(Comparator.comparingInt(String::length))
                .toList();

        System.out.println("Exercise 6: \n" + sortedLength);

        //EXERCISE 7
        List<String> reverseOrder = sortedLength.reversed();
        System.out.println("Exercise 7: \n" + reverseOrder);
    }
}