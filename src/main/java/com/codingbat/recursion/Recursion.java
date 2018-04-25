package com.codingbat.recursion;

public class Recursion {

    public int factorial(int n) {
        if (n==1) { return 1;}
        return n*factorial(n-1);
    }

    public int bunnyEars2(int bunnies) {
        if (bunnies==0) return 0;
        if (bunnies%2==0) {
            return 3 + bunnyEars2(bunnies - 1);
        }
        else {
            return 2+ bunnyEars2(bunnies-1);
        }
    }

    public int count7(int n) {

        if (n == 0) return 0;
        if (n % 10 == 7) return 1 + count7(n / 10);
        else return count7(n / 10);

    }

    public int countX(String str) {
        if (str.equals("")) return 0;
        if (str.charAt(0) == 'x') return 1 + countX(str.substring(1));
        else return countX(str.substring(1));
    }

    public String changePi(String str) {
        //   return str.replaceAll("pi","3.14");
        if (str.equals("") || str.length() < 2) return str;

        if (str.substring(0, 2).equals("pi")) return "3.14" + changePi(str.substring(2));
        else return str.substring(0, 1) + changePi(str.substring(1));
    }

    public int array11(int[] nums, int index) {

        if (index >= nums.length) return 0;
        if (nums[index] == 11) return 1 + array11(nums, index + 1);
        else return array11(nums, index + 1);
    }

    public String pairStar(String str) {

        if (str.equals("") || str.length() < 2) return str;
        if (str.charAt(0) == str.charAt(1)) return str.charAt(0) + "*" + pairStar(str.substring(1));
        else return str.charAt(0) + pairStar(str.substring(1));
    }

    public int countAbc(String str) {

        if (str.equals("") || str.length() < 3) return 0;
        if (str.charAt(0) == 'a' && str.charAt(1) == 'b' && (str.charAt(2) == 'c' || str.charAt(2) == 'a'))
            return 1 + countAbc(str.substring(1));
        else return countAbc(str.substring(1));
    }


    public int countHi2(String str) {
        if (str.equals("") || str.length()<2) return 0;
        if (str.substring(str.length()-2,str.length()).equals("hi")) {
            if ((str.length()>2 && str.charAt(str.length()-3)!='x') || str.length()==2)
            return 1 + countHi2(str.substring(0,str.length()-1));
        }
        return countHi2(str.substring(0,str.length()-1));
    }


    public int strCount(String str, String sub) {

        if (!str.contains(sub)) return 0;
        else {
            if (str.substring(0, sub.length()).equals(sub))
                return 1 + strCount(str.substring(sub.length()), sub);
            else
                return strCount(str.substring(1), sub);
        }
    }

    public int bunnyEars(int bunnies) {
        if (bunnies == 0) return 0;
        return 2 + bunnyEars(bunnies - 1);
    }

    public int triangle(int rows) {
        //  return rows*(rows+1)/2;
        if (rows == 0) return 0;
        return rows + triangle(rows - 1);
    }

    public int count8(int n) {
        if (n == 0) return 0;
        if (n % 10 == 8) {
            if (n / 10 % 10 == 8) return 2 + count8(n / 10);
            return 1 + count8(n / 10);
        } else return count8(n / 10);
    }

    public int strDist(String str, String sub) {
        return strDistTemp(str, sub).length();
    }

    public String strDistTemp(String str, String sub) {

        if (!str.contains(sub)) return "";
        else {
            if (str.startsWith(sub))
                if (str.substring(str.length() - sub.length(), str.length()).equals(sub))
                    return str;
                else return strDistTemp(str.substring(0, str.length() - 1), sub);
            else
                return strDistTemp(str.substring(1), sub);

        }
    }

    public boolean strCopies(String str, String sub, int n) {
        if (n <= strCopiesTemp(str, sub)) return true;
        else return false;
    }

    public int strCopiesTemp(String str, String sub) {

        if (!str.contains(sub)) return 0;
        else {
            if (str.startsWith(sub))
                return 1 + strCopiesTemp(str.substring(1), sub);
            else
                return strCopiesTemp(str.substring(1), sub);
        }
    }

    public boolean nestParen(String str) {
        if (str.equals("")) return true;
        if (str.substring(0, 1).equals("(") && str.substring(str.length() - 1, str.length()).equals(")"))
            return nestParen(str.substring(1, str.length() - 1));
        return false;
    }


}
