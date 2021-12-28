package com.greatlearning.search;

public class LinearSearch {

    public int linearSearchImpl(boolean[] arr, boolean check) {

        int count = 0;

        for (boolean b : arr ) {
            if (b == check)
                count++;
        }

        return count;
    }

}
