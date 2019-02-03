package com.arturheath;

import static org.junit.Assert.*;

public class NumsTest {

    private Nums num;

    @org.junit.Before
    public void setUp(){
        num = new Nums(10);
    }

    @org.junit.Test
    public void shouldSumNumbers() {
        assertEquals(18, num.sumNums(8));
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void negativeDiffShouldThrowExc() {
        assertEquals(-11, num.subtrNums(21));
    }
}