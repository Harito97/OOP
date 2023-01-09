package com.sortstrategy;

public class BubbleSort implements ISort {
    @Override
    public int sort(int[] data) {
        boolean swapped;
        int n = data.length;
        int temp = 0;
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                    swapped = true;
                    count++;
                }
            }

            //Neu khong co phan tu doi cho thi gan false xong break
            if (swapped == false)
                break;
        }
        return count;
    }
}
