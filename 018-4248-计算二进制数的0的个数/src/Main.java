import java.util.Scanner;

/**
 * Author: Íõ¿¡³¬
 * Date: 2016-01-17 08:24
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
            System.out.println(countZero(n));
        }

        scanner.close();
    }

    private static int countZero(int n) {
        int rs = 0;

        while (n != 0) {
            rs += (n & 1) ^ 1;
            n >>>= 1;
        }

        return rs;
    }
}
