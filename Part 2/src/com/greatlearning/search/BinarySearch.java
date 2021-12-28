package com.greatlearning.search;

public class BinarySearch {

    public boolean binarySearchImpl(double[] arr, double key) {

        boolean found = false;
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + ((right - left) / 2 );

            if (key < arr[mid]) {
                right = mid - 1;
            } else if (key > arr[mid]) {
                left = mid + 1;
            } else if (key == arr[mid]) {
                found = true;
                break;
            }
        }

        if (left > right) {
            found = false;
        }

        return found;

    }

}
