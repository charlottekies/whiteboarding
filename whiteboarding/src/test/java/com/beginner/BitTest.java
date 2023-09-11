package com.beginner;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BitTest {

    private com.beginner.Bit bit;

    @BeforeEach
    void setUp() {
        bit = new com.beginner.Bit();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void test_isEven_when_2() {
        Boolean actual = bit.isEven(2);
        Assert.assertTrue("2 is even.", actual);
    }

    @Test
    void test_isEven_when_1() {
        Boolean actual = bit.isEven(1);
        Assert.assertFalse("1 is not even.", actual);
    }

    @Test
    void test_isEven_when_0() {
        Boolean actual = bit.isEven(0);
        Assert.assertTrue("0 is even.", actual);
    }

    @Test
    void test_isEven_when_negative_2() {
        Boolean actual = bit.isEven(-2);
        Assert.assertTrue("-2 is even.", actual);
    }

    @Test
    void test_isEven_when_negative_1() {
        Boolean actual = bit.isEven(-1);
        Assert.assertFalse("-1 is not even.", actual);
    }

    @Test
    void test_isEven_when_max_value() {
        Integer largeNumber = Integer.MAX_VALUE;
        Boolean actual = bit.isEven(largeNumber);
        Assert.assertFalse("the largest number available is not even.", actual);
    }

    @Test
    void test_isEven_when_min_value() {
        Integer smallNumber = Integer.MIN_VALUE;
        Boolean actual = bit.isEven(smallNumber);
        Assert.assertFalse("the smallest number available is even.", actual);
    }

    @Test
    void setNthBit() {
        // TODO: Implement
    }
}