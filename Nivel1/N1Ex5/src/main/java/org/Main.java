package org;

public class Main {
    public static void main(String[] args) {

        myFunctionalInterface Pi = () -> 3.1514;

        System.out.println(Pi.getPiValue());
    }
}