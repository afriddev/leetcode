
class Solution {
    public int findKthPositive(int[] arr, int k) {
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        for(int index = 0;index < arr.length;index++){
            map.put(arr[index], index);
        }
        int result = 0;
        int num = 1;
        while(true){
            if(!map.containsKey(num)){
                result++;
            }
            if(result == k) return num;

            num++;
        }
    }
}
