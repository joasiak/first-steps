package com.codewars.kyu6;

import org.junit.Test;

import static org.junit.Assert.*;

public class DigitalRootTest {

    @Test
    public void digital_root() {
        assertEquals( "Nope!" , 7, DigitalRoot.digital_root(16));
        assertEquals( "Nope!" , 6, DigitalRoot.digital_root(942));
        assertEquals( "Nope!" , 2, DigitalRoot.digital_root(493193));
        assertEquals( "Nope!" , 6, DigitalRoot.digital_root(132189));

    }
}