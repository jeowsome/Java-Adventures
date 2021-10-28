import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students = scanner.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        for (int i = 1; i <= students; i++) {
            int score = scanner.nextInt();
            if (score == 5) {
                a++;
            } else if (score == 4) {
                b++;
            } else if (score == 3) {
                c++;
            } else if (score == 2) {
                d++;
            }
        }
        System.out.println(d + " " + c + " " + b + " " + a);
    }
}