import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int num = sc.nextInt();

        while (num != 0) {
            max = Math.max(num, max);
            num = sc.nextInt();
        }

        System.out.println(max);
    }
}