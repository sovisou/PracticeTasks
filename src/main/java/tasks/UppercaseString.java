package tasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UppercaseString {
    /**
     * Реалізуй метод getUppercaseString(), який приймає масив рядків
     * sourceStrings та повертає список рядків, у якому:
     * кожен рядок починається з малої літери — "a" або "b";
     * довжина кожного рядка 3 або більше.
     * Поверни ці рядки у верхньому регістрі.
     */

    public static List<String> getUppercaseString(String[] sourceStrings) {
        return Arrays.stream(sourceStrings)
                .filter(n -> n.startsWith("a") || n.startsWith("b"))
                .filter(s -> s.length() >= 3)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

}
