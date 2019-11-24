/*
Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.

This is case sensitive, for example "Aa" is not considered a palindrome here.

Note:
Assume the length of given string will not exceed 1,010.

Example:

Input:
"abccccdd"

Output:
7

Explanation:
One longest palindrome that can be built is "dccaccd", whose length is 7.
*/

"""
Solution -Java
"""

class Solution {
    public int longestPalindrome(String s) {
        int count = 0;
        boolean flag = false;
        int[] arr = new int[52];
        for(int i = 0; i < s.length(); i++){
            if(Integer.valueOf(s.charAt(i)) > 96){
                arr[s.charAt(i) - 'a'] += 1;
            }else{
                arr[s.charAt(i) - 'A' + 26] += 1;
            } 
        }
        for(int i = 0; i < arr.length; i++){
            count += arr[i] - (arr[i] % 2);
            if(arr[i] % 2 != 0) flag = true;
        }
        if(flag == true) count += 1;
        return count;
    }
}
