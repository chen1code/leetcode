/*
Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

Example: 

Input: 19
Output: true
Explanation: 
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
*/

"""
解法：如果出现4，就返回false。可以尝试证明，为什么当且仅当出现4就不会出现1

Solution -- java
"""

class Solution {
    public boolean isHappy(int n) {
        if (n == 1) return true;
        int num = 0;
        while(n > 0){
            int temp = n % 10;
            n = n / 10;
            num += Math.pow(temp, 2);
        }
        return num == 4 ? false : isHappy(num);
    }
}
