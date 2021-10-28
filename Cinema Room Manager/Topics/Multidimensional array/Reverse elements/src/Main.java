
class ArrayOperations {
    public static void reverseElements(int[][] twoDimArray) {
        int[][] reverseArray = new int[twoDimArray.length][];

        for (int i = 0; i < twoDimArray.length; i++) {
            reverseArray[i] = new int[twoDimArray[i].length];
            for (int j = 0; j < twoDimArray[i].length; j++) {
                int[] tempArray = new int[twoDimArray[i].length];
                reverseArray[i][j] = twoDimArray[i][tempArray.length - (j + 1)];
            }
        }

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                twoDimArray[i][j] = reverseArray[i][j];
            }
        }
    }
}