/*
Given a string s and a string t, check if s is subsequence of t.

You may assume that there is only lower case English letters in both s and t. t is potentially a very long (length ~= 500,000) string, and s is a short string (<=100).

A subsequence of a string is a new string which is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (ie, "ace" is a subsequence of "abcde" while "aec" is not).

Example 1:
s = "abc", t = "ahbgdc"

Return true.

Example 2:
s = "axc", t = "ahbgdc"

Return false.
*/

"""
循环对比，找到一个，内循环标记为当前下标

Solution - Java

"""


class Solution {
    public boolean isSubsequence(String s, String t) {
        int tmp = 0;
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            for(int j = tmp; j < t.length(); j++){
                if(s.charAt(i) == t.charAt(j)){
                    tmp = j+1; //不加1会导致字符多算一个
                    count += 1;
                    break;
                }
            }
        }
        return count == s.length();
    }
}
