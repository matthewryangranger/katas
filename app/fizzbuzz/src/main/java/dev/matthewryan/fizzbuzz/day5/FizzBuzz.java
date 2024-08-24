package dev.matthewryan.fizzbuzz.day5;

public class FizzBuzz {
    public String convert(int value) {
        if (value % 3 == 0)
            return "Fizz";
        if (value % 5 == 0)
            return "Buzz";
        return String.valueOf(value);
    }
}
