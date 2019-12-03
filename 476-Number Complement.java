/*
Example 1:
Input: 5
Output: 2
Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.
Example 2:
Input: 1
Output: 0
Explanation: The binary representation of 1 is 1 (no leading zero bits), and its complement is 0. So you need to output 0.
*/

"""
求与其补码的和

Solution - Java
"""

class Solution {
    public int findComplement(int num) {
//        int i = 0;
//         int j = 0;
        
//         while (i < num)
//         {
//             i += Math.pow(2, j);
//             j++;
//         }
        
//         return i - num; 
        return ~num & (Integer.highestOneBit(num) - 1);
    }
}
