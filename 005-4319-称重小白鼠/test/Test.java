import huawei.Demo;
import huawei.MOUSE_COLOR;
import huawei.Mouse;

import java.util.Arrays;

/**
 * Author: Íõ¿¡³¬
 * Date: 2016-01-16 13:27
 * CSDN: http://blog.csdn.net/derrantcm
 * Github: https://github.com/Wang-Jun-Chao
 * Declaration: All Rights Reserved !!!
 */
public class Test {
    public static void main(String[] args) {
        Mouse[] mouses = {
                new Mouse(15, MOUSE_COLOR.CL_RED),
                new Mouse(30, MOUSE_COLOR.CL_BLUE),
                new Mouse(5, MOUSE_COLOR.CL_BLUE),
                new Mouse(9, MOUSE_COLOR.CL_YELLOW),
                new Mouse(30, MOUSE_COLOR.CL_GRAY)
        };

        MOUSE_COLOR[] color = Demo.sortMouse(mouses);

        System.out.println(Arrays.toString(color));
    }
}
