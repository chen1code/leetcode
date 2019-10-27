/*
Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

Example 1:

Input: s = "egg", t = "add"
Output: true
Example 2:

Input: s = "foo", t = "bar"
Output: false
Example 3:

Input: s = "paper", t = "title"
Output: true
*/

"""
解法：创建两空数组sup1与sup2，在相应位置存放对方的字符整型值。之后进行判断
例子：s = "add"  t = "egg"
1)s.charAt[0] = 97 t.charAt[0] = 101
  sup1[97] = 101; sup2[101] = 97
2)s.charAt[1] = 100 t.charAt[1] = 103
  sup1[100] = 103   sup2[103] = 100
3)s.charAt[2] = 100  t.charAt[2] = 103
  sup1[100] = 103 与 sup2[103] = 100是互相相等的
  
反例：s = "foo" t = "bar"
进行到s.charAt[1] = 111  t.charAt[1] = 97
sup1[111] = 97  sup2[97] = 111  ===>这一步在插入值之前，sup1与sup2在相应的位置值是初始值0
进行到s.charAt[2] = 111  t.charAt[2] = 114
这是 sup1[111]有值 = 97，而t.charAt[2] = 114 != 97 故返回false
"""
"""
Solution -- java
"""
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] sup1 =new int [255];
        int[] sup2 =new int [255];
        for(int i = 0; i < s.length(); i++){
            int schar = s.charAt(i);
            int tchar = t.charAt(i);
            if(sup1[schar] != 0 && sup1[schar] != tchar){
                return false;
            }
            if(sup2[tchar] != 0 && sup2[tchar] != schar){
                return false;
            }
            sup1[schar] = tchar;
            sup2[tchar] = schar;
        }
        return true;
    }
}
