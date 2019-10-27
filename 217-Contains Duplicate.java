/* Contains Duplicate
*Given an array of integers, find if the array contains any duplicates.
Your function should return true if any value appears at least twice in the array, 
and it should return false if every element is distinct.
*
Example 1:

Input: [1,2,3,1]
Output: true
Example 2:

Input: [1,2,3,4]
Output: false
Example 3:

Input: [1,1,1,3,3,4,3,2,4,2]
Output: true

*/

"""
Java:
Solution1 -- 排序后，两两对比
"""
class Solution {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length == 0){
            return false;
        }
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
}

"""
Java:
Solution2 -- 创建set对象，set不能存在相同的元素
"""
public  boolean containsDuplicate(int[] nums) {
    Set<Integer> set = new HashSet<Integer>();
    for(int i : nums)
        if(!set.add(i))// if there is same
            return true; 
    return false;
}
