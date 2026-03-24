class Solution {
    public int[] radixSort(int[] nums){
        int max = nums[0];
        for (int i = 1;i < nums.length;i++){
            if(nums[i] > max) max = nums[i];
        }
        for (int exp = 1; max/exp > 0;exp *=10){
            count(exp, nums);
        }
        return nums;
    }
    public void count(int exp,int [] nums){
        int n = nums.length;
        int[] count = new int[10];
        int[] output = new int[n];
        for (int i=0;i<n;i++) count[( nums[i]/exp)%10]++;
        for (int i =1;i<10;i++) count [i] = count[i] + count[i-1];
        for (int i =n-1;i>=0;i--) output[--count[(nums[i] /exp) %10]] = nums[i];
        for (int i = 0;i<n;i++) nums[i] = output[i];
    }
    public int[] numberGame(int[] nums) {
       int[] n = radixSort(nums);
       
       int i = 0 ;int j = 1;
       while(i <= n.length-2){
        int temp = n[i];
        n[i] = n[j];
        n[j] = temp;
        i = i+2;
        j = j+2;
       }
       return n;
    }
}
