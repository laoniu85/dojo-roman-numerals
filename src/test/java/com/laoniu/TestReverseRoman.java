package com.laoniu;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestReverseRoman {

    @Test
    public void should_1_to_9_correct() {
        assertEquals(ReverseRomanNumerals.convert("I"), 1);
        assertEquals(ReverseRomanNumerals.convert("II"), 2);
        assertEquals(ReverseRomanNumerals.convert("III"), 3);
        assertEquals(ReverseRomanNumerals.convert("IV"), 4);
        assertEquals(ReverseRomanNumerals.convert("V"), 5);
        assertEquals(ReverseRomanNumerals.convert("VI"), 6);
        assertEquals(ReverseRomanNumerals.convert("VII"), 7);
        assertEquals(ReverseRomanNumerals.convert("VIII"), 8);
        assertEquals(ReverseRomanNumerals.convert("IX"), 9);
    }

    @Test
    public void should_10_to_90_correct() {
        assertEquals(ReverseRomanNumerals.convert("X"),10);
        assertEquals(ReverseRomanNumerals.convert("XX"),20);
        assertEquals(ReverseRomanNumerals.convert("XXX"),30);
        assertEquals(ReverseRomanNumerals.convert("XL"),40);
        assertEquals(ReverseRomanNumerals.convert("L"),50);
        assertEquals(ReverseRomanNumerals.convert("LX"),60);
        assertEquals(ReverseRomanNumerals.convert("LXX"),70);
        assertEquals(ReverseRomanNumerals.convert("LXXX"),80);
        assertEquals(ReverseRomanNumerals.convert("XC"),90);
    }


    @Test
    public void should_100_to_900_correct() {
        assertEquals(ReverseRomanNumerals.convert("C"),100);
        assertEquals(ReverseRomanNumerals.convert("CC"),200);
        assertEquals(ReverseRomanNumerals.convert("CCC"),300);
        assertEquals(ReverseRomanNumerals.convert("CD"),400);
        assertEquals(ReverseRomanNumerals.convert("D"),500);
        assertEquals(ReverseRomanNumerals.convert("DC"),600);
        assertEquals(ReverseRomanNumerals.convert("DCC"),700);
        assertEquals(ReverseRomanNumerals.convert("DCCC"),800);
        assertEquals(ReverseRomanNumerals.convert("CM"),900);
    }

    @Test
    public void should_1000_to_4000_correct() {
        assertEquals(ReverseRomanNumerals.convert("M"),1000);
        assertEquals(ReverseRomanNumerals.convert("MM"),2000);
        assertEquals(ReverseRomanNumerals.convert("MMM"),3000);
        assertEquals(ReverseRomanNumerals.convert("MMMM"),4000);
    }

    @Test
    public void test_others() {
        assertEquals(ReverseRomanNumerals.convert("MCMXC"),1990);
        assertEquals(ReverseRomanNumerals.convert("MMVIII"),2008);
        assertEquals(ReverseRomanNumerals.convert("XCIX"),99);
        assertEquals(ReverseRomanNumerals.convert("XLVII"),47);
    }

}
