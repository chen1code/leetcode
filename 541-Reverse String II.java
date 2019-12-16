/*
Given a string and an integer k, you need to reverse the first k characters for every 2k characters counting from the start of the string. If there are less than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and left the other as original.
Example:
Input: s = "abcdefg", k = 2
Output: "bacdfeg"
*/

"""
Solution - Java
"""

class Solution {
    public String reverseStr(String s, int k) {
//         Solution 1
//         String strNew = "";
//         for(int i = 0; i < s.length(); i += 2*k){
//             int start=i;
//             int end= Math.min(i+k,s.length());
//             strNew=sRever(s, start, end);
//             s = strNew;
            
//         }
//         return strNew;
        
        //Solution 2
        char[] ca = s.toCharArray();
        for (int left = 0; left < ca.length; left += 2 * k) {
            for (int i = left, j = Math.min(left + k - 1, ca.length - 1); i < j; i++, j--) {
                char tmp = ca[i];
                ca[i] = ca[j];
                ca[j] = tmp;
            }
        }
        return new String(ca);
    }
    public static String sRever(String strArg,int start,int end){
         
        String strStart=strArg.substring(0,start);
         
        String strEnd=strArg.substring(end,strArg.length());
 
        String strSub=strArg.substring(start, end);
 
        StringBuffer sb=new StringBuffer(strSub);
        strSub=sb.reverse().toString();
         
        return strStart.concat(strSub).concat(strEnd);
    }
}
