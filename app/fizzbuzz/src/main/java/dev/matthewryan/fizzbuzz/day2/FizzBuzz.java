package dev.matthewryan.fizzbuzz.day2;

public class FizzBuzz {

    public String convert(Integer value) {
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
