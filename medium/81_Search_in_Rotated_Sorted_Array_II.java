
/**
    Runtime - 0ms
    Time complexity - 0(N)
    Beats - 100&,
    Space compleity - O(1)
    Beats - 51%

 */

class Solution {
    public boolean search(int[] nums, int target) {
        for(int index  = 0;index < nums.length ;index++){
            if(nums[index] == target){
                return true;
            }
        }
        return false;
    }
}
