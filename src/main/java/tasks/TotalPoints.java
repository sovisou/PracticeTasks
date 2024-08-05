package tasks;

public class TotalPoints {
    /**
     * Наша футбольна команда завершила чемпіонат. Результат кожного матчу виглядає як " x: y ".
     * Результати всіх матчів записуються в масив, наприклад ["3:1", "2:2", "0:1", ...].
     * Реалізуй метод countPoints(), який приймає такий масив рядків games і повертає
     * загальну кількість балів нашої команди в чемпіонаті.
     * Правила підрахунку балів для кожного матчу:
     * якщо x > y - 3 бали
     * якщо x < y - 0 балів
     * якщо x = y - 1 бал
     */
    public static int countPoints(String[] games) {
        int finalScore = 0;
        for (String game : games) {
            String[] elements = game.split(":");
            int x = Integer.parseInt(elements[0]);
            int y = Integer.parseInt(elements[1]);
            if (x > y) {
                finalScore += 3;
            } else if (x == y) {
                finalScore += 1;
            }
        }
        return finalScore;
    }
}
