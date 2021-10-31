https://leetcode.com/problems/roman-to-integer/
#Brute Force
class Solution {
    public int romanToInt(String s) {
			return Arrays.stream(s
                .replace("IV", "4 ")
                .replace("IX", "9 ")
                .replace("XL", "40 ")
                .replace("XC", "90 ")
                .replace("CD", "400 ")
                .replace("CM", "900 ")
                .replace("I", "1 ")
                .replace("V", "5 ")
                .replace("X", "10 ")
                .replace("L", "50 ")
                .replace("C", "100 ")
                .replace("D", "500 ")
                .replace("M", "1000 ")
                .trim()
                .split(" "))
                .map(Integer::valueOf)
                .reduce(0, Integer::sum);
    }
}
