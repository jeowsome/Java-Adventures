import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        int occur = 0;

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int find = scanner.nextInt();
        for (int i: array) {
            occur += i == find ? 1 : 0;
        }

        System.out.println(occur);
    }
}