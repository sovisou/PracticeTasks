package tasks;

public class MatrixAddition {
    /**
     * Реалізуй метод addMatrix(), який приймає 2 матриці та повертає нову матрицю, яка представляє їх суму.
     * Обидві матриці є двовимірними масивами, мають розмір N x M та містять лише цілі числа.
     * Як додати 2 матриці? Елемент [n][m] з першої матриці додай до елементу [n][m] другої матриці.
     * Ця сума і є новим елементом матриці результатів.
     */

    public static int[][] addMatrix(int[][] first, int[][] second) {
        int raws = first.length;
        int columns = first[0].length;
        int[][] newMatrix = new int [raws][columns];
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second.length; j++) {
                newMatrix[i][j] = first[i][j] + second[i][j];
            }
        }
        return newMatrix;
    }
}
