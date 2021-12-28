package com.greatlearning.service;

import com.greatlearning.search.BinarySearch;
import com.greatlearning.search.LinearSearch;

public class SearchService {

    LinearSearch linearSearch;
    BinarySearch binarySearch;

    public SearchService() {
        this.linearSearch = new LinearSearch();
        this.binarySearch = new BinarySearch();
    }

    public void displayNoOfCompanyRoseToday(boolean[] comparedPrice) {
        int countOfCompanyRose = linearSearch.linearSearchImpl(comparedPrice, true);
        System.out.println(" Total no of companies whose stock price rose today :  " + countOfCompanyRose);
    }

    public void displayNoOfCompanyFellToday(boolean[] comparedPrice) {
        int countOfCompanyFell = linearSearch.linearSearchImpl(comparedPrice, false);
        System.out.println(" Total no of companies whose stock price declined today :  " + countOfCompanyFell);
    }

    public void searchKeyValue(double[] sharePrice, double key) {
        boolean isFound = binarySearch.binarySearchImpl(sharePrice, key);
        if (isFound) {
            System.out.println(" Stock of value " + key + " is present");
        }else {
            System.out.println(" Value not found");
        }
    }

}
