package dev.matthewryan.fizzbuzz.day4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void testConvertIntegerOnetoStringOne() {
        // Arrange
        FizzBuzz unit = new FizzBuzz();
        // Act
        Integer one = 1;
        // Assert
        assertEquals("1", unit.convert(one));
    }

    @Test
    public void testConvertIntegerTwotoStringTwo() {
        // Arrange
        FizzBuzz unit = new FizzBuzz();
        // Act
        Integer one = 1;
        // Assert
        assertEquals("1", unit.convert(one));
    }

    @Test
    public void testConvertIntegerThreetoStringFizz() {
        // Arrange
        FizzBuzz unit = new FizzBuzz();
        // Act
        Integer three = 3;
        // Assert
        assertEquals("Fizz", unit.convert(three));
    }

    @Test
    public void testConvertMultiplesOfIntegerThreetoStringFizz() {
        // Arrange
        FizzBuzz unit = new FizzBuzz();
        // Act
        Integer nine = 9;
        // Assert
        assertEquals("Fizz", unit.convert(nine));
    }

    @Test
    public void testConvertIntegerFivetoStringBuzz() {
        // Arrange
        FizzBuzz unit = new FizzBuzz();
        // Act
        Integer five = 5;
        // Assert
        assertEquals("Buzz", unit.convert(five));
    }

    @Test
    public void testConvertMultiplesOfIntegerFivetoStringBuzz() {
        // Arrange
        FizzBuzz unit = new FizzBuzz();
        // Act
        Integer ten = 10;
        // Assert
        assertEquals("Buzz", unit.convert(ten));
    }
}
