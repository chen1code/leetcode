/*
Example 1:

Input: [1,2,3],[2]
Output: 1
Explanation: The only heater was placed in the position 2, and if we use the radius 1 standard, then all the houses can be warmed.
 

Example 2:

Input: [1,2,3,4],[1,4]
Output: 1
Explanation: The two heater was placed in the position 1 and 4. We need to use radius 1 standard, then all the houses can be warmed.
*/

"""
Solution - Java
"""

class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        int min_max = 0;
        for(int i = 0; i < houses.length; i++){
            int min = Integer.MAX_VALUE;
            for(int j = 0; j < heaters.length; j++){
                int tmp = Math.abs(heaters[j]-houses[i]);
                min = Math.min(tmp, min);
            }
            min_max = Math.max(min,min_max);
            
        }
        return min_max;
    }
}
