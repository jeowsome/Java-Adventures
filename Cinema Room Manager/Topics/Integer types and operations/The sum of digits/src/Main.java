import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] number = scanner.next().split("");
        int sum = 0;

        for (String str: number) {
            sum += Integer.parseInt(str);
        }

        System.out.println(sum);
    }
}