package com.laoniu;

import static com.laoniu.RomanNumber.*;

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
        return Hundred.reverseConvert(numberString);
    }

    private static Result convertTen(String numberString) {
        return Ten.reverseConvert(numberString);
    }

    private static Result covertOne(String numberString) {
        return One.reverseConvert(numberString);
    }

    private static Result convertThousand(String numberString) {
        return Thousand.reverseConvert(numberString);
    }


}
