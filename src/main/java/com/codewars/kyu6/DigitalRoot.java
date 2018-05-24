package com.codewars.kyu6;

public class DigitalRoot {
    public static int digital_root(int n) {
        int temp=0;
        for (int k=n; k!=0;k/=10) {
            temp+=k%10;
        }
        if (temp/10==0) return temp;
        return digital_root(temp);
    }
}

/*

  public static int digital_root(int n) {
       return (n != 0 && n%9 == 0) ? 9 : n % 9;
  }

    public static int digital_root(int n) {
    return n < 10 ? n : digital_root(digital_root(n/10)+n%10);
  }

A digital root is the recursive sum of all the digits in a number.
Given n, take the sum of the digits of n. If that value has two digits, continue reducing in this way until a single-digit number is produced.
This is only applicable to the natural numbers.

digital_root(132189)
=> 1 + 3 + 2 + 1 + 8 + 9
=> 24 ...
=> 2 + 4
=> 6
digital_root(942)
=> 9 + 4 + 2
=> 15 ...
=> 1 + 5
=> 6
 */