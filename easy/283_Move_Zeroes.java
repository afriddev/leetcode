class Solution {
    public void moveZeroes(int[] nums) {

        if (nums.length == 1) {
            System.out.println(nums);
        }
        int r = 1, l = 0;

        while (r < nums.length) {
            if (nums[l] != 0) {
                l++;
                r++;
            } else if (nums[r] == 0) {
                r++;
            }

            else {
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
                r++;
            }

        }
        


    }
}
