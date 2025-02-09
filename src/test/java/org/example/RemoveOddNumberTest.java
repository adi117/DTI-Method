package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RemoveOddNumberTest {

    @Test
    @DisplayName("Remove Odd Number")
    void testRemoveOddNumber(){
        assertArrayEquals(new int[] {2,4,6,8,10}, RemoveOddNumber.oddNumberRemover(new int[] {1,2,3,4,5,6,7,8,9,10}));
    }

}