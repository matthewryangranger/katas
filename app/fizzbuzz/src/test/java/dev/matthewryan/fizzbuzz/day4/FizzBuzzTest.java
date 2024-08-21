package dev.matthewryan.fizzbuzz.day4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void testConvertIntegerOneToStringOne() {
        // Arrange
        FizzBuzz unit = new FizzBuzz();
        // Act
        Integer one = 1;
        // Assert
        assertEquals("1", unit.convert(one));
    }

    @Test
    public void testConvertIntegerTwoToStringTwo() {
        // Arrange
        FizzBuzz unit = new FizzBuzz();
        // Act
        Integer one = 1;
        // Assert
        assertEquals("1", unit.convert(one));
    }

    @Test
    public void testConvertIntegerThreeToStringFizz() {
        // Arrange
        FizzBuzz unit = new FizzBuzz();
        // Act
        Integer three = 3;
        // Assert
        assertEquals("Fizz", unit.convert(three));
    }

    @Test
    public void testConvertMultiplesOfIntegerThreeToStringFizz() {
        // Arrange
        FizzBuzz unit = new FizzBuzz();
        // Act
        Integer nine = 9;
        // Assert
        assertEquals("Fizz", unit.convert(nine));
    }

    @Test
    public void testConvertIntegerFiveToStringBuzz() {
        // Arrange
        FizzBuzz unit = new FizzBuzz();
        // Act
        Integer five = 5;
        // Assert
        assertEquals("Buzz", unit.convert(five));
    }

    @Test
    public void testConvertMultiplesOfIntegerFiveToStringBuzz() {
        // Arrange
        FizzBuzz unit = new FizzBuzz();
        // Act
        Integer ten = 10;
        // Assert
        assertEquals("Buzz", unit.convert(ten));
    }

    @Test
    public void testConvertIntegerFifteenToStringFizzBuzz() {
        // Arrange
        FizzBuzz unit = new FizzBuzz();
        // Act
        Integer fifteen = 15;
        // Assert
        assertEquals("FizzBuzz", unit.convert(fifteen));
    }

    @Test
    public void testConvertMultiplesOfIntegerFifteenToStringFizzBuzz() {
        // Arrange
        FizzBuzz unit = new FizzBuzz();
        // Act
        Integer sixty = 60;
        // Assert
        assertEquals("FizzBuzz", unit.convert(sixty));
    }
}
