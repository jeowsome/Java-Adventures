import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int divisibleCount = 0;
        double average = 0;

        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                divisibleCount++;
                average += i;
            }
        }
        System.out.println(average / divisibleCount);

    }
}