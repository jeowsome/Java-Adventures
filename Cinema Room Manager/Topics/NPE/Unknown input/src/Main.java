import java.util.Objects;

class Util {
    // correct this method to avoid NPE
    public static void printLength(String name) {
        if (Objects.equals(name, null)) {
            return;
        }
        System.out.println(name.length());
    }
}