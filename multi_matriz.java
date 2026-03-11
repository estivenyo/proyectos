import java.util.Random;

public class MultiMatriz {
    public static void main(String[] args) {
        int rowsA = 2, colsA = 3, colsB = 2;
        Random r = new Random();

        int[][] A = new int[rowsA][colsA], B = new int[colsA][colsB], prod = new int[rowsA][colsB];

        // generar y multiplicar en un solo paso
        for (int i = 0; i < rowsA; i++)
            for (int j = 0; j < colsA; j++) {
                A[i][j] = r.nextInt(11); // 0-10
                for (int k = 0; k < colsB; k++) {
                    if (i == 0) B[j][k] = r.nextInt(11); // generar B solo una vez
                    prod[i][k] += A[i][j] * B[j][k];
                }
            }

        System.out.println("Matriz A:"); print(A);
        System.out.println("Matriz B:"); print(B);
        System.out.println("Producto:"); print(prod);
    }

    static void print(int[][] m) {
        for (int[] row : m) {
            for (int v : row) System.out.print(v + "\t");
            System.out.println();
        }
    }
}
