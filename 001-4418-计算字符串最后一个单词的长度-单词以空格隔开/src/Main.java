import java.util.Scanner;

/**
 * Author: 王俊超
 * Date: 2016-01-15 20:54
 * CSDN: http://blog.csdn.net/derrantcm
 * Github: https://github.com/Wang-Jun-Chao
 * Declaration: All Rights Reserved !!!
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            System.out.println(countLastWordLength(line));
        }

        scanner.close();
    }

    private static int countLastWordLength(String line) {
        if (line == null || line.length() < 1) {
            return 0;
        }

        int last = line.length() - 1;
        // 找最后一个单词的最后一个非空白字符
        while (last >= 0 && line.charAt(last) == ' ') {
            last--;
        }

        // 说明全部都是空白字符
        if (last < 0) {
            return 0;
        }

        int first = last - 1;
        // 找最后一个单词的前一个空白字符的位置
        while (first >= 0 && line.charAt(first) != ' ') {
            first--;
        }

        return last - first;
    }
}
