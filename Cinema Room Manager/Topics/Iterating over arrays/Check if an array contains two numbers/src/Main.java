import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] nums = new int[size];

        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        boolean nFound = false;
        boolean mFound = false;

        for (int i : nums) {
            if (i == m) {
                mFound = true;
            }

            if (mFound && i == n) {
                nFound = true;
            }
        }

        System.out.println(mFound && nFound);
    }
}