import java.util.Scanner;

/**
 * Author: 王俊超
 * Date: 2016-01-17 19:57
 * CSDN: http://blog.csdn.net/derrantcm
 * Github: https://github.com/Wang-Jun-Chao
 * Declaration: All Rights Reserved !!!
 */
public class Main {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        Scanner scanner = new Scanner(Main.class.getClassLoader().getResourceAsStream("data.txt"));
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            System.out.println(countNoPrime(n));
        }

        scanner.close();
    }

    private static String countNoPrime(int n) {

        if (n <= 3) {
            return "";
        }

        StringBuilder builder = new StringBuilder();
        for (int i = 4; i <= n; i++) {
            if (!isPrime(i)) {
                builder.append(i).append(' ');
            }
        }

        // 走到这一步，一定是有非素数的，比如4
        return builder.substring(0, builder.length() - 1);
    }

    private static boolean isPrime(int i) {
        if (i < 2) {
            return false;
        }

        int sqrt = (int) Math.sqrt(i);
        for (int j = 2; j <= sqrt; j++) {
            if (i % j == 0) {
                return false;
            }
        }

        return true;
    }
}
