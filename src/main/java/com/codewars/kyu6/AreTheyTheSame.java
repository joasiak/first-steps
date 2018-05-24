package com.codewars.kyu6;

import java.util.ArrayList;
import java.util.Arrays;

public class AreTheyTheSame {
    public static boolean comp(int[] a, int[] b) {
        if (a.length!=b.length || a.length==0) return false;
        boolean[] isTheSame = new boolean[b.length];
        for (int e : a) {
            for (int i=0; i<b.length;i++) {
                 if (b[i]==e*e && isTheSame[i]!=true) {isTheSame[i] = true;
                 break;
                 }
            }
        }
        for (boolean i : isTheSame) {
            if (i == false) return false;
        }
        return true;
    }

    public static boolean comp2(int[] a, int[] b) {
        if (a.length!=b.length || a.length==0) return false;
        int[] aa = Arrays.stream(a).map(n->n*n).toArray();
        Arrays.sort(aa);
        Arrays.sort(b);
        return Arrays.equals(aa,b);
    }

    public static boolean comp3(int[] a, int[] b) {
        if (a.length != b.length || a.length == 0) return false;
        return Arrays.stream(b)
                .filter(i -> Arrays.stream(a)
                        .anyMatch(j -> (j * j) == i))
                .count() == a.length;
    }

}
