public class Solution {

    public int[] radixSort(int[] array){
        int max = array[0];
        for (int i = 1;i < array.length;i++){
            if(array[i] > max) max = array[i];
        }
        for (int exp = 1;max/exp > 0;exp *=10)count(exp, array);
        return array;
    }
    public void count(int exp,int[] array){
        int n = array.length;
        int[] count = new int[10];
        int[] output = new int[n];
        for(int i = 0;i < n;i++) count[(array[i]/exp) % 10]++;
        for(int i = 1;i < 10 ;i++) count[i] = count[i] + count[i-1];
        for(int i = n-1;i>=0;i--) output[-- count[(array[i] / exp ) % 10]] = array[i];
        for(int i = 0;i < n;i++) array[i] = output[i]; 
    }
}
