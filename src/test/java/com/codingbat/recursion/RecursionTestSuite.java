package com.codingbat.recursion;

import org.junit.Assert;
import org.junit.Test;

public class RecursionTestSuite {

    Recursion e = new Recursion();

    @Test
    public void factorial() {
        Assert.assertEquals(e.factorial(1),1);
        Assert.assertEquals(e.factorial(3),6);
        Assert.assertEquals(e.factorial(5),120);
        Assert.assertEquals(e.factorial(6),720);
        Assert.assertEquals(e.factorial(8),40320);
    }

    @Test
    public void bunnyEars2() {
        Assert.assertEquals(e.bunnyEars2(1),2);
        Assert.assertEquals(e.bunnyEars2(2),5);
        Assert.assertEquals(e.bunnyEars2(5),12);
        Assert.assertEquals(e.bunnyEars2(6),15);
        Assert.assertEquals(e.bunnyEars2(10),25);
    }

    @Test
    public void count7() {
        Assert.assertEquals(e.count7(717),2);
        Assert.assertEquals(e.count7(654737),2);
        Assert.assertEquals(e.count7(77777),5);
        Assert.assertEquals(e.count7(2356),0);
    }

    @Test
    public void countX() {
        Assert.assertEquals(e.countX("xxhixx"),4);
        Assert.assertEquals(e.countX("hihi"),0);
        Assert.assertEquals(e.countX(""),0);
        Assert.assertEquals(e.countX("x"),1);
    }

    @Test
    public void changePi() {
        Assert.assertEquals(e.changePi("xpix"),"x3.14x");
        Assert.assertEquals(e.changePi("hip"),"hip");
        Assert.assertEquals(e.changePi("xxpi"),"xx3.14");
        Assert.assertEquals(e.changePi("pixyz"),"3.14xyz");

    }

    @Test
    public void pairStar() {
        Assert.assertEquals(e.pairStar("hello"),"hel*lo");
        Assert.assertEquals(e.pairStar("xxxyy"),"x*x*xy*y");
        Assert.assertEquals(e.pairStar("a"),"a");
        Assert.assertEquals(e.pairStar("abbba"),"ab*b*ba");
    }

    @Test
    public void countAbc() {

        Assert.assertEquals(e.countAbc("ababcx"),2);
        Assert.assertEquals(e.countAbc("abcbba"),1);
        Assert.assertEquals(e.countAbc("aaa"),0);
    }

    @Test
    public void countHi2() {
        Assert.assertEquals(e.countHi2("ahixhi"),1);
        Assert.assertEquals(e.countHi2("hihihi"),3);
        Assert.assertEquals(e.countHi2("xxhi"),0);
        Assert.assertEquals(e.countHi2("xhihixhi"),1);

    }

    @Test
    public void strCount() {
        Assert.assertEquals(e.strCount("catcowcatow","cat"),2);
        Assert.assertEquals(e.strCount("xyx", "x"),2);
        Assert.assertEquals(e.strCount("aaaaaa", "aa"),3);
        Assert.assertEquals(e.strCount("a", "z"),0);
    }

    @Test
    public void strDist() {
        Assert.assertEquals(e.strDist("catcowcatow","cat"),9);
        Assert.assertEquals(e.strDist("cccatcowcatxx", "cat") ,9);
        Assert.assertEquals(e.strDist("xyx","x"),3);
        Assert.assertEquals(e.strDist("hiHellohihihi", "hi"),13);

    }

}