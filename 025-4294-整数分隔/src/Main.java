import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Author: 王俊超
 * Date: 2016-01-17 21:28
 * CSDN: http://blog.csdn.net/derrantcm
 * Github: https://github.com/Wang-Jun-Chao
 * Declaration: All Rights Reserved !!!
 */
public class Main {

    // 解题方法，使用类似于找零钱的方法二
    public static void main(String[] args) {

        //Scanner scanner = new Scanner(System.in);
        Scanner scanner = new Scanner(Main.class.getClassLoader().getResourceAsStream("data.txt"));
        while (scanner.hasNext()) {
            int n = scanner.nextInt();


            System.out.println(intDivide(n));
        }

        scanner.close();
    }

    // 保存中间结果，只计算一次就可以
    private static int[] INT_DIVIDE = new int[1000 * 1000 + 1];
    private static int intDivide(int n) {

        // 题目所要求的数据范围
        if (n < 1 || n > 1000000) {
            return -1;
        }

        // 所有不于于n的2的整数次幂
        List<Integer> list = new ArrayList<Integer>();
        int power2 = 1;

        do {
            list.add(power2);
            power2 <<= 1;
        } while (power2 <= n);


        return intDivide(n, list, list.size() - 1);
    }

    private static int intDivide(int n, List<Integer> list, int idx) {

        if (n == 1 || n == 0 || idx == 0) {
            return 1;
        }

        if (n < 0 || idx < 0) {
            return 0;
        }

        // 如果之前已经计算过了就不用再计算了
        if (INT_DIVIDE[n] != 0) {
            return INT_DIVIDE[n];
        }

        int rs = intDivide(n - list.get(idx), list, idx) % 1000000000;
        rs = (rs + intDivide(n, list, idx - 1) % 1000000000) % 1000000000;

        // 保存结果
        INT_DIVIDE[n] = rs;
        return rs;
    }


}
