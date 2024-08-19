package dev.matthewryan.fizzbuzz.day2;

public class FizzBuzz {

    public String convert(Integer value) {
        if (value == 3) {
            return "Fizz";
        }
        return String.valueOf(value);
    }
}
