package L03.JUNIT;


public class Sort {

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1])
                    swap(arr, j, j + 1);
            }
        }
    }

    public static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int value = arr[i];
            while (j >= 0 && arr[j] > value) {
                arr[j + 1] = arr[j--];
            }
            arr[j + 1] = value;
        }
    }

    public static void selectionSort(int[] arr) {
        int minIndex;
        for (int i = 0; i < arr.length; i++) {
            minIndex = minByIndex(arr, i, arr.length); //O(n)
            swap(arr, i, minIndex);//O(1)
        }
    }

    //O(1)
    private static void swap(int[] arr, int i, int minIndex) {
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
    }

    //O(n)
    private static int minByIndex(int[] arr, int from, int to) {
        int index = from;
        for (int i = from; i < to; i++) {
            if (arr[index] > arr[i]) {
                index = i;
            }
        }
        return index;
    }

}
