class Solution {
    public static int firstMissingPositive(int[] nums) {

        Arrays.sort(nums);


        int index = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                if (nums[i] != index) {
                    if(nums[i] == index -1){
                        index = index - 1;
                    } 
                    else return index;
                }
                index++;
                
            }

            if (i == nums.length - 1) {
                if (nums[i] <= 0) {
                    return 1;
                } else {
                    return nums[i] + 1;

                }
            }
        }

        return index;
    }
}
