import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] nums = new int[size];

        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }
        int[] unsorted = nums.clone();
        Arrays.sort(nums);
        boolean isASC = Arrays.equals(unsorted, nums);

        System.out.println(isASC);
    }
}