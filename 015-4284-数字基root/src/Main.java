import java.util.Scanner;

/**
 * Author: Íõ¿¡³¬
 * Date: 2016-01-16 22:45
 * CSDN: http://blog.csdn.net/derrantcm
 * Github: https://github.com/Wang-Jun-Chao
 * Declaration: All Rights Reserved !!!
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Scanner scanner = new Scanner(Main.class.getClassLoader().getResourceAsStream("data.txt"));
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            System.out.println(countRoot(n));
        }

        scanner.close();
    }

    private static int countRoot(int n) {

        if (n < 1) {
            return -1;
        }

        while (n / 10 != 0) {
            int v = 0;
            while (n != 0) {
                v += n % 10;
                n /= 10;
            }

            n = v;
        }

        return n;
    }
}
