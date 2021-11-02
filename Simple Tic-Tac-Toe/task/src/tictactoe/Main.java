package tictactoe;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void printGame(String[] g) {
        int count = 0;

        for (int i = 0; i < 4; i++) {
            if (i == 0 || i == 3) {
                System.out.println("----------");
                if (i == 3) {
                    break;
                }
            }
            for (int j = 0; j <= 4; j++) {
                if (j == 0 || j == 4) {
                    System.out.print("| ");
                } else {
                    if (Objects.equals(g[count], "")) {
                        System.out.print("_ ");
                    } else{
                        System.out.print(g[count] + " ");
                    }
                    count++;
                }
            }
            System.out.println();
        }
    }

    public static boolean analyseGame(String[][] moves) {
        int xs = 0;
        int os = 0;
        int blanks = 0;
        boolean xWin = false;
        boolean oWin = false;

        for (String[] s: moves) {
            for (String x: s) {
                if (Objects.equals(x, "X")) {
                    xs++;
                } else if (Objects.equals(x, "O")) {
                    os++;
                } else {
                    blanks++;
                }
            }
        }

        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < moves[i].length-2; j++) {
                if (Objects.equals(moves[i][j], "X")
                        && Objects.equals(moves[i][j + 1], "X")
                        && Objects.equals(moves[i][j + 2], "X")) {
                    xWin = true;
                } else if (Objects.equals(moves[i][j], "O")
                        && Objects.equals(moves[i][j + 1], "O")
                        && Objects.equals(moves[i][j + 2], "O")) {
                    oWin = true;
                }
            }
        }

        for (int i = 0; i < moves.length - 2; i++) {
            for (int j = 0; j < moves[i].length; j++) {
                if (Objects.equals(moves[i][j], "X")
                        && Objects.equals(moves[i + 1][j], "X")
                        && Objects.equals(moves[i + 2][j], "X")) {
                    xWin = true;
                } else if (Objects.equals(moves[i][j], "O")
                        && Objects.equals(moves[i + 1][j], "O")
                        && Objects.equals(moves[i + 2][j], "O")) {
                    oWin = true;
                }
            }
        }

        for (int i = 0; i < moves.length - 2; i++) {
            for (int j = 0; j < moves[i].length-2; j++) {
                if (Objects.equals(moves[i][j], "X")
                        && Objects.equals(moves[i + 1][j + 1], "X")
                        && Objects.equals(moves[i + 2][j + 2], "X")) {
                    xWin = true;
                } else if (Objects.equals(moves[i][j], "O")
                        && Objects.equals(moves[i + 1][j + 1], "O")
                        && Objects.equals(moves[i + 2][j + 2], "O")) {
                    oWin = true;
                }
            }
        }

        if (Objects.equals(moves[0][2], "X")
                && Objects.equals(moves[1][1], "X")
                && Objects.equals(moves[2][0], "X")) {
            xWin = true;
        } else if (Objects.equals(moves[0][2], "O")
                && Objects.equals(moves[1][1], "O")
                && Objects.equals(moves[2][0], "O")) {
            oWin = true;
        }

        for (int i = 0; i < moves.length; i++) {
            if (i == 0) System.out.println("----------");
            for (int j = 0; j < moves[i].length; j++) {
                if (j == 0) System.out.print("| ");
                System.out.print(moves[i][j] + " ");
                if (j == 2) System.out.print("| ");
            }
            System.out.println("");
            if (i == 2) System.out.println("----------");
        }

        if (xWin) {
            System.out.println("X wins");
            return false;
        } else if (oWin) {
            System.out.println("O wins");
            return false;
        } else  if (xs + os == 9){
            System.out.println("Draw");
            return false;
        } else {
            return true;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean game = true;
        String[] g = {" ", " ", " ", " ", " ", " ", " ", " ", " "};
        boolean xTurn = true;
        boolean oTurn = false;
        int row = 0;
        int column = 0;
        String[][] moves = {
                {g[0], g[1], g[2]},
                {g[3], g[4], g[5]},
                {g[6], g[7], g[8]}
        };
        printGame(g);
        while (game) {
            System.out.println("Enter the coordinates: ");
            try {
                row = scanner.nextInt() - 1;
                column = scanner.nextInt() - 1;
            } catch (Exception e) {
                System.out.println("You should enter numbers!");
            }

            if (row >= 3 || column >= 3) {
                System.out.println("Coordinates should be from 1 to 3!");
            } else if (Objects.equals(moves[row][column], null) || Objects.equals(moves[row][column], "_") || Objects.equals(moves[row][column], " ")){
                if (xTurn) {
                    moves[row][column] = "X";
                    xTurn = false;
                    oTurn = true;
                } else {
                    moves[row][column] = "O";
                    oTurn = false;
                    xTurn = true;
                }
                game = analyseGame(moves);
            } else {
                System.out.println("This cell is occupied! Choose another one!");
            }
        }
    }
}
