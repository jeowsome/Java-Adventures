import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();
        long n = 1;
        long sum = 1;

        while (sum <= m) {
            n++;
            sum *= n;
        }
        System.out.println(n);
    }
}