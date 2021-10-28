import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(" ");
        List<String> list = Arrays.asList(numbers);
        int shift = scanner.nextInt();

        Collections.rotate(list, shift);

        for (String str: list) {
            System.out.print(str + " ");
        }
    }
}