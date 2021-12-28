package com.greatlearning.service;

public class DisplayService {

    public void displaySharePriceInAscendingOrder(double[] arr) {
        System.out.println(" Stock prices in ascending order are :");
        for (double a : arr ) {
            System.out.print(a + "  ");
        }
    }

    public void displaySharePriceInDescendingOrder(double[] arr) {
        System.out.println(" Stock prices in descending order are :");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + "  ");
        }
    }

}
