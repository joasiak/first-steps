package com.codingbat.others;

import java.util.ArrayList;
import java.util.List;

public class OtherExamples {

    public String everyNth(String str, int n) {
        String result = "";
        for (int i = 0; i < str.length(); i = i + n) {
            result = result + str.charAt(i);
        }
        return result;
    }

    public boolean or35(int n) {
        return (n % 3 == 0) || (n % 5 == 0);
    }

    boolean doubleX(String str) {
        boolean isDoubleX = false;
        for (int i = 0; i <= str.length() - 2; i++) {
            String aa = str.substring(i, i + 1);
            if (str.substring(i, i + 1).equals("x")) {
                if (str.substring(i + 1, i + 2).equals("x")) {
                    isDoubleX = true;
                    break;
                }
            }
        }
        return isDoubleX;
    }

    public int last2(String str) {
        int numberOfLast2 = 0;
        if (str.length() > 2) {

            String last = str.substring(str.length() - 2, str.length());
            for (int i = 0; i <= str.length() - 2; i++) {
                if (str.substring(i, i + 2).equals(last)) {
                    numberOfLast2 += 1;
                }
            }
            numberOfLast2 = numberOfLast2 - 1;
        }
        return numberOfLast2;
    }


    public boolean array123(int[] nums) {
        boolean is1InArray = false;
        boolean is2InArray = false;
        boolean is3InArray = false;
        int indicator = 0;

        for (int s : nums) {
            if (s == 1 && (!is1InArray)) {
                indicator += 1;
            }
            if (s == 2 && (!is2InArray)) {
                indicator += 1;
            }
            if (s == 3 && (!is3InArray)) {
                indicator += 1;
            }
        }
        if (indicator == 3) return true;
        else return false;
    }


