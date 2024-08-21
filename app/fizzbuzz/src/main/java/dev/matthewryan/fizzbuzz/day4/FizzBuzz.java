package dev.matthewryan.fizzbuzz.day4;

public class FizzBuzz {
    public String convert(int value) {
        if (value % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(value);
    }
}
