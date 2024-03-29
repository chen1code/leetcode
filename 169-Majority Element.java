/*
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.

Example 1:

Input: [3,2,3]
Output: 3
Example 2:

Input: [2,2,1,1,1,2,2]
Output: 2
*/


"""
solution -- java
"""
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int half = nums.length / 2;
        // int count = 1;
        // for(int i = 0; i < nums.length - 1; i++){
        //     if(count > half){
        //         return nums[i];
        //     }
        //     if(nums[i+1] == nums[i]){
        //         count += 1;
        //     }else{
        //         count = 1;
        //     }
        // }
        // return nums[nums.length - 1];
        return nums[half];
    }
}

"""
Solution -- pyhton
"""
class Solution(object):
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        # 以为要占据超过一半的数量，那么中间的数(len(nums)//2)必定是出现次数最多且
        # 超过一半的数
        return sorted(nums)[len(nums) // 2]
