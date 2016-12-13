package com.laoniu;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestRomanNumerals {
    @Test
    public void should_1_to_9_correct() {
        assertEquals("I",RomanNumerals.convert(1));
        assertEquals("II",RomanNumerals.convert(2));
        assertEquals("III",RomanNumerals.convert(3));
        assertEquals("IV",RomanNumerals.convert(4));
        assertEquals("V",RomanNumerals.convert(5));
        assertEquals("VI",RomanNumerals.convert(6));
        assertEquals("VII",RomanNumerals.convert(7));
        assertEquals("VIII",RomanNumerals.convert(8));
        assertEquals("IX",RomanNumerals.convert(9));
    }

    @Test
    public void should_10_to_90_correct() {
//        assertEquals("X",RomanNumerals.convert(10));
//        assertEquals("II",RomanNumerals.convert(2));
//        assertEquals("III",RomanNumerals.convert(3));
//        assertEquals("IV",RomanNumerals.convert(4));
//        assertEquals("V",RomanNumerals.convert(5));
//        assertEquals("VI",RomanNumerals.convert(6));
//        assertEquals("VII",RomanNumerals.convert(7));
//        assertEquals("VIII",RomanNumerals.convert(8));
//        assertEquals("IV",RomanNumerals.convert(9));
    }

}
