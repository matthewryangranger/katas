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

    @Test
    public void testFizzBuzzClassToConvertIntTwoToStringTwo() {
        // Arrange
        FizzBuzz unit = new FizzBuzz();
        // Act
        Integer two = 2;

        // Assert
        assertEquals("2", unit.convert(two));
    }

    @Test
    public void testFizzBuzzClassToConvertIntThreeToFizz() {
        // Arrange
        FizzBuzz unit = new FizzBuzz();
        // Act
        Integer three = 3;

        // Assert
        assertEquals("Fizz", unit.convert(three));
    }
}
