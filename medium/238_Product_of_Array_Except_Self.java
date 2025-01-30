class Solution {
     public static int[] productExceptSelf(int[] nums) {

        int[] prefix = new int[nums.length];
        int[] sufix = new int[nums.length];
        int[] result = new int[nums.length];

        for (int index = 0; index < nums.length; index++) {
            if (index != 0) {
                prefix[index] = prefix[index - 1] * nums[index - 1];
                sufix[nums.length - index - 1] = sufix[nums.length - index - 1 + 1] * nums[nums.length - index - 1 + 1];
            } else {
                prefix[0] = 1;
                sufix[nums.length-1] = 1;
            }
        }
        for(int index =0 ;index<nums.length;index++){

            result[index] = prefix[index] * sufix[index];
        }
        return result;
    }
}
