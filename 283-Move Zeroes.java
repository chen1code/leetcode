/*
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
Note:

You must do this in-place without making a copy of the array.
Minimize the total number of operations.
*/



"""
采用双重循环
对于 nums = [0,1,0,3,12]
从 i=0开始，遇到nums[i]=0的时候，j第一次从i开始往下找到第一个不为0的数，与nums[i]交换；并记录下此时j的位置；

Solution -- Java

"""

class Solution {
    public void moveZeroes(int[] nums) {
        int temp = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                if(temp == 0) temp = i; // 去除部分重复劳动
                for(int j = temp; j < nums.length; j++){
                    if(nums[j] != 0){
                        nums[i] = nums[j];
                        nums[j] = 0;
                        temp = j;
                        break;
                    }
                }
            }
        }
    }
}

"""
设定一个初始的标志，将后面不为0的往前赋值

Solution --Java
"""
class Solution{
    if(nums == null || nums.length == 0) return;
        int posInsert = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0) nums[posInsert++] = nums[i];
        }
        while(posInsert < nums.length){
            nums[posInsert] = 0;
            posInsert += 1;
        }
}
