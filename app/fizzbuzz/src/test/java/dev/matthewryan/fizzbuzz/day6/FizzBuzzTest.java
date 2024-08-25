package dev.matthewryan.fizzbuzz.day6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    public void testFizzBuzzClassToConvertIntOneToStringOne() {
        // Arrange
        FizzBuzz unit = new FizzBuzz();
        // Act
        int one = 1;
        // Assert
        assertEquals("1", unit.convert(one));
    }

    @Test
    public void testFizzBuzzClassToConvertIntTwoToStringTwo() {
        // Arrange
        FizzBuzz unit = new FizzBuzz();
        // Act
        int two = 2;
        // Assert
        assertEquals("2", unit.convert(two));
    }

    @Test
    public void testFizzBuzzClassToConvertIntThreeToStringFizz() {
        // Arrange
        FizzBuzz unit = new FizzBuzz();
        // Act
        int three = 3;
        // Assert
        assertEquals("Fizz", unit.convert(three));
    }

    @Test
    public void testFizzBuzzClassToConvertMultiplesOfThreeToStringFizz() {
        // Arrange
        FizzBuzz unit = new FizzBuzz();
        // Act
        int six = 6;
        // Assert
        assertEquals("Fizz", unit.convert(six));
    }

    @Test
    public void testFizzBuzzClassToConvertIntFiveToStringBuzz() {
        // Arrange
        FizzBuzz unit = new FizzBuzz();
        // Act
        int five = 5;
        // Assert
        assertEquals("Buzz", unit.convert(five));
    }
}
