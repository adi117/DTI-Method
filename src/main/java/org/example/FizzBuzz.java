package org.example;

import java.util.Scanner;

public class FizzBuzz {

    public static String fizzBuzzPrint(Scanner scanner){

        double numberList;

        System.out.print("Input number : ");
        numberList = scanner.nextDouble();

        return checkFizzBuzz(numberList);
    }

    private static String checkFizzBuzz(double number){

        StringBuilder fizzBuzzResult = new StringBuilder();

        for (int i = 1; i <= number; i++){
            if (i % 3 == 0 && i % 5 == 0){
                fizzBuzzResult.append("FizzBuzz");
            } else if(i % 3 == 0){
                fizzBuzzResult.append("Fizz");
            } else if (i % 5 == 0){
                fizzBuzzResult.append("Buzz");
            } else {
                fizzBuzzResult.append(Integer.toString(i));
            }

            if (i < number){
                fizzBuzzResult.append(", ");
            }
        }

        return fizzBuzzResult.toString();

    }

}
