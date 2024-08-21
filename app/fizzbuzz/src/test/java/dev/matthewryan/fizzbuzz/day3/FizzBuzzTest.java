package dev.matthewryan.fizzbuzz.day3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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

    @Test
    public void testIntegerMultiplesOfThreeConversion() {
        // Act
        int six = 6;
        // Assert
        assertEquals("Fizz", unit.convert(six));
    }

    @Test
    public void testIntegerFiveConversion() {
        // Act
        int five = 5;
        // Assert
        assertEquals("Buzz", unit.convert(five));
    }

    @Test
    public void testIntegerMultiplesOfFiveConversion() {
        // Act
        int ten = 10;
        // Assert
        assertEquals("Buzz", unit.convert(ten));
    }

    @Test
    public void testIntegerFifteenConversion() {
        // Act
        int fifteen = 15;
        // Assert
        assertEquals("FizzBuzz", unit.convert(fifteen));
    }

    @Test
    public void testIntegerMultiplesOfFifteenConversion() {
        // Act
        int thirty = 30;
        // Assert
        assertEquals("FizzBuzz", unit.convert(thirty));
    }
}
