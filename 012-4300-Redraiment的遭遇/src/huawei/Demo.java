package huawei;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.Arrays;

/*
输入参数：

		int Month：整数，Redraiment到家的月数。
		int Day：整数，Redraiment到家的日期
输出参数：
		无
返回值：
		int  （返回Redraiment到家后遭遇停电的天数）
*/
public class Demo {

    // 七八月停电情况
    private static boolean[] UNDOWN = new boolean[62];

    static {
        for (int i = 0, count = 0; i < UNDOWN.length; ) {
            UNDOWN[i] = false; // 停电
            count++;
            i++;
            // 未停电
            for (int j = 0; i < UNDOWN.length && j < count; j++) {
                UNDOWN[i] = true;
                i++;
            }
        }
    }

    public int getDayNum(int month, int day) {

        if (month > 8) {
            return 0;
        }

        int beg = (month - 7) * 31 + (day - 1);

        beg = beg >= 0 ? beg : 0;

        int rs = 0;
        while (beg < UNDOWN.length) {
            if (!UNDOWN[beg]) {
                rs++;
            }
            beg++;
        }

        return rs;
    }
}
