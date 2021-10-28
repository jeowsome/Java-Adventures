import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int outputted = 0;

        for (int i = 1; i <= n; i++) {
            int count = i;
            while (count != 0) {
                outputted++;
                count--;
                System.out.print(i + " ");
                if (outputted == n) {
                    break;
                }
            }
            if (outputted == n) {
                break;
            }
        }
    }
}