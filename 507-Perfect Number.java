/*
We define the Perfect Number is a positive integer that is equal to the sum of all its positive divisors except itself.

Now, given an integer n, write a function that returns true when it is a perfect number and false when it is not.
Example:
Input: 28
Output: True
Explanation: 28 = 1 + 2 + 4 + 7 + 14
*/

"""
Solution -Java
"""

class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num == 0) return false;
        int count = 0;
        for(int i = 1; i <= Math.sqrt(num); i++){
            if(num % i == 0) {
                count += i;
                if(i != 1) count += num / i;
            }
        }
        if(count == num && count != 1) return true;
        return false;
    }
}
