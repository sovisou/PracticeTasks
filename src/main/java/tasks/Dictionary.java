package tasks;

public class Dictionary {
    /**
     *Напевно тобі знайоме повідомлення від Google "Можливо, Ви мали на увазі ...?",
     *  коли вводиш пошуковий запит і помиляєшся в слові. У цьому завданні ми хочемо реалізувати щось подібне.
     * Ти отримаєш введений термін term (рядок в нижньому регістрі) і масив відомих слів words
     * (також рядки в нижньому регістрі). Твоя задача - з'ясувати, яке слово зі словника найбільш
     * схоже на введене. Подібність описується мінімальною кількістю букв, які потрібно додати, прибрати або замінити,
     * щоб перейти від введеного слова до одного зі словника. Чим менше кількість необхідних змін, тим вище
     * подібність між двома словами. Однакові слова, очевидно, є найбільш схожими.
     * Слово, в якому потрібно змінити одну букву, більш схоже на інше слово, в якому необхідно змінити 2 (або більше)
     * літери. Наприклад, помилковий термін berr більше схожий на beer (потрібно замінити 1 букву),
     * ніж на barrel (всього потрібно замінити 3 літери).
     * Приклади:
     * tasks.Dictionary fruits = new tasks.Dictionary(new String[]{"cherry", "pineapple", "melon", "strawberry", "raspberry"});
     * fruits.findMostSimilar("strawbery"); // повертає "strawberry"
     * fruits.findMostSimilar("berry"); // повертає "cherry"
     */
    private final String[] words;

    public Dictionary(String[] words) {
        this.words = words;
    }

    public String findMostSimilar(String term) {
        String mostSimilar = null;
        int minDistance = Integer.MAX_VALUE;
        for (String word : words) {
            int distance = calculateLevenshteinDistance(term, word);
            if (distance < minDistance) {
                minDistance = distance;
                mostSimilar = word;
            }
        }
        return mostSimilar;
    }
    private int calculateLevenshteinDistance(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        int[][] dp = new int[len1 + 1][len2 + 1];
        for (int i = 0; i <= len1; i++) {
            for (int j = 0; j <= len2; j++) {
                if (i == 0) {
                    dp[i][j] = j;
                } else if (j == 0) {
                    dp[i][j] = i;
                } else {
                    int cost = (s1.charAt(i - 1) == s2.charAt(j - 1)) ? 0 : 1;
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j] + 1, dp[i][j - 1] + 1), dp[i - 1][j - 1] + cost);
                }
            }
        }
        return dp[len1][len2];
    }
}
