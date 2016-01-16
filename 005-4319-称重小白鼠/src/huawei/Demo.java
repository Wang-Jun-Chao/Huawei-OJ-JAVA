package huawei;

import java.util.Arrays;
import java.util.Comparator;

public final class Demo {

    /*根据重量排序后，输出帽子颜色
     * 举例：	5只小白鼠，重量分别为15 30 5 9 30，帽子颜色依次为CL_RED, CL_BLUE, CL_BLUE, CL_YELLOW, CL_GRAY，
     * 则排序后的输出的帽子颜色序列应该为CL_BLUE, CL_YELLOW, CL_RED, CL_BLUE, CL_GRAY。
        如果没有小白鼠，输出null。
    输入参数：小白鼠数组

    */
    public static MOUSE_COLOR[] sortMouse(Mouse[] mouse) {

        if (mouse == null || mouse.length < 1) {
            return null;
        }

        Arrays.sort(mouse, new Comparator<Mouse>() {
            @Override
            public int compare(Mouse o1, Mouse o2) {
                if (o1 == null) {
                    return -1;
                }

                if (o2 == null) {
                    return 1;
                }

                return o1.weight - o2.weight;
            }
        });

        MOUSE_COLOR[] color = new MOUSE_COLOR[mouse.length];

        for (int i =0; i < mouse.length; i++) {
            if (mouse[i] != null) {
                color[i] = mouse[i].color;
            } else {
                color[i] = null;
            }
        }

        return color;
    }


}


