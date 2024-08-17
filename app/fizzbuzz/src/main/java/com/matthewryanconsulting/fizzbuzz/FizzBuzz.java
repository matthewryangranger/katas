package com.matthewryanconsulting.fizzbuzz;

public class FizzBuzz {

    public String convert(int number) {
        if (number % 15 == 0) {
            return "FizzBuzz";
        }
        if (number % 3 == 0) {
            return "Fizz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        }
//        if (number == 15) {
//            return "FizzBuzz";
//        }
        return String.valueOf(number);
    }
}
