package L04.Threads;

import java.util.Arrays;
import java.util.Random;
import java.util.TreeMap;

public class Test {

    public static void main(String[] args) throws InterruptedException {

        int n = 100000000;
        int[] arr = new int[n];
        init(arr);
        long start = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 300) {
                System.out.println("Ok");
                return;
            }
        }
        System.out.println("Not ok");
        long end = System.currentTimeMillis();
        System.out.println("Time - " + (end - start));

        Thread.sleep(2500);
        System.out.println("---------------------------");
        SearchThread s1 = new SearchThread(Arrays.copyOfRange(arr, 0, n / 2), "THs-1");
        SearchThread s2 = new SearchThread(Arrays.copyOfRange(arr, n / 2, n), "THs-2");
        s1.start();
        s2.start();

    }

    private static void init(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt();
        }
    }

}

class SearchThread extends Thread {

    int[] arr;

    public SearchThread(int[] arr, String name) {
        super(name);
        this.arr = arr;
    }

    @Override
    public void run() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 300) {
                System.out.println("Ok");
                return;
            }
        }
        System.out.println("Not ok");
    }
}




