/*
Given a binary array, find the maximum number of consecutive 1s in this array.

Example 1:
Input: [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s.
    The maximum number of consecutive 1s is 3.
*/


"""
Solution -Java
"""


class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max_len = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0) count += 1;
            if(nums[i] == 0 || (i == nums.length - 1)) {
                max_len = Math.max(count, max_len); count = 0;
            }
        }
        return max_len;
    }
}
