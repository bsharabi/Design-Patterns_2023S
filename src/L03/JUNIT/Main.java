package L03.JUNIT;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr1 = {1, 5, 4, 6, 5, 8, 7, 5, 2, 4, 5, 6, 5};
        Sort.bubbleSort(arr1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {1, 5, 4, 6, 5, 8, 7, 5, 2, 4, 5, 6, 5};
        Sort.insertionSort(arr2);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = {1, 5, 4, 6, 5, 8, 7, 5, 2, 4, 5, 6, 5};
        Sort.selectionSort(arr3);
        System.out.println(Arrays.toString(arr3));
    }
}
