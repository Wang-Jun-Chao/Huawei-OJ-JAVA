package huawei;

import java.util.Arrays;
import java.util.Comparator;

public final class Demo {

    // 功能：输入整型数组，对其元素按照升序或降序进行排序
    // 输入：arr 需要排序的整型数组
    //       flag 0:升序 1：降序
    // 返回：没有重复数字的整型
    public static void sortArray(Integer[] arr, int flag) {
        if (arr == null || arr.length < 2 || flag < 0 || flag > 1) {
            return;
        }

        final int FACTOR = flag == 0 ? 1 : -1;


        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                if (o1 == null) {
                    return -FACTOR;
                }

                if (o2 == null) {
                    return FACTOR;
                }

                return (o1 - o2) * FACTOR;
            }
        });

    }
}