package tasks;

public class IPAddresses {
    /**
     * Реалізуй метод countIPBetween(), який приймає дві IPv4 адреси start і end, і повертає кількість
     * адрес між ними (включаючи перший, виключаючи останній).
     * Примітки:
     * Всі вхідні дані будуть дійсними адресами IPv4 у вигляді рядків
     * Остання адреса завжди буде більше першої
     * Приклади:
     * countIPBetween("10.0.0.0", "10.0.0.50") == 50
     * countIPBetween("10.0.0.0", "10.0.1.0") == 256
     * countIPBetween("20.0.0.10", "20.0.1.0") == 246
     */
    public static long countIPBetween(String start, String end) {
        long startIP = ipToLong(start);
        long endIP = ipToLong(end);
        return (int) (endIP - startIP);
    }

    private static long ipToLong(String ip) {
        String[] parts = ip.split("\\.");
        long ipLong = 0;
        for (int i = 0; i < 4; i++) {
            ipLong |= (Long.parseLong(parts[i]) << (24 - (8 * i)));
        }
        return ipLong;
    }
}