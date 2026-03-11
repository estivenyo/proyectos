import java.util.Random;

public class AddMatrices {
    public static void main(String[] args) {
        int rows = 2, cols = 3;
        Random r = new Random();

        int[][] a = new int[rows][cols], b = new int[rows][cols], sum = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++) {
                a[i][j] = r.nextInt(21) - 10;
                b[i][j] = r.nextInt(21) - 10;
                sum[i][j] = a[i][j] + b[i][j];
            }

        System.out.println("Primera matriz:"); print(a);
        System.out.println("Segunda matriz:"); print(b);
        System.out.println("Suma:"); print(sum);
    }

    static void print(int[][] m) {
        for (int[] row : m) {
            for (int v : row) System.out.print(v + "\t");
            System.out.println();
        }
    }
}
