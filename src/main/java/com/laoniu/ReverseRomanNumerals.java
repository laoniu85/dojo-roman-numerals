package com.laoniu;

import static com.laoniu.RomanNumber.Hundred;
import static com.laoniu.RomanNumber.One;
import static com.laoniu.RomanNumber.Ten;

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
    static int[] numbers = new int[]{9, 8, 7, 6, 4, 5, 3, 2, 1};

    //TODO: 可能可以用责任链模式
    public static int convert(String numberString) {
        Result resultOne = covertOne(numberString);
        Result resultTen = convertTen(resultOne.getRemainString());
        Result resultHundred = convertHundred(resultTen.getRemainString());
        Result resultThousand = convertThousand(resultHundred.getRemainString());
        return resultOne.getNum() + resultTen.getNum() * 10 + resultHundred.getNum() * 100 + resultThousand.getNum() * 1000;
    }

    private static Result convertHundred(String numberString) {
        for (int i = 0; i < 9; i++) {
            if (numberString.endsWith(Hundred.getNumbers()[numbers[i]])) {
                return new Result(numberString.substring(0, numberString.length() - Hundred.getNumbers()[numbers[i]].length()), numbers[i]);
            }
        }

        return new Result(numberString, 0);
    }
    private static Result convertTen(String numberString) {
        for (int i = 0; i < 9; i++) {
            if (numberString.endsWith(Ten.getNumbers()[numbers[i]])) {
                return new Result(numberString.substring(0, numberString.length() - Ten.getNumbers()[numbers[i]].length()), numbers[i]);
            }
        }
        return new Result(numberString, 0);
    }

    private static Result covertOne(String numberString) {
        for (int i = 0; i < 9; i++) {
            if (numberString.endsWith(One.getNumbers()[numbers[i]])) {
                return new Result(numberString.substring(0, numberString.length() - One.getNumbers()[numbers[i]].length()), numbers[i]);
            }
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


}
