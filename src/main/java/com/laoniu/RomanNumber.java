package com.laoniu;

public class RomanNumber {
    String one;
    private String five;
    private String ten;
    private String four;
    private String nine;

    public static RomanNumber One = new RomanNumber("I", "V", "X");
    public static RomanNumber Ten = new RomanNumber("C", "D", "M");
    public static RomanNumber Hundred = new RomanNumber("X", "L", "C");
    public static RomanNumber Thousand = new ThousandNumber("M", "", "");

    private static class ThousandNumber extends RomanNumber {
        ThousandNumber(String one, String five, String ten) {
            super(one, five, ten);
        }

        public void getNumberString(int number, StringBuilder sb) {
            if (number <= 4) {
                for (int i = 0; i < number; i++) {
                    sb.append(one);
                }
            }
        }
    }


    private RomanNumber(String one, String five, String ten) {
        this.one = one;
        this.five = five;
        this.ten = ten;
        this.four = one + five;
        this.nine = one + ten;
    }


    public void getNumberString(int number, StringBuilder sb) {
        if (number < 4) {
            for (int i = 0; i < number; i++) {
                sb.append(one);
            }
        }
        if (number == 4) {
            sb.append(four);
        }
        if (number == 9) {
            sb.append(nine);
        }
        if (number < 9 && number >= 5) {
            sb.append(five);
            for (int i = 0; i < number - 5; i++) {
                sb.append(one);
            }
        }
    }
}
