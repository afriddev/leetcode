class Solution {
    public int removeElement(int[] nums, int val) {
            int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                for (int j = nums.length-1; j > i; j--) {
                    if (nums[j] != val) {
                        int value = nums[i];
                        nums[i] = nums[j];
                        nums[j] = value;
                        count++;
                        break;
                    }
                }
            } else {
                count++;
            }

        }
        return count;
    }
}
