/*
Given a pattern and a string str, find if str follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

Example 1:

Input: pattern = "abba", str = "dog cat cat dog"
Output: true
Example 2:

Input:pattern = "abba", str = "dog cat cat fish"
Output: false
Example 3:

Input: pattern = "aaaa", str = "dog cat cat dog"
Output: false
Example 4:

Input: pattern = "abba", str = "dog dog dog dog"
Output: false
*/



"""
利用HashMap的put函数
Solution -- Java
"""

class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] newStr = str.split(" ");
        if (newStr.length != pattern.length())
            return false;
        HashMap input = new HashMap();
        for(Integer i = 0; i < newStr.length; i++){
            if(input.put(pattern.charAt(i),i) != input.put(newStr[i], i)) 
                return false;
        }
        
        return true;
    }
}
