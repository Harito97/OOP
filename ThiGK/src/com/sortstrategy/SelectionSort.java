package com.sortstrategy;

public class SelectionSort implements ISort {
    @Override
    public int sort(int[] data) {
        int count = 0;
        for (int i = 0; i < data.length - 1; i++){
            int index = i;
            for (int j = i + 1; j < data.length; j++){
                if (data[j] < data[index]){
                    index = j;  //searching for lowest index
                    count++;
                }
            }
            int smallerNumber = data[index];
            data[index] = data[i];
            data[i] = smallerNumber;
        }
        return count;
    }
}
