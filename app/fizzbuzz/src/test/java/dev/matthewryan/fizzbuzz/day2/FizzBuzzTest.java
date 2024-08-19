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

    @Test
    public void testFizzBuzzClassToConvertMultiplesIntThreeToFizz() {
        // Arrange
        FizzBuzz unit = new FizzBuzz();
        // Act
        Integer six = 6;
        // Assert
        assertEquals("Fizz", unit.convert(six));
    }

    @Test
    public void testFizzBuzzClassToConvertIntFourToFour() {
        // Arrange
        FizzBuzz unit = new FizzBuzz();
        // Act
        Integer four = 4;
        // Assert
        assertEquals("4", unit.convert(four));
    }

    @Test
    public void testFizzBuzzClassToConvertIntFiveToBuzz() {
        // Arrange
        FizzBuzz unit = new FizzBuzz();
        // Act
        Integer five = 5;
        // Assert
        assertEquals("Buzz", unit.convert(five));
    }

    @Test
    public void testFizzBuzzClassToConvertMultiplesIntFiveToBuzz() {
        // Arrange
        FizzBuzz unit = new FizzBuzz();
        // Act
        Integer fifty = 50;
        // Assert
        assertEquals("Buzz", unit.convert(fifty));
    }

    @Test
    public void testFizzBuzzClassToConvertIntFifteenToFizzBuzz() {
        // Arrange
        FizzBuzz unit = new FizzBuzz();
        // Act
        Integer fifteen = 15;
        // Assert
        assertEquals("FizzBuzz", unit.convert(fifteen));
    }

    @Test
    public void testFizzBuzzClassToConvertMultiplesFifteenToFizzBuzz() {
        // Arrange
        FizzBuzz unit = new FizzBuzz();
        // Act
        Integer thirty = 30;
        // Assert
        assertEquals("FizzBuzz", unit.convert(thirty));
    }


}
