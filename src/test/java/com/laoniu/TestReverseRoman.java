package com.laoniu;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestReverseRoman {

    @Test
    public void should_1_to_9_correct() {
        assertEquals(ReverseRomanNumerals.convert("I"), 1);
//        assertEquals("II", RomanNumerals.convert(2));
//        assertEquals("III", RomanNumerals.convert(3));
//        assertEquals("IV", RomanNumerals.convert(4));
//        assertEquals("V", RomanNumerals.convert(5));
//        assertEquals("VI", RomanNumerals.convert(6));
//        assertEquals("VII", RomanNumerals.convert(7));
//        assertEquals("VIII", RomanNumerals.convert(8));
//        assertEquals("IX", RomanNumerals.convert(9));
    }

    @Test
    public void should_10_to_90_correct() {
//        assertEquals("X", RomanNumerals.convert(10));
//        assertEquals("XX", RomanNumerals.convert(20));
//        assertEquals("XXX", RomanNumerals.convert(30));
//        assertEquals("XL", RomanNumerals.convert(40));
//        assertEquals("L", RomanNumerals.convert(50));
//        assertEquals("LX", RomanNumerals.convert(60));
//        assertEquals("LXX", RomanNumerals.convert(70));
//        assertEquals("LXXX", RomanNumerals.convert(80));
//        assertEquals("XC", RomanNumerals.convert(90));
    }


    @Test
    public void should_100_to_900_correct() {
//        assertEquals("C", RomanNumerals.convert(100));
//        assertEquals("CC", RomanNumerals.convert(200));
//        assertEquals("CCC", RomanNumerals.convert(300));
//        assertEquals("CD", RomanNumerals.convert(400));
//        assertEquals("D", RomanNumerals.convert(500));
//        assertEquals("DC", RomanNumerals.convert(600));
//        assertEquals("DCC", RomanNumerals.convert(700));
//        assertEquals("DCCC", RomanNumerals.convert(800));
//        assertEquals("CM", RomanNumerals.convert(900));
    }

    @Test
    public void should_1000_to_4000_correct() {
//        assertEquals("M", RomanNumerals.convert(1000));
//        assertEquals("MM", RomanNumerals.convert(2000));
//        assertEquals("MMM", RomanNumerals.convert(3000));
//        assertEquals("MMMM", RomanNumerals.convert(4000));
    }

    @Test
    public void test_others() {
//        assertEquals("MCMXC", RomanNumerals.convert(1990));
//        assertEquals("MMVIII", RomanNumerals.convert(2008));
//        assertEquals("XCIX", RomanNumerals.convert(99));
//        assertEquals("XLVII", RomanNumerals.convert(47));
    }

}
