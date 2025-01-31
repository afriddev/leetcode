class Solution {
   public static int maximumGap(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        for (int index = 0; index < nums.length - 1; index++) {
            list.add(Math.abs(nums[index] - nums[index + 1]));
        }
        int result = 0;
        for(int num:list){
            if(num > result){
                result = num;
            }
        }
        return result;
    }
}
