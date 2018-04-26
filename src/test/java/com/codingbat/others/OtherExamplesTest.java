package com.codingbat.others;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OtherExamplesTest {

    OtherExamples e = new OtherExamples();

    @Test
    public void withoutString() {
      // Assert.assertEquals(e.withoutString("Hello there","e"),"Hllo thr");
     //   Assert.assertEquals(e.withoutString("THIS is a FISH", "iS"), "TH a FH");
        Assert.assertEquals(e.withoutString("abxxxab","xx"), "abxab");
        Assert.assertEquals(e.withoutString("xxx","xx"), "x");
        Assert.assertEquals(e.withoutString("Hi HoHo", "Ho"), "Hi ");
      //  Assert.assertEquals(e.withoutString("This is a FISH", "IS"),"Th a FH");
      //  Assert.assertEquals(e.withoutString("MkjtMkx", "Mk"),"jtx");
      //  Assert.assertEquals(e.withoutString("Hello there", "llo"),"He there");


    }
}