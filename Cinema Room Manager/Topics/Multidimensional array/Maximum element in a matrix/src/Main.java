import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int max = matrix[0][0];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        int maxColumn = 0;
        int maxRow = 0;
        boolean maxFound = false;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (max == matrix[i][j]) {
                    maxFound = true;
                    maxRow = i;
                    maxColumn = j;
                    break;
                }
            }
            if (maxFound) {
                System.out.println(maxRow + " " + maxColumn);
                break;
            }
        }
    }
}