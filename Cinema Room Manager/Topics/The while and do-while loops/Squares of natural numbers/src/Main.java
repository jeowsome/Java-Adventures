import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int square = 0;
        int counter = 1;

        while (true) {
            square = counter * counter;
            if (square <= n) {
                System.out.println(square);
                counter++;
            } else {
                break;
            }
        }
    }
}