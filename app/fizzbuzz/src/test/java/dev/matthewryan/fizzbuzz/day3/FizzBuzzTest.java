package dev.matthewryan.fizzbuzz.day3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    private FizzBuzz unit;

    @BeforeEach
    public void setUp() {
        // Arrange
        unit = new FizzBuzz();
    }

    @Test
    public void testIntegerOneConversion() {
        // Act
        int one = 1;
        // Assert
        assertEquals("1", unit.convert(one));
    }

    @Test
    public void testIntegerTwoConversion() {
        // Act
        int two = 2;
        // Assert
        assertEquals("2", unit.convert(two));
    }

    @Test
    public void testIntegerThreeConversion() {
        // Act
        int three = 3;
        // Assert
        assertEquals("Fizz", unit.convert(three));
    }
}
