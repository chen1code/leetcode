/*
Given two strings s and t , write a function to determine if t is an anagram of s.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
*/


"""
思路：替换字母为空，最后比较两字符串的长度

Solution -- Java

"""

class Solution {
    public boolean isAnagram(String s, String t) { 
        if(s.length() != t.length()){
            return false;
        }
        while(s.length() != 0){
            int i = 0;
            String tmp = s.charAt(i) +"";
            s = s.replace(tmp,"");
            t = t.replace(tmp,"");  
            if(s.length() != t.length()){
                return false;
            }
        }
        return true;
    }
}
