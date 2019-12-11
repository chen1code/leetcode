/*
Given scores of N athletes, find their relative ranks and the people with the top three highest scores, who will be awarded medals: "Gold Medal", "Silver Medal" and "Bronze Medal".

Example 1:
Input: [5, 4, 3, 2, 1]
Output: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
Explanation: The first three athletes got the top three highest scores, so they got "Gold Medal", "Silver Medal" and "Bronze Medal". 
For the left two athletes, you just need to output their relative ranks according to their scores.
*/

"""
新建数组，排序后一一对比

Solution - Java
"""

class Solution {
    public String[] findRelativeRanks(int[] nums) {
        int[] old_nums = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            old_nums[i] = nums[i];
        }
        Arrays.sort(nums);
        String[] re = new String[nums.length];
        for(int i = 0; i < old_nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(old_nums[i] == nums[j]){
                    if(j == nums.length - 1) re[i] = "Gold Medal";
                    else if(j == nums.length - 2) re[i] = "Silver Medal";
                    else if(j == nums.length - 3) re[i] = "Bronze Medal";
                    else re[i] = (nums.length - j) + "";
                }
            }
        }
        
        return re;
    }
}
