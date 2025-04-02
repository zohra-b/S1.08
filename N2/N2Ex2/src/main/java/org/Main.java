package org;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> myIntList = new ArrayList<>();
        myIntList.add(123);
        myIntList.add(32587);
        myIntList.add(7845);
        myIntList.add(5542);
        myIntList.add(874);

        StringBuilder builder = new StringBuilder();

        String myIntString = myIntList.stream()
                .map(i -> (i%2 == 0) ? "e"+i : "o"+i)
                .collect(Collectors.joining(","));

        System.out.println(myIntString);


    }
}