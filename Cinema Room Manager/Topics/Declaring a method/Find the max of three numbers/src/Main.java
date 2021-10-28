import java.util.Scanner;

public class Main {

    public static int getNumberOfMaxParam(int a, int b, int c) {
        int[] nums = {1, a, b, c};
        int maxAt = 1;

        for (int i = 1; i < nums.length; i++) {
            maxAt = nums[i] > nums[maxAt] ? i : maxAt;
        }
        return maxAt;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        System.out.println(getNumberOfMaxParam(a, b, c));
    }
}