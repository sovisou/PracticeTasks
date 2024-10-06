package tasks;

public class JumpingNumber {
    /**
     * Реалізуй метод isJumping(), який приймає додатне ціле число number і повертає рядок "Jumping!!",
     * якщо кожна цифра в числі відрізняється від сусідньої на 1. Якщо ці умова не виконується,
     * потрібно повернути рядок "Not!!".
     * Примітки:
     * Різниця між 9 та 0 не вважається 1;
     * Усі одноцифрові числа вважаються "Jumping!!".
     * Приклади:
     * isJumping(57) ==> "Not!!"
     * isJumping(34) ==> "Jumping!!"
     * @param number
     * @return
     */
    public static String isJumping(int number) {
        if (number < 10) {
            return "Jumping!!";
        }
        char[] chars = String.valueOf(number).toCharArray();
        int counter = 0;
        for (int i = 0; i < chars.length - 1; i++) {
            int currentDigit = chars[i] - '0';
            int nextDigit = chars[i + 1] - '0';
            if (Math.abs(currentDigit - nextDigit) == 1) {
                counter++;
            }
        }
        if (counter == (chars.length - 1)) {
            return "Jumping!!";
        }
        return "Not!!";
    }
}
