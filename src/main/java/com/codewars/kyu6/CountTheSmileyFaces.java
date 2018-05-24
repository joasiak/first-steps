package com.codewars.kyu6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountTheSmileyFaces {
    public static int countSmileys(List<String> arr) {
        int count=0;
        List<String> validFaces = new ArrayList<>();
        validFaces.add(":)");
        validFaces.add(":D");
        validFaces.add(":~)");
        validFaces.add(":-D");
        validFaces.add(":~D");
        validFaces.add(":-)");
        validFaces.add(";)");
        validFaces.add(";D");
        validFaces.add(";~)");
        validFaces.add(";-D");
        validFaces.add(";~D");
        validFaces.add(";-)");
        for (String s : arr) {
            if (validFaces.contains(s)) count++;
        }

        return count;
    }


    public static int countSmileys2(List<String> arr) {
        return (int) arr.stream()
                .filter(e -> e.matches("[:;][-~]?[\\)D]"))
                .count();

    }
}


/*
Given an array (arr) as an argument complete the function countSmileys that should return the total number of smiling faces.

Rules for a smiling face:
-Each smiley face must contain a valid pair of eyes. Eyes can be marked as : or ;
-A smiley face can have a nose but it does not have to. Valid characters for a nose are - or ~
-Every smiling face must have a smiling mouth that should be marked with either ) or D.
No additional characters are allowed except for those mentioned.
Valid smiley face examples:
:) :D ;-D :~)
Invalid smiley faces:
;( :> :} :]

Example cases:

countSmileys([':)', ';(', ';}', ':-D']);       // should return 2;
countSmileys([';D', ':-(', ':-)', ';~)']);     // should return 3;
countSmileys([';]', ':[', ';*', ':$', ';-D']); // should return 1;

 */