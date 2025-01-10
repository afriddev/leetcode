class Solution {
    public int majorityElement(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        Map<Integer, Integer> hasmMap = new HashMap<>();
        for (int index = 0; index < nums.length; index++) {
            if (hasmMap.get(nums[index]) != null) {
                int temp = hasmMap.get(nums[index]);
                hasmMap.replace(nums[index], temp + 1);
            } else {
                hasmMap.put(nums[index], 1);
            }

            if(hasmMap.get(nums[index]) > nums.length/2){
                return nums[index];
            }
        }
        return 0;
        
    }
}
