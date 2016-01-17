import java.util.Scanner;

/**
 * Author: 王俊超
 * Date: 2016-01-17 08:20
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
            int m = scanner.nextInt();
            System.out.println(getMaxDivisor(n, m));
        }

        scanner.close();
    }

    public static long getMaxDivisor(long m, long n) {
        // 保证第一个数不小于第二个数
        if (m < n) {
            getMaxDivisor(n, m);
        }

        long t;

        while (m % n != 0) {
            t = n;
            n = m % n;
            m = t;
        }


        return n;
    }
}
