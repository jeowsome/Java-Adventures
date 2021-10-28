
class ArrayOperations {
    public static void printCorners(int[][] twoDimArray) {
        if (twoDimArray[0].length == 1) {
            System.out.print(twoDimArray[0][0] + " " + twoDimArray[0][0]);
            System.out.println();
            System.out.print(twoDimArray[twoDimArray.length - 1][0] + " " + twoDimArray[twoDimArray.length - 1][0]);
        } else {
            System.out.print(twoDimArray[0][0] + " " + twoDimArray[0][twoDimArray[0].length - 1]);
            System.out.println();
            System.out.print(twoDimArray[twoDimArray.length - 1][0] + " ");
            System.out.print(twoDimArray[twoDimArray.length - 1][twoDimArray[0].length - 1]);
        }
    }
}