import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];

        for (int i1 = 0; i1 < n; i1++) {
            for (int j1 = 0; j1 < m; j1++) {
                matrix[i1][j1] = scanner.nextInt();
            }
        }

        int i = scanner.nextInt();
        int j = scanner.nextInt();

        for (int i1 = 0; i1 < matrix.length; i1++) {
            int temp = matrix[i1][i];
            matrix[i1][i] = matrix[i1][j];
            matrix[i1][j] = temp;
        }

        for (int i1 = 0; i1 < n; i1++) {
            for (int j1 = 0; j1 < m; j1++) {
                System.out.print(matrix[i1][j1] + " ");
            }
            System.out.println();
        }

    }
}