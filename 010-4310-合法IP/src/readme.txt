现在IPV4下用一个32位无符号整数来表示，一般用点分方式来显示，点将IP地址分成4个部分，每个部分为8位，
表示成一个无符号整数（因此不需要用正号出现），如10.137.17.1，是我们非常熟悉的IP地址，
一个IP地址串中没有空格出现（因为要表示成一个32数字）。
现在需要你用程序来判断IP是否合法。

函数说明：public void checkIP(String inputStr, StringBuffer outputStr)
          inputStr
              输入字符串
          outputStr
              输出判断结果，输入的inputStr是合法的IP，返回YES，否则返回NO
示例 输入：10.138.15.1 返回：YES

注意： 010.1.1.1是合法IP，0010.1.1.1是非法IP