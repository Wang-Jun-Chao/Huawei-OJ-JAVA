import java.util.Scanner;

/**
 * Author: Íõ¿¡³¬
 * Date: 2016-01-16 17:31
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

            int[] rs = intReverse(n);
            System.out.println(rs[0] + " " + rs[1]);

        }

        scanner.close();
    }

    public static int[] intReverse(int n) {
        int count = 0;
        int reverse = 0;
        do {
            count++;
            reverse = reverse * 10 + n % 10;
            n /= 10;
        } while (n != 0);

        return new int[]{count, reverse};
    }
}
