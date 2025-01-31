class Solution {
    /**
     * Time complexity - O(N)
     * Run time - 0ms
     * Beats - 100%
     * 
     */
    public static void sortColors(int[] nums) {
        int noOFZeros = 0;
        int NoOfOnes = 0;
        int NoOfTwos = 0;
        for (int num : nums) {
            if (num == 0) {
                noOFZeros++;
            } else if (num == 1) {
                NoOfOnes++;
            } else {
                NoOfTwos++;
            }
        }
        for (int index = 0; index < noOFZeros + NoOfOnes + NoOfTwos; index++) {
            if (index < noOFZeros) {
                nums[index] = 0;
            } else if (index >= noOFZeros && index - noOFZeros < NoOfOnes) {
                nums[index] = 1;
            } else {
                nums[index] = 2;
            }
        }
    }
}
