package ru.job4j.array;

public class SimpleStringEncoder {

    public static String varToStr(int counter, char symbol) {
        String result = "";
        if (counter > 1) {
            result += String.valueOf(symbol) + String.valueOf(counter);
        } else {
            result += String.valueOf(symbol);
        }
        return result;
    }

    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == symbol) {
                counter++;
            } else {
                result += varToStr(counter, symbol);
                symbol = input.charAt(i);
                counter = 1;
            }
        }
        result += varToStr(counter, symbol);
        return result;
    }
}
