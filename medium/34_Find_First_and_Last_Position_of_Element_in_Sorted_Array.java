class Solution {
    /**
     * Time Complexity - O(N)
     * Space Compplexity - O(N)
     */
   public static int[] searchRange(int[] nums, int target) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] == target) {
                a.add(index);
            }
        }

        if (a.isEmpty()) {
            return new int[] {-1,-1};
        } 
            else return  new int[]{a.get(0),a.get(a.size()-1)};

    }
}
