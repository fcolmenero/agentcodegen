package com.example;

public class StringUtils {
    /**
     * Reverses the given string.
     * @param s The string to reverse.
     * @return The reversed string, or null if the input was null.
     */
    public String reverse(String s) {
        if (s == null) {
            return null;
        }
        return new StringBuilder(s).reverse().toString();
    }
}