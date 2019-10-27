/*
Given an integer n, return the number of trailing zeroes in n!.

Example 1:

Input: 3
Output: 0
Explanation: 3! = 6, no trailing zero.
Example 2:

Input: 5
Output: 1
Explanation: 5! = 120, one trailing zero.
*/

"""
Solution -- java
"""

class Solution {
    public int trailingZeroes(int n) {
        // int sum = 1;
        // int zeros = 0;
        //13阶乘时超正数范围，计算不精确
        // while(n > 1){
        //     sum = sum * n;
        //     n -= 1;
        // } 
        // while(sum > 0){
        //     if(sum % 10 == 0){
        //         zeros += 1;
        //         sum = sum / 10;
        //     }else{
        //         break;
        //     }
        // }
        // return zeros;
        
        // 说明：1 2 3 4 5 == 》 2 * 5 得到1个0
        //      6 7 8 9 10 == > 8 * 10 得到1个0
        // 那么1 2 3 4 5 6 7 8 9 10就有2个0
        // 有几个5的倍数 就有几个0
        int count = 0;
        while(n > 0){
            count += n/5;
            n /= 5;
        }
        return count;
    }
}
