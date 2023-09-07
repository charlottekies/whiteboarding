package com.beginner;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulationTest {

    private com.beginner.StringManipulation stringManipulation;

    @BeforeEach
    void setUp() {
        stringManipulation = new com.beginner.StringManipulation();
    }

    @AfterEach
    void tearDown() {
    }

    /** reverseString **/

    @Test
    void test_reverseString_when_string_is_null() {
        String actual = stringManipulation.reverseString(null);
        Assert.assertTrue(actual == null);
    }

    @Test
    void test_reverseString_when_string_is_one_char() {
        String actual = stringManipulation.reverseString("1");
        String expected = "1";
        Assert.assertEquals("A string with one character should be returned with the same value", actual, expected);
    }

    @Test
    void test_reverseString_when_string_is_two_chars() {
        String actual = stringManipulation.reverseString("12");
        String expected = "21";
        Assert.assertEquals("A string with two characters should be returned with reversed values", actual, expected);
    }

    @Test
    void test_reverseString_when_string_is_three_chars() {
        String actual = stringManipulation.reverseString("why");
        String expected = "yhw";
        Assert.assertEquals("Input 'why' should return 'yhw'", actual, expected);
    }

    @Test
    void test_reverseString_when_string_contains_spaces() {
        String actual = stringManipulation.reverseString("w hy");
        String expected = "yhw";
        Assert.assertEquals("Input 'why' should return 'yh w'", actual, expected);
    }

    @Test
    void test_reverseString_when_string_is_long() {
        int length = 1000000; // Length of the string (1 million characters)
        StringBuilder longString = new StringBuilder();

        longString.append('B');
        for (int i = 0; i < length; i++) {
            longString.append('A');
        }

        StringBuilder longStringReversed = new StringBuilder();
        for (int i = 0; i < length; i++) {
            longStringReversed.append('A');
        }
        longStringReversed.append('B');

        String stringToReverse = longString.toString();
        String expected = longStringReversed.toString();
        String actual = stringManipulation.reverseString(stringToReverse);

        Assert.assertEquals("Strings should be equal", actual, expected);
        Assert.assertEquals("String should be 1,000,001 characters", actual.length(), 1000001);
        Assert.assertEquals("first character should be A", 'A', actual.substring(0, 1));
        Assert.assertEquals("last character should be B", 'B', actual.substring(actual.length() - 1));
    }
    
    /** areAnagrams **/

    @Test
    void areAnagrams() {
    }

    /** isValidParentheses **/
    @Test
    void isValidParentheses() {
    }

    /** stringToInteger **/

    @Test
    void stringToInteger() {
    }
}