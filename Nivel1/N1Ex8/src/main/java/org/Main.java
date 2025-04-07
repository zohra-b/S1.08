package org;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ReverseInterface reversedString = (s1) -> {
            List myString = Arrays.asList(s1.split(""));
            Collections.reverse(myString);
            return String.join("", myString);

        };

        String hello = "hello";

        System.out.println (reversedString.reverse(hello));
    }



}