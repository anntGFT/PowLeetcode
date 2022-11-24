package org.example;

public class Solution {
    public Solution(){

    }

    public double myPow(double x, int n){

        double result = x;

        for (int i = 0; i<n - 1; i++){

            result *= x;
        }

        return result;
    }
}