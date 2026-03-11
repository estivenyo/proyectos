import java.util.Random;

public class AddMatrices {
    public static void main(String[] args) {
        int rows = 2, columns = 3;
        Random rand = new Random();

        // Generar matrices aleatorias manteniendo la estructura original
        int[][] firstMatrix = new int[rows][columns];
        int[][] secondMatrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                firstMatrix[i][j] = rand.nextInt(21) - 10;  // valores entre -10 y 10
                secondMatrix[i][j] = rand.nextInt(21) - 10; // valores entre -10 y 10
            }
        }

        // Sumar las dos matrices
        int[][] sum = new int[rows][columns];
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }

        // Mostrar las matrices y el resultado
        System.out.println("Primera matriz:");
        for(int[] row : firstMatrix) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }

        System.out.println("Segunda matriz:");
        for(int[] row : secondMatrix) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }

        System.out.println("Suma de dos matrices es: ");
        for(int[] row : sum) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
}
