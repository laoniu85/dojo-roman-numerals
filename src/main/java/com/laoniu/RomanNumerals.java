package com.laoniu;

public class RomanNumerals {
    public static String convert(int number) {
        StringBuilder sb = new StringBuilder();
        new RomanNumber(sb, "M", "", "").getNumberStringB((number / 1000) % 10);
        new RomanNumber(sb, "C", "D", "M").getNumberStringA((number / 100) % 10);
        new RomanNumber(sb, "X", "L", "C").getNumberStringA((number / 10) % 10);
        new RomanNumber(sb, "I", "V", "X").getNumberStringA(number % 10);
        return sb.toString();
    }
}
