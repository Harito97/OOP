package com.sortstrategy;

public class InsertionSort implements ISort {
    @Override
    public int sort(int[] data) {
        int count = 0;
        int n = data.length;
        for (int i = 1; i < n; ++i) {
            int key = data[i];
            int j = i - 1;

            while (j >= 0 && data[j] > key) {
                data[j + 1] = data[j];
                j = j - 1;
                count++;
            }
            data[j + 1] = key;
        }
        return count;
    }
}
