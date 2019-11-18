/*
Count the number of segments in a string, where a segment is defined to be a contiguous sequence of non-space characters.

Please note that the string does not contain any non-printable characters.

Example:

Input: "Hello, my name is John"
Output: 5
*/

"""
字符串按空格分割，注意多空格相连以及首尾空格的情况

Solution -- Java

"""



class Solution {
    public int countSegments(String s) {
        String[] str = s.trim().split(" ");
        int count = 0;
        for(int i = 0; i < str.length; i++){
            if(str[i].length() >= 1) count++;
        }
        return count;
    }
}
