package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FindingPairNumberTest {

    @Test
    @DisplayName("Find Pair Number")
    void testFindPairNumber(){
        int[] resultFindPairNumber = FindingPairNumber.findPairNumber(new int[] {2,7,11,15}, 9);
        assertEquals("[0, 1]", Arrays.toString(resultFindPairNumber));
    }
}