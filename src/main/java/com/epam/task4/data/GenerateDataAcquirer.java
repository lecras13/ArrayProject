package com.epam.task4.data;

import com.epam.task4.entity.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class GenerateDataAcquirer implements DataAcquirer {

    @Override
    public Array getArray(){
        Array array = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter size to auto-generate array :");
            int size = Integer.parseInt(reader.readLine());
            int[] mas = new int[size];
            Random random = new Random();
            for (int i = 0; i < size; i++){
                int number = random.nextInt(999);
                mas[i] = number;
            }
            array = new Array(mas);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return array;
    }
}
