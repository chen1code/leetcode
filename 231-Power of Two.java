/*
Given an integer, write a function to determine if it is a power of two.

Example 1:

Input: 1
Output: true 
Explanation: 20 = 1
Example 2:

Input: 16
Output: true
Explanation: 24 = 16
Example 3:

Input: 218
Output: false
*/


"""
思路：1. 判断该数是否能一直被2整除
     2. 使用二进制方法。如果该数能表示成2的次方形式，
     那么，该数一定是 10...000的形式或者1；
     因此，比它小一个的数必然是01...111的形式；
     两者 & 必然为0

Solution -- Java
"""

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0) return false;
        while(n > 1){
            if(n % 2 != 0){
                return false;
            }
            n = n / 2;
        }
        return true;
    }
}

"""
Solution2 -- Java
"""
class Solution {
    public boolean isPowerOfTwo(int n) {
        return ((n & (n-1))==0 && n>0);
    }
}
