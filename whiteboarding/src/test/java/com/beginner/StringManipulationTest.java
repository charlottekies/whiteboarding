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

        // TODO: Why is this line printing the long string to the console?
//        Assert.assertEquals("Strings should be equal", actual, expected);
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
    void test_areAnagrams_true() {
        Boolean actual = stringManipulation.areAnagrams("silent", "listen");
        Assert.assertTrue("listen and silent are anagrams", actual);
    }

    @Test
    void test_areAnagrams_one_character() {
        Boolean actual = stringManipulation.areAnagrams("c", "c");
        Assert.assertTrue("c and c are anagrams", actual);
    }

    @Test
    void test_areAnagrams_empty_strings() {
        Boolean actual = stringManipulation.areAnagrams("", "");
        Assert.assertFalse("empty strings are not anagrams", actual);
    }

    @Test
    void test_areAnagrams_using_spaces() {
        Boolean actual = stringManipulation.areAnagrams("Tom Marvolo Riddle", "I am Lord Voldemort");
        Assert.assertTrue("these sentences are anagrams", actual);
    }

    @Test
    void test_areAnagrams_using_punctuation() {
        Boolean actual = stringManipulation.areAnagrams("Tom Marvolo Riddle!", "I am Lord Voldemort!");
        Assert.assertTrue("these sentences are anagrams", actual);
    }

    @Test
    void test_areAnagrams_false_same_words_too_many_characters() {
        Boolean actual = stringManipulation.areAnagrams("silent", "listenn");
        Assert.assertFalse("silent and listenn with two nns are not anagrams", actual);
    }

    /** isValidParentheses **/

    // Valid Parentheses: Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
    @Test
    void test_isValidParentheses_using_TWO_parentheses() {
        Boolean actual = stringManipulation.isValidParentheses("(,)");
        Assert.assertTrue("'(,)' contains valid parentheses", actual);
    }

    @Test
    void test_isInvalidParentheses_using_ONE_parentheses() {
        Boolean actual = stringManipulation.isValidParentheses("(,");
        Assert.assertFalse("'(,' contains invalid parentheses", actual);
    }

    @Test
    void test_isValidParentheses_using_many_parentheses() {
        Boolean actual = stringManipulation.isValidParentheses("()()()(((())))(())))((");
        Assert.assertTrue("'()()()(((())))(())))((' contains valid parentheses", actual);
    }

    @Test
    void test_isINValidParentheses_using_many_parentheses() {
        Boolean actual = stringManipulation.isValidParentheses("()()(((((()");
        Assert.assertFalse("'()()(((((()' contains invalid parentheses", actual);
    }

    @Test
    void test_isINValidParentheses_when_string_is_empty() {
        Boolean actual = stringManipulation.isValidParentheses("");
        Assert.assertFalse("'' contains invalid parentheses", actual);
    }

    /** stringToInteger **/

    @Test
    public void test_stringToInteger_SingleDigit() {
        int result = stringManipulation.stringToInteger("5");
        Assert.assertEquals(5, result);
    }

    @Test
    public void test_stringToInteger_PositiveInteger() {
        int result = stringManipulation.stringToInteger("123");
        Assert.assertEquals(123, result);
    }

    @Test
    public void test_stringToInteger_NegativeInteger() {
        int result = stringManipulation.stringToInteger("-456");
        Assert.assertEquals(-456, result);
    }

    @Test
    public void test_stringToInteger_LeadingWhitespace() {
        int result = stringManipulation.stringToInteger("   789");
        Assert.assertEquals(789, result);
    }

    @Test
    public void test_stringToInteger_NonNumericString() {
        int result = stringManipulation.stringToInteger("abc");
        Assert.assertEquals(0, result); // Non-numeric string should return 0
    }

    @Test
    public void test_stringToInteger_empty_string() {
        int result = stringManipulation.stringToInteger("");
        Assert.assertEquals(0, result); 
    }
    
    @Test
    public void test_stringToInteger_null_string() {
        int result = stringManipulation.stringToInteger(null);
        Assert.assertEquals(0, result); // null string should return 0
    }
    
}