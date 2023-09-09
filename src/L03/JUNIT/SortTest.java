//package L03.JUNIT;
//
//import java.util.Arrays;
//import java.util.Random;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class SortTest {
//    static Random rd = new Random();
//    static final int SIZE = 950;
//    static int[][] mat = new int[SIZE][];
//
//    static int[] init() {
//        int[] array = new int[rd.nextInt(900)];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = rd.nextInt();
//        }
//        return array;
//    }
//
//    boolean assertT(int[] arr) {
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i] > arr[i + 1])
//                return false;
//        }
//        return true;
//    }
//
//    @org.junit.jupiter.api.AfterAll
//    static void initMat() {
//        for (int i = 0; i < SIZE; i++)
//            mat[i] = init();
//    }
//
//    @org.junit.jupiter.api.Test
//    void bubbleSort() {
//        for (int i = 0; i < SIZE; i++) {
//            int[] temp = Arrays.copyOf(mat[i], mat[i].length);
//            Sort.bubbleSort(temp);
//            assertTrue(assertT(temp));
//        }
//    }
//
//    @org.junit.jupiter.api.Test
//    void insertionSort() {
//        for (int i = 0; i < SIZE; i++) {
//            int[] temp = Arrays.copyOf(mat[i], mat[i].length);
//            Sort.insertionSort(temp);
//            assertTrue(assertT(temp));
//        }
//    }
//
//    @org.junit.jupiter.api.Test
//    void selectionSort() {
//        for (int i = 0; i < SIZE; i++) {
//            int[] temp = Arrays.copyOf(mat[i], mat[i].length);
//            Sort.selectionSort(temp);
//            assertTrue(assertT(temp));
//        }
//    }
//}