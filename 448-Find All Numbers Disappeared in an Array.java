/*
Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

Find all the elements of [1, n] inclusive that do not appear in this array.

Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.

Example:

Input:
[4,3,2,7,8,2,3,1]

Output:
[5,6]
*/

"""
Tips:出现的最大数值不会超过数组长度

1.比较繁琐，先排序，之后在进行数值比较判断
2.将数值取负，没有取负的即没有出现

Solution -- Java
"""


class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {        
        // Arrays.sort(nums);
        // int tmp = 1;
        // List<Integer> list = new ArrayList<>();
        // if(nums.length == 0) return list;
        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i] == tmp - 1) continue;
        //     while(tmp != nums[i]) {
        //         list.add(tmp);
        //         tmp += 1;
        //     }
        //     tmp += 1;
        // }
        // int l_num = nums[nums.length - 1];
        // while(l_num < nums.length){
        //     l_num += 1;
        //     list.add(l_num);
        // }
        // return list;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            int val = Math.abs(nums[i]) - 1;  //防止index溢出
            if(nums[val] > 0){
                nums[val] = -nums[val];
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                list.add(i+1);
            }
        }
        return list;
    }
}
