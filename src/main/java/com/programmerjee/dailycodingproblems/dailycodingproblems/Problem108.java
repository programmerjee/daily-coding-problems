package com.programmerjee.dailycodingproblems.dailycodingproblems;


public class Problem108 {

    public String getSolution(String a, String b) {
        boolean canBeShifted = false;
        if (a.equals(b)) {
            canBeShifted = true;
        }
        else {
            if (a.length() != b.length()) {
                canBeShifted = false;
            }
            else {
                String tmp = a + a;
                if (tmp.contains(b)) {
                    canBeShifted = true;
                }
                else {
                    canBeShifted = false;
                }
            }
        }
        
        if(canBeShifted) {
            return a + " can be shifted to become " + b;
        }
        else {
            return a + " cannot be shifted to become " + b;
        }
    }
    
}

/* Given two strings A and B, 
return whether or not A can be shifted some number of times to get B.

For example, if A is abcde and B is cdeab, return true. 
If A is abc and B is acb, return false.*/