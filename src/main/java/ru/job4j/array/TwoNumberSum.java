package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != target) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] + array[j] == target) {
                        return new int[] {i, j};
                    }
                }
            }
        }
        return new int[0];
    }

    public static int[] getIndexes2(int[] array, int target) {
        int i = 0;
        int j = array.length - 1;
        while (j != i) {
            if (array[i] + array[j] != target) {
                i++;
            }
            if (array[i] + array[j] == target) {
                return new int[] {i, j};
            }
            if (j == i) {
                j--;
                i = 0;
            }
        }
        return new int[0];
    }
}
