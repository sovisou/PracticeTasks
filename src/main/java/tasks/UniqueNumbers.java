package tasks;

import java.util.List;
import java.util.stream.Collectors;

public class UniqueNumbers {
    /**
     Реалізуй метод getUniqueNumbers(), який приймає рядок sourceNumber
     та повертає список з усіма унікальними числами у вигляді символів із даного рядка.
     */
    public static List<Character> getUniqueNumbers(String sourceNumber) {
        return sourceNumber.chars()
                .distinct()
                .mapToObj(n -> (char) n)
                .collect(Collectors.toList());
    }
}
