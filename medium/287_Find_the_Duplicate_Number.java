class Solution {
    /**
     * Time Complexity - O(N)
     * Space Complexity - O(N)
     * Beats - 33%
     */
   public static int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int ele : nums) {
            if (hashMap.get(ele) != null) {
                return ele; 
            }else {
                hashMap.put(ele, ele);
            }
        }
        return 0;
    }
}
