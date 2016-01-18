import java.util.Scanner;

/**
 * Author: 王俊超
 * Date: 2016-01-17 20:28
 * CSDN: http://blog.csdn.net/derrantcm
 * Github: https://github.com/Wang-Jun-Chao
 * Declaration: All Rights Reserved !!!
 */
public class Main4 {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        Scanner scanner = new Scanner(Main4.class.getClassLoader().getResourceAsStream("data.txt"));


        while (scanner.hasNext()) {

            String line = scanner.nextLine().trim();
            String[] ss = line.split("\\s+");

            // 人数
            int num = Integer.parseInt(ss[0]);
            // 操作数目
            int row = Integer.parseInt(ss[1]);

            line = scanner.nextLine().trim();

            // 学生成绩数组，第一个位置不用
            int[] arr = getNumber(line);


            for (int i = 0; i < row; i++) {
                line = scanner.nextLine().trim();
                ss = line.split("\\s+");
                int x = Integer.parseInt(ss[1]);
                int y = Integer.parseInt(ss[2]);

                if (ss[0].charAt(0) == 'Q') {
                    int max = arr[x];
                    for (int j = x + 1; j <= y; j++) {
                        if (max < arr[j]) {
                            max = arr[j];
                        }
                    }

                    System.out.println(max);
                } else if (ss[0].charAt(0) == 'U') {
                    arr[x] = y;
                }
            }
        }

        scanner.close();
    }

    private static int[] getNumber(String s) {

        String[] ss = s.split("\\s+");
        int[] arr = new int[ss.length + 1];
        for (int i = 0; i < ss.length; i++) {
            arr[i + 1] = Integer.parseInt(ss[i]);
        }

        return arr;
    }


}
