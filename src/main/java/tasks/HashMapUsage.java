package tasks;

import java.util.Map;

public class HashMapUsage {
    /**
     * У цьому завданні реалізуй метод calculateSum(), у якому підрахуй суму значень Integer
     * переданого хешмапу, де ключ містить keyPart.
     * Наприклад, якщо keyPart = "hello" і хешмап має такий вміст:
     * data.put("myhelloworld", 4);
     * data.put("Hello", 7);
     * data.put("AwesomeString", 8);
     * data.put("Wow!!!! HELLO", 9);`
     * Результатом буде 4 + 7 + 9 = 20.
     * Зверни увагу:
     * якщо хешмап порожній, поверни 0;
     * якщо keyPart порожній, поверни суму всіх Integer.
     * */

    public static int calculateSum(Map<String, Integer> data, String keyPart) {
        int sum = 0;
        if (data.isEmpty()) {
            return 0;
        }
        if (keyPart.isEmpty()) {
            for (int value : data.values()) {
                sum += value;
            }
            return sum;
        }
        for (Map.Entry<String, Integer> entry : data.entrySet()) {
            if (entry.getKey().contains(keyPart)) {
                sum += entry.getValue();
            }
        }
        return sum;
    }
}
