/*
Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

Example:

Input: 38
Output: 2 
Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2. 
             Since 2 has only one digit, return it.
*/

"""
Solution -- Java
"""

class Solution {
    public int addDigits(int num) {
        while(num >= 10){
            num = add_num2(num);
            //num = add_num1(num);
        }
        return num;
    }
    //by字符串
    public int add_num1(int n){
        String str = n + "";
        int re_n = 0;
        for(int i = 0; i < str.length(); i++){
            re_n += Integer.parseInt(str.charAt(i)+"");
        }
        return re_n;
    }
    //循环加数
    public int add_num2(int n){
        int tmp = 0;
        while(n != 0){
            tmp += n % 10;
            n = n / 10;
        }
        return tmp;
    }
}

"""
找规律可发现
0～9的结果：0～9

10～19的结果：1、2、3 …… 9、1

20～29的结果：1、2、3 …… 9、1

Solution -- Java

"""

public class Solution {
    public int addDigits(int num) {
        if (num == 0){
            return 0;
        }
        if (num % 9 == 0){
            return 9;
        }
        else {
            return num % 9;
        }
    }
}
