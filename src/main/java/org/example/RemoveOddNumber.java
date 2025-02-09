package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveOddNumber {

    public static int[] oddNumberRemover(int[] numberList){
        String[] indexEvenNumber = findEvenNumber(numberList).split("");

        ArrayList<Integer> evenNumber = new ArrayList<>();
//        StringBuilder evenNumber = new StringBuilder();

        for (String number : indexEvenNumber){
            evenNumber.add(numberList[Integer.parseInt(number)]);
        }

        return evenNumber.stream().mapToInt(Integer::intValue).toArray();
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
