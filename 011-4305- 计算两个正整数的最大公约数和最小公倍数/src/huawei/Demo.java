package huawei;

public final class Demo {

    // 功能：获取两个整数的最大公约数
    // 输入：两个整数
    // 返回：最大公约数
    public static long getMaxDivisor(long m, long n) {
        // 保证第一个数不小于第二个数
        if (m < n) {
            getMaxDivisor(n, m);
        }

        long t;

        while (m % n != 0) {
            t = n;
            n = m % n;
            m = t;
        }


        return n;
    }

    // 功能：获取两个整数的最小公倍数
    // 输入：两个整数
    // 返回：最小公倍数
    public static long getMinMultiple(long m, long n) {

        return m / getMaxDivisor(m, n) * n;
    }

}