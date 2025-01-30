class Solution {
    /**
     * Time Complexity O(N)
     * Space Complexity O(1)
     * Beats - 100%
     * Run time - 0ms
     */
    public static int findPeakElement(int[] nums) {
        int peakElement = nums[0];
        int result = 0;
        for (int index = 1; index < nums.length; index++) {
            if (peakElement < nums[index]) {
                peakElement = nums[index];
                result = index;
            }
        }
        return result;
    }
}
