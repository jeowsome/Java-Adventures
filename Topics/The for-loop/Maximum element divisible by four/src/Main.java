import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = 0;

        for (int i = 1; i <= n; i++) {
            int input = scanner.nextInt();
            if (input % 4 == 0 && input > max) {
                max = input;
            }
        }
        System.out.println(max);
    }
}