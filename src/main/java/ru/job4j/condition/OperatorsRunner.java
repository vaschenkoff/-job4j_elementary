package ru.job4j.condition;

public class OperatorsRunner {
    public static void main(String[] args) {
        int first = 2;
        int second = 10;
        int result = first + second;
        System.out.println("Result sum: " + result);
        result = second - first;
        System.out.println("Result subtract: " + result);
        result = first * second;
        System.out.println("Result multiply: " + result);
        result = second / first;
        System.out.println("Result divide: " + result);
    }
}
