package com.laoniu;

public class ReverseRomanNumerals {
    static class Result {
        String remainString;
        int num;

        public Result(String remainString, int num) {
            this.remainString = remainString;
            this.num = num;
        }

        public String getRemainString() {
            return remainString;
        }

        public Result setRemainString(String remainString) {
            this.remainString = remainString;
            return this;
        }

        public int getNum() {
            return num;
        }

        public Result setNum(int num) {
            this.num = num;
            return this;
        }
    }
    //发现规律 9 8 7 6 4 5 3 2 1
    //TODO: 可能可以用责任链模式
    public static int convert(String numberString) {
        Result resultOne = covertOne(numberString);
        Result resultTen = convertTen(resultOne.getRemainString());
        Result resultHundred = convertHundred(resultTen.getRemainString());
        Result resultThousand = convertThousand(resultHundred.getRemainString());
        return resultOne.getNum() + resultTen.getNum() * 10 + resultHundred.getNum() * 100 + resultThousand.getNum() * 1000;
    }

    private static Result convertHundred(String numberString) {
        if (numberString.endsWith("CM")) {
            return new Result(numberString.substring(0, numberString.length() - 2), 9);
        }
        if (numberString.endsWith("DCCC")) {
            return new Result(numberString.substring(0, numberString.length() - 4), 8);
        }
        if (numberString.endsWith("DCC")) {
            return new Result(numberString.substring(0, numberString.length() - 3), 7);
        }
        if (numberString.endsWith("DC")) {
            return new Result(numberString.substring(0, numberString.length() - 2), 6);
        }
        if (numberString.endsWith("CD")) {
            return new Result(numberString.substring(0, numberString.length() - 2), 4);
        }
        if (numberString.endsWith("D")) {
            return new Result(numberString.substring(0, numberString.length() - 1), 5);
        }
        if (numberString.endsWith("CCC")) {
            return new Result(numberString.substring(0, numberString.length() - 3), 3);
        }
        if (numberString.endsWith("CC")) {
            return new Result(numberString.substring(0, numberString.length() - 2), 2);
        }
        if (numberString.endsWith("C")) {
            return new Result(numberString.substring(0, numberString.length() - 1), 1);
        }
        return new Result(numberString, 0);
    }

    private static Result convertThousand(String numberString) {
        if (numberString.endsWith("MMMM")) {
            return new Result(numberString.substring(0, numberString.length() - 4), 4);
        }
        if (numberString.endsWith("MMM")) {
            return new Result(numberString.substring(0, numberString.length() - 3), 3);
        }
        if (numberString.endsWith("MM")) {
            return new Result(numberString.substring(0, numberString.length() - 2), 2);
        }
        if (numberString.endsWith("M")) {
            return new Result(numberString.substring(0, numberString.length() - 1), 1);
        }
        return new Result(numberString, 0);
    }

    private static Result convertTen(String numberString) {

        if (numberString.endsWith("XC")) {
            return new Result(numberString.substring(0, numberString.length() - 2), 9);
        }
        if (numberString.endsWith("LXXX")) {
            return new Result(numberString.substring(0, numberString.length() - 4), 8);
        }
        if (numberString.endsWith("LXX")) {
            return new Result(numberString.substring(0, numberString.length() - 3), 7);
        }
        if (numberString.endsWith("LX")) {
            return new Result(numberString.substring(0, numberString.length() - 2), 6);
        }
        if (numberString.endsWith("XL")) {
            return new Result(numberString.substring(0, numberString.length() - 2), 4);
        }
        if (numberString.endsWith("L")) {
            return new Result(numberString.substring(0, numberString.length() - 1), 5);
        }
        if (numberString.endsWith("XXX")) {
            return new Result(numberString.substring(0, numberString.length() - 3), 3);

        }
        if (numberString.endsWith("XX")) {
            return new Result(numberString.substring(0, numberString.length() - 2), 2);

        }
        if (numberString.endsWith("X")) {
            return new Result(numberString.substring(0, numberString.length() - 1), 1);

        }
        return new Result(numberString, 0);
    }

    private static Result covertOne(String numberString) {
        if (numberString.endsWith("IX")) {
            return new Result(numberString.substring(0, numberString.length() - 2), 9);
        }
        if (numberString.endsWith("VIII")) {
            return new Result(numberString.substring(0, numberString.length() - 4), 8);
        }
        if (numberString.endsWith("VII")) {
            return new Result(numberString.substring(0, numberString.length() - 3), 7);
        }
        if (numberString.endsWith("VI")) {
            return new Result(numberString.substring(0, numberString.length() - 2), 6);

        }
        if (numberString.endsWith("IV")) {
            return new Result(numberString.substring(0, numberString.length() - 2), 4);

        }
        if (numberString.endsWith("V")) {
            return new Result(numberString.substring(0, numberString.length() - 1), 5);

        }
        if (numberString.endsWith("III")) {
            return new Result(numberString.substring(0, numberString.length() - 3), 3);

        }
        if (numberString.endsWith("II")) {
            return new Result(numberString.substring(0, numberString.length() - 2), 2);

        }
        if (numberString.endsWith("I")) {
            return new Result(numberString.substring(0, numberString.length() - 1), 1);

        }
        return new Result(numberString, 0);
    }
}
