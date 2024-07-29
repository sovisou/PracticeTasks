package tasks;

import java.util.HashSet;
import java.util.Set;

public class PrettyArray {
    /**
     * Гарний масив — це такий масив, у якого для кожного елемента n існують n-1 або n+1. Наприклад:
     * [2,10,3,9] гарний масив, тому що:
     * 2 = 3 - 1
     * 10 = 9 + 1
     * 3 = 2 + 1
     * 9 = 10 - 1
     * Реалізуй метод isArrayPretty(), який повертає true, якщо масив array є гарним,
     * інакше — false. Крім того, він має повертати false, якщо array порожній.
     */

    public static boolean isArrayPretty(int[] array) {
        if (array.length == 0) {
            return false;
        }
        Set<Integer> elements = new HashSet<>();
        for (int number : array) {
            elements.add(number);
        }
        for (int number : array) {
           if (!elements.contains(number - 1) && !elements.contains(number + 1)) {
                return false;
            }
        }
        return true;
    }
}
