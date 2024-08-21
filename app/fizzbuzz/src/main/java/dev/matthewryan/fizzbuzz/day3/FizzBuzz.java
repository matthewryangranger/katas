package dev.matthewryan.fizzbuzz.day3;

public class FizzBuzz {
    public String convert(int value) {
        if (value % 3 == 0) {
            if (value % 5 == 0)
                return "FizzBuzz";
            return "Fizz";
        }
        if (value % 5 == 0)
            return "Buzz";
        return String.valueOf(value);
    }
}
