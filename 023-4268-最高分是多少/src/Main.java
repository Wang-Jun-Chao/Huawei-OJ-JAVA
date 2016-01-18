import java.util.Scanner;

/**
 * Author: 王俊超
 * Date: 2016-01-17 20:28
 * CSDN: http://blog.csdn.net/derrantcm
 * Github: https://github.com/Wang-Jun-Chao
 * Declaration: All Rights Reserved !!!
 */
public class Main {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        Scanner scanner = new Scanner(Main.class.getClassLoader().getResourceAsStream("data.txt"));


        while (scanner.hasNext()) {

            // 人数
            int num = scanner.nextInt();
            // 操作数目
            int row = scanner.nextInt();
            // 学生成绩数组，第一个位置不用
            int[] arr = new int[num + 1];

            for (int i = 1; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
            }

            for (int i = 0; i < row; i++) {
                char opt =  scanner.next().charAt(0);
                int x = scanner.nextInt();
                int y = scanner.nextInt();

                if (opt == 'Q') {

                    if (x > y) {
                        int t = x;
                        x = y;
                        y = t;
                    }


                    int max = arr[x];
                    for (int j = x + 1; j <= y; j++) {
                        if (max < arr[j]) {
                            max = arr[j];
                        }
                    }

                    System.out.println(max);
                } else if (opt == 'U') {
                    arr[x] = y;
                }
            }


        }

        scanner.close();
    }
}
