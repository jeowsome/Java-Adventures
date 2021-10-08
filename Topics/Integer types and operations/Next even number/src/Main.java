import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int digit = scanner.nextInt();

        final int i = digit % 2 == 0 ? digit + 2 : digit + 1;

        System.out.println(i);
    }
}