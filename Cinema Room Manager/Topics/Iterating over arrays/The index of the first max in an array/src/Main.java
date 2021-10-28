import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int max = array[0];
        int maxIndex = 0;

        for (int i = 0; i < n; i++) {
            if (array[i] > max) {
                maxIndex = i;
                max = array[i];
            }
        }

        System.out.println(maxIndex);
    }
}