package tasks;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortNames {
    /**
     * У тебе є список імен: List<String>. Твоє завдання: відсортуй імена за алфавітом та поверни перші три з них після сортування.
     * Наприклад:
     * Input: List.of("Rick", "Jessie", "George", "Garold");
     * Result: List.of("Garold", "George", "Jessie");
     * Input: List.of("Rick");
     * Result: List.of("Rick");
     * Зверни увагу: виріши це завдання за допомогою Stream API.
     * */
        public static List<String> sortNames(List<String> names) {
            return names.stream()
                    .sorted()
                    .limit(3)
                    .collect(Collectors.toList());
        }
}