class Solution {
    public static int missingNumber(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int ele : nums) {
            list.add(ele);
        }
        for (int index = 0; index < nums.length; index++) {
            if (!list.contains(index)) {
                return index;
            }
        }
        return nums.length ;
    }
}
