package com.sortstrategy;

import java.util.Arrays;

public class App {
    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length - 1; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print(arr[arr.length - 1] + "]");
    }
    public static void main(String[] args) {
        /* TODO */
        // Tạo một mảng các số tự nhiên, các số tự nhiên được sinh ngẫu nhiên
        int[] arr1 = new int[5];
        for (int i = 0; i < arr1.length; i++){
            arr1[i] = (int) (Math.random() * 100);
        }
        int[] arr2 = Arrays.copyOf(arr1, arr1.length);
        int[] arr3 = Arrays.copyOf(arr1, arr1.length);
        // In ra mảng vừa tạo theo định dạng, ví dụ [1 2 3 4 5].
        printArray(arr1);
        // Sắp xếp mảng theo thứ tự tăng dần sử dụng các thuật toán sắp xếp khác nhau.
        System.out.println();

        System.out.println("Using Insertion Sort Algorithm: ");
        System.out.println("Before sorting: ");
        printArray(arr1);
        InsertionSort insertionSort = new InsertionSort();
        int count = insertionSort.sort(arr1);
        System.out.println("\nAfter sorting:");
        printArray(arr1);
        System.out.println("\nNumber of swap: " + count);
        System.out.println();

        System.out.println("Using Selection Sort Algorithm: ");
        System.out.println("Before sorting: ");
        printArray(arr2);
        SelectionSort selectionSort = new SelectionSort();
        count = selectionSort.sort(arr2);
        System.out.println("\nAfter sorting:");
        printArray(arr2);
        System.out.println("\nNumber of swap: " + count);
        System.out.println();


        System.out.println("Using Bubble Sort Algorithm: ");
        System.out.println("Before sorting: ");
        printArray(arr3);
        BubbleSort bubbleSort = new BubbleSort();
        count = bubbleSort.sort(arr3);
        System.out.println("\nAfter sorting:");
        printArray(arr3);
        System.out.println("\nNumber of swap: " + count);
        System.out.println();
        // In ra mảng sau khi sắp xếp.
        // In ra số lần đổi vị trí trong thuật toán đang sử dụng.
        // Ví dụ:
        // Using Bubble Sort Algorithm:
        // Before sorting: [5 4 3 2 1]
        // After sorting: [1 2 3 4 5]
        // Number of swap: 10

        // Using Selection Sort Algorithm:
        // Before sorting: [5 4 3 2 1]
        // After sorting: [1 2 3 4 5]
        // Number of swap: 10

        // Kết quả chạy chương trình lưu vào file SortStrategy<Mã sinh viên>.txt và nộp cùng source code.
    }
}
