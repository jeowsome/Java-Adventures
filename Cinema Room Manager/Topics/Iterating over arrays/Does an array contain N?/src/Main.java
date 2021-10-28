import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] nums = new int[size];

        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }

        int toFind = scanner.nextInt();
        boolean found = false;

        for (int i : nums) {
            found = i == toFind || found;
        }

        System.out.println(found);
    }
}