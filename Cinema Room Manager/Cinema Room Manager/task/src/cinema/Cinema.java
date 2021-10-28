package cinema;
import java.util.Objects;
import java.util.Scanner;

public class Cinema {

    public static void showMenu() {
        System.out.println("1. Show the seats");
        System.out.println("2. Buy a ticket");
        System.out.println("3. Statistics");
        System.out.println("0. Exit");
    }

    public static void makeSeats(String[][] cinemaSeats) {
        for (int i = 0; i < cinemaSeats.length; i++) {
            for (int j = 0; j < cinemaSeats[i].length; j++) {
                if (j == 0 && i == 0) {
                    cinemaSeats[i][j] = " ";
                } else if (i >= 1 && j >= 1) {
                    cinemaSeats[i][j] = "S ";
                } else {
                    cinemaSeats[i][j] = j + i + " ";
                }
            }
        }
    }

    public static void showSeats(String[][] cinemaSeats) {
        System.out.println("Cinema:");
        for (String[] cinemaSeat : cinemaSeats) {
            for (String s : cinemaSeat) {
                System.out.print(s);
            }
            System.out.println();
        }
    }

    public static boolean buyTicket(int row, int rows,int seat, int seats, String[][] cinemaSeats) {
        if (row > rows || seat > seats) {
            System.out.println("Wrong input!");
            return false;
        } else if (Objects.equals(cinemaSeats[row][seat], "B ")) {
            System.out.println("That ticket has already been purchased!");
            return false;
        } else {
            for (int i = 1; i <= cinemaSeats.length; i++) {
                for (int j = 1; j <= cinemaSeats.length; j++) {
                    if (j == seat && i == row) {
                        cinemaSeats[i][j] = "B ";
                    }
                }
            }
            return true;
        }
    }

    public static void showStatistics(int ticketBought, int rows, int seats, int income, int totalIncome, int[] stats) {
        int totalSeats = rows * seats;
        double percentage = ((double) ticketBought / totalSeats) * 100;
        if (totalSeats <= 60) {
            stats[2] = totalSeats * 10;
        } else {
            int frontRow = totalSeats / 2;
            int backRows = totalSeats - frontRow;
            stats[2] = (frontRow * 10) + ((backRows - 1) * 8);
        }
        System.out.printf("Number of purchased tickets: %d%n", ticketBought);
        System.out.printf("Percentage: %.2f", percentage);
        System.out.print("%\n");
        System.out.printf("Current Income: $%d%n", totalIncome);
        System.out.printf("Total income: $%d%n", stats[2]);
    }

    public static int calculatePrice(int rows, int seats, int row, int col, int[] stats) {
        int totalSeats = rows * seats;
        if (totalSeats <= 60) {
            stats[2] = totalSeats * 10;
            return 10;
        } else {
            int frontRow = rows / 2;
            int backRows = rows - frontRow;
            stats[2] = (frontRow * 10) + (backRows * 8);
            if (row <= frontRow) {
                return 10;
            } else {
                return 8;
            }
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seats = scanner.nextInt();
        int[] stats = {0, 0, 0};
        String[][] cinemaSeats = new String[rows + 1][seats + 1];
        makeSeats(cinemaSeats);
        showMenu();
        int ticketBought = 0;
        int currentIncome = 0;
        int totalIncome = 0;

        int choice = scanner.nextInt();

        while (choice != 0) {
            if (choice == 1) {
                showSeats(cinemaSeats);
            } else if (choice == 2) {
                boolean notBooked = true;
                while (notBooked) {
                    System.out.println("Enter a row number:");
                    int row = scanner.nextInt();
                    System.out.println("Enter a seat number in that row:");
                    int seat = scanner.nextInt();
                    if (buyTicket(row, rows, seat, seats, cinemaSeats)) {
                        ticketBought++;
                        currentIncome = calculatePrice(rows, seats, row, seat, stats);
                        totalIncome += currentIncome;
                        System.out.printf("Ticket price: $%d%n", currentIncome);
                        notBooked = false;
                    }
                }
            } else if (choice == 3){
                showStatistics(ticketBought, rows, seats, currentIncome, totalIncome, stats);
            } else {
                break;
            }
            showMenu();
            choice = scanner.nextInt();
        }
    }
}