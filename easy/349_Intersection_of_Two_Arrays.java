class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            map1.put(nums1[i], nums1[i]);
        }

        int loop = nums2.length;

        

        for (int i = 0; i < loop; i++) {
            if (map1.get(nums2[i]) != null && map2.get(nums2[i]) == null) {
                map2.put(nums2[i], nums2[i]);
            }

        }

        int[] a = new int [map2.size()];
        int index = 0 ;
        for(int i : map2.keySet()){
            a[index] = i;
            index++;
        }
        for(int i:a){
            System.out.println(i);
        }

        return a;

    }
}
