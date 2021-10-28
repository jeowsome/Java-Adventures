import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int climbed = 0;
        int day = 0;

        while (true) {
            day++;
            climbed += a;
            if (climbed >= h) {
                break;
            }
            climbed -= b;
        }

        System.out.println(day);
    }
}