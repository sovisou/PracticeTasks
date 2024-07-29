package tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayOfDigits {
    /**
     *Реалізуй метод toArrayOfDigits(), який приймає число n і
     *  повертає масив із його цифрами у зворотному порядку. Наприклад:
     * toArrayOfDigits(46156); // [6, 5, 1, 6, 4]
     * toArrayOfDigits(1234); // [4, 3, 2, 1]
     * toArrayOfDigits(-123); // [3, 2, 1]
     * Зверни увагу: масив результатів повинен містити тільки числа.
     * ['6', '5', '1', '6', '4'] є неправильним результатом. Крім того,
     * якщо число від’ємне, ігноруй знак -: для n = -123 результат має бути [3, 2, 1].
     * */

    public static int[] toArrayOfDigits(int n) {
        if (n < 0) {
            n = Math.abs(n);
        }
        String number = String.valueOf(n);
        List<Integer> digits = new ArrayList<>();
        for (char element : number.toCharArray()) {
            digits.add(Character.getNumericValue(element));
        }
        Collections.reverse(digits);
        int[] digitsArray = new int[digits.size()];
        for (int i = 0; i < digits.size(); i++) {
            digitsArray[i] = digits.get(i);
        }
        return digitsArray;
    }

}
