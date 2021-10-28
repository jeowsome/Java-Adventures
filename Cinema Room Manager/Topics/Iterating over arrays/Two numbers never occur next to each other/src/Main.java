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

        boolean adjacent = true;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == n && nums[i + 1] == m || nums[i] == m && nums[i + 1] == n) {
                adjacent = false;
                break;
            }
        }

        System.out.println(adjacent);
    }
}