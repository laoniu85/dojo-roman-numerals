package com.laoniu;

public class ReverseRomanNumerals {
    public static int convert(String numberString) {
        Integer x = covertOne(numberString);
        if (x != null) return x;

        Integer x1 = convertTen(numberString);
        if (x1 != null) return x1 * 10;

        Integer x2 = convertHundred(numberString);
        if (x2 != null) return x2 * 100;

        Integer x3 = convertThousand(numberString);
        if (x3 != null) return x3 * 1000;
        return 0;
    }

    private static Integer convertHundred(String numberString) {
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
        return null;
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
        return null;
    }

    private static Integer convertTen(String numberString) {
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
        return null;
    }

    private static Integer covertOne(String numberString) {
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
        return null;
    }
}
