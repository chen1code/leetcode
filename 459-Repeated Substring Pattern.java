/*
Given a non-empty string check if it can be constructed by taking a substring of it and appending multiple copies of the substring together. You may assume the given string consists of lowercase English letters only and its length will not exceed 10000.

 

Example 1:

Input: "abab"
Output: True
Explanation: It's the substring "ab" twice.
Example 2:

Input: "aba"
Output: False
Example 3:

Input: "abcabcabcabc"
Output: True
Explanation: It's the substring "abc" four times. (And the substring "abcabc" twice.)
*/

"""
从第一个字母开始，复制出一个新的字符串，与原字符串比较，相等则返回true，否则返回false

Soluiton - java

"""

class Solution {
    public boolean repeatedSubstringPattern(String s) {
        for(int i = 0; i < s.length()/2; i++){
            if(s.length() % (i+1) == 0){
                String str = s.substring(0,i+1);
                StringBuilder new_s = new StringBuilder();
                for(int j = 0; j < s.length() / (i+1); j++){
                    new_s.append(str);
                }
                if(new_s.toString().equals(s)) return true;
            }
        }
        return false;
    }
}
