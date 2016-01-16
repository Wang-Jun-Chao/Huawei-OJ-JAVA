import huawei.SortFile;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/**
 * Author: 王俊超
 * Date: 2016-01-16 10:43
 * CSDN: http://blog.csdn.net/derrantcm
 * Github: https://github.com/Wang-Jun-Chao
 * Declaration: All Rights Reserved !!!
 */
public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {

        String root = Main.class.getClassLoader().getResource("").toString();
        root = URLDecoder.decode(root, "UTF-8");
        System.out.println(root);
        root = root.substring(root.indexOf(':') + 2);
        System.out.println(root);


        SortFile sortFile = new SortFile();


        sortFile.sortWords(root + "input.txt", root + "output.txt", SortFile.SortType.WORDASC);
        sortFile.sortWords(root + "input.txt", root + "output2.txt", SortFile.SortType.WORDDSC);
        sortFile.sortWords(root + "input.txt", root + "output3.txt", SortFile.SortType.WORDCOUNT);

    }
}
