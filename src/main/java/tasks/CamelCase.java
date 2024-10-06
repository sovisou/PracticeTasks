package tasks;

public class CamelCase {
    /**
     * Реалізуй метод convertToCamelCase(), який приймає рядок string, де слова розділені
     * дефісами та/або нижніми підкресленнями. Метод повинен повернути вхідний рядок, відформатований у стилі camelCase.
     * Перше слово в результаті має бути написане з великої букви лише якщо перше слово у вхідному рядку було
     * написане з великої літери (цей стиль відомий як Upper Camel Case або Pascal case).
     * Приклади:
     * "books-already-read" ==> "booksAlreadyRead"
     * "Long_function_Name" ==> "LongFunctionName"
     * @param string
     * @return
     */
    public static String convertToCamelCase(String string) {
        char[] charArray = string.toCharArray();
        String camelCaseFormat = "";
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '-' || charArray[i] == '_') {
                camelCaseFormat += Character.toUpperCase(charArray[i + 1]);
                i++;
            } else {
                camelCaseFormat += charArray[i];
            }
        }
        return camelCaseFormat;
    }
}
