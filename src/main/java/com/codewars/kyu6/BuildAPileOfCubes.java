package com.codewars.kyu6;

public class BuildAPileOfCubes {

    public static long findNb(long m) {
        int sum =0;
        int result= -1;
        for (int i=0; sum<=m; i++) {
            sum+=Math.pow(i,3);
            if (sum==m) result = i;
        }
        return result;
    }
}
