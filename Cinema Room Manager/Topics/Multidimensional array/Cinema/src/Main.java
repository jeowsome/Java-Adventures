import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nRows = scanner.nextInt();
        int mSeats = scanner.nextInt();
        int[][] cinema = new int[nRows][mSeats];
        int row = 0;

        for (int i = 0; i < nRows; i++) {
            for (int j = 0; j < mSeats; j++) {
                cinema[i][j] = scanner.nextInt();
            }
        }

        int k = scanner.nextInt();

        for (int i = 0; i < cinema.length; i++) {
            int rowCount = 0;
            for (int j = 0; j < cinema[i].length; j++) {
                if (cinema[i][j] == 0) {
                    rowCount++;
                } else {
                    rowCount = 0;
                }
                if (rowCount == k && row == 0) {
                    row = i + 1;
                    break;
                }
            }
        }
        System.out.println(row);

    }
}