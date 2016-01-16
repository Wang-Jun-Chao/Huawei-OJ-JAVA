import huawei.Demo;

/**
 * Author: Íõ¿¡³¬
 * Date: 2016-01-16 14:16
 * CSDN: http://blog.csdn.net/derrantcm
 * Github: https://github.com/Wang-Jun-Chao
 * Declaration: All Rights Reserved !!!
 */
public class Test {
    public static void main(String[] args) {
        Demo demo = new Demo();
        System.out.println(demo.checkPart("000"));
        System.out.println(demo.checkPart("010"));
        System.out.println(demo.checkPart("001"));

        System.out.println(demo.checkPart("0010"));
        System.out.println(demo.checkPart("256"));
        System.out.println(demo.checkPart("a56"));

        System.out.println();

        StringBuffer sb = new StringBuffer();

        // YES
        demo.checkIP("10.138.15.1", sb);
        System.out.println(sb);

        demo.checkIP("010.1.1.1", sb);
        System.out.println(sb);

        demo.checkIP("010.1.1.1", sb);
        System.out.println(sb);

        // NO
        demo.checkIP("0010.1.1.1", sb);
        System.out.println(sb);

        demo.checkIP("0010.1.1.1.01", sb);
        System.out.println(sb);

        demo.checkIP("0A0.1.11.01", sb);
        System.out.println(sb);

        demo.checkIP(" .1.11.01", sb);
        System.out.println(sb);

        demo.checkIP(".1.11.01", sb);
        System.out.println(sb);

        demo.checkIP("1.1..11.01", sb);
        System.out.println(sb);

        demo.checkIP("1.1..11.", sb);
        System.out.println(sb);

        demo.checkIP("1.1.11..", sb);
        System.out.println(sb);

        demo.checkIP("..1.1.11.", sb);
        System.out.println(sb);

        demo.checkIP("1.1.11", sb);
        System.out.println(sb);
    }
}
