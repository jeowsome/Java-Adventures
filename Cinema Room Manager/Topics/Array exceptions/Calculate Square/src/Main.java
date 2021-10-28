
class FixingExceptions {

    public static void calculateSquare(int[] array, int index) {
        int size = array == null ? 0: array.length;
        if (size == 0 || index < 0 || index > array.length - 1) {
            System.out.println("Exception!");
        } else {
            System.out.println(array[index] * array[index]);
        }
    }
}