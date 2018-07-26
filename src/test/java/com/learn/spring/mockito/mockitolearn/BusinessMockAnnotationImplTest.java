package com.learn.spring.mockito.mockitolearn;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

/**
 * Created by didi on 2018/7/26.
 */
@RunWith(MockitoJUnitRunner.class)
public class BusinessMockAnnotationImplTest {

    @Mock
    DataService dataService;

    @InjectMocks
    BusinessImpl business;

    @Test
    public void testGreatestFromAllData(){
//        DataService dataService = Mockito.mock(DataService.class);
        Mockito.when(dataService.retrieveAllData()).thenReturn(new int[] {24, 15, 6});

//        BusinessImpl business = new BusinessImpl(dataService);
        int result = business.greatestFromAllData();

        Assert.assertEquals(24, result);
    }

    @Test
    public void secondTestGreatestFromAllData(){
//        DataService dataService = Mockito.mock(DataService.class);
        Mockito.when(dataService.retrieveAllData()).thenReturn(new int[] {33, 10000, 6});

//        BusinessImpl business = new BusinessImpl(dataService);
        int result = business.greatestFromAllData();

        Assert.assertEquals(10000, result);
    }
}

