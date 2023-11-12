package com.yarkin.learning;

public class Tasks {
    /**
     * Get reversed version of the string
     *
     * @param text some text
     * @return reversed version of text
     */
    public static String reverse(String text) {
        if (text == null)
        {
            throw new IllegalArgumentException("The string is null");
        }

        StringBuilder stringBuilder = new StringBuilder(text.length());
        for (int i = text.length() - 1; i >= 0; i--) {
            stringBuilder.append(text.charAt(i));
        }
        return stringBuilder.toString();
    }
}
