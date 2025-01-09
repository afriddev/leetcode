import java.util.List;

class Solution {
    public int smallestDistancePair(int[] nums, int k) {
      List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                res.add(Math.abs((nums[i] - nums[j])));
            }
        }
        for (int i = 0; i < res.size(); i++) {
            int index = i;
            for (int j = i+1; j < res.size(); j++) {
                if (res.get(index) > res.get(j)) {
                    index = j;
                }
            }
            if (index != i) {
                int swapValue = res.get(index);
                res.set(index, res.get(i));
                res.set(i, swapValue);
            }

        }
        return res.get(k-1);
    }
}
