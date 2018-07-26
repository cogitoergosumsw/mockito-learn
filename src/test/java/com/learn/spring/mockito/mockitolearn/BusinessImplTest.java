package com.learn.spring.mockito.mockitolearn;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import javax.xml.crypto.Data;

/**
 * Created by didi on 2018/7/26.
 */
public class BusinessImplTest {

    @Test
    public void testGreatestFromAllData(){
        DataService dataService = Mockito.mock(DataService.class);
        Mockito.when(dataService.retrieveAllData()).thenReturn(new int[] {24, 15, 6});

        BusinessImpl business = new BusinessImpl(dataService);
        int result = business.greatestFromAllData();

        Assert.assertEquals(24, result);
    }

    @Test
    public void secondTestGreatestFromAllData(){
        DataService dataService = Mockito.mock(DataService.class);
        Mockito.when(dataService.retrieveAllData()).thenReturn(new int[] {33, 10000, 6});

        BusinessImpl business = new BusinessImpl(dataService);
        int result = business.greatestFromAllData();

        Assert.assertEquals(10000, result);
    }
}

class DataServiceStub implements DataService {

    @Override
    public int[] retrieveAllData() {
        return new int[]{24, 15, 12};
    }
}