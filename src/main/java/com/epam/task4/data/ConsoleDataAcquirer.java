package com.epam.task4.data;

import com.epam.task4.entity.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleDataAcquirer implements DataAcquirer {

    @Override
    public Array getArray() {
        Array array = null;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter size array:");
            int size = Integer.parseInt(reader.readLine());
            int[] mas = new int[size];
            System.out.println("Enter number:");
            for (int i = 0; i < size; i++){
                int number = Integer.parseInt(reader.readLine());
                mas[i] = number;
            }
            array = new Array(mas);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return array;
    }
}
