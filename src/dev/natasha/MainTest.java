package dev.natasha;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    void addNumber() {
        System.out.println("Test: addNumber");
        int a = 3;
        int b = 4;

        Main test = new Main ();
        int result = test.addNumber(a, b);
        assertEquals(7, result);
//        assertEquals(5, result);
    }
}