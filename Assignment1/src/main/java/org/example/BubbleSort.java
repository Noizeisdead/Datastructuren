package org.example;

public class BubbleSort {
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) { //loop through the arr
            for (int j = 1; j < (n - i); j++) { //check if index j is smaller than the index before
                if (arr[j - 1] > arr[j]) {
                    //swap elements if j is smaller
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String args[])
    {
            int arr[] = {12, 11, 13, 5, 6, 7};
            bubbleSort(arr);
            System.out.println("Sorted array is");
            printArray(arr);
        }
}
