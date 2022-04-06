package com.example.sorting;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class SortingUtility {

    public static <T extends Comparable<T>> void gnomeSort(T[] data) {

        int pos = 0;
        while(pos < data.length) {
            if (pos == 0 || data[pos].compareTo(data[pos - 1]) >= 0)
                pos++;
            else {
                swap(data, pos, pos - 1);
                pos--;
            }
        }

    }

    public static <T extends Comparable<T>> void gnomierSort(T[] data) {

        for (int pos =0; pos < data.length; pos++) {
            gnomierSort(data, pos);
        }

    }

    private static <T extends Comparable<T>> void gnomierSort(T[] data, int upperBound) {

        while(upperBound > 0 && data[upperBound - 1].compareTo(data[upperBound]) > 0)
        {
            swap(data, upperBound - 1, upperBound);
            upperBound--;
        }
    }

    private static <T extends Comparable<T>> void swap(T[] data, int index1, int index2) {

        T temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;

    }
}





