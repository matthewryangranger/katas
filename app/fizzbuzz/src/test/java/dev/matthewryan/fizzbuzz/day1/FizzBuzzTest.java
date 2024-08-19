package dev.matthewryan.fizzbuzz.day1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    private FizzBuzz unit;

    @BeforeEach
    public void setup() {
        //Arrange
        unit = new FizzBuzz();
    }

    @Test
    public void returnOneTest() {
        //Act
        int one = 1;
        String result = unit.convert(one);

        //Assert
        assertEquals("1", result);
    }

    @Test
    public void returnFourteenTest() {
        //Act
        int fourteen = 14;
        String result = unit.convert(fourteen);

        //Assert
        assertEquals("14", result);
    }

    @Test
    public void returnFizzWhenPassedThreeTest() {
        //Act
        int three = 3;
        String result = unit.convert(three);

        //Assert
        assertEquals("Fizz", result);
    }

    @Test
    public void returnFizzWhenMultipleOfThreeTest() {
        //Act
        int nine = 9;
        String result = unit.convert(nine);

        //Assert
        assertEquals("Fizz", result);
    }

    @Test
    public void returnBuzzWhenPassedFiveTest() {
        //Act
        int five = 5;
        String result = unit.convert(five);

        //Assert
        assertEquals("Buzz", result);
    }

    @Test
    public void returnBuzzWhenMultiplesFiveTest() {
        //Act
        int ten = 10;
        String result = unit.convert(ten);

        //Assert
        assertEquals("Buzz", result);
    }

    @Test
    public void returnFizzBuzzWhenPassedFifteenTest() {
        //Act
        int fifteen = 15;
        String result = unit.convert(fifteen);

        //Assert
        assertEquals("FizzBuzz", result);
    }

    @Test
    public void returnFizzBuzzWhenMultiplesFifteenTest() {
        //Act
        int thirty = 30;
        String result = unit.convert(thirty);

        //Assert
        assertEquals("FizzBuzz", result);
    }
}
