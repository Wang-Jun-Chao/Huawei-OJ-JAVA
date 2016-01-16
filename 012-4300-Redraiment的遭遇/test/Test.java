import huawei.Demo;

/**
 * Author: Íõ¿¡³¬
 * Date: 2016-01-16 15:21
 * CSDN: http://blog.csdn.net/derrantcm
 * Github: https://github.com/Wang-Jun-Chao
 * Declaration: All Rights Reserved !!!
 */
public class Test {
    public static void main(String[] args) {
        Demo demo = new Demo();

        System.out.println(demo.getDayNum(6, 21));
        System.out.println(demo.getDayNum(7, 1));
        System.out.println(demo.getDayNum(7, 2));
        System.out.println(demo.getDayNum(7, 3));
        System.out.println(demo.getDayNum(7, 4));
        System.out.println(demo.getDayNum(7, 21));
        System.out.println(demo.getDayNum(8, 21));
        System.out.println(demo.getDayNum(8, 31));
    }
}
