package com.sortstrategy;

public class SelectionSort implements ISort {
    @Override
    public int sort(int[] data) {
        for (int i = 0; i < data.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j;//searching for lowest index
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return 0;
    }
}
