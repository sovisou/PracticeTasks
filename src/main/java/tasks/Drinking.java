package tasks;

public class Drinking {
    /**
     * Mate Bar рекомендує випивати по одній склянці води на кожен стандартний напій, щоб на наступний день не було похмілля.
     * Реалізуй метод hydrate(), який приймає рядок drinks, що представляє напої, які ти збираєшся пити.
     * Наприклад: String drinks = "3 beers and 1 glass of rum"
     * Поверни рядок з інформацією, скільки склянок води потрібно випити, щоб не було похмілля.
     */
    public static String hydrate(String drinks) {
        int glasses = 0;
        char[] drinkChars = drinks.toCharArray();
        for (char element : drinkChars ) {
            if (Character.isDigit(element)) {
                glasses += Integer.parseInt(String.valueOf(element));
            }
        }
        if (glasses == 1) {
            return "1 glass of water";
        }
        return glasses + " glasses of water";
    }
}
