import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = scanner.nextInt();
        int total = 0;

        for (int i = 1; i <= counter; i++) {
            int number = scanner.nextInt();
            if (number % 6 == 0) {
                total += number;
            }
        }
        System.out.println(total);
    }
}