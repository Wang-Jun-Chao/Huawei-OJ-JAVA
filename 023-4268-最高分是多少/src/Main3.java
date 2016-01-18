import java.util.Scanner;

/**
 * Author: Íõ¿¡³¬
 * Date: 2016-01-17 20:28
 * CSDN: http://blog.csdn.net/derrantcm
 * Github: https://github.com/Wang-Jun-Chao
 * Declaration: All Rights Reserved !!!
 */
public class Main3 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(Main6.class.getClassLoader().getResourceAsStream("data.txt"));

        Scanner sc = new Scanner(System.in);

        String firstLine = sc.nextLine();
        String[] nums = firstLine.split(" ");
        int N = Integer.parseInt(nums[0]);
        int M = Integer.parseInt(nums[1]);


        String secondLine = sc.nextLine();
        int[] scores = getScores(secondLine);

        for (int i = 0; i < M; i++) {
            String qu = sc.next();
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (qu.equals("Q")) {
                System.out.println(getMax(scores, a - 1, b - 1));

            } else

            if (qu.equals("U")) {
                scores[a - 1] = b;
            }
        }
        sc.close();
    }

    public static int getMax(int[] score, int a, int b) {
        int max = score[a];
        for (int i = a; i <= b; i++) {
            if (score[i] > max) {
                max = score[i];
            }
        }
        return max;
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