    public String altPairs(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i += 4) {
            int end = i + 2;
            if (end > str.length()) {
                end = str.length();
            }
            result = result + str.substring(i, end);
        }
        return result;
    }

    public boolean noTriples(int[] nums) {
        for (int i = 0; i < (nums.length - 2); i++) {
            int first = nums[i];
            if (nums[i + 1] == first && nums[i + 2] == first) return false;
        }
        return true;
    }

    public String stringBits(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if ((i + 1) % 2 == 1) {
                result += str.substring(i, i + 1);
            }
        }
        return result;
    }

    public int stringMatch(String a, String b) {
        int len = Math.min(a.length(), b.length());
        int count = 0;
        for (int i=0; i<len-1; i++) {
            String aSub = a.substring(i, i+2);
            String bSub = b.substring(i, i+2);
            if (aSub.equals(bSub)) {
                count++;
            }
        }
        return count;
    }

    public int stringMatch2(String a, String b) {
        int count = 0;
        int len = Math.min(a.length(), b.length());
        for (int i = 0; i < len - 1; i++) {
            if (a.length() < b.length()) {
                String check = a.substring(i, i + 2);
                if (b.contains(check)) {
                    count += 1;
                }
            } else {
                String check = a.substring(i, i + 2);
                if (b.contains(check)) {
                    count += 1;
                }
            }
        }
        return count;
    }

    public boolean makeBricks(int small, int big, int goal) {
        int howManyBigIsNeeded = goal / 5;
        int howManySmallIsNeeded = goal;

        boolean isEnought = false;

        if (howManySmallIsNeeded <= small) {
            isEnought = true;
        } else if (howManyBigIsNeeded * big == goal) {
            isEnought = true;
        } else if (goal - (big * 5) <= small && (goal % 5) <= small) {
            isEnought = true;
        }
        return isEnought;
    }

    public int fixTeen(int n) {
        if ((n != 15) && (n != 16) && (13 <= n) && (n <= 19))
            return 0;
        else return n;
    }

    public int countYZ(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (i == str.length() - 1) {
                if (str.toLowerCase().charAt(i) == 'y' || str.toLowerCase().charAt(i) == 'z') count += 1;
            } else if (!Character.isLetter(str.charAt(i + 1))) {
                if (str.charAt(i) == 'y' || str.charAt(i) == 'z') {
                    count += 1;
                }
            }
        }
        return count;

    }

    public String sameEnds(String string) {
        String currentStr = "";
        String finalStr = "";
        boolean isSameEnds = false;
        for (int i = 0; i < string.length(); i++) {
            currentStr = string.substring(0, i);
            if (string.endsWith(currentStr)) {
                String z = string.substring(i + 1, string.length());
                int b = string.lastIndexOf(currentStr);
                int s = string.substring(i + 1, string.length()).indexOf(currentStr);
                if (i <= b) {
                    finalStr = currentStr;
                }
            }
        }
        return finalStr;
    }

    public int sumNumbers(String str) {
        String numberString = "";
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char k = str.charAt(i);
            if (Character.isDigit(str.charAt(i))) {
                numberString += str.substring(i, i + 1);
                if (i + 1 == str.length()) {
                    strings.add(numberString);
                    numberString = "";
                } else if (!Character.isDigit(str.charAt(i + 1))) {
                    strings.add(numberString);
                    numberString = "";
                }
            }
        }
        int sum = 0;
        for (String s : strings) {
            sum += Integer.parseInt(s);
        }
        return sum;
    }

    public String withoutString(String base, String remove) {
        if (!base.toUpperCase().contains(remove.toUpperCase())) {
            return base;
        } else {
            String result = "";
            char first = remove.toUpperCase().charAt(0);
            for (int i = 0; i < base.length(); i++) {
                if (base.toUpperCase().charAt(i) == first) {
                    if (i + remove.length() < base.length() && base.toUpperCase().substring(i, i + remove.length()).equals(remove.toUpperCase())) {
                        i= i + remove.length()-1;
                    }
                }
                else
                    result+=base.charAt(i);
            }
            return result;
        }
    }

    /*
    public String withoutString(String base, String remove) {
        int blen = base.length();
        int rlen = remove.length();
        String lowbase = base.toLowerCase();
        String lowrem = remove.toLowerCase();
        String fin = "";
        for (int i = 0; i < blen; i++) {
            if (i <= blen - rlen) {
                String tmp = lowbase.substring(i,i+rlen);
                if (!tmp.equals(lowrem))
                    fin += base.substring(i,i+1);
                else {
                    i += rlen-1;
                }
            }
            else {
                String tmp2 = lowbase.substring(i,i+1);
                if (!tmp2.equals(lowrem))
                    fin += base.substring(i,i+1);
            }
        }
        return fin;
    }
*/



    /*
    Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n}
    (spaces added to show the grouping). Note that the length of
    the array will be 1 + 2 + 3 ... + n, which is known to sum to exactly n*(n + 1)/2.

    seriesUp(3) → [1, 1, 2, 1, 2, 3]
    seriesUp(4) → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
    seriesUp(2) → [1, 1, 2]
     */
    public int[] seriesUp(int n) {
        int[] tablica = new int[n * (n + 1) / 2];
        int k = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                tablica[k++] = j;
            }
        }
        return tablica;
    }

/*
Given a non-empty array, return true if there is a place to split the array so
that the sum of the numbers on one side is equal to the sum of the numbers on the other side.

canBalance([1, 1, 1, 2, 1]) → true
canBalance([2, 1, 1, 2, 1]) → false
canBalance([10, 10]) → true
*/

    public boolean canBalance(int[] nums) {
        boolean isSplitPossible = false;
        int frontSum = 0;
        int endSum = 0;
        for (int i = 0; i < nums.length; i++) {
            frontSum += nums[i];
            endSum = 0;
            for (int j = nums.length - 1; j > i; j--) {
                endSum += nums[j];
            }
            if (frontSum == endSum) {
                isSplitPossible = true;
            }
        }
        return isSplitPossible;
    }

    public boolean scoresIncreasing(int[] scores) {
        boolean isScoreIncrease = false;
        ArrayList<Boolean> temporaryList = new ArrayList<>();
        for (int i = 1; i < scores.length; i++) {
            if (scores[i - 1] <= scores[i]) {
                temporaryList.add(true);
            } else
                temporaryList.add(false);
        }
        return (!temporaryList.contains(false));

    }


    public int scoresAverage(int[] scores) {
        int len = scores.length;
        return Math.max(average(scores, 0, len / 2 - 1), average(scores, len / 2, len - 1));
    }


    int average(int[] scores, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += scores[i];
        }
        return sum / ((end - start) + 1);
    }

    public List wordsWithoutList(String[] words, int len) {
        ArrayList<String> newWordsList = new ArrayList<>();
        for (String s : words) {
            if (s.length() != len) {
                newWordsList.add(s);
            }
        }
        return newWordsList;
    }

}
