package com.learn.spring.mockito.mockitolearn;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by didi on 2018/7/26.
 */
public class BusinessImplTest {

    @Test
    public void testGreatestFromAllData(){
        BusinessImpl business = new BusinessImpl(new DataServiceStub());
        int result = business.greatestFromAllData();

        Assert.assertEquals(24, result);
    }
}

class DataServiceStub implements DataService {

    @Override
    public int[] retrieveAllData() {
        return new int[]{24, 15, 12};
    }
}