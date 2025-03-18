
/**
    Runtime - 0ms
    Time complexity - O(N)
    Beats - 100%
    Space compleity - O(1)
    Beats - 56%


 */
class Solution {
    public int findMin(int[] nums) {
        int min = nums[0];
        for (int index = 1; index < nums.length; index++) {
            if(min > nums[index]){
                min = nums[index];
            }
        }
        return min;
    }
}
