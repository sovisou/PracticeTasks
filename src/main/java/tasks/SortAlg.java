package tasks;

import java.util.Arrays;

public class SortAlg {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int index = divided(arr, low, high);
            quickSort(arr, low, index - 1);
            quickSort(arr, index + 1, high);
        }

    }
    private static int divided (int[] arr, int low, int high) {
        int core = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < core) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;


        return i + 1;
    }

    public static void main(String[] args) {
        int[] array = {17, 14, 15, 6, 8, 1, 3, 18};
        quickSort(array, 0, array.length - 1);
        System.out.println("  Sorted Array: " + Arrays.toString(array));


    }
}
