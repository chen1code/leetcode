/*
*Given an array of integers and an integer k, 
find out whether there are two distinct indices i and j in the array 
such that nums[i] = nums[j] and the absolute difference between i and j is at most k.

Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:

Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:

Input: nums = [1,2,3,1,2,3], k = 2
Output: false
*/


"""
Solution1 --- 循环遍历
"""
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {        
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] == nums[j] && j - i <= k){
                    return true;
                }
                if(j - i > k){
                    break;
                }
            }
        }
        return false;
    }
}

"""
Solution2 --- 利用set
"""
public static boolean containsNearbyDuplicate1(int[] nums, int k) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(i > k) set.remove(nums[i-k-1]);
            if(!set.add(nums[i])) return true;
        }
        return false;
	}
