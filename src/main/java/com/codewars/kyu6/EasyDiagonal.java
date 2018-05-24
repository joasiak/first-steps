package com.codewars.kyu6;

import java.math.BigInteger;

public class EasyDiagonal {

    public static BigInteger diagonal(int n, int p) {
        BigInteger result = BigInteger.ZERO;
        for (int i=n; i>=p; i--) {
            result=result.add(binomial(i,p));
        }
        return result;
    }

    public static BigInteger binomial(int n, int k) {
        return factorial(n).divide(factorial(k).multiply(factorial(n-k)));
    }

    public static BigInteger factorial(int n) {
        if (n==0) return BigInteger.ONE;
        return BigInteger.valueOf(n).multiply(factorial(n-1));
    }

}
