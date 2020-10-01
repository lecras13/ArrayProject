package com.epam.task4.data;

import com.epam.task4.data.enums.DataType;
import org.junit.Test;

public class DataFactoryTest {
    @Test(expected = IllegalArgumentException.class)
    public void dataFactoryTestWhenDataNotHaveInFactory() {
        DataFactory factory = new DataFactory();

        DataAcquirer console = factory.getDataAcquirer(DataType.TEST);
    }
}
