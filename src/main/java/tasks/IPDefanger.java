package tasks;

public class IPDefanger {
    /**
     * Реалізуй метод defangIPAddress(), який приймає рядок з дійсною IPv4-адресою address і повертає змінену версію цієї IP-адреси.
     * У зміненій IP-адресі кожна крапка '.' замінена на "[.]".
     * Приклади:
     * defangIPAddress("1.1.1.1") == "1[.]1[.]1[.]1"
     * defangIPAddress("255.100.50.0") == "255[.]100[.]50[.]0"
     */
    public static String defangIPAddress(String address) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if(address.charAt(i) == '.') {
                builder.append("[.]");
            } else {
                builder.append(address.charAt(i));
            }
        }
        return builder.toString();
    }
}
