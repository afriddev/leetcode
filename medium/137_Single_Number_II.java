class Solution {
    /**
     * Time Complexity - O(N)
     * Runtime - 6ms
     * Beats - 19%
     */
    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums) {
            hashMap.put(num, hashMap.getOrDefault(num, 0)+1);
        }
        for(int key:hashMap.keySet()){
            if(hashMap.get(key) == 1) return key;
        }
        return 0;
    }
}
