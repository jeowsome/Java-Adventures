import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int busHeight = sc.nextInt();
        int numBridge = sc.nextInt();
        boolean willCrash = false;
        int bridgeCrashNum = 0;

        for (int i = 1; i <= numBridge; i++) {
            int bridgeHeight = sc.nextInt();
            if (bridgeHeight <= busHeight && !willCrash) {
                willCrash = true;
                bridgeCrashNum = i;
            }
        }

        if (willCrash && bridgeCrashNum > 0) {
            System.out.println("Will crash on bridge " + bridgeCrashNum);
        } else {
            System.out.println("Will not crash");
        }
    }
}