package com.epam.task4.entity;

import org.junit.Assert;
import org.junit.Test;

public class ArrayTest {
    @Test
    public void bubbleSortTestWhitParameteres(){
        int[] masForTest = new int[]{1, 5, 7, 88, 35, 35};
        Array   array = new Array(masForTest);

        array.bubbleSort();

        Assert.assertEquals(array.toString(), "1 5 7 35 35 88 ");
    }
}
