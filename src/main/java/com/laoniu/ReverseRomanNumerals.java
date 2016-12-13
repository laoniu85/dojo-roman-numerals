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
    //TODO: 可能可以用责任链模式 似乎没有必要
    public static int convert(String numberString) {
        Result resultOne = One.reverseConvert(numberString);
        Result resultTen = Ten.reverseConvert(resultOne.getRemainString());
        Result resultHundred = Hundred.reverseConvert(resultTen.getRemainString());
        Result resultThousand = Thousand.reverseConvert(resultHundred.getRemainString());
        return resultOne.getNum() + resultTen.getNum() * 10 + resultHundred.getNum() * 100 + resultThousand.getNum() * 1000;
    }


}
