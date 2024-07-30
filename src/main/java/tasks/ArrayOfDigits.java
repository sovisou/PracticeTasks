package tasks;

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
        n = Math.abs(n);
        String number = String.valueOf(n);
        int[] digits = new int[number.length()];
        for (int i = 0; i < number.length(); i++) {
            digits[i] = Character.getNumericValue(number.charAt(number.length() - 1 - i));
        }
        return digits;
    }
}
