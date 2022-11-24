package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    static Solution solution;
    double x, result;
    int n;

    @BeforeAll
    static void setup(){

        solution = new Solution();
    }

    @Test
    public void TwoRaisedToThePowerTen(){

        x = 2.0;
        n = 10;
        result = 1024.0;

        assertEquals(result, solution.myPow(x,n));

    }

    @Test
    public void ThreePointFiveRaisedToThePowerThree(){

        x = 3.5;
        n = 3;
        result = 42.875;

        assertEquals(result, solution.myPow(x,n));

    }
}
