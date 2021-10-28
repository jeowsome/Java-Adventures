import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int hrToSec = 3600;
        int hr1 = scanner.nextInt() * hrToSec;
        int min1 = scanner.nextInt() * 60;
        int sec1 = scanner.nextInt() + hr1 + min1;
        int hr2 = scanner.nextInt() * hrToSec;
        int min2 = scanner.nextInt() * 60;
        int sec2 = scanner.nextInt() + hr2 + min2;

        System.out.println(sec2 - sec1);

    }
}