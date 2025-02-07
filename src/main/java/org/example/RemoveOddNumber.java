package org.example;

import java.util.ArrayList;

public class RemoveOddNumber {

    public static void oddNumberRemover(int[] numberList){
        String[] indexEvenNumber = findEvenNumber(numberList).split("");

        StringBuilder evenNumber = new StringBuilder();

        for (String number : indexEvenNumber){
            evenNumber.append(numberList[Integer.parseInt(number)]);
        }

        System.out.println(evenNumber);
    }

    private static String findEvenNumber(int[] numberList){

        StringBuilder evenIndex = new StringBuilder();

        for (int i = 0; i < numberList.length; i++){
            if (numberList[i] % 2 == 0){
                evenIndex.append(i);
            }
        }

        return evenIndex.toString();

    }


}
