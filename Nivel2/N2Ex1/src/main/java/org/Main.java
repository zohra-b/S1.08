package org;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Albert");
        names.add("Pau");
        names.add("Ada");
        names.add("Ari");
        names.add("Marta");
        names.add("Berta");
        names.add("Luci");

//        ArrayList<String> namesWithA = new ArrayList<>();
//        for (String name : names){
//            if (name.startsWith("A") && name.length()==3){
//                namesWithA.add(name);
//            }

        List<String> namesWithA = names.stream()
                .filter(name -> name.startsWith("A") && name.length()==3)
                .collect(Collectors.toList());

        System.out.println(namesWithA);
    }




}