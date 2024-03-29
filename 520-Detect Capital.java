/*
Given a word, you need to judge whether the usage of capitals in it is right or not.

We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital, like "Google".
Otherwise, we define that this word doesn't use capitals in a right way.
 

Example 1:

Input: "USA"
Output: True
*/

"""
Solution -Java
"""

class Solution {
    public boolean detectCapitalUse(String word) {
        //Solution - 1
        //return word.matches("[A-Z]+|[a-z]+|[A-Z][a-z]+");
        int numUpper = 0;
        
        //SOlution - 2
        for (int i=0;i<word.length();i++)
            if (Character.isUpperCase(word.charAt(i))) numUpper++;
        if (numUpper == 1) return Character.isUpperCase(word.charAt(0));
        return numUpper == 0 || numUpper == word.length();
    }
}
