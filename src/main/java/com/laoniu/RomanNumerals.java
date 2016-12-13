package com.laoniu;

public class RomanNumerals {
    public static String convert(int number) {
        StringBuilder sb = new StringBuilder();
        getPos1000(number / 1000, sb);
        getPos100((number % 1000) / 100, sb);
        getPos10((number % 100) / 10, sb);
        getPos1(number % 10, sb);
        return sb.toString();
    }

    private static void getPos1000(int number, StringBuilder sb) {
        if (number <= 4) {
            for (int i = 0; i < number; i++) {
                sb.append("M");
            }
        }
    }

    private static void getPos100(int number, StringBuilder sb) {
        if (number < 4) {
            for (int i = 0; i < number; i++) {
                sb.append("C");
            }
        }
        if (number == 4) {
            sb.append("CD");
        }
        if (number == 9) {
            sb.append("CM");
        }
        if (number < 9 && number >= 5) {
            sb.append("D");
            for (int i = 0; i < number - 5; i++) {
                sb.append("C");
            }
        }
    }


    private static void getPos10(int number, StringBuilder sb) {
        if (number < 4) {
            for (int i = 0; i < number; i++) {
                sb.append("X");
            }
        }
        if (number == 4) {
            sb.append("XL");
        }
        if (number == 9) {
            sb.append("XC");
        }
        if (number < 9 && number >= 5) {
            sb.append("L");
            for (int i = 0; i < number - 5; i++) {
                sb.append("X");
            }
        }
    }

    private static void getPos1(int number, StringBuilder sb) {
        if (number < 4) {
            for (int i = 0; i < number; i++) {
                sb.append("I");
            }
        }
        if (number == 4) {
            sb.append("IV");
        }
        if (number == 9) {
            sb.append("IX");
        }
        if (number < 9 && number >= 5) {
            sb.append("V");
            for (int i = 0; i < number - 5; i++) {
                sb.append("I");
            }
        }
    }


}
