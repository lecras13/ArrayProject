package com.epam.task4.logic;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {
    @Test
    public void searchingBinaryWithParameters(){
        BinarySearch binarySearch = new BinarySearch();
        int[] masForTest = new int[]{1, 5, 7, 88, 35, 35};

        String result = binarySearch.binarySearching(masForTest, 7);

        Assert.assertEquals("Index: 2", "Index: " + result);
    }

    @Test
    public void searchingBinaryWithParametersAndNumberWhichNotDetected(){
        BinarySearch binarySearch = new BinarySearch();
        int[] masForTest = new int[]{1, 5, 7, 88, 35, 35};

        String result = binarySearch.binarySearching(masForTest, 10);

        Assert.assertEquals("This number is not detected", result);
    }

}
