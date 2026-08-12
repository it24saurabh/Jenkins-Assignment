package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void testAddition() {
        assertEquals(5, App.add(2, 3));
    }

    @Test
    void testMultiplication() {
        assertEquals(20, App.multiply(4, 5));
    }
}
