package com.laoniu;

public abstract class RomanNumber {
    String one;
    String five;
    String ten;
    String four;
    String nine;

    public static RomanNumber One = new NormalNumber("I", "V", "X");
    public static RomanNumber Ten = new NormalNumber("X", "L", "C");
    public static RomanNumber Hundred = new NormalNumber("C", "D", "M");
    public static RomanNumber Thousand = new ThousandNumber("M", "", "");
    String[] numbers;



    private static class NormalNumber extends RomanNumber {
        NormalNumber(String one, String five, String ten) {
            super(one, five, ten);
        }

        @Override
        public String abstractGetNumberString(int number) {
            StringBuilder sb = new StringBuilder();
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
            return sb.toString();
        }

    }

    private static class ThousandNumber extends RomanNumber {
        ThousandNumber(String one, String five, String ten) {
            super(one, five, ten);
        }

        @Override
        public String abstractGetNumberString(int number) {
            StringBuilder sb = new StringBuilder();
            if (number <= 4) {
                for (int i = 0; i < number; i++) {
                    sb.append(one);
                }
            }
            return sb.toString();
        }


    }


    private RomanNumber(String one, String five, String ten) {
        this.one = one;
        this.five = five;
        this.ten = ten;
        this.four = one + five;
        this.nine = one + ten;
        numbers = new String[10];
        numbers[0] = "";
        for (int i = 1; i < 10; i++) {
            numbers[i] = this.abstractGetNumberString(i);
        }
    }

    public abstract String abstractGetNumberString(int number);

    public void getNumberString(int number, StringBuilder sb) {
        sb.append(numbers[number]);
    }

    public String[] getNumbers() {
        return numbers;
    }


}
