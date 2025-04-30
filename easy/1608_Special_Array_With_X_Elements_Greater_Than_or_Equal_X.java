/**
Time Complexity - O(N^2)
Runtime - 2MS
Beats  - 52%
 */
class Solution {
    public int specialArray(int[] nums) {
        int num = 1;
        int times = 0;
        while (true) {
            times = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] >= num) {
                    times = times + 1;
                }
            }
            if (num == times)
                return num;
            if (num == nums.length)
                return -1;
            num = num + 1;
        }
    }
}
