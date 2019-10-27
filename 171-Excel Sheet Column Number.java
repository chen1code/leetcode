/*
Given a column title as appear in an Excel sheet, return its corresponding column number.

For example:

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
    ...
Example 1:

Input: "A"
Output: 1
Example 2:

Input: "AB"
Output: 28
Example 3:

Input: "ZY"
Output: 701
*/


"""
Solution -- java
"""
class Solution {
    public int titleToNumber(String s) {
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int num = 0;
        //计算方式为：ZY ==> 26*26 + 25
        //          AAA == > 1*26*26 + 1*26 + 1 
        for(int i = s.length() - 1; i >= 0; i--){
            num += Math.pow(26, s.length() - i - 1) * (alpha.indexOf(s.charAt(i))+1); 
        }
        return num;
    }
}
