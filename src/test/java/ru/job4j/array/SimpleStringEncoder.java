package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == symbol) {
                counter++;
            } else {
                String intToStr = String.valueOf(counter);
                String chToStr = String.valueOf(symbol);
                if (counter > 1) {
                    result += chToStr + intToStr;
                } else {
                    result += chToStr;
                }
                symbol = input.charAt(i);
                counter = 1;
            }
        }
        if (counter > 1) {
            String intToStr = String.valueOf(counter);
            String chToStr = String.valueOf(symbol);
            result += chToStr + intToStr;
        } else {
            String chToStr = String.valueOf(symbol);
            result += chToStr;
        }
        return result;
    }
}
