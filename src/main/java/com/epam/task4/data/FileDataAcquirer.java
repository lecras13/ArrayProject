package com.epam.task4.data;

import com.epam.task4.entity.Array;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileDataAcquirer implements DataAcquirer {
    private String fileName;

    public FileDataAcquirer(String fileName){
        this.fileName = fileName;
    }

    @Override
    public Array getArray(){
        Array array = null;
        String data = null;
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            data = reader.readLine();
            String[] masAll = parseData(data);
            int[] mas = fillMassive(masAll);
            array = new Array(mas);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return array;
    }

    private String[] parseData(String data){
        String[] parseData = data.split(" ");
        return parseData;
    }

    private int[] fillMassive(String[] masAll){
        int[] mas = new int[masAll.length];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = Integer.parseInt(masAll[i]);
        }
        return mas;
    }
}
