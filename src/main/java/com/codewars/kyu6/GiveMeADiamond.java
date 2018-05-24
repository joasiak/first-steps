package com.codewars.kyu6;

public class GiveMeADiamond {

    public static String print(int n) {
        StringBuilder str = new StringBuilder();
        if (n%2==0 || n<0) return null;
        for (int i=1; i<n; i+=2) {
            appendLine(str,(n-i)/2,n);
        }
        for (int i=0; i<=n/2; i++) {
            appendLine(str,i,n);
        }
        return str.toString();
    }

    public static void appendLine(StringBuilder diamond, int spaceNo, int totalSize) {
        for (int i=1; i<=spaceNo; i++) {
            diamond.append(" ");
        }
        for (int i=1; i<=totalSize-2*spaceNo; i++) {
            diamond.append("*");
        }
        diamond.append("\n");
    }
}
