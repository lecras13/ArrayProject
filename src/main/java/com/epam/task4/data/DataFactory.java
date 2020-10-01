package com.epam.task4.data;

import com.epam.task4.data.enums.DataType;

public class DataFactory {
    private static final String FILEPATH = "src/main/resources/FileDataAcquirer.txt";

    public DataAcquirer getDataAcquirer(DataType type){
        DataAcquirer toReturn = null;
        switch (type) {
            case CONSOLE:
                toReturn = new ConsoleDataAcquirer();
                break;
            case FILE:
                toReturn = new FileDataAcquirer(FILEPATH);
                break;
            case GENERATE:
                toReturn = new GenerateDataAcquirer();
                break;
            default:
                throw new IllegalArgumentException("Wrong type" + type);
        }
        return toReturn;
    }
}
