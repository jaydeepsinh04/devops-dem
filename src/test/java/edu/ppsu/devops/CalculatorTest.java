package edu.ppsu.devops;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void testSubtract() {
        assertEquals(5, 10 - 5);
    }
}