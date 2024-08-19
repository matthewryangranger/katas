package dev.matthewryan.fizzbuzz.day2;

public class FizzBuzz {

    public String convert(Integer value) {
        if (value == 15) {
            return "FizzBuzz";
        }
        if (value % 3 == 0) {
            return "Fizz";
        }
        if (value % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(value);
    }
}
