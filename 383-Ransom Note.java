/*
Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.

Each letter in the magazine string can only be used once in your ransom note.

Note:
You may assume that both strings contain only lowercase letters.

canConstruct("a", "b") -> false
canConstruct("aa", "ab") -> false
canConstruct("aa", "aab") -> true
*/

"""
法1.将字符串中的字母替换为空，去判断消减的长度变化
法2.建立一个空数组，将字母存放进去，依据数值的变化判断

Solution -- Java

"""

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {        
        while(ransomNote.length() > 0){
            int len_1 = ransomNote.length();
            int len_2 = magazine.length();
            String tmp = ransomNote.charAt(0) + "";
            ransomNote = ransomNote.replace(tmp,"");
            magazine = magazine.replace(tmp,"");
            if(len_1 - ransomNote.length() > len_2 - magazine.length()){
                return false;
            }
        }
        return true;
    }
}

//数组方法
// public class Solution {
//     public boolean canConstruct(String ransomNote, String magazine) {
//         int[] arr = new int[26];
//         for (int i = 0; i < magazine.length(); i++) {
//             arr[magazine.charAt(i) - 'a']++;
//         }
//         for (int i = 0; i < ransomNote.length(); i++) {
//             if(--arr[ransomNote.charAt(i)-'a'] < 0) {
//                 return false;
//             }
//         }
//         return true;
//     }
// }
