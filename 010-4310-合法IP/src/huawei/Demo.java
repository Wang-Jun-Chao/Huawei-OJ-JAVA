package huawei;

public class Demo {
    /**
     * @param inputStr  输入字符串
     * @param outputStr 输出判断结果
     * @description： 输入的inputStr是合法的IP，返回YES，否则返回NO 示例 输入：10.138.15.1 返回：YES
     */
    public void checkIP(String inputStr, StringBuffer outputStr) {

        if (inputStr == null || inputStr.length() < 1) {
            outputStr.delete(0, outputStr.length());
            outputStr.append("NO");
            return;
        }

        int beg = 0;
        int end = 0;
        // 总计处理的部分
        int count = 0;

        for (end = 1; end < inputStr.length();) {
            while (end < inputStr.length() && inputStr.charAt(end) != '.') {
                end++;
            }

            String part = inputStr.substring(beg, end);
            // 当前处理的是第几个部分
            count++;

            if (!checkPart(part) || count > 4) {
                outputStr.delete(0, outputStr.length());
                outputStr.append("NO");
                return;
            }

            if (end < inputStr.length()) {
                beg = end + 1;
                end += 2;
            }
        }

        String part = inputStr.substring(beg);
//        if (!checkPart(part) || count != 4){
        if (!checkPart(part)){
            outputStr.delete(0, outputStr.length());
            outputStr.append("NO");
            return;
        }

        outputStr.delete(0, outputStr.length());
        outputStr.append("YES");
    }

    public boolean checkPart(String part) {
        if (part == null || part.length() < 1 || part.length() > 3) {
            return false;
        }

        int num = 0;
        for (int i = 0; i < part.length(); i++) {
            char c = part.charAt(i);
            if (c > '9' || c < '0') {
                return false;
            } else {
                num = num * 10 + c - '0';
            }
        }

        return num < 256;
    }
}
