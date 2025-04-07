package org;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Hello");
        myList.add("world");
        myList.add("Learning");
        myList.add("Java");
        myList.add("Go");
        myList.add("Strongly");

        //EXERCISE 1
        List<String> stringsWithO = myList.stream()
                .filter(s -> s.contains("o"))
                .toList();

        System.out.println("Ex1 : Strings containing O : " + stringsWithO);

        //EXERCISE 2
        List<String> withOMoreThanFive = myList.stream()
                .filter(s -> s.contains("o"))
                .filter(s -> s.length() >=5)
                .toList();

        System.out.println("Ex2 : Strings containing O and >= 5 caracters : " + withOMoreThanFive);

        //EXERCISE 3
        List<String> months = new ArrayList<>();
        months.add("january");
        months.add("february");
        months.add("march");
        months.add("april");
        months.add("may");
        months.add("june");
        months.add("july");
        months.add("august");
        months.add("september");
        months.add("october");
        months.add("november");
        months.add("december");
        System.out.println("Printing months using lambda :");
        months.forEach(m-> System.out.println(m));

        //EXERCISE 4
        System.out.println("Using method reference :");
        months.forEach(System.out::println);




    }


}