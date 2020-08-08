package com.programmerjee.dailycodingproblems.dailycodingproblems;

/* 
Given a real number n, find the square root of n. 
For example, given n = 9, return 3.
*/

public class Problem129 {
    public String getSolution(int x) {
        double doublex = x;
        int result = (int)Math.sqrt(doublex);
        return "The square root of " + x + " is " + result;
    }
    
}