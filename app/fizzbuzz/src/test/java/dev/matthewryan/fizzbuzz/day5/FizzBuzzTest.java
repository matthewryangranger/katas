package dev.matthewryan.fizzbuzz.day5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void testConvertOneToStringOne() {
        // Arrange
        FizzBuzz unit = new FizzBuzz();
        // Act
        int one = 1;
        // Assert
        assertEquals("1", unit.convert(one));
    }

    @Test
    public void testConvertTwoToStringTwo() {
        // Arrange
        FizzBuzz unit = new FizzBuzz();
        // Act
        int two = 2;
        // Assert
        assertEquals("2", unit.convert(two));
    }

    @Test
    public void testConvertThreeToStringThree() {
        // Arrange
        FizzBuzz unit = new FizzBuzz();
        // Act
        int three = 3;
        // Assert
        assertEquals("Fizz", unit.convert(three));
    }
}
