/*
Given n points in the plane that are all pairwise distinct, a "boomerang" is a tuple of points (i, j, k) such that the distance between i and j equals the distance between i and k (the order of the tuple matters).

Find the number of boomerangs. You may assume that n will be at most 500 and coordinates of points are all in the range [-10000, 10000] (inclusive).

Example:

Input:
[[0,0],[1,0],[2,0]]

Output:
2

Explanation:
The two boomerangs are [[1,0],[0,0],[2,0]] and [[1,0],[2,0],[0,0]]

*/

"""
HashMap特性

Solution -Java
"""


class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < points.length; i++){
            int tmp = 0;
            for(int j = 0; j < points.length; j++){
                if(i == j) continue;
                int p_sum = (int)Math.pow(points[j][0]-points[i][0],2) + (int)Math.pow(points[j][1]-points[i][1],2);
                map.put(p_sum, map.getOrDefault(p_sum, 0) + 1);  // 存在p_sum则取p_sum对应value值加1，否则就默认0+1
            }
            for(int val : map.values()) {
                count += val * (val-1);
            }            
            map.clear();
        }
        return count;
    }
}
