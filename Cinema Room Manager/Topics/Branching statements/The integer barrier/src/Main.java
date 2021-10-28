import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        final int barrier = 1000;

        while (true) {
            int num = sc.nextInt();
            sum += num;
            if (num == 0) {
                sum += barrier;
                break;
            } else if (sum >= barrier) {
                break;
            }

        }
        System.out.println(sum - barrier);
    }
}