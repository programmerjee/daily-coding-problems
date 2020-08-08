package com.programmerjee.dailycodingproblems.dailycodingproblems;

/* You have n fair coins and you flip them all at the same time. 
Any that come up tails you set aside. The ones that come up heads you flip again. 
How many rounds do you expect to play before only one coin remains?

Write a function that, given n, returns the number of rounds 
you'd expect to play until one coin remains.

*/

public class Problem124 {

    int coinNumber;

    public void setCoinNumber(int n) {
        coinNumber = n;
    }

    public String getSolution(int coinNumber) {
        //divide n by 2, then divide remainder by 2 until 1 coin remains
        //count each time you divide by 2
        int count = 0;
        int starting = coinNumber;
        if(coinNumber==1)
        {
            count = 1;
        }
        else
        {
            do {
                coinNumber = coinNumber/2;
                count++;
            }
            while (coinNumber > 1);
        } 

        return "You will need to flip the coin " + count + " number of times if you start with " + starting + " coins.";
    }
    
}

/*
10 / 2 = 5 count = 1
5 / 2 = 2 count = 2
2 / 2 = 1 count = 3
*/ 