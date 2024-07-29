package tasks;

public class RowWeights {
    /**
     * Кілька людей стоять в ряд, розділившись на дві команди.
     * Перша людина потрапляє в команду 1, друга - в команду 2, третя - в команду 1 і так далі.
     * Реалізуй метод getTotalWeight(), який приймає масив цілих додатних чисел weights.
     * Поверни новий масив з двох цілих чисел,
     * де перше - загальна вага команди 1, а друге - загальна вага команди 2.
     * Примітки:
     * масив weights складається щонайменше з одного числа
     * всі числа додатні*/

    public static int[] getTotalWeight(int[] weights) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < weights.length; i++) {
            if (i % 2 == 0) {
                sum1 += weights[i];
            } else {
                sum2 += weights[i];
            }
        }
        return new int[]{sum1, sum2};
    }
}
