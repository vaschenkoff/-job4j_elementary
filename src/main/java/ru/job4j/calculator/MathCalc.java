package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalc {
    public static double sumAndMult(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double minusAndDiv(double first, double second) {
        return minus(first, second) + division(first, second);
    }

    public static double sumOfAllOperations(double first, double second) {
        return sum(first, second) + multiply(first, second) + minus(first, second) + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMult(10, 20));
        System.out.println("Реультат: " + minusAndDiv(20, 10));
        System.out.println("Результат:" + sumOfAllOperations(20, 10));
    }
}
