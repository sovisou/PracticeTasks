package tasks;

import java.util.Arrays;
import java.util.List;

public class MinNumber {
    public static <T extends Comparable<? super T>> T findMin(List<T> list) {
        if (list.isEmpty()) {
            throw new RuntimeException("List cannot be empty");
        }

        T minElement = list.get(0);
        for (T element : list) {
            if (element.compareTo(minElement) < 0) {
                minElement = element;
            }
        }
        return minElement;
    }

        public static void main (String[]args){
            List<Integer> integers = Arrays.asList(4, 5, 8);
            System.out.println("Minimum Integer: " + findMin(integers));

            List<String> strings = Arrays.asList("fire", "water", "air");
            System.out.println("Minimum String: " + findMin(strings));
        }

}