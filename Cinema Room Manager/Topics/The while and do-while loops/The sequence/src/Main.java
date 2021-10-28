import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = 0;

        while (n != 0) {
            int num = scanner.nextInt();
            max = (num % 4) == 0 && num > max ? num : max;
            n--;
        }

        System.out.println(max);
    }
}