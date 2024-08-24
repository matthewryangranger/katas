package dev.matthewryan.fizzbuzz.day5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    private FizzBuzz unit;

    @BeforeEach
    public void setup() {
        // Arrange
        unit = new FizzBuzz();
    }
    @Test
    public void testConvertOneToStringOne() {
        // Act
        int one = 1;
        // Assert
        assertEquals("1", unit.convert(one));
    }

    @Test
    public void testConvertTwoToStringTwo() {
        // Act
        int two = 2;
        // Assert
        assertEquals("2", unit.convert(two));
    }

    @Test
    public void testConvertThreeToStringFizz() {
        // Act
        int three = 3;
        // Assert
        assertEquals("Fizz", unit.convert(three));
    }

    @Test
    public void testConvertMultiplesOfThreeToStringFizz() {
        // Act
        int six = 6;
        // Assert
        assertEquals("Fizz", unit.convert(six));
    }

    @Test
    public void testConvertFiveToStringBuzz() {
        // Act
        int five = 5;
        // Assert
        assertEquals("Buzz", unit.convert(five));
    }
}
