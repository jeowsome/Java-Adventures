import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] matrix = new int[size][size];
        boolean isSymmetric = true;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (matrix[j][i] != matrix[i][j]) {
                    isSymmetric = false;
                    break;
                }
            }
        }

        if (isSymmetric) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }
}