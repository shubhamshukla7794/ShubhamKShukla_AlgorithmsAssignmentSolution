package com.greatlearning.service;

import com.greatlearning.sort.MergeSort;

public class SortService {

    MergeSort mergeSort;

    public SortService() {
        this.mergeSort = new MergeSort();
    }

    public void sortSharePrice(double[] sharePrice) {
        mergeSort.sort(sharePrice, 0, sharePrice.length - 1);
    }

}
