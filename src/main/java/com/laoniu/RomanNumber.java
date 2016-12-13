package com.laoniu;

public class RomanNumber {
    StringBuilder sb;
    String one;
    String five;
    String ten;

    public static RomanNumber One = new RomanNumber("I", "V", "X");
    public static RomanNumber Ten = new RomanNumber("C", "D", "M");
    public static RomanNumber Hundred = new RomanNumber("X", "L", "C");
    public static RomanNumber Thousand = new ThousandNumber("M","","");

    public static class ThousandNumber extends RomanNumber{
        public ThousandNumber(String one, String five, String ten) {
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


    public RomanNumber(String one, String five, String ten) {
        this.one = one;
        this.five = five;
        this.ten = ten;
    }



    public void getNumberString(int number, StringBuilder sb) {
        if (number < 4) {
            for (int i = 0; i < number; i++) {
                sb.append(one);
            }
        }
        if (number == 4) {
            sb.append(one).append(five);
        }
        if (number == 9) {
            sb.append(one).append(ten);
        }
        if (number < 9 && number >= 5) {
            sb.append(five);
            for (int i = 0; i < number - 5; i++) {
                sb.append(one);
            }
        }
    }
}
