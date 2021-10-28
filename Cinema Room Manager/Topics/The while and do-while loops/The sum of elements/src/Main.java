import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;

        int num = scanner.nextInt();
        while (num != 0) {
            total += num;
            num = scanner.nextInt();
        }

        System.out.println(total);
    }
}