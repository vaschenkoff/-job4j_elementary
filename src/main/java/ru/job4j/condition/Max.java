package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int third) {
        return max(left, max(right, third));
    }

    public static int max(int left, int right, int third, int forth) {
        return max(left, max(right, third, forth));
    }

    public static void main(String[] args) {
        int rsl = Max.max(4, 4);
        System.out.println(rsl);
        rsl = Max.max(4, 3, 5);
        System.out.println(rsl);
        rsl = Max.max(5, 6, 7, 8);
        System.out.println(rsl);
    }
}
