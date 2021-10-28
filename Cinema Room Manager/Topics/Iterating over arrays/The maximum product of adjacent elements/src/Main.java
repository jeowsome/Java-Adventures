import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int maxProduct = array[0] * array[1];
        int first = array[0];

        for (int i = 1; i < n; i++) {
            int currentProduct = first * array[i];
            if (currentProduct > maxProduct) {
                maxProduct = currentProduct;
            }
            first = array[i];
        }

        System.out.println(maxProduct);
    }
}