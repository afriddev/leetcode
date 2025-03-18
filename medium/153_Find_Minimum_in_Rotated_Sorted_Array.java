
/**
    Runtime - 0ms
    Time Complexity - O(N)
    Beats - 100%
    Space complexity - O(1)
    Beats - 32%
 */
class Solution {
     public int findMin(int[] nums) {
        int min = nums[0];

        for(int index = 1;index <nums.length;index++){
            if(nums[index] < min){
                min  = nums[index];
            }

        }
        return min;
    }
}
