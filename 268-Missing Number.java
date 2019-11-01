/*
Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

Example 1:

Input: [3,0,1]
Output: 2
Example 2:

Input: [9,6,4,2,3,5,7,0,1]
Output: 8
*/

"""
线排序，然后判断 num[index] == index

Solution -- java

"""
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int miss_num = 0;
        for(int i= 0; i < nums.length; i++){
            if(nums[i] != i){
                miss_num = i;
                break;
            }
            if(i == nums.length - 1){
                miss_num = nums.length;
            }
        }
        return miss_num;
    }
}


"""
利用xor a^b^b = a

Solution -- Java
"""
    
public int missingNumber(int[] nums) {

    int xor = 0, i = 0;
	for (i = 0; i < nums.length; i++) {
		xor = xor ^ i ^ nums[i];
	}

	return xor ^ i;
}
