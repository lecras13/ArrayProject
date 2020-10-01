package com.epam.task4.logic;

import com.epam.task4.entity.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinarySearch {

    public String searchingBinary(Array array){
        int numberToSearch = readNumberToSearch();
        String index = binarySearching(array.getElementData(), numberToSearch);
        return "Index: " + index;
    }

    private int readNumberToSearch(){
        int toReturn = 0;
        String data = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter number to binarySearch:");
            data = reader.readLine();
            toReturn = Integer.parseInt(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return toReturn;
    }

    public String binarySearching(int arr[], int elementToSearch){
        int firstIndex = 0;
        int lastIndex = arr.length - 1;
        // if element noe presented
        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            // if middle element is required element
            if (arr[middleIndex] == elementToSearch) {
                return middleIndex + "";
            }
            // if middle element is less
            // take off first part from search
            else if (arr[middleIndex] < elementToSearch)
                firstIndex = middleIndex + 1;
                //if middle element is more
                // take off second part from search
            else if (arr[middleIndex] > elementToSearch)
                lastIndex = middleIndex - 1;
        }
        return "This number (" + elementToSearch +") is not detected" ;
    }
}
