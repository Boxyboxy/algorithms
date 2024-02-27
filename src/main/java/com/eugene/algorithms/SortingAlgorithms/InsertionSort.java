package main.java.com.eugene.algorithms.SortingAlgorithms;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args){
        int[] arr = new int[]{7,4,3,5,2,1,6};

        insertionSort(arr);
        for(int i =0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
