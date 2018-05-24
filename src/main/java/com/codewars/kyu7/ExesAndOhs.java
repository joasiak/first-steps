package com.codewars.kyu7;

public class ExesAndOhs {

    public static boolean getXO (String str) {
        int xsNumber = 0;
        int osNumber = 0;

        for (int i=0; i<str.length();i++) {
            if (str.toLowerCase().charAt(i) =='x') xsNumber++;
            if (str.toLowerCase().charAt(i)=='o') osNumber++;
        }

        return (xsNumber==osNumber) ? true : false;
    }
}
