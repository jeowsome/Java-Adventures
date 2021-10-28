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
        int sum = 0;
        
        for (int i : nums) {
            sum += i > n ? i : 0;
        }

        System.out.println(sum);
    }
}