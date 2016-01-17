import java.util.Scanner;

/**
 * Author: 王俊超
 * Date: 2016-01-17 20:56
 * CSDN: http://blog.csdn.net/derrantcm
 * Github: https://github.com/Wang-Jun-Chao
 * Declaration: All Rights Reserved !!!
 */
public class Main {

    private final static int[] MONEY = {1, 2, 5, 10, 20, 50, 100};

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        Scanner scanner = new Scanner(Main.class.getClassLoader().getResourceAsStream("data.txt"));
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            if (n == 0 || n > 250) {
                break;
            }
// 方法二的使用
//            int idx = 0;
            // 不大于n但是离n最近的MONEY
//            for (int i = MONEY.length - 1; i >= 0; i--) {
//                if (n >= MONEY[i]) {
//                    idx = i;
//                    break;
//                }
//            }
//            System.out.println(countChange(n, idx));

            System.out.println(countChange(n));
        }

        scanner.close();
    }


    // 方法二
    private static int countChange(int n, int index) {
        if (n == 1 || n == 0 || index == 0) {
            return 1;
        }

        if (n < 0 || index < 0) {
            return 0;
        }

        return countChange(n - MONEY[index], index) + countChange(n, index - 1);
    }

    // 方法一
    private static int countChange(int n) {

        int count = 0;

        for (int c100 = 0; c100 * 100 <= n; c100++) {
            int left100 = n - c100 * 100;
            for (int c50 = 0; c50 * 50 <= left100; c50++) {
                int left50 = left100 - c50 * 50;
                for (int c20 = 0; c20 * 20 <= left50; c20++) {
                    int left20 = left50 - c20 * 20;
                    for (int c10 = 0; c10 * 10 <= left20; c10++) {
                        int left10 = left20 - c10 * 10;
                        for (int c5 = 0; c5 * 5 <= left10; c5++) {
                            int left5 = left10 - c5 * 5;
                            for (int c2 = 0; c2 * 2 <= left5; c2++) {
                                int left2 = left5 - c2 * 2;
                                if (c100 + c50 + c10 + c5 + c2 + left2 <= 100) {
                                    count++;
                                }
                            }
                        }
                    }
                }
            }
        }

        return count;
    }
}
