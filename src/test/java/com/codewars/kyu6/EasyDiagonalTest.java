package com.codewars.kyu6;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.*;

public class EasyDiagonalTest {

    @Test
    public void test0() {
        assertEquals(BigInteger.valueOf(56), EasyDiagonal.diagonal(7, 2));
    }
    @Test
    public void test1() {
        assertEquals(BigInteger.valueOf(5985), EasyDiagonal.diagonal(20, 3));
    }
    @Test
    public void test2() {
        assertEquals(BigInteger.valueOf(20349), EasyDiagonal.diagonal(20, 4));
    }
    @Test
    public void test3() {
        assertEquals(BigInteger.valueOf(54264), EasyDiagonal.diagonal(20, 5));
    }

}