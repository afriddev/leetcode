class Solution {
    public  int thirdMax(int[] nums) {
        List<Integer> sortList = new ArrayList<>();
        Arrays.sort(nums);
        for (int index = 0; index < nums.length; index++) {
            if (sortList.indexOf(nums[index]) == -1) {
                sortList.add(nums[index]);
            }
        }

        if (sortList.size() <= 2) {
            return sortList.get(sortList.size()-1);
        }

        return sortList.get(sortList.size() - 3);

    }
}
