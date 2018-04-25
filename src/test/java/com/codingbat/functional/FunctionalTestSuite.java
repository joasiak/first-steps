package com.codingbat.functional;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

public class FunctionalTestSuite {

    Functional f =  new Functional();

    @Test
    public void doubling() {
        //given
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        //when
        ArrayList<Integer> resultList = new ArrayList<>();
        resultList.add(2);
        resultList.add(4);
        resultList.add(6);

        //then
        Assert.assertEquals(f.doubling(list),resultList);
    }

}