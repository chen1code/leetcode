/*
You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.

Example 1:

Input: [1,2,3,1]
Output: 4
Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
             Total amount you can rob = 1 + 3 = 4.
Example 2:

Input: [2,7,9,3,1]
Output: 12
Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
             Total amount you can rob = 2 + 9 + 1 = 12.
*/

"""
Tips: 开始以为按奇偶分开求和取最大值 --- 错误理解

解法步骤
[2, 7, 9, 3, 1] 原式数组 nums
1）======= [2, 7, , , ,] max_num; 2 = nums[0]; 7 = Math.max(nums[0], nums[1])
2) ======= [2, 7, 11, , ] 2 + 9 > 7  第三位填较大值11
3) ======= [2, 7, 11, 11, ] 3 + 7 < 11 第四位填较大值11
4）======= [2, 7, 11, 11, 12] 11 + 1 > 11 第五位填12
"""

"""
Solution -- java
"""

class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0)
            return 0;
        if(nums.length == 1)
            return nums[0];
        int[] max_num = new int[nums.length];
        max_num[0] = nums[0];
        max_num[1] = Math.max(nums[0], nums[1]);
        for(int i = 2; i < nums.length; i++){
            max_num[i] = Math.max(max_num[i-1], max_num[i-2] + nums[i]);
        }
        return max_num[nums.length - 1];
    }
}
