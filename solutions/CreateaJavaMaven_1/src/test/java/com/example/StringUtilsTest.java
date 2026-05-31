package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    private final StringUtils stringUtils = new StringUtils();

    @Test
    void testReverseNormalString() {
        assertEquals("olleh", stringUtils.reverse("hello"));
    }

    @Test
    void testReverseEmptyString() {
        assertEquals("", stringUtils.reverse(""));
    }

    @Test
    void testReverseNullString() {
        assertNull(stringUtils.reverse(null));
    }

    @Test
    void testReverseSingleCharacter() {
        assertEquals("a", stringUtils.reverse("a"));
    }

    @Test
    void testReversePalindrome() {
        assertEquals("racecar", stringUtils.reverse("racecar"));
    }
}