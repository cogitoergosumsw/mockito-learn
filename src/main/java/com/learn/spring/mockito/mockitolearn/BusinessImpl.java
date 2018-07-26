package com.learn.spring.mockito.mockitolearn;

/**
 * Created by didi on 2018/7/26.
 */
public class BusinessImpl {
    private DataService dataService;

    public BusinessImpl(DataService dataService) {
        super();
        this.dataService = dataService;
    }

    int greatestFromAllData() {
        int[] data = dataService.retrieveAllData();
        int greatest = Integer.MIN_VALUE;

        for (int value: data) {
            if (value > greatest) {
                greatest = value;
            }
        }
        return greatest;
    }
}
