package com.programmerjee.dailycodingproblems.dailycodingproblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* 
Given a list of numbers and a number k, 
return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] 
and k of 17, return true since 10 + 7 is 17.
*/

public class Problem1 {

	public String getSolution(int[] a, int b) {
        boolean isSum = false;

        /*for(int i = 0; i < a.length-1; i++) {
            for(int j = 1; j < a.length; j++) {
                if((a[i] + a[j]) == b)
                {
                    isSum = true;
                    break;
                }
            }
        } */

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length; i++) {

            // Check if the complement of current element is present in the map
            if (map.containsKey(b - a[i])) {
                isSum = true;
            }
            //add element to map for later comparison
            map.put(a[i], i);
        }

        if(isSum) {
            return "For list " + Arrays.toString(a) + " two numbers add up to " + b;
        }
        else {
            return "For list " + Arrays.toString(a) + " two numbers do not add up to " + b;
        }
		
	}

}
