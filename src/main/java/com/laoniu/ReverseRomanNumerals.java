package com.laoniu;

public class ReverseRomanNumerals {
    public static int convert(String numberString) {
        int sum = 0;
        sum += covertOne(numberString);

        sum += convertTen(numberString);

        sum += convertHundred(numberString);

        sum += convertThousand(numberString);
        return sum;
    }

    private static int convertHundred(String numberString) {
        if (numberString.equals("C")) {
            return 1;
        }
        if (numberString.equals("CC")) {
            return 2;
        }
        if (numberString.equals("CCC")) {
            return 3;
        }
        if (numberString.equals("CD")) {
            return 4;
        }
        if (numberString.equals("D")) {
            return 5;
        }
        if (numberString.equals("DC")) {
            return 6;
        }
        if (numberString.equals("DCC")) {
            return 7;
        }
        if (numberString.equals("DCCC")) {
            return 8;
        }
        if (numberString.equals("CM")) {
            return 9;
        }
        return 0;
    }

    private static Integer convertThousand(String numberString) {
        if (numberString.equals("M")) {
            return 1;
        }
        if (numberString.equals("MM")) {
            return 2;
        }
        if (numberString.equals("MMM")) {
            return 3;
        }
        if (numberString.equals("MMMM")) {
            return 4;
        }
        return 0;
    }

    private static int convertTen(String numberString) {
        if (numberString.equals("X")) {
            return 1;
        }
        if (numberString.equals("XX")) {
            return 2;
        }
        if (numberString.equals("XXX")) {
            return 3;
        }
        if (numberString.equals("XL")) {
            return 4;
        }
        if (numberString.equals("L")) {
            return 5;
        }
        if (numberString.equals("LX")) {
            return 6;
        }
        if (numberString.equals("LXX")) {
            return 7;
        }
        if (numberString.equals("LXXX")) {
            return 8;
        }
        if (numberString.equals("XC")) {
            return 9;
        }
        return 0;
    }

    private static int covertOne(String numberString) {
        if (numberString.equals("I")) {
            return 1;
        }
        if (numberString.equals("II")) {
            return 2;
        }
        if (numberString.equals("III")) {
            return 3;
        }
        if (numberString.equals("IV")) {
            return 4;
        }
        if (numberString.equals("V")) {
            return 5;
        }
        if (numberString.equals("VI")) {
            return 6;
        }
        if (numberString.equals("VII")) {
            return 7;
        }
        if (numberString.equals("VIII")) {
            return 8;
        }
        if (numberString.equals("IX")) {
            return 9;
        }
        return 0;
    }
}
