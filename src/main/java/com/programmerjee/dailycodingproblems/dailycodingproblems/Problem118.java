package com.programmerjee.dailycodingproblems.dailycodingproblems;

import java.util.Arrays;

public class Problem118 {

    int[] sortedInts = {-9, -2, 0, 2, 3};

    public String getSolution(int[]sortedInts) {
        int[] squaredInts = new int[sortedInts.length];
        StringBuffer retval = new StringBuffer();
        for (int i = 0; i < squaredInts.length; i++) {
            squaredInts[i] = sortedInts[i] * sortedInts[i];
        }
        Arrays.sort(squaredInts);
        for (int j = 0; j < squaredInts.length; j++) {
            retval.append(Integer.toString(squaredInts[j]));
            retval.append(", ");
        }

        return "The integer list squared is " + retval;
    }

    /* Given a sorted list of integers, 
    square the elements and give the output in sorted order.
    For example, given [-9, -2, 0, 2, 3], 
    return [0, 4, 4, 9, 81].*/
    
}