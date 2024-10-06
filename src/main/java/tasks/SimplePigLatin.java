package tasks;

public class SimplePigLatin {
    /**
     * Реалізуй метод toSimplePigLatin(), який приймає рядок string і перетворює його вміст на поросячу латину. Ось що потрібно зробити:
     * перенести першу літеру кожного слова в його кінець;
     * додати до кінця кожного слова "ay";
     * не додавати нічого до розділових знаків.
     * Функція повинна повертати змінений рядок.
     * Приклади:
     * toSimplePigLatin("code") ==> "odecay"
     * toSimplePigLatin("Java is fun") ==> "avaJay siay unfay"
     * toSimplePigLatin("Thank you !") ==> "hankTay ouyay !"
     */
    public static String toSimplePigLatin(String string) {
        String[] words = string.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].matches("[a-zA-Z]+")) {
                words[i] = words[i].substring(1) + words[i].charAt(0) + "ay";
            }
        }
        return String.join(" ", words);
    }
}
