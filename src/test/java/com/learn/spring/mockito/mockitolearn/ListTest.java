package com.learn.spring.mockito.mockitolearn;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import java.util.List;

import java.awt.*;

/**
 * Created by didi on 2018/7/26.
 */
public class ListTest {

    @Test
    public void testSize() {
        List mockList = Mockito.mock(List.class);
        Mockito.when(mockList.size()).thenReturn(10);
        Assert.assertEquals(10, mockList.size());
    }

    @Test
    public void testMultipleSize() {
        List mockList = Mockito.mock(List.class);
        Mockito.when(mockList.size()).thenReturn(10).thenReturn(20);
        Assert.assertEquals(10, mockList.size());
        Assert.assertEquals(20, mockList.size());
    }

    @Test
    public void testGet() {
        List mockList = Mockito.mock(List.class);
        Mockito.when(mockList.get(0)).thenReturn("Test");
        Assert.assertEquals("Test", mockList.get(0));
        Assert.assertEquals(null, mockList.get(10));
    }
}
