import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int digits = scanner.nextInt();
        final int first = digits / 100;
        final int second = ((digits % 100) / 10) * 10;
        final int third = (digits % 10) * 100;

        System.out.println(first + second + third);
    }
}