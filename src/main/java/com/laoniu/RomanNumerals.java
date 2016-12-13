package com.laoniu;

import static com.laoniu.RomanNumber.*;

public class RomanNumerals {
    public static String convert(int number) {
        StringBuilder sb = new StringBuilder();
        Thousand.getNumberString((number / 1000) % 10, sb);
        Hundred.getNumberString((number / 100) % 10, sb);
        Ten.getNumberString((number / 10) % 10, sb);
        One.getNumberString(number % 10, sb);
        return sb.toString();
    }
}
