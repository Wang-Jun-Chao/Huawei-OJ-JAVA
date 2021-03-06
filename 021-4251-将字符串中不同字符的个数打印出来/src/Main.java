import java.util.*;

/**
 * Author: ������
 * Date: 2016-01-17 20:07
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
            System.out.println(countChar(input));
        }

        scanner.close();
    }

    private static int countChar(String input) {
        Set<Character> set = new HashSet<Character>(256);

        for (int i = 0; i < input.length(); i++) {
            set.add(input.charAt(i));
        }


        return set.size();
    }
}
