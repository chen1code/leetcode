/*
Given a positive integer num, write a function which returns True if num is a perfect square else False.

Note: Do not use any built-in library function such as sqrt.

Example 1:

Input: 16
Output: true
Example 2:

Input: 14
Output: false
*/


"""
A square number is 1+3+5+7+...

Solution -- Java

"""

class Solution {
    public boolean isPerfectSquare(int num) {
        // if(num == 1) return true;
        // for(int i = 1; i < num / 2 + 1; i++){
        //     if(i * i == num) return true;
        // }
        // return false;
        int i = 1;
         while (num > 0) {
             num -= i;
             i += 2;
         }
         return num == 0;
    }
}
