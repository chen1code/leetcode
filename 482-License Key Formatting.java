/*
Example 1:
Input: S = "5F3Z-2e-9-w", K = 4

Output: "5F3Z-2E9W"

Explanation: The string S has been split into two parts, each part has 4 characters.
Note that the two extra dashes are not needed and can be removed.
Example 2:
Input: S = "2-5g-3-J", K = 2

Output: "2-5G-3J"

Explanation: The string S has been split into three parts, each part has 2 characters except the first part as it could be shorter as mentioned above.
*/

"""
逆序隔K个数递减

Solution - Java
"""

class Solution {
    public String licenseKeyFormatting(String S, int K) {
        S = S.toUpperCase();
        S = S.replace("-","");
        StringBuilder str = new StringBuilder(S);
        int num = str.length() % K;
        for(int i = str.length()-K-1; i >=0; i -= K){
            str.insert(i+1,'-');
        }
        return str.toString();
    }
}
