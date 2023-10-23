package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double firstOperation = x2 - x1;
        double secondOperation = y2 - y1;
        double thirdOperation = Math.pow(firstOperation, 2);
        double fourthOperation = Math.pow(secondOperation, 2);
        double fifthOperation = thirdOperation + fourthOperation;
        double rsl = Math.sqrt(fifthOperation);
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result1);
        double result2 = Point.distance(1, 0, 2, 0);
        System.out.println("result (1, 0) to (2, 0) " + result2);
        double result3 = Point.distance(3, 5, 8, 7);
        System.out.println("result (3, 5) to (8, 7) " + result3);
    }
}
