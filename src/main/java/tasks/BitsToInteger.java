package tasks;

public class BitsToInteger {
    /**
     * Реалізуй метод reverseBitsToInteger(), який приймає ціле додатне десяткове число number,
     * преводить його в бінарне, розвертає це бінарне число і знову переводить в десяткове.
     * Поверни результат переведення чисел.
     */
    public static int reverseBitsToInteger(int number) {
        String binaryNumber = Integer.toBinaryString(number).replace(' ', '0');
        String reversedBinaryNumber = new StringBuilder(binaryNumber).reverse().toString();
        int parsedNumber = Integer.parseInt(reversedBinaryNumber, 2);
        return parsedNumber;
    }
}
