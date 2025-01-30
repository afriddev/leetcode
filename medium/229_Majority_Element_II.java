class Solution {
    /**
     * Time Complexity - O(N)
     * Space Complexity - O(N)
     * Beats - 43%
     * Runtime - 11ms
     */
    public static List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        ArrayList<Integer> a = new ArrayList<>();
        for(int ele : nums){
            hashMap.put(ele,hashMap.getOrDefault(ele, 0)+1);

        }
        for(int key: hashMap.keySet()){
            if(hashMap.get(key) > nums.length/3){
                a.add(key);
            }
        }
        return a;

    }
}
