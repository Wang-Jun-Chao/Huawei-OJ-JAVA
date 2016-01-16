package huawei;


public final class Demo {

    /*
    功能:

    输入:

    输出:	计算n!中有多少个0

    返回:

    */
    public static int getZeroCount(int n) {

        if (n < 5) {
            return 0;
        }

        int rs = 0;

        while (n != 0) {
            n /= 5;
            rs += n;
        }

        return rs;
    }
}


