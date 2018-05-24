package com.codewars.kyu7;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExesAndOhsTest {

    @Test
    public void testSomething1() {
        assertEquals(true, ExesAndOhs.getXO("xxxooo"));
    }

    @Test
    public void testSomething2() {
        assertEquals(true, ExesAndOhs.getXO("xxxXooOo"));
    }

    @Test
    public void testSomething3() {
        assertEquals(false, ExesAndOhs.getXO("xxx23424esdsfvxXXOOooo"));
    }

    @Test
    public void testSomething4() {
        assertEquals(false, ExesAndOhs.getXO("xXxxoewrcoOoo"));
    }

    @Test
    public void testSomething5() {
        assertEquals(false, ExesAndOhs.getXO("XxxxooO"));
    }

    @Test
    public void testSomething6() {
        assertEquals(true, ExesAndOhs.getXO("zssddd"));
    }

    @Test
    public void testSomething7() {
        assertEquals(false, ExesAndOhs.getXO("Xxxxertr34"));
    }

}