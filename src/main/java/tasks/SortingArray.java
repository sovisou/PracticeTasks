package tasks;

import java.util.Arrays;

public class SortingArray<T extends Comparable<? super T>> {

    public T[] merge(T[] firstArray) {

        if(firstArray.length < 2) {
            return firstArray;
        }
        int mid = firstArray.length / 2;
        T[] leftArray = Arrays.copyOfRange(firstArray, 0, mid);
        T[] rightArray = Arrays.copyOfRange(firstArray, mid, firstArray.length);
        leftArray = merge(leftArray);
        rightArray = merge(rightArray);
        mergeArray(firstArray, leftArray, rightArray);
        return firstArray;
    }
    public void mergeArray(T[] firstArray, T[] leftArray, T[] rightArray) {
        int indexFirstArray = 0;
        int indexLeftArray = 0;
        int indexRightArray = 0;
        while (indexFirstArray < leftArray.length && indexRightArray < rightArray.length) {
            if (leftArray[indexLeftArray].compareTo(rightArray[indexRightArray]) <= 0) {
                firstArray[indexFirstArray++] = leftArray[indexLeftArray++];
            } else {
                firstArray[indexFirstArray++] = rightArray[indexRightArray++];
            }
        }
        while (indexLeftArray < leftArray.length) {
            firstArray[indexFirstArray++] = leftArray[indexLeftArray++];
        }
        while (indexRightArray < rightArray.length) {
            firstArray[indexFirstArray++] = rightArray[indexRightArray++];
        }
    }

    public static void main(String[] args) {
        SortingArray<Integer> sorter = new SortingArray<>();
        Integer[] array = {28, 29, 48, 1, 10, 2, 99};
        Integer[] sortedArray = sorter.merge(array);
        for (Integer i : sortedArray) {
            System.out.print(i + " ");
        }
    }
    }

