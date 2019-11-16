/*
We are playing the Guess Game. The game is as follows:

I pick a number from 1 to n. You have to guess which number I picked.

Every time you guess wrong, I'll tell you whether the number is higher or lower.

You call a pre-defined API guess(int num) which returns 3 possible results (-1, 1, or 0):

-1 : My number is lower
 1 : My number is higher
 0 : Congrats! You got it!
Example :

Input: n = 10, pick = 6
Output: 6
*/

"""
二分查找法，设置start与end两个哨兵，判断mid大小；需要注意陷入死循环

Solution -- Java

"""

/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int start = 1;
        int end = n;
        while(start < end){
            int mid = start + (end - start) / 2; // 防止内存溢出
            if(guess(mid) == -1){
                end = mid;
            }
            if(guess(mid) == 1){
                start = mid + 1; // 加1是防止陷入死循环 例如n=2,pick=2的时候，不加1会导致死循环
            }
            if(guess(mid) == 0){
                return mid;
            }
        }
        return start;
    }
}
