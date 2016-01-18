import java.util.Scanner;

/**
 * Author: 王俊超
 * Date: 2016-01-17 20:28
 * CSDN: http://blog.csdn.net/derrantcm
 * Github: https://github.com/Wang-Jun-Chao
 * Declaration: All Rights Reserved !!!
 */

public class Main5 {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(Main.class.getClassLoader().getResourceAsStream("data.txt"));
        Scanner sc = new Scanner(System.in);
        //初始化数据 N：学生数量  M：操作数量
        String firstLine = sc.nextLine();
        String[] initalNums = firstLine.split(" ");
        int N = Integer.parseInt(initalNums[0]);
        int M = Integer.parseInt(initalNums[1]);

        //初始化成绩
        String secondLine = sc.nextLine();
        int[] scores = new int[N];
        scores = getScores(secondLine);

        //命令
        int[] Max = new int[M];
        int count = 0;
        for (int i = 0; i < M; i++) {
            String qu = sc.next();
            if (qu.equals("Q")) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                Max[count] = getMax(scores, a - 1, b - 1);
                count++;
            }
            if (qu.equals("U")) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                scores[a - 1] = b;
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.println(Max[i]);
        }
        sc.close();
    }

    public static int getMax(int[] score, int a, int b) {
        int temp = score[a];
        for (int i = a; i <= b; i++) {
            if (score[i] > temp) {
                temp = score[i];
            }
        }
        return temp;
    }

    public static int[] getScores(String secondLine) {
        String[] scores = secondLine.split(" ");
        int[] res = new int[scores.length];
        for (int i = 0; i < scores.length; i++) {
            res[i] = Integer.parseInt(scores[i]);
        }
        return res;
    }
}
