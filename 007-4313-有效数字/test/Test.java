import huawei.Demo;

/**
 * Author: Íõ¿¡³¬
 * Date: 2016-01-16 13:45
 * CSDN: http://blog.csdn.net/derrantcm
 * Github: https://github.com/Wang-Jun-Chao
 * Declaration: All Rights Reserved !!!
 */
public class Test {
    public static void main(String[] args) {
        Demo demo = new Demo();
        System.out.println(demo.NumType("123.456"));
        System.out.println(demo.NumType("123a"));

        System.out.println(demo.NumType("123.456d"));
        System.out.println(demo.NumType("123.456D"));
        System.out.println(demo.NumType("123.456F"));
        System.out.println(demo.NumType("123.456f"));

        System.out.println(demo.NumType("123.456S"));
        System.out.println(demo.NumType("123.456s"));

        System.out.println(demo.NumType("123.456E"));

        System.out.println(demo.NumType("123.456E0"));
        System.out.println(demo.NumType("123.456E-1"));
        System.out.println(demo.NumType("123.456E+1"));

        System.out.println(demo.NumType("123.456L"));
        System.out.println(demo.NumType("123.456l"));
    }
}
