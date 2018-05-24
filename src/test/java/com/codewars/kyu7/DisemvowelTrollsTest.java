package com.codewars.kyu7;

import com.codewars.kyu7.DisemvowelTrolls;
import org.junit.Test;
import static org.junit.Assert.*;

public class DisemvowelTrollsTest {

    DisemvowelTrolls s = new DisemvowelTrolls();

    @Test
    public void disemvowelTest() {
        assertEquals(s.disemvowel("This website is for losers LOL!"),
                "Ths wbst s fr lsrs LL!");
    }
}