package com.epam.task4;

import com.epam.task4.entity.Array;
import com.epam.task4.logic.BinarySearch;
import com.epam.task4.data.DataAcquirer;
import com.epam.task4.data.DataFactory;
import com.epam.task4.data.enums.DataType;
import com.epam.task4.view.PrintFactory;
import com.epam.task4.view.ResultPrinter;
import com.epam.task4.view.enums.PrintType;

/**
 * Variant 1-2-7
 * Create type Array, which is a wrapper class over an array of integer type.
 * This type must implement constructors (allowing you to create objects of the type in several ways),
 * get-s, set-s and overridden methods of the Object class (toString (), equals (), hasCode ()).
 * 1. Sort method - bubble method.
 * 2. Search for an array element (use the binary search algorithm).
 * 7. Filling in array elements both from the console and from a file and by generating random numbers.
 *
 * @author Raman Aleksandrov
 */

public class Main {
    public static void main(String[] args){
        DataFactory factory = new DataFactory();
        runFromConsole(factory);
        runFromFile(factory);
        runFromGenerate(factory);
    }

    private static void runFromConsole(DataFactory dataFactory){
        DataAcquirer console = dataFactory.getDataAcquirer(DataType.CONSOLE);
        Array array = console.getArray();
        //print before sort
        print(PrintType.CONSOLEPRINTER, array.toString());
        //sort
        array.bubbleSort();
        //print after sort
        print(PrintType.CONSOLEPRINTER, array.toString());
        //binary search and print
        print(PrintType.CONSOLEPRINTER, findTheResultBinary(array));
    }

    private static void runFromFile(DataFactory dataFactory){
        DataAcquirer file = dataFactory.getDataAcquirer(DataType.FILE);
        Array array = file.getArray();
        //print before sort
        print(PrintType.FILEPRINTER, array.toString());
        //sort
        array.bubbleSort();
        //print after sort
        print(PrintType.FILEPRINTER, array.toString());
        //binary search and print
        print(PrintType.FILEPRINTER, findTheResultBinary(array));
    }

    private static void runFromGenerate(DataFactory dataFactory){
        DataAcquirer console = dataFactory.getDataAcquirer(DataType.GENERATE);
        Array array = console.getArray();
        //print before sort
        print(PrintType.CONSOLEPRINTER, array.toString());
        //sort
        array.bubbleSort();
        //print after sort
        print(PrintType.CONSOLEPRINTER, array.toString());
        //binary search and print
        print(PrintType.CONSOLEPRINTER, findTheResultBinary(array));
    }

    private static String findTheResultBinary(Array array){
        BinarySearch binarySearch = new BinarySearch();
        String result = binarySearch.searchingBinary(array);
        return result;
    }

    private static void print(PrintType type, String result){
        PrintFactory printFactory = new PrintFactory();
        ResultPrinter resultPrinter = printFactory.getResultPrinter(type);
        resultPrinter.print(result);
    }
}
