package dev.matthewryan.fizzbuzz.day3;

import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    public void testIntegerOneConversion() {
        // Arrange
        FizzBuzz unit = new FizzBuzz();
        // Act
        int one = 1;
        // Assert
        assertEquals("1", unit.convert(one));
    }
}
