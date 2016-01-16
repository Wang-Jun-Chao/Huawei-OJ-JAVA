import huawei.Demo;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

/**
 * Author: Íõ¿¡³¬
 * Date: 2016-01-16 12:24
 * CSDN: http://blog.csdn.net/derrantcm
 * Github: https://github.com/Wang-Jun-Chao
 * Declaration: All Rights Reserved !!!
 */
public class Test {
    public static void main(String[] args) {
        Integer[] arr = new Integer[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }

        arr[3] = null;
        arr[7] = null;



        System.out.println(Arrays.toString(arr));

        Demo.sortArray(arr, 0);
        System.out.println(Arrays.toString(arr));

        Demo.sortArray(arr, 1);
        System.out.println(Arrays.toString(arr));
    }
}
