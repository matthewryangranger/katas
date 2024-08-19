package dev.matthewryan.fizzbuzz.day2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void testFizzBuzzClassToConvertIntOneToStringOne() {
        // Arrange
        FizzBuzz unit = new FizzBuzz();
        // Act
        Integer one = 1;

        // Assert
        assertEquals("1", unit.convert(one));
    }
}
