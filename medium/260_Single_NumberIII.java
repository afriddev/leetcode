class Solution {
    public static int[] singleNumber(int[] nums) {
        HashSet<Integer>  set = new HashSet<>();
        for(int index = 0;index < nums.length;index++){
            if(!set.add(nums[index])){
                set.remove(nums[index]);
            }
        }
        int[] result = new int[set.size()];
        int index = 0;
        for(int num : set){
            result[index] = num;
            index++;

        }
        return result;
    }
}
