/*
Write a program to check whether a given number is an ugly number.

Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.

Example 1:

Input: 6
Output: true
Explanation: 6 = 2 × 3
Example 2:

Input: 8
Output: true
Explanation: 8 = 2 × 2 × 2
Example 3:

Input: 14
Output: false 
Explanation: 14 is not ugly since it includes another prime factor 7.
*/

"""
只要依次循环判断是否能被2，3，5整除即可

Solution -- Java

"""

class Solution {
    public boolean isUgly(int num) {
        if(num==1) return true;
        if(num==0) return false;
        while(num%2==0) num=num/2;
        while(num%3==0) num=num/3;
        while(num%5==0) num=num/5;
        return num==1;       
    }
}
