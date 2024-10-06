package tasks;

public class SquareMatrixMultiplication {
    /**
     * Реалізуй метод multiplySquareMatrices(), який приймає дві матриці (N x N - двовимірні масиви)
     * і повертає іншу матрицю, що являє собою їх добуток.
     * Обидві матриці, що передаються у метод, мають розмір N x N і містять лише цілі числа.
     * Як перемножити дві квадратні матриці:
     * Наприклад, є дві матриці, A і B, розміром 2 x 2. Матриця C (рішення) є добутком A і B.
     * Щоб заповнити комірку [0][0] матриці C, потрібно обчислити: A[0][0] * B[0][0] + A[0][1] * B[1][0].
     */
    public static int[][] multiplySquareMatrices(int[][] a, int[][] b) {
        int length = a.length;
        int[][] sumMatrix = new int [length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                for(int m = 0; m < length; m++) {
                    sumMatrix[i][j] += a[i][m] * b[i][j];
                }
            }
        }
       return sumMatrix;
    }
}
