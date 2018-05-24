package com.codewars.kyu7;

import java.util.ArrayList;

public class DisemvowelTrolls {

    public String disemvowel(String str) {
        ArrayList<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('e');

        String result="";
        for (int i=0; i<=str.length()-1;i++) {
            if (!vowels.contains(str.toLowerCase().charAt(i)))
                result+=str.charAt(i);
        }
        return result;
    }
}


/*

Remove all vowels in the given string

 */