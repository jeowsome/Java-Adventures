import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int larger = 0;
        int smaller = 0;
        int perfect = 0;

        for (int i = 1; i <= n; i++) {
            int quality = scanner.nextInt();
            larger += quality == 1 ? 1 : 0;
            smaller += quality == -1 ? 1 : 0;
            perfect += quality == 0 ? 1 : 0;
        }

        System.out.println(perfect + " " + larger + " " + smaller);
    }
}