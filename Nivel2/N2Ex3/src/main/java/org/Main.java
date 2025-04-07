package org;

public class Main {
    public static void main(String[] args) {

        OperationInterface addition = (a, b) -> a + b;
        OperationInterface subtraction = (a,b) -> a - b;
        OperationInterface multiplication = (a, b) -> a * b;
        OperationInterface division = (a, b) -> a / b;

        System.out.println(addition.operation(14, 58));
        System.out.println(subtraction.operation(14, 58));
        System.out.println(multiplication.operation(14, 58));
        System.out.println(division.operation(814, 58));

    }
}