import java.util.Scanner;

/**
 * Author: Íõ¿¡³¬
 * Date: 2016-01-17 20:16
 * CSDN: http://blog.csdn.net/derrantcm
 * Github: https://github.com/Wang-Jun-Chao
 * Declaration: All Rights Reserved !!!
 */
public class Main {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        Scanner scanner = new Scanner(Main.class.getClassLoader().getResourceAsStream("data.txt"));
        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            System.out.println(charChange(input));
        }

        scanner.close();
    }

    private static String charChange(String s) {
        if (s == null || s.length() < 1) {
            return s;
        }

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'U') {
                chars[i] = (char) (chars[i] - 'A' + 'a' + 5);
            } else if (chars[i] >= 'V' && chars[i] <= 'Z') {
                chars[i] = (char) (chars[i] - 'A' + 'a' - 21);
            }
        }

        return new String(chars);
    }
}
