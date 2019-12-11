/*
The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

F(0) = 0,   F(1) = 1
F(N) = F(N - 1) + F(N - 2), for N > 1.
Given N, calculate F(N).

 

Example 1:

Input: 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
*/

"""
Solution -Java
"""

class Solution {
    public int fib(int N) {
        int[] num = new int[N+1];
        num[0] = 0;
        if(N >= 1) num[1] = 1;
        for(int i = 2; i <= N; i++){
            num[i] = num[i-2] + num[i-1];
        }
        return num[N];
        
        // if(N <= 1)
        //     return N;
        // else
        //     return fib(N - 1) + fib(N - 2);
//         if(N <= 1)
//             return N;
        
// 		int a = 0, b = 1;
		
// 		while(N-- > 1)
// 		{
// 			int sum = a + b;
// 			a = b;
// 			b = sum;
// 		}
//         return b;
    }
}
