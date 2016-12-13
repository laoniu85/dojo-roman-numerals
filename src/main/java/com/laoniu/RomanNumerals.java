package com.laoniu;

public class RomanNumerals {
    public static String convert(int number) {
        StringBuilder sb = new StringBuilder();
        if (number < 4) {
            for (int i = 0; i < number; i++) {
                sb.append("I");
            }
        }
        if (number == 4) {
            return "IV";
        }
        if (number == 9) {
            return "IX";
        }
        if (number < 9 && number >= 5) {
            sb.append("V");
            for (int i = 0; i < number - 5; i++) {
                sb.append("I");
            }
        }
        return sb.toString();
    }
}
