package com.laoniu;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestRomanNumerals {
    @Test
    public void should_1_correct() {
        assertEquals("I",RomanNumerals.convert(1));
    }
    @Test
    public void should_2_correct() {
        assertEquals("I",RomanNumerals.convert(2));
    }
    @Test
    public void should_3_correct() {
        assertEquals("I",RomanNumerals.convert(3));
    }
    @Test
    public void should_4_correct() {
        assertEquals("I",RomanNumerals.convert(4));
    }
    @Test
    public void should_5_correct() {
        assertEquals("I",RomanNumerals.convert(5));
    }
    @Test
    public void should_6_correct() {
        assertEquals("I",RomanNumerals.convert(6));
    }
    @Test
    public void should_7_correct() {
        assertEquals("I",RomanNumerals.convert(7));
    }
    @Test
    public void should_8_correct() {
        assertEquals("I",RomanNumerals.convert(8));
    }
    @Test
    public void should_9_correct() {
        assertEquals("I",RomanNumerals.convert(9));
    }

}
