package tasks;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FilterAndModifyLetters {
    /**У тебе є рядок input з випадковими літерами без цифр і знаків пунктуації.
     * Твоє завдання: видали кожну літеру з непарним індексом та поверни результат у верхньому регістрі.
     *Наприклад:
     Input: "random"
     Result: "RNO"
     Input: "a"
     Result: "A"
     Зверни увагу: виріши це завдання за допомогою Stream API.*/

    public static String filterLetters(String input) {
        return IntStream.range(0, input.length())
                .filter(index -> index % 2 == 0)
                .mapToObj(i -> String.valueOf(input.charAt(i)))
                .collect(Collectors.joining())
                .toUpperCase();
    }
}
