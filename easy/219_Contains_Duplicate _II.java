class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int i = 0;
        int j = 1;
        while (i < nums.length - 1) {
            if (i!= j && nums[i] == nums[j] && Math.abs(i - j) <= k) {
                return true;
            } else if (Math.abs(i - j) > k || j == nums.length - 1) {
                i++;
                j = i;
            }
            else{
                j++;
            }

        }
        return false;
    }
}
