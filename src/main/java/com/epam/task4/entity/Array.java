package com.epam.task4.entity;

import java.util.Arrays;

public class Array {
    private static final int DEFAULT_CAPACITY = 10;
    private int[] elementData;
    private int size;

    public Array(){
        elementData = new int[DEFAULT_CAPACITY];
    }

    public Array(int size){
        elementData = new int[size];
    }

    public Array(int[] mass){
        elementData = mass;
        size = mass.length;
    }

    public void setElementData(int[] elementData){
        this.elementData = elementData;
    }

    public int[] getElementData(){
        return elementData;
    }

    public int getSize(){
        return size;
    }

    public void bubbleSort(){
        int[] forSort = this.elementData;
        for (int i = 0; i < forSort.length; i++) {
            int min = forSort[i];
            int min_i = i;
            for (int j = i + 1; j < forSort.length; j++) {
                if (forSort[j] < min) {
                    min = forSort[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = forSort[i];
                forSort[i] = forSort[min_i];
                forSort[min_i] = tmp;
            }
        }
        this.setElementData(forSort);
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Array array = (Array) o;

        if (size != array.size) return false;
        return Arrays.equals(elementData, array.elementData);
    }

    @Override
    public int hashCode(){
        int result = Arrays.hashCode(elementData);
        result = 31 * result + size;
        return result;
    }

    @Override
    public String toString(){
        String toPrint = "";
        int[] toPr = this.getElementData();
        for (int i = 0; i < toPr.length; i++) {
            toPrint += toPr[i] + " ";
        }
        return toPrint;
    }
}
