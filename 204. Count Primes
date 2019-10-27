/*
Count the number of prime numbers less than a non-negative number, n.

Example:

Input: 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
*/

"""
Solution -- java
"""
class Solution {
    # 解法1：判断每个数是不是素数
    // public int countPrimes(int n) {
    //     int count = 0;
    //     if(n < 2){return 0;}
    //     for(int i = 2; i < n; i++){
    //         Boolean flag = isPrime(i);
    //         if(flag){
    //             count += 1;
    //         }
    //     }
    //     return count;
    // }
    // public Boolean isPrime(int num){
    //     for(int i = 2; i <= Math.sqrt(num); i++){
    //         if(num % i == 0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    # (推荐！！！)解法2：不是判断每个数，而是将数与数相乘占位，占位的必不是素数
    # 例子：10以内的素数
    # 先设置一个长度为11的数组 marker。
    # 从i = 2, j = 2开始，2 * 2 = 4 < 10; marker[4] = false
    # 2*3 = 6 < 10; marker[9] = false
    # 以此类推，那么最终得到结果
    public int countPrimes(int n) {
        int res=0;
        boolean[] marker=new boolean[n+1];
        for(int i=2;i<n;i++){
            if(!marker[i]){
                res++;
                for(int j=2;j*i<n;j++){
                    marker[i*j]=true;
                }
            }
        }
        return res;
    }
}
