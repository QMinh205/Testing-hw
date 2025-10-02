package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class WeekTwoTest {

    @Test
    void testChildrenUnder12() {
        assertEquals(50000, MovieTicketCalculator.calculateTicketPrice(10, false));
    }

    @Test
    void testStudent() {
        assertEquals(70000, MovieTicketCalculator.calculateTicketPrice(20, true));
    }

    @Test
    void testAdult() {
        assertEquals(100000, MovieTicketCalculator.calculateTicketPrice(30, false));
    }

    @Test
    void testSenior() {
        assertEquals(60000, MovieTicketCalculator.calculateTicketPrice(65, true));
    }

    @Test
    void testInvalidAge() {
        assertThrows(IllegalArgumentException.class, () ->
            MovieTicketCalculator.calculateTicketPrice(-1, false)
        );
    }
}
