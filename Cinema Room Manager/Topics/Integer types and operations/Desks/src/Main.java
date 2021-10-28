import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row1 = scanner.nextInt();
        int row2 = scanner.nextInt();
        int row3 = scanner.nextInt();
        final int total = (row1 + row2 + row3) + ((row1 % 2) + (row2 % 2) + (row3 % 2));

        System.out.println(total);
    }
}