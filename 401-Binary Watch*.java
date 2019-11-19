"""
二进制
h*64 代表十进制数的二进制表示中有一个为1

Solution -Java

"""


class Solution {
    public List<String> readBinaryWatch(int num) {
        List<String> times = new ArrayList<>();
        for (int h=0; h<12; h++)
            for (int m=0; m<60; m++)
                if (Integer.bitCount(h * 64 + m) == num) //重点理解 等价于 Integer.bitCount(h) + Integer.bitCount(m)
                    times.add(String.format("%d:%02d", h, m));
        return times; 
    }
}
