package com.epam.task4.view;

import com.epam.task4.view.enums.PrintType;
import org.junit.Test;

public class PrintFactoryTest {
    @Test(expected = IllegalArgumentException.class)
    public void printTestWhenPrintNotHaveInFactory(){
        PrintFactory factory = new PrintFactory();

        ResultPrinter resultPrinter = factory.getResultPrinter(PrintType.TEST);
    }
}
