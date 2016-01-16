import java.util.Scanner;

/**
 * Author: Íõ¿¡³¬
 * Date: 2016-01-16 22:33
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
            System.out.println(countLeft(n));
        }

        scanner.close();
    }

    private static int countLeft(int n) {
        if (n < 1) {
            return -1;
        }

        int last = 0;
        for (int i = 1; i <= n; i++) {
            last = (last + 3) % i;
        }

        return last + 1;
    }
}
