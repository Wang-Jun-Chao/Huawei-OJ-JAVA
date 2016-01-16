package huawei;


import java.util.Set;
import java.util.TreeSet;

public final class Demo {
    /*****************************************************************************
     * Description : 实现整数排序，即先将从A输入的整型数序列进行排序，剔除重复整型数，输出得到的升序序列B；
     * Input       : array_A                 输入参数，输入待排序整型数序列A
     * Return      : 排序后的整型数序列
     *****************************************************************************/
    public static int[] sort(int[] arr) {
        if (arr == null || arr.length < 1) {
            return null;
        }

        Set<Integer> set = new TreeSet<Integer>();
        for (int i : arr) {
            set.add(i);
        }

        int[] rs = new int[set.size()];
        int i = 0;
        for (int v : set) {
            rs[i] = v;
            i++;
        }

        return rs;
    }


}


