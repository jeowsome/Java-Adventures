import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] nums = new int[size];
        int ascCount = 1;
        int maxCount = 0;
        int desc = 0;
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }

        if (nums.length == 1) {
            maxCount = 1;
        } else {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] < nums[i + 1]) {
                    ascCount++;
                    maxCount = ascCount;
                } else {
                    desc++;
                    ascCount = 1;
                }
            }
            maxCount = desc == size - 1 ? 1 : maxCount;
        }

        System.out.println(maxCount);
    }
}