package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class WeekThreeTest {
    @Test
    void test2True() {
        assertThrows(IllegalArgumentException.class, () ->
            MovieTicketCalculator.calculateTicketPrice(-1, false)
        );
    }
    
    @Test
    void test4True() {
        assertEquals(50000, MovieTicketCalculator.calculateTicketPrice(10, false));
    }

    @Test
    void test6True() {
        assertEquals(60000, MovieTicketCalculator.calculateTicketPrice(65, true));
    }

    @Test
    void test8True() {
        assertEquals(70000, MovieTicketCalculator.calculateTicketPrice(20, true));
    }

    @Test
    void test2468False() {
        assertEquals(100000, MovieTicketCalculator.calculateTicketPrice(30, false));
    }
}
