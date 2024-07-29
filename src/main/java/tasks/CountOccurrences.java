package tasks;

public class CountOccurrences {
    /**
     * Реалізуй метод countOccurrences(), який приймає 2 параметри: str та substr.
     * У методі підрахуй скільки разів substr з'являється в str.
     * Наприклад, для str = "azyxxzyzy" і substr = "zy" метод має повернути 3,
     * оскільки "zy" з'являється 3 рази: a[zy]xx[zy][zy].
     * countOccurrences("azyxxzyzy", "zy"); // 3
     * countOccurrences("ababagalamaga", "ba"); // 2
     * Зверни увагу:
     * str і substr містять лише латинські літери в нижньому регістрі;
     * літери в substr не повторюються (наприклад, substr не може бути xyx).
     */

    public static int countOccurrences(String str, String substr) {
        int substrIndex = 0;
        int counter = 0;
        while ((substrIndex = str.indexOf(substr, substrIndex)) != -1) {
            counter++;
            substrIndex += substr.length();
        }
        return counter;
    }
}
