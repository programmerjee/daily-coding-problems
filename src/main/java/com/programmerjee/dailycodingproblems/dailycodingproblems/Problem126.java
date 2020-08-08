package com.programmerjee.dailycodingproblems.dailycodingproblems;

import java.util.*;

/* 

Write a function that rotates a list by k elements. 
For example, [1, 2, 3, 4, 5, 6] rotated by two becomes 
[3, 4, 5, 6, 1, 2]. Try solving this without creating a copy of the list. 
How many swap or move operations do you need?

*/

public class Problem126 {

    public String getSolution(int[] x, int swap) {
        int len = x.length;
        int[] y= new int[len];
        for(int i = 0; i < len; i++) {
            if (i < (len - swap)){
                y[i] = x[i + 2]; 
            }
            else if(i == (len-swap)){
                y[i] = x[0];
            }
            else if (i > (len-swap)){
                y[i] = x[len - i];
            }
        }
        
        return "Original list " + Arrays.toString(x) + " rotated by " + swap + " is " + Arrays.toString(y);

    }
    //len = 6
    //swap = 2
    //i = 4
    //desired = 0
    //i = 5
    //desired = 1
    
}