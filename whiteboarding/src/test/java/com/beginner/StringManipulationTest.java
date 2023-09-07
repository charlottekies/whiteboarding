package com.beginner;

import com.beginner.utils.AnagramChecker;
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
    void areAnagrams_false() {
        Boolean actual = stringManipulation.areAnagrams("banana", "apple");
        Assert.assertFalse("banana and apple are not anagrams", actual);
    }

    @Test
    void areAnagrams_true() {
        Boolean actual = stringManipulation.areAnagrams("silent", "listen");
        Assert.assertTrue("listen and silent are anagrams", actual);
    }

    @Test
    void areAnagrams_one_character() {
        Boolean actual = stringManipulation.areAnagrams("c", "c");
        Assert.assertTrue("c and c are anagrams", actual);
    }

    @Test
    void areAnagrams_empty_strings() {
        Boolean actual = stringManipulation.areAnagrams("", "");
        Assert.assertFalse("empty strings are not anagrams", actual);
    }

    @Test
    void areAnagrams_using_spaces() {
        Boolean actual = stringManipulation.areAnagrams("Tom Marvolo Riddle", "I am Lord Voldemort");
        Assert.assertTrue("these sentences are anagrams", actual);
    }

    @Test
    void areAnagrams_using_punctuation() {
        Boolean actual = stringManipulation.areAnagrams("Tom Marvolo Riddle!", "I am Lord Voldemort!");
        Assert.assertTrue("these sentences are anagrams", actual);
    }

    @Test
    void areAnagrams_false_same_words_too_many_characters() {
        Boolean actual = stringManipulation.areAnagrams("silent", "listenn");
        Assert.assertFalse("silent and listenn with two nns are not anagrams", actual);
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