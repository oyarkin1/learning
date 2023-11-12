package com.yarkin.learning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TasksTest {

    @Test
    void testReverse() {
        assertEquals("gnirts tseT", Tasks.reverse("Test string"));
    }

    @Test
    void testReverseIfEmptyString() {
        assertEquals("", Tasks.reverse(""));
    }

    @Test
    void testReverseIfNull() {
        assertThrows(IllegalArgumentException.class,
                () -> Tasks.reverse(null), "The string is null");
    }
}