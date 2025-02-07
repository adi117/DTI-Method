package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class FindingPairNumber {

    public static String findPairNumber(int[] numberList, int target){

        int[] pairNumber = new int[2];

        for (int i = 0; i < numberList.length; i++){
            for (int j = 1; j < numberList.length - 1; j++){
                if (numberList[i] + numberList[j] == target){
                    pairNumber[0] = i;
                    pairNumber[1] = j;
                    return Arrays.toString(pairNumber);
                }
            }
        }

        return "No pair exist";

    }

}
