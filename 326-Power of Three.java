/*
Given an integer, write a function to determine if it is a power of three.

Example 1:

Input: 27
Output: true
Example 2:

Input: 0
Output: false
Example 3:

Input: 9
Output: true
*/

"""
1.递归或者循环
2.利用3的最大次方数来除n

Solution -- Java

"""

class Solution {
    public boolean isPowerOfThree(int n) {
        // if((n % 3 != 0 || n <= 0) && n != 1) return false;
        // return n == 1 || isPowerOfThree(n/3);
        return n>0 && (n==1 || (n%3==0 && isPowerOfThree(n/3)));
        
        //return ( n>0 &&  1162261467%n==0); ==> 方法2
    }
}
