package com.codewars.kyu6;

import org.junit.Test;

import static org.junit.Assert.*;

public class BuildAPileOfCubesTest {

    @Test
    public void test0() {
        assertEquals(45, BuildAPileOfCubes.findNb(1071225));
    }
    @Test
    public void test1() {
        assertEquals(47, BuildAPileOfCubes.findNb(1272384));
    }
    @Test
    public void test2() {
        assertEquals(-1, BuildAPileOfCubes.findNb(1272385));
    }

    @Test
    public void test11() {
        assertEquals(2022, BuildAPileOfCubes.findNb(4183059834009L));
    }
    @Test
    public void test21() {
        assertEquals(-1, BuildAPileOfCubes.findNb(24723578342962L));
    }
    @Test
    public void test3() {
        assertEquals(4824, BuildAPileOfCubes.findNb(135440716410000L));
    }
    @Test
    public void test4() {
        assertEquals(3568, BuildAPileOfCubes.findNb(40539911473216L));
    }
}