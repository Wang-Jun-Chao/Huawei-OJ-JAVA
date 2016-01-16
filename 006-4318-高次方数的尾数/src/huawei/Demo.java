package huawei;

public final class Demo {
    /*
    功能: 求解M的N次方的最后三位数(M，N均大于10)
	输入参数：
	    int M：M > 10
	    int N：N > 10
	返回值：
	    M的N次方的最后三位数
	*/

    public static int getLast3DigitsOfMN(int M, int N) {

        if (M <= 10 || N <= 10) {
            throw new IllegalArgumentException();
        }

        int rs = 1;

        for (int i = 0; i < N; i++) {
            rs *= (M % 1000);
            rs %= 1000;

        }

        return rs;
    }

}


