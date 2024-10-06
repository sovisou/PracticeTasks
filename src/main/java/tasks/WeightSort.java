package tasks;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WeightSort {
    /**
     * Реалізуй метод orderWeights(), який приймає рядок weights, що містить числа та пробіли, і повертає рядок,
     * де ці числа відсортовані відповідно до їх "ваги".
     * "Вага" числа - це сума його цифр.
     * Наприклад, 99 має "вагу" 18, 100 має "вагу" 1, тому в результаті 100 буде перед 99.
     * Якщо два числа мають однакову "вагу", відсортуй їх так, ніби вони є рядками (в алфавітному порядку):
     * Наприклад, 90 і 180 мають однакову "вагу" (9), але 180 стоїть перед 90 як рядок.
     * Примітки:
     * усі числа в рядку є додатними;
     * вхідний рядок може бути порожнім;
     * вхідний рядок може містити пробіли на початку або в кінці, а також більше одного пробілу поспіль.
     * Приклади:
     * orderWeights("78 92 100") ==> "100 92 78"
     * orderWeights("91 118") ==> "118 91"
     * orderWeights("45   67") ==> "45 67"
     */
        public static String orderWeights(String weights) {
            return Stream.of(weights.trim().split(" +"))
                    .sorted()
                    .sorted(Comparator.comparingInt(o -> o.chars().map(Character::getNumericValue).sum()))
                    .collect(Collectors.joining(" "));
        }

}
