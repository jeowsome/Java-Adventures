import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] nums = new int[size];

        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }

        int tripleCounter = 0;

        for (int i = 0; i < size - 2; i++) {
            if (nums[i] == nums[i + 1] - 1 && nums[i + 1] == nums[i + 2] - 1) {
                tripleCounter++;
            }
        }

        System.out.println(tripleCounter);
    }
}